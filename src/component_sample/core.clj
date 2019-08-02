(ns component-sample.core
  (:gen-class)
  (:require [com.stuartsierra.component :as component]
            [component-sample.system :as system]))

(defonce system (atom nil))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (reset! system (component/start (system/new-system :prod))))
