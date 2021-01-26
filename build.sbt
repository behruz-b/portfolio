name := "portfolio"
 
version := "1.0" 
      
lazy val `portfolio2` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"
      
scalaVersion := "2.13.4"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice ) ++ Seq(
  "org.webjars" %% "webjars-play" % "2.8.0-1",
  "org.webjars"% "jquery"% "3.4.1",
  "org.webjars" % "requirejs" % "2.2.0",
  "org.webjars" % "bootstrap" % "4.3.1"
)
