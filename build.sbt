ThisBuild / scalaVersion := "2.13.13"
ThisBuild / version := "1.0-SNAPSHOT"
name := "Sub-Projects-Play3.0"

lazy val common = (project in file("modules/common"))
  .enablePlugins(PlayScala)

lazy val admin = (project in file("modules/admin"))
  .enablePlugins(PlayScala).dependsOn(common)

lazy val website = (project in file("modules/website"))
  .enablePlugins(PlayScala).dependsOn(common)

lazy val main = (project in file("."))
  .enablePlugins(PlayScala)
  .aggregate(admin, website, common)
  .dependsOn(admin, website, common)


libraryDependencies ++= Seq(
  guice
)