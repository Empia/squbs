scalaVersion in ThisBuild := "2.11.2"

version in ThisBuild := "0.6.0-SNAPSHOT"

organization in ThisBuild := "org.squbs"

publishArtifact := false

addCommandAlias("coverage", "scoverage:test")

ScoverageKeys.minimumCoverage in ThisBuild := 70

ScoverageKeys.failOnMinimumCoverage in ThisBuild := true

fork in Test in ThisBuild := true

parallelExecution in ScoverageTest in ThisBuild := false

parallelExecution in Test in ThisBuild := false

lazy val `squbs-unicomplex` = project

lazy val `squbs-zkcluster` = project dependsOn `squbs-unicomplex`

lazy val `squbs-httpclient` = project dependsOn (`squbs-unicomplex`, `squbs-testkit` % "test") 

lazy val `squbs-testkit` = project dependsOn `squbs-unicomplex`

lazy val `squbs-pattern` = project