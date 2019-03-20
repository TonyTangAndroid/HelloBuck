1. Generate the ./buckw file.

```
./gradlew buckWrapper
```

2. Build the okbuck for all targets.

 ```
 ./buckw build ...
 ```

3. List all targets.

 ```
 ./buckw build ...
 ```

4. Install a debug version and run it.

 ```
 ./buckw install //app:bin_debug --run
 ```