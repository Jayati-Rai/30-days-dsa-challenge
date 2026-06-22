# 🚀 30 Days DSA Challenge (Java + Maven)

This repository documents my **30-day journey of solving Data Structures & Algorithms problems**, with a focus on writing **clean, structured, and testable code** rather than just brute-solving questions.

---

## 📌 Challenge Description

The goal of this challenge is to:

* Strengthen **problem-solving and algorithmic thinking**
* Build consistency by solving problems daily
* Practice writing **optimized and readable code**
* Follow **industry-level practices** like project structuring and unit testing

Instead of treating DSA as isolated scripts, this project treats solutions like a **real codebase**.

---

## 🧠 Approach

* Each problem is organized into structured packages
* Focus on **optimal solutions** (HashMap, DP, etc.)
* Important problems include **JUnit 5 test cases**
* Built using a **Maven project structure**

---

## 🛠 Tech Stack

* Java
* Maven
* JUnit 5

---

## 📁 Project Structure

```plaintext
src/
 ├── main/java      → Problem solutions
 └── test/java      → Unit tests
```

---

## 📚 Topics Covered (Ongoing)

* Arrays & Strings
* Recursion & Backtracking
* Stack & Queue
* Linked Lists
* Trees & Graphs
* Dynamic Programming

---

## 📈 Current Progress

# 30 Days DSA Challenge 🚀

## Progress Tracker

| Day   | Topic                          | Pattern              | Problem                             | Status |
| ----- | ------------------------------ | -------------------- | ----------------------------------- | ------ |
| Day 1 | Hashing Basics                 | HashMap (Lookup)     | Two Sum                             | ✅      |
|       |                                |                      | Contains Duplicate                  | ✅      |
|       |                                |                      | Valid Anagram                       | ✅      |
| Day 2 | Hashing (Frequency + Grouping) | Frequency Map        | Group Anagrams                      | ✅      |
|       |                                |                      | Top K Frequent Elements             | ✅      |
| Day 3 | Hashing + Prefix Thinking      | Prefix Sum + HashMap | Subarray Sum Equals K               | ✅      |
|       |                                |                      | Product of Array Except Self        | ✅      |
| Day 4 | Two Pointers Basics            | Left–Right Traversal | Valid Palindrome                    | ✅      |
|       |                                |                      | Remove Duplicates from Sorted Array | ✅      |
| Day 5 | Two Pointers Advanced          | Pair Optimization    | Container With Most Water           | ✅      |
|       |                                |                      | 3Sum                                | ✅      |
| Day 6 | Mixed Practice         | Solved problems     | Solve without looking           | ✅      |
| Day 7 |Revision                  |                      |                                 | ✅      |
| Day 8 | Sliding Window Basics  | Fixed Window    | Maximum Sum Subarray of Size K           | ✅      |
|       |                                |                      | Longest Substring without repeating characters  
| Day 9 | Sliding Window Advance  | Variable Window    | Minimum Window Substring           | ✅      |
|       |                                |                      | Permutation in String    | ✅   |
| Day 10 | Stack basics  | LIFO    | Valid Parentheses           | ✅      |
|       |                                |                      | Min Stack    | ✅   |
| Day 11 | Monotonic Stack  | Next greater/smaller    | Next Greater Element Parentheses           | ✅      |
|       |                                |                      | Daily Temperatures    | ✅   |
---

## Patterns Learned

### Day 1 — Hashing Basics

**Pattern:** HashMap (Lookup)

**Key Insight:**
Use constant-time lookup to avoid nested loops and reduce complexity from O(n²) to O(n).

---

### Day 2 — Hashing (Frequency + Grouping)

**Pattern:** Frequency Map

**Key Insight:**
Count occurrences and group elements efficiently using HashMaps.

---

### Day 3 — Hashing + Prefix Thinking

**Pattern:** Prefix Sum + HashMap

**Key Insight:**
Store cumulative information to answer range and subarray questions efficiently.

---

### Day 4 — Two Pointers Basics

**Pattern:** Left–Right Traversal

**Key Insight:**
Process sorted or symmetric data from both ends to reduce extra space and improve runtime.

---

### Day 5 — Two Pointers Advanced

**Pattern:** Pair Optimization

**Key Insight:**
Use pointer movement strategically to eliminate unnecessary combinations and brute force checks.

---

### Day 6 — Mixed Practice

**Pattern:** Pattern Recognition

**Key Insight:**
Focus on identifying the underlying pattern of a problem before thinking about code. The goal is to connect new problems with previously learned techniques such as HashMaps, Prefix Sums, and Two Pointers.

---

### Day 7 — Revision

**Pattern:** Active Recall

**Key Insight:**
Revisit previously solved problems and rebuild solutions without looking at notes or code. True understanding is demonstrated by being able to derive the approach and explain the reasoning independently.

---

### Day 8 — Sliding Window Basics

**Pattern:** Fixed Window 

**Key Insight:**
Maintain a window of elements and update it incrementally as it moves through the array or string. Instead of recomputing results for every possible range, reuse previous work to reduce time complexity from O(n²) to O(n) in many cases.

---

### Day 9 — Sliding Window Advanced

**Pattern:** Dynamic Sliding Window

**Key Insight:**
Expand the window until all required characters are included, then shrink it as much as possible while maintaining validity. This approach efficiently finds the smallest valid substring without checking every possible window.

---

### Day 10 — Stack Basics

**Pattern:** LIFO (Last In, First Out)

**Key Insight:**
Use a stack when the most recently processed element must be accessed first. Stacks are particularly useful for matching pairs, maintaining order dependencies, and tracking state during traversal.

- **Valid Parentheses:** Push opening brackets and validate each closing bracket against the most recent unmatched opening bracket.
- **Min Stack:** Use an auxiliary stack to track the minimum value at each state, allowing retrieval of the minimum element in O(1) time.

---

### Day 11 — Monotonic Stack

**Pattern:** Next Greater/Smaller Element

**Key Insight:**
Maintain a stack in monotonic order to efficiently find the next greater or smaller element for each position. Instead of comparing every element with all future elements, use the stack to keep track of unresolved candidates and process each element only once.

- **Next Greater Element:** Use a decreasing stack to find the first greater element on the right.
- **Daily Temperatures:** Store indices in a decreasing stack and resolve waiting days when a warmer temperature is encountered.

---

## Goal

Complete 30 days of DSA while focusing on:

* Pattern Recognition
* Problem-Solving Frameworks
* Interview Preparation
* Consistent Daily Practice


## Progress

- Days Completed: **8 / 30**
- Problems Solved: **14**
- Topics Covered:
  - Arrays
  - Hashing
  - Two Pointers
  - Binary Search
  - Dynamic Programming (Basics)

### Legend
- ✅ Completed
- 🔄 In Progress
- ⏳ Pending

---

## 🔍 Example

### Two Sum

* **Idea:** Use a HashMap to store previously seen elements
* **Time Complexity:** O(n)
* **Space Complexity:** O(n)
* **Test Coverage:** Included using JUnit

---

## 🎯 Goal

To go beyond solving problems and focus on:

* Writing **clean and maintainable code**
* Building **testable solutions**
* Following **real-world development practices**

---

## 🚧 Upcoming

* More problems with optimized approaches
* Better test coverage for edge cases
* Topic-wise organization (Arrays, DP, Graphs, etc.)

---
