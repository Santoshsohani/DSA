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
```
* * *
* * *
* * *
```
```python
def rectangular_star_pattern(n:int):
    for i in range(0,n):
        for j in range (0,n):
            print("* ", end="")
        print()
        
        
rectangular_star_pattern(5)
```
2. Right angled star pattern

**Problem Statement**: Given an integer N, print the following pattern.

```
*
* *
* * *
* * * *
```

```python
def right_angle_star_pattern(n:int):
    for i in range(0,n):
        for j in range(0,i):
            print("* ", end="")
        print()
        
        
right_angle_star_pattern(5)
```

3. Reverse right pyramid

**Problem Statement**: Given an integer N, print the following pattern.
```
* * * *
* * *
* *
*
```
```python
def reverse_right_pyramid(n: int):
    for i in range(n,0,-1):
        for j in range(0,i):
            print("* ", end="")
        print()
reverse_right_pyramid(5)
```

# Mathematics

1. Count digits in a number

**Problem Statement**:  Given an integer N, return the number of digits in N. 
```python
def count_digits(n):
    n = abs(n)
    if n == 0:
        return 1
    
    count = 0
    while n > 0:
        n = n//10
        count += 1
    
    return count
```
2.  Reverse Integer

**Problem Statement**: Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

```python
class Solution:
    def reverse(self, x: int) -> int:
        INT_MIN = -2**31
        INT_MAX = 2**31-1
        sign = 1

        if x < 0:
            sign = -1
        else:
            sign = 1


        x_abs = abs(x)
        reversed_num = 0

        while x_abs != 0:
            digit = x_abs % 10
            x_abs = x_abs // 10
            reversed_num = reversed_num * 10 + digit


        reversed_num *= sign

        if reversed_num < INT_MIN or reversed_num > INT_MAX:
            return 0
        return reversed_num
```

3. GCD : GCD is the largest number which exactly divides the numbers.

```python
def gcd(a,b):
    while b != 0:
        temp = a
        a = b
        b = temp % b
        
    return a
```
4. Armstrong number

**Problem Statement**:  An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits. 


```python
def armstrong(num):
    if num == 1:
        return True
    
    original_num = num
    sum = 0
    digits = []
    
    while num != 0:
        digit  = num % 10
        num = num // 10
        digits.append(digit)
        
   
    for d in digits:
        sum  += d ** len(digits)
    
    
    return sum == original_num


print(armstrong(13))
```

5. Check Plaindrome

```python
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        
        original = x
        reversed_num = 0

        while x != 0:
            digit = x % 10
            x = x // 10
            reversed_num = reversed_num * 10 + digit

        return original == reversed_num
```

6. Divisors
```python
def divisors(num):
    res = []
    
    for i in range(1,num//2+1):
        if num % i == 0:
            res.append(i)
    
    res.append(num)
    
    return res
    
print(divisors(36))
```

7. Prime Number

A prime number is a natural number greater than 1 that has exactly two distinct positive divisors:
- 1
- Itself

```python
def prime_or_not(num):
    if num <= 1:
        return False
        
    for i in range(2, int(num * 0.5)+1):
        if num % i == 0:
            return False
    
    return True
```

# Recursion
A Recursion is a function which calls itself under a specific condition. The condition is called as **Base Case**
```python
count = 0 

def print_counter():
    global count  
    
    if count == 3:
        return
    
    print(count)
    count += 1
    print_counter()  

print_counter()
```
Here `if count == 3` is the base case.

1. Print 1 to N Using Recursion
```python
def print_1_n(i,N):
    if i > N:
        return
    
    print(i)
    print_1_n(i+1,N)
    

print_1_n(1,10)
```
```python
# Using BackTracking

def print_1_to_n(i,n):
    if i < 1:
        return
    
    print_1_to_n(i-1,n)
    print(i)
```

2. Print N to 1 using Recursion
```python
def print_n_1(n):
    if n < 1:
        return
    
    print(n)
    print_n_1(n-1)
```

# Hashing

### **Definition**

* **Hashing**: Mapping data (key) → fixed-size integer (hash value) using a **hash function**.
* Used for **fast lookup, insertion, and deletion**.

---

### **Hash Function in Python**

```python
hash_value = hash(key)
```

* Deterministic within a single run.
* Can be negative.
* Varies between runs (security feature).

---

### **Hashable**

* **Immutable** objects: `str`, `int`, `tuple` (if all elements are hashable).
* Custom objects → define `__hash__` and `__eq__`.

---

### **Core Data Structures**

* **dict**: Key → Value mapping, O(1) average lookup.
* **set**: Stores unique keys, O(1) average lookup.

---

### **Collisions**

* Two keys with the same hash.
* Python resolves with **open addressing (perturbation probing)**.

---

### **Complexity**

* **Average case**: O(1) for insert, search, delete.
* **Worst case**: O(n) if too many collisions.
* Space: O(n).

---

### **Custom Hash Example**

```python
class Point:
    def __init__(self, x, y):
        self.x, self.y = x, y
    def __hash__(self):
        return hash((self.x, self.y))
    def __eq__(self, other):
        return self.x == other.x and self.y == other.y
```

---

### **Uses in DSA**

* Duplicate detection
* Frequency counting
* Symbol tables, caches
* Graph algorithms (visited sets)

---

1. Count Frequency
```python
arr = [10,20,30,40,40,10,20]

def count_frequency(nums):
    res = {}
    for num in nums:
        if num in res:
            res[num] += 1
        else:
            res[num] = 1
    return res
```
