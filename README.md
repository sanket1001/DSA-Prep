# LeetCode Top Interview 150 - Solutions

This repository contains my solutions for the [LeetCode Top Interview 150](https://leetcode.com/studyplan/top-interview-150/) questions. The aim is to solve all 150 problems and provide well-documented code and explanations for each solution.

## 🏁 Objective
The goal of this project is to solve the top 150 interview questions from LeetCode, improving problem-solving skills, algorithmic thinking, and coding proficiency. This repository will serve as a reference for others preparing for coding interviews.

## 📁 Structure
The repository is organized into folders based on the topics of the problems. Each folder contains multiple subfolders representing individual problems. Each subfolder contains:
- **Solution File:** Contains the Java code solution for the problem.
- **Explanation.md:** A brief explanation of the approach, time complexity, and space complexity for each solution.
  
```plaintext
├── Arrays
│   ├── Problem-001-Merge-Sorted-Arrays
│   │   ├── Solution.java
│   │   └── Explanation.md
│   |── Problem-002-Remove-Element
│   |   ├── Solution.java
│   |   └── Explanation.md
|   :  
├── Two Pointers
│   ├── Problem-001-Valid-Palindrome
│   │   ├── Solution.java
│   │   └── Explanation.md
|   :
├── Sliding Window
│   ├── Problem-005-Minimum-Size-Subarray-Sum
│   │   ├── Solution.java
│   │   └── Explanation.md
├── ...
└── README.md
```

## 📝 Progress
- [x] Arrays - Problem 001: Two Sum
- [ ] Linked Lists - Problem 002: Add Two Numbers
- [ ] Arrays - Problem 004: Median of Two Sorted Arrays
- [ ] Dynamic Programming - Problem 005: Longest Palindromic Substring
- ...

(Progress will be updated as more problems are solved.)

## ⚙️ Solutions
The solutions are written in **Java**. Each solution file follows a clean, understandable format, with comments to explain key parts of the algorithm.

### Example
```java
// Problem: Merge Sorted Arrays
// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
// and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pt1 = 0, pt2 = 0;
        int[] num_temp = new int[n + m];
        for (int i = 0; i < n + m; i++) {
            num_temp[i] = nums1[i];
        }
        for (int i = 0; i < n + m; i++) {
            if (pt1 == m) {
                nums1[i] = nums2[pt2];
                pt2++;
                continue;
            }
            if (pt2 == n) {
                nums1[i] = num_temp[pt1];
                pt1++;
                continue;
            }

            if (num_temp[pt1] < nums2[pt2]) {
                nums1[i] = num_temp[pt1];
                pt1++;
            } else {
                nums1[i] = nums2[pt2];
                pt2++;
            }
        }

    }
}
```

## 🧠 Problem-Solving Approach
For each problem, the following steps are followed:
1. **Understanding the Problem:** Clarifying input/output expectations.
2. **Exploring Test Cases:** Considering edge cases and different scenarios.
3. **Planning the Approach:** Deciding the optimal data structure and algorithm.
4. **Implementing the Solution:** Writing clean, efficient code in Java.
5. **Analyzing Time & Space Complexity:** Estimating efficiency.
6. **Iterating over the Solution:** Ierating the code over and over again to find the best possible solution.

## 📚 Topics Covered
The problems cover a variety of algorithmic concepts, including but not limited to:
- **Arrays**
- **Linked Lists**
- **Dynamic Programming**
- **Recursion and Backtracking**
- **Sorting and Searching**
- **Graphs and Trees**
- **Stack and Queues**
- **Bit Manipulation**

## 💡 How to Contribute
If you'd like to contribute by improving existing solutions or adding new ones, feel free to submit a pull request! Please ensure that your solutions follow the repository’s structure and provide detailed explanations.
