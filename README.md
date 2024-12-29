# Java List Tutorial

Welcome to the Java List Tutorial repository! This repository aims to provide a comprehensive guide to using lists in Java, focusing on the different types of lists, their characteristics, algorithm complexities, and use cases.

## Table of Contents

1. [Introduction](#introduction)
2. [Types of Lists](#types-of-lists)
3. [List Operations](#list-operations)

## Introduction

In Java, the `List` interface is part of the `java.util` package and represents an ordered collection of elements. Lists are dynamic, meaning their size can change as elements are added or removed. Unlike sets, lists allow duplicate elements. The `List` interface is implemented by several classes, each optimized for different operations, such as fast access, insertion, and thread safety.

## Types of Lists

### 1. **ArrayList**
- **Description**: A resizable array implementation of the `List` interface.
- **Key Features**:
    - Fast random access by index.
    - Slower insertions and deletions, especially in the middle of the list.
    - Does not guarantee thread-safety.
- **Algorithm Complexity**:
    - **Access by index**: O(1)
    - **Search**: O(n)
    - **Insert at end**: O(1) amortized
    - **Insert/remove at middle**: O(n)
    - **Resize**: O(n) when the internal array needs to be expanded.
- **Use Case**: Best for scenarios where fast access to elements by index is required and modifications are infrequent.

### 2. **LinkedList**
- **Description**: A doubly linked list implementation of the `List` interface.
- **Key Features**:
    - Efficient insertions and removals at the beginning or middle of the list.
    - Slower random access by index compared to `ArrayList`.
- **Algorithm Complexity**:
    - **Access by index**: O(n)
    - **Search**: O(n)
    - **Insert/remove at beginning/end**: O(1)
    - **Insert/remove in the middle**: O(n)
- **Use Case**: Ideal for scenarios where there are frequent insertions and deletions, particularly at the beginning or middle of the list.

### 3. **Vector**
- **Description**: An older class that implements a dynamically resizing array.
- **Key Features**:
    - Synchronized, ensuring thread safety.
    - Slower than `ArrayList` due to the overhead of synchronization.
- **Algorithm Complexity**:
    - **Access by index**: O(1)
    - **Search**: O(n)
    - **Insert at end**: O(1) amortized
    - **Insert/remove at middle**: O(n)
- **Use Case**: Rarely used in modern Java programs due to performance concerns; primarily used when thread safety is necessary.

### 4. **Stack**
- **Description**: A subclass of `Vector` that implements a stack (LIFO).
- **Key Features**:
    - Follows Last-In-First-Out (LIFO) order for elements.
    - Inherits thread-safety from `Vector`.
- **Algorithm Complexity**:
    - **Push**: O(1)
    - **Pop**: O(1)
    - **Peek**: O(1)
    - **Search**: O(n)
- **Use Case**: Commonly used in algorithmic tasks where stack behavior is needed, such as recursive problems or depth-first search (DFS).

### 5. **CopyOnWriteArrayList**
- **Description**: A thread-safe variant of `ArrayList`.
- **Key Features**:
    - Ensures thread safety by creating a copy of the list for write operations.
    - Expensive for write-heavy operations but very efficient for read-heavy workloads.
- **Algorithm Complexity**:
    - **Access by index**: O(1)
    - **Search**: O(n)
    - **Insert/remove**: O(n) (due to copying the array for each write)
    - **Iterate**: O(n)
- **Use Case**: Best suited for situations where the list is frequently read but rarely modified, such as in multi-threaded environments where data is mostly static.

## List Operations

Here are some common operations you can perform on lists in Java:

- **Adding elements**: `add()`, `addAll()`
- **Accessing elements**: `get()`
- **Removing elements**: `remove()`, `removeAll()`
- **Checking list size**: `size()`
- **Iterating over elements**: `for`, `forEach()`, `iterator()`
- **Sorting elements**: `sort()`
- **Searching elements**: `contains()`, `indexOf()`
