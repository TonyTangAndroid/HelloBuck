## Issue desc:

If I enable lint by with the following block

```

okbuck {
    lint {
        version = '26.3.2'
    }
    externalDependencies {
        downloadInBuck = false
    }
}

```

It will break command with `//...` with error
`/app:lint_release: parameter 'bash': The macro '$(location //:)' could not be expanded:`

Help would be appreciated.




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