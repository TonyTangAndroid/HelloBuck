Usage:
  buck test [<targets>] [<options>]

Description:
  Builds and runs the tests for one or more specified targets.
  You can either directly specify test targets, or any other target which
  contains a `tests = ['...']` field to specify its tests. Alternatively,
  by specifying no targets all of the tests will be run.
  Tests get run by the internal test runner unless an external test runner
  is specified in the .buckconfig file. Note that not all of the options
  are applicable to all build rule types. Likewise, when an external test
  runner is being used, some of the options listed here may not apply, and
  you may need to use options specific to that test runner. See -- option.

Options:
 -- LIST<STRING>                        : When an external test runner is
                                          specified to be used (in the
                                          .buckconfig file), all options
                                          specified after -- get forwarded
                                          directly to the external test runner.
                                          Available options after -- are
                                          specific to that particular test
                                          runner and you may also want to
                                          consult its help pages.
 --all                                  : Whether all of the tests should be
                                          run.
 --build-filtered                       : Whether to build filtered out tests.
 --build-report PATH                    : File where build report will be
                                          written.
 --code-coverage                        : Whether code coverage information
                                          will be generated.
 --code-coverage-format [CSV | HTML |   : Comma separated Formats to be used
 XML]                                     for coverage
 --code-coverage-title VAL              : Title used for coverage
 --config (-c) section.option=value     : Override .buckconfig option
 --config-file PATH                     : Override options in .buckconfig using
                                          a file parameter
 --debug                                : Whether the test will start suspended
                                          with a JDWP debug port of 5005
 --deep                                 : Perform a "deep" build, which makes
                                          the output of all transitive
                                          dependencies available.
 --exclude-incompatible-targets         : Exclude targets that are not
                                          compatible with the given target
                                          platform. (experimental)
 --exclude-transitive-tests             : Only run the tests targets that were
                                          specified on the command line
                                          (without adding more tests by
                                          following dependencies).
 --help                                 : Prints the available options and
                                          exits.
 --keep-going                           : Keep going when some targets can't be
                                          made.
 --local                                : Disable distributed build (overrides
                                          --distributed).
 --no-cache                             : Whether to ignore the remote & local
                                          cache declared in .buckconfig.
 --num-threads (-j) N                   : Default is 1.25 * num processors.
 --out PATH                             : Copies the output of the lone build
                                          target to this path.
 --output-test-events-to-file           : Serialize test-related event-bus
 (--output-events-to-file) VAL            events to the given file as
                                          line-oriented JSON objects.
 --populate-cache                       : Performs a cache population, which
                                          makes the output of all unchanged
                                          transitive dependencies available (if
                                          these outputs are available in the
                                          remote cache). Does not build changed
                                          or unavailable dependencies locally.
 --profile-buck-parser                  : Enable profiling of buck.py internals
                                          (not the target being compiled) in
                                          the debuglog and trace.
 --report-absolute-paths                : Reports errors using absolute paths
                                          to the source files instead of
                                          relative paths.
 --rulekeys-log-path VAL                : If set, log a binary representation
                                          of rulekeys to this file.
 --run-with-java-agent VAL              : Whether the test will start a java
                                          profiling agent
 --shallow                              : Perform a "shallow" build, which only
                                          makes the output of all explicitly
                                          listed targets available.
 --show-full-json-output                : Show full output in JSON format.
 --show-full-output                     : Print the absolute path to the output
                                          for each of the built rules.
 --show-json-output                     : Show output in JSON format.
 --show-output                          : Print the path to the output for each
                                          of the built rules relative to the
                                          cell.
 --show-rulekey                         : Print the rulekey for each of the
                                          built rules.
 --shuffle                              : Randomize the order in which test
                                          classes are executed.WARNING: only
                                          works for Java tests!
 --skylark-profile-output PATH          : Experimental. Path to a file where
                                          Skylark profile information should be
                                          written into. The output is in Chrome
                                          Tracing format and can be viewed in
                                          chrome://tracing tab
 --target-platforms VAL                 : Target platforms.
 --test-runner-env                      : Add or override an environment
                                          variable passed to the test runner.
                                          Later occurrences override earlier
                                          occurrences. Currently this only
                                          support Apple(ios/osx) tests.
 --verbose (-v) N                       : Specify a number between 0 and 8. '-v
                                          1' is default, '-v 8' is most verbose.
 --xml VAL                              : Where to write test output as XML.
 --adb-threads (-T) N                   : Number of threads to use for adb
                                          operations. Defaults to number of
                                          connected devices.
 --all-devices (-x)                     : Install .apk on all connected devices
                                          and/or emulators (multi-install mode)
 --emulator (-e)                        : Use this option to use emulators only.
 --device (-d)                          : Use this option to use real devices
                                          only.
 --serial (-s, --udid) <serial-number>  : Use device or emulator with specific
                                          serial or UDID number.
 --simulator-name (-n) <name>           : Use simulator with specific name
                                          (Apple only).
 --test-selectors (--filter, -f)        : Select tests to run using <class>,
 TEST-SELECTOR                            #<method> or <class>#<method>.
                                          Selectors are interpreted as
                                          java.util.regex regular expressions.
                                          Not every language supports these
                                          selectors. Notably, C++ and python do
                                          not respect these filters. Note also
                                          that if an external test runner is
                                          used, this filter also ignored. If
                                          the class (or method) part is
                                          omitted, all classes (or methods)
                                          will match.  If both the class and
                                          method is omitted (the string '#')
                                          then all tests will match.  Prefix a
                                          selector with '!' to exclude a class
                                          or method.  If multiple selectors are
                                          given, the first matching selector is
                                          used to include (or exclude) a test.
                                          By default, all tests are excluded
                                          unless a selector includes them.
                                          However, if all selectors are
                                          exclusive then the default is to
                                          include.  Use the format
                                          ':/path/to/file' to load selectors,
                                          one per line, from a file.  Examples:
                                          'com.example.MyTest' to run all tests
                                          in MyTest; 'com.example.MyTest#testFoo
                                          ' or 'MyTest#Foo' to just run the
                                          testFoo test; '!MyTest#Foo' to run
                                          everything except the testFoo test;
                                          '#Important !TestA !TestC #' to only
                                          run the important tests in TestA and
                                          TestC and run everything else.)
 --explain-test-selectors               : Buck will say how it interpreted your
                                          test selectors before running tests.
 --exclude LIST<LABELS>                 : Labels to ignore when running tests,
                                          --exclude L1 L2 ... LN.
 --labels (--include) LIST<LABELS>      : Labels to include (or exclude, when
                                          prefixed with '!') when running test
                                          rules.  The first matching statement
                                          is used to decide whether to include
                                          or exclude a test rule.
 --always-exclude (--always_exclude)    : If set, an exclude filter will win
                                          over a target on the command line, so
                                          tests that were both specified to run
                                          on the command line and are excluded
                                          through either the '--exclude' option
                                          or in the .buckconfig will not run.