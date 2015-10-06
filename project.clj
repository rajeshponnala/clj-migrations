(defproject clj-migrations "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [migratus "0.8.6"]
                 [org.postgresql/postgresql "9.4-1203-jdbc42"]
                 [org.clojure/java.jdbc "0.4.2"]]
  :plugins [[migratus-lein "0.1.7"]]
  :migratus {:store :database
             :migration-dir "migrations/"
             :db {:classname "org.postgresql.Driver"
                  :subprotocol "postgresql"
                  :subname "//localhost:5432/Korma"
                  :user "postgres"
                  :password "Design_20"}})
