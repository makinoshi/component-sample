(defproject component-sample "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [com.stuartsierra/component "0.4.0"]
                 [org.immutant/web "2.1.10"]
                 [aero "1.1.3"]]
  :main ^:skip-aot component-sample.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:source-paths ["src-dev"]
                   :repl-options {:init-ns user}}})
