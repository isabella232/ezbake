(defproject puppetlabs.packages/jvm-puppet "0.1.0-SNAPSHOT"
  :description "Release artifacts for jvm-puppet"
  :pedantic? :warn
  :dependencies [[puppetlabs/jvm-puppet "0.1.0-SNAPSHOT"]
                 [puppetlabs/trapperkeeper-webserver-jetty9 "0.3.4"]]

  :uberjar-name "jvm-puppet-release.jar"

  :repositories [["releases" "http://nexus.delivery.puppetlabs.net/content/repositories/releases/"]
                 ["snapshots" "http://nexus.delivery.puppetlabs.net/content/repositories/snapshots/"]]
  :main puppetlabs.trapperkeeper.main
  )