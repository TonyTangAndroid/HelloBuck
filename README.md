# An okbuck sample that actually work with just two command line.



## How to run
1. Generate the ./buckw file.

```
./gradlew buckWrapper
```

2. Install a debug version and run it.

 ```
./buckw install //app:bin_debug --run
 ```

## Optional commands

3. List all targets.

 ```
./buckw targets //...
 ```

4. Build the okbuck for all targets.

 ```
./buckw build //...
 ```
