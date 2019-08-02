(ns component-sample.component.server
  (:require [com.stuartsierra.component :as component]
            [immutant.web :as immutant]
            [ring.util.response :as res]))

(defrecord Server [handler conf server]
  component/Lifecycle
  (start [this]
    (let [server (immutant/run handler conf)]
      (assoc this :server server)))
  (stop [{:as this :keys [server]}]
    (when server (immutant/stop server))
    (assoc this :server nil)))

(defn new-server [conf]
  (map->Server {:handler (fn [req] (res/response "Hello world"))
                :conf (:server conf)
                :server nil}))
