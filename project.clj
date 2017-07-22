(defproject darkleaf/form "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0" :scope "provided"]
                 [org.clojure/clojurescript "1.9.671" :scope "provided"]

                 [reagent "0.7.0" :exclusions [cljsjs/react] :scope "test"]
                 [cljsjs/react-with-addons "15.5.4-0" :scope "test"]

                 [org.clojure/test.check "0.9.0" :scope "test"]
                 [org.clojure/core.match "0.3.0-alpha4" :scope "test"]]

  :plugins [[lein-figwheel "0.5.11"]]
  :profiles {:dev {:dependencies [[figwheel-sidecar "0.5.8"]
                                  [com.cemerick/piggieback "0.2.1"]]
                   :source-paths ["dev"]}}
  :clean-targets [:target-path "out"]
  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src"]
                        :figwheel true
                        :compiler {:main "darkleaf.form.demo"}}]})