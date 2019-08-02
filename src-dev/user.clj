(ns user
  (:require [com.stuartsierra.component :as component]
            [component-sample.system :as system]))

(defonce dev-system (atom nil))

(defn start []
  (reset! dev-system (component/start (system/new-system :dev))))

(defn stop []
  (when @dev-system
    (component/stop @dev-system)))

(defn go []
  (stop)
  (start))
