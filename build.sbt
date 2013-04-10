import DartKeys._

scalaVersion := "2.10.1"

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

scalacOptions ++= Seq("-target:jvm-1.7","-language:postfixOps")

//scalacOptions += "-feature"

DartPlugin.settings

dartWebUIEntryPoints += "testwebui.html"
