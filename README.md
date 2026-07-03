# QN1 Accounts UML

## Relationships in the UML diagram

1. `Account` implements `Statement`. This is interface implementation / realization.
2. `SavingsAccount` extends `Account`. This is inheritance / generalization.
3. `CurrentAccount` extends `Account`. This is inheritance / generalization.
4. `Customer` has a list of `Account` objects. This is aggregation.

## Multiplicity between Customer and Account

The diagram shows `1` near `Customer` and `0..*` near `Account`.

This means one customer can have zero, one, or many accounts. Each account belongs to one customer in this design.

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
