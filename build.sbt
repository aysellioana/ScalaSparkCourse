name := "SparkScalaCourse"

version := "0.1"

scalaVersion := "2.13.3"




libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.2.0" withSources() withJavadoc(),
  "org.apache.spark" %% "spark-sql" % "3.2.0" withSources() withJavadoc(),
  "org.apache.spark" %% "spark-mllib" % "3.2.0" withSources() withJavadoc(),
  "org.apache.spark" %% "spark-streaming" % "3.2.0" withSources() withJavadoc(),
  "org.twitter4j" % "twitter4j-core" % "4.0.7" withSources() withJavadoc(),
  "org.twitter4j" % "twitter4j-stream" % "4.0.7" withSources() withJavadoc()
)

//assemblyMergeStrategy /  assembly := {
//  case PathList("META-INF", _*) => MergeStrategy.discard
//  case _                        => MergeStrategy.first
//}

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}