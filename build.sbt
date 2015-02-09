name := "Logback_mail"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
	"ch.qos.logback"             	%       "logback-classic"     	%       "1.0.13",
        "javax.mail"                 	%       "mail"                 	%       "1.4.5"	)

