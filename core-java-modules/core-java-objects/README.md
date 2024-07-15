# README

## Shallow and Deep Copy Examples in Java

This repository contains Java examples demonstrating the concepts of shallow copy and deep copy using custom `Person` and `Address` classes.

### Contents

1. **ShallowCopyExample.java**
    - Demonstrates shallow copying where the copied object shares references with the original object.
2. **DeepCopyExample.java**
    - Demonstrates deep copying where the copied object has its own separate copy of the referenced objects.
3. **Address.java** and **Person.java**
    - Contain the implementations of the `Address` and `Person` classes with methods for shallow and deep copying.

The `Address` class represents an address with a single attribute `city`. It includes a `deepCopy` method to create a deep copy of an `Address` object.

The `Person` class represents a person with a `name` and an `address`. It includes methods to create shallow and deep copies of a `Person` object.

### Usage

To run these examples, compile and run the respective Java files using your preferred IDE or command line.

For example, using the command line:

```bash
javac ShallowCopyExample.java
java ShallowCopyExample

javac -d . DeepCopyExample.java
java com.baeldung.DeepCopyExample
```

### Conclusion

This repository provides a clear demonstration of the differences between shallow and deep copying in Java. By examining the behavior of the `ShallowCopyExample` and `DeepCopyExample` classes, you can understand how object references are handled in each case.
