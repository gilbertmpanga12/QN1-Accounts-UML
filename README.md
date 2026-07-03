## How to test in NetBeans

1. Open NetBeans.
2. Click `File` > `Open Project`.
3. Select this folder: `QN1-Accounts-UML`.
4. Right-click the project and choose `Run`.
5. NetBeans should recognize it as a Maven Java project because of the `pom.xml` file.

You can also test in a terminal:

```bash
javac src/*.java
java -cp src Main
```

If Maven is available, you can also run:

```bash
mvn compile exec:java
```
