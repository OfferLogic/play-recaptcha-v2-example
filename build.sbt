name := "recaptcha-v2-example"

version := "1.5"    

libraryDependencies ++= Seq(
  "com.nappin" %% "play-recaptcha" % "1.5",
  specs2 % Test,
  "org.mockito" % "mockito-core" % "1.+" % Test 
)

scalaVersion := "2.11.6"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

routesGenerator := InjectedRoutesGenerator

// Enable this if using a snapshot release of play-recaptcha
//resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
