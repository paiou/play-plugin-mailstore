
name := "play-plugin-mailstore"

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.2"

scalacOptions ++= Seq("-deprecation", "-feature")

libraryDependencies ++= Seq(
//  "org.scala-lang.modules" %% "scala-async" % "0.9.0-M2",
  "com.typesafe.play" %% "play" % "2.2.1" % "provided",
  "com.typesafe" %% "play-plugins-mailer" % "2.2.0"
)

resolvers ++= Seq(
  Resolver.typesafeRepo("releases")
)

publishMavenStyle := false

publishTo <<= (version) { v: String =>
  val status = if(v.trim.endsWith("-SNAPSHOT")) "snapshots" else "releases"
  Some(Resolver.sbtPluginRepo(status))
}

//playScalaSettings

