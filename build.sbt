//import DartKeys._

offline := false

scalaVersion := "2.10.2"

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

scalacOptions ++= Seq("-target:jvm-1.7","-language:postfixOps")

//scalacOptions += "-feature"

resolvers += Resolver.file("Local Repository", file("/Users/olivier/projects/scala/Play20/repository/local"))(Resolver.ivyStylePatterns)

//DartPlugin.settings

dartEntryPoints += "simple.dart"

dartEntryPoints += "simple2.dart"

dartWebUIEntryPoints += "testwebui.html"
