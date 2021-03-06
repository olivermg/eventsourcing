(ns ow.factum.transport.embedded.server
  #_(:require [com.stuartsierra.component :as c]))

(defrecord EmbeddedServer [on-connect])

(defn start [this]
  this)

(defn stop [this]
  ;;; TODO: in practice, we should have an on-close handler here for each client
  this)

(defn embedded-server [on-connect]
  (map->EmbeddedServer {:on-connect on-connect}))
