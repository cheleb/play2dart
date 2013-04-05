// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Orcades-LR repository" at "http://www.orcades.net/tmprepo/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("play" % "sbt-plugin" % "2.1.1")

addSbtPlugin("net.orcades" % "sbt-dart-plugin" % "0.2.1-SNAPSHOT")
