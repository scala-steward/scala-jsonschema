addSbtPlugin("org.scoverage" %% "sbt-scoverage" % "2.0.5")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype"  % "3.9.21")
addSbtPlugin("com.github.sbt" % "sbt-release"   % "1.1.0")
addSbtPlugin("com.github.sbt" % "sbt-pgp"       % "2.2.1")

// Format
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.6")

// Documentation
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox"                % "0.10.3")
addSbtPlugin("io.github.jonas"       % "sbt-paradox-material-theme" % "0.6.0")
addSbtPlugin("com.typesafe.sbt"      % "sbt-site"                   % "1.4.1")
addSbtPlugin("com.typesafe.sbt"      % "sbt-ghpages"                % "0.6.3")
addSbtPlugin("org.scalameta"         % "sbt-mdoc"                   % "2.3.7")

ThisBuild / libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always
