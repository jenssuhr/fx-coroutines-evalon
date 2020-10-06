Observed behavior:
- Both `gradle test` and running `ReadLogoTest` from IntelliJ work as expected
- Setting a breakpoint on e.g. line 10 of `ReadLogo` and the trying to debug the test using the IntelliJ
debugger results in a deadlock (see thread dump in `threaddump.txt`).
- The same breakpoint works fine when debugging `main()`. 

Environment:
- macOS 15.15.7
- OpenJDK 14.0.2
- IntelliJ 2020.2.2
- Kotlin 1.4.10
- Arrow 0.11.0
- kotest 4.2.6
