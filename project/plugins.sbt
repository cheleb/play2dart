// Comment to get more information during initialization
logLevel := Level.Warn

offline := true

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"


// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.0")

addSbtPlugin("net.orcades" % "sbt-dart-plugin" % "0.2.2-SNAPSHOT")
