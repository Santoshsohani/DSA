# Data Structures & Algorithms
Data Structures is the way to store the data. such that it can be used effectively.

Consider Data Structures as containers - Each containers can be used to store data based upon the use case
- **Arrays** : Used to store data in fixed format
- **Linked List**: Store data using pointers (Links)
- **Stack** : LIFO
- **Queue** : FIFO
- **Tress & Graphs** : Used to store hierarchical data. 

Algorithms on the other hand are the step-by-step process to perform a given task or solve a given problem
Some of the common algorithms:
- Searching
- Sorting

# Patters & Techniques
1. Two Pointers
2. Sliding Window
3. Hashing
4. Prefix Sum
5. Backtracking
6. Dynamic Programming
7. Binary Search
8. Recursion
9. Divide and Conquer
10. Tree Traversal Techniques
11. Graph Traversal Techniques
12. Greedy
13. Bit Manipulation

# Complexity
**Time Complexity** refers to how fast your algorithm works as the input grows, technical definition can be Time complexity is an function which represents how many steps your algorithm takes for a given input of size `n`

It is denoted using `O`

| Big-O Notation | Name          |
| -------------- | ------------- |
| O(1)           | Constant      |
| O(logn)        | Logarithimc   |
| O(n)           | Linear        |
| O(n * logn)    | linearithimic |
| O(n^2)         | Qudaratic     |
| O(2^n)         | Exponential   |
| O(n!)          | Factorial     |

**Space Complexity** is the total memory consumed when an algorithm is executed for an given input.

| Complexity | Meaning                   |
| ---------- | ------------------------- |
| O(1)       | Constant space            |
| O(n)       | Linear space              |
| O(log n)   | Logarithmic (e.g., stack) |
| O(n²)      | Quadratic space           |


# Scalability
Scalability refers to how efficiently  your algorithm can perform when the input increases.

If your code works fine for 100 elements but crashes for 10⁶ — that’s a **scalability issue**.

| Input Size   | Acceptable Time Complexity |
| ------------ | -------------------------- |
| 10^6 or 10^7 | O(n) or O(n logn)          |
| 10^4         | O(n^2)                     |
| <= 10^3      | O(n^3) or less             |

Final conclusion is that your algorithm needs to scaled based upon the size of the input.

# Case Table

| Algorithm      | Best Case  | Average Case | Worst Case |
| -------------- | ---------- | ------------ | ---------- |
| Linear Search  | O(1)       | O(n)         | O(n)       |
| Binary Search  | O(1)       | O(log n)     | O(log n)   |
| Bubble Sort    | O(n)       | O(n²)        | O(n²)      |
| Insertion Sort | O(n)       | O(n²)        | O(n²)      |
| Merge Sort     | O(n log n) | O(n log n)   | O(n log n) |
| Quick Sort     | O(n log n) | O(n log n)   | O(n²)      |


# Rules 
**Basic Rules:**
- Single Loop : `O(n)`
- Nested Loop : `O(n^2)`
- Multiply : `O(log n)`
- Divide the input : `O(log n)`

```
O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(2ⁿ) < O(n!)
```


# Asymptotic Notations
These are the notations which describes the performance of an algorithm as the input size move towards infinity.

|Notation|Name|What it tells us|
|---|---|---|
|`O()`|**Big O**|**Upper Bound** — Worst case|
|`Ω()`|**Big Omega**|**Lower Bound** — Best case|
|`Θ()`|**Big Theta**|**Tight Bound** — When best = worst|

# Patterns

1. Rectangular Star Pattern
**Problem Statement**: Given an integer N, print the following pattern.
```python
def rectangular_star_pattern(n:int):
    for i in range(0,n):
        for j in range (0,n):
            print("* ", end="")
        print()
        
        
rectangular_star_pattern(5)
```
