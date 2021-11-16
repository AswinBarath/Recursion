# Recursion

*Tips, Notes, Patterns & Problem solving based on the Recursion concepts*

## SDE Sheet problems on Recursion & Backtracking

[Sheet Link](https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/)

### Day 9 Recursion

| Completion Status | Problems on Recursion | Explanation | Solution |
| --- | --- | --- | --- |
| ✅ | [Subset Sums](https://practice.geeksforgeeks.org/problems/subset-sums2234/1#) | [Brute, Better & Optimal Approaches](#subset-sums) | [Java Soultion](./src/sde_sheet/SubsetSums_I.java) |
| 🔃 | [Subsets II](https://leetcode.com/problems/subsets-ii/) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/.java) |
| 🔃 | [Combination Sum](https://leetcode.com/problems/combination-sum/) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/.java) |
| 🔃 | [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/.java) |
| 🔃 | [Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/.java) |
| 🔃 | [Permutation Sequence](https://leetcode.com/problems/permutation-sequence/) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/.java) |

### Day 10 (Recursion, Backtracking)

| Completion Status | Problems on Recursion | Explanation | Solution |
| --- | --- | --- | --- |
| 🔃 | [Permutations](https://leetcode.com/problems/permutations/) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/.java) |
| 🔃 | [N-Queens](https://leetcode.com/problems/n-queens-ii/) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/.java) |
| 🔃 | [Sudoku Solver](https://leetcode.com/problems/sudoku-solver/) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/.java) |
| 🔃 | [m Coloring Problem](https://www.geeksforgeeks.org/m-coloring-problem-backtracking-5/) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/.java) |
| 🔃 | [Rat in a Maze](https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1#) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/.java) |
| 🔃 | [Word Break](https://leetcode.com/problems/word-break/) | [Brute, Better & Optimal Approaches](#) | [Java Soultion](./src/sde_sheet/.java) |

---

## Subset Sums

- Time Complexity: **(2^N) + ((2^N) * log(2^N))**
  - For every index, we have two recursive choices (pick & don't pick)
  - So, if the no. of indices is **N**, then the time complexity for all the choices in the recursive tree is **2^N**
  - As per the question, we have to return the answer - sum of individual subsets, in the increasing order. Hence, for sorting the answer it will take **(2^N) * log(2^N)**

---

## Tips

- The problem-solving mindset to solve recursion problems comes with **Practice!**
- This is the most important concept from all of the Data Structures and Algorithms concepts
- Recursion provides the base knowledge for more than 90% of the topics involving problem-solving
- Clear understanding of Recursion is important to solve problems like:
  - Binary Trees
  - Linked lists
  - Binary Search Trees
  - Dynamic Programming
  - Heaps
  - Graphs
  - Traversals
- Prerequisites for Recursion:
  - Functions
  - Memory Management
- You will face difficulties while learning Recursion, **so don't skip it! don't give up!**
- Because once you understand recursion its very easy to proceed with problem solving
- **Don't break your learning streak!**
- Do not overthink !

## Working of function calls

- Until function is not finished execution, it will remain in call stack
- When a function finishes execution, it is removed from the stack and the flow of the program is restored to where that function was called

## What is Recursion ?

- A function that calls itself

### Base condition in Recursion

- Condition where our recursion will stop making new calls
- No base condition -> Function calls will keep happening and the stack will be filled again and again
- For every call of a function will take some memory in stack
- When the memory of computer will exceed the limit -> StackOverflow error

### Why Recursion ?

- It helps us in solving bigger/complex problems in a simple way
- You can convert recursion solutions into iteration and vice versa
- Space complexity: O(N) where N is the number of recursive calls, hence it's not constant
- It helps us in breaking down bigger problems into smaller problems

## Step-by-step approach for Recursion Problems

1. Identify if you can break down problem into smaller problems
2. Write the recurrence relation if needed
3. Draw the **recursion tree** for a small example
4. See how the values and what type of values (int, string, etc) are returned at each step and see where the function calls will come out of. And in the end, you will come out of the main function

## Key areas to focus in Recursion

- **Visualization** of *Function calls* and call stack with *Recursion tree*
- **Variables** (Which variable type to use in which place and what to return)
  - **Argument variables** -> Will go into the next function call
  - **Return type**
  - **Variables present in function body** -> Are specific to that function call

## About the recursion tree

- See the flow of functions and see how they are getting into stack
- Identify and focus on left tree calls and right tree calls
- Draw the tree and pointers again and again using pen and paper
- Use the debugger to see the flow of the program

## Visualizing Recursion - Recursion Tree

<img src="assets/Visualizing Recursion.jpg" alt="Visualizing Recursion - Recursion Tree" />

## What is Tail Recursion ?

- When the last function call is the last statement in the body, it is called **Tail Recursion**
- Take the programs *NumbersExampleRecursion* and *Fibonacci* to understand tail recursion
  - In the numbers example, the *print(i)* recursive call is the last statement, hence it is a Tail Recusion
  - Whereas, in the Fibonacci program, the last statement is a return statement which is waiting for the execution of the two recursive calls *fibo(n-1)* and *fibo(n-2)*

## Types of Recurrence relations

1. Linear recurrence relation -> Fibonacci Number
2. Divide & Conquer recurrence relation -> Binary Search
