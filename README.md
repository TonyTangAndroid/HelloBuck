# An okbuck sample that works with AndroidX within two command line.



## How to run
1. Generate the ./buckw file.

```
./gradlew buckWrapper
```

2. Install a debug version and run it.

 ```
./buckw install //app:bin_debug --run
 ```
 
 The apk is generated under folder
 
 ```
 ${root_project_dir}/buck-out/gen/app/bin_debug.apk
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



## The configuration

This is the key configuration to make it works.

```
apply plugin: 'com.uber.okbuck'
okbuck {
    buildToolVersion = '28.0.3'

    lint {
        disabled = true
    }
    externalDependencies {
        downloadInBuck = false
    }
    jetifier {
        aarOnly = true
    }
}

```