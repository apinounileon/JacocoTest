# Generate a report
To generate a report, simply run : 
```shell
mvn verify
```
This will create a **jacoco** directory inside the **/target** folder, containing the HTML report.
### Changing the output directory
In the [pom.xml](pom.xml) file, you can specify the output path for jacoco reports:
```xml
<configuration>
    ...
    <outputDirectory>${project.basedir}/target/jacoco</outputDirectory>
</configuration>
```