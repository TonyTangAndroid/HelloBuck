Description:
  Buck build tool

Usage:
  buck [<options>]
  buck <command> --help
  buck <command> [<command-options>]

Available commands:
  audit          lists the inputs for the specified target
  build          builds the specified target
  cache          makes calls to the artifact cache
  cachedelete    Delete artifacts from the local and remote cache
  clean          deletes any generated files and caches
  distbuild      attaches to a distributed build (experimental)
  doctor         debug and fix issues of Buck commands
  fetch          downloads remote resources to your local machine
  fix            attempts to fix errors encountered in the previous build
  help           shows this screen (or the help page of the specified command) and exits.
  install        builds and installs an application
  kill           kill buckd for the current project
  killall        kill all buckd processes
  project        generates project configuration files for an IDE
  publish        builds and publishes a library to a central repository
  query          provides facilities to query information about the target nodes graph
  rage           debug and fix issues of Buck commands
  root           prints the absolute path to the root of the current buck project
  run            runs a target as a command
  server         query and control the http server
  targets        prints the list of buildable targets
  test           builds and runs the tests for the specified target
  uninstall      uninstalls an APK
  verify-caches  Verify contents of internal Buck in-memory caches.

Options:
 --flagfile FILE : File to read command line arguments from.
 --help (-h)     : Shows this screen and exits.
 --version (-V)  : Show version number.