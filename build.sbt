//import DartKeys._

offline := true

scalaVersion := "2.10.1"

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

scalacOptions ++= Seq("-target:jvm-1.7","-language:postfixOps")

//scalacOptions += "-feature"

resolvers += Resolver.file("Local Repository", file("/Users/olivier/projects/scala/Play20/repository/local"))(Resolver.ivyStylePatterns)

//DartPlugin.settings

dartEntryPoints += "simple.dart"

dartWebUIEntryPoints += "testwebui.html"
