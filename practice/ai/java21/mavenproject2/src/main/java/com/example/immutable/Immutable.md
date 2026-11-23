/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.immutable;

import java.util.ArrayList;

public class Animal {

    private final ArrayList<String> favouriteFood;

    public Animal() {
        this.favouriteFood = new ArrayList<>();
        this.favouriteFood.add("apple");
    }

    public ArrayList<String> getFavouriteFood() {
        return favouriteFood;
    }

    public static void main(String[] args) {
        var zebra = new Animal();
        System.out.println(zebra.getFavouriteFood());
        zebra.getFavouriteFood().add("chocalates");
        System.out.println(zebra.getFavouriteFood());
    }
}
here favouriteFood is final but its changes


Excellent question\! This is an important concept in Java: `final` prevents reassignment of a reference, not modification of the object it references.

Let's understand your code.

### 1. What does `final` mean here?

java

```java
private final ArrayList<String> favouriteFood;
```

Here, `final` means that once `favouriteFood` is assigned an object, you cannot make it refer to another object.

For example:

java

```java
public Animal() {
    this.favouriteFood = new ArrayList<>();
    this.favouriteFood.add("apple");
}
```

This is allowed because you assign the reference once.

But this is NOT allowed:

java

```java
this.favouriteFood = new ArrayList<>(); // Compilation error
```

You cannot reassign the final reference.

### 2. Why can you still modify the ArrayList?

Because `final` does not make the object immutable.

Your getter returns the actual reference to the internal ArrayList:

java

```java
public ArrayList<String> getFavouriteFood() {
    return favouriteFood;
}
```

So when you write:

java

```java
zebra.getFavouriteFood().add("chocalates");
```

You are modifying the existing ArrayList, not changing the reference.

### 3. Visual representation

Initially:

Animal object

`final favouriteFood`

ArrayList

- apple

After adding chocolates:

Animal object

`final favouriteFood`

Same ArrayList

- apple
- chocolates

The reference remains unchanged, but the object's contents change.

### 4. How can you prevent modification?

If you want to prevent callers from modifying your list, use `Collections.unmodifiableList()`.

java

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Animal {

    private final List<String> favouriteFood;

    public Animal() {
        this.favouriteFood = new ArrayList<>();
        this.favouriteFood.add("apple");
    }

    public List<String> getFavouriteFood() {
        return Collections.unmodifiableList(favouriteFood);
    }
}
```

Now this will throw `UnsupportedOperationException`:

java

```java
zebra.getFavouriteFood().add("chocolates");
```

### Remember this important distinction

| Keyword/concept | Meaning |
| --- | --- |
| `final` reference | Cannot point to another object |
| Mutable object | Its internal state can change |
| Immutable object | Its internal state cannot change |
| `Collections.unmodifiableList()` | Prevents modification through that returned view |

Interview tip: `final` does not mean immutable. It means the variable cannot be reassigned. The object it references can still be mutable.