import sbtassembly.AssemblyPlugin.autoImport.assembly

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.12"

lazy val root = (project in file("."))
  .settings(
    name := "myproject"
  )

assembly / assemblyOutputPath := file("/Users/wassim/Desktop/git/incubator-toree/my_project.jar")

Global / onChangedBuildSource := ReloadOnSourceChanges