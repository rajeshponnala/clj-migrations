(ns clj-migrations.db.migrations
  (:require [migratus.core :as mg]))

(def config {:store :database
             :migration-dir "migrations/"
             :db {:classname "org.postgresql.Driver"
                  :subprotocol "postgresql"
                  :subname "//localhost:5432/Korma"
                  :user "postgres"
                  :password "Design_20"}})


