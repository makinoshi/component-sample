(ns component-sample.system
  (:require [aero.core :as aero]
            [com.stuartsierra.component :as component]
            [clojure.java.io :as io]
            [component-sample.component.server :as server])
  (:import (clojure.lang Keyword)))

(defn new-system [^Keyword profile]
  (let [conf (aero/read-config (io/resource "config.edn")
                               {:profile profile})]
    (component/system-map
     :server (server/new-server conf))))
