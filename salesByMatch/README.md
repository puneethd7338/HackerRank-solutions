# 🧦 Sales by Match – HackerRank Problem

🔗 [HackerRank Problem Link](https://www.hackerrank.com/challenges/sock-merchant/problem)

---

## 📝 Problem Statement

You are given an array of integers representing the color of each sock in a pile.  
Each integer represents a different color. Your task is to determine how many **pairs of socks** with matching colors can be formed.

---

## ✅ Steps to Approach the Problem

1. **Understand the requirement**:  
   You need to find how many matching sock pairs can be formed.

2. **Choose a data structure**:  
   Use a **HashMap** (or Dictionary) to store the frequency of each color.

3. **Count the pairs**:  
   For each color, divide its count by 2 using integer division (`count / 2`) to get the number of pairs.

4. **Add up all the pairs**:  
   Return the total sum of pairs for all colors.

---
## 📥 Sample Input
n = 9
ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]


---

## 📤 Sample Output

3


---

## 💬 Explanation

- Color 10 → 4 socks → 2 pairs  
- Color 20 → 3 socks → 1 pair  
- Color 30, 50 → 1 sock each → 0 pairs

✅ Total Pairs = 2 (from 10) + 1 (from 20) = **3 pairs**

---


