_Complexity level: Easy_

**Task** 

A level-order traversal, also known as a breadth-first search, visits each level of a tree's nodes from left to right, top to bottom. You are given a pointer, `root` , pointing to the root of a binary search tree.Write the application so that it prints the level-order traversal of the binary search tree.

**Input Format**

The locked stub code in your editor reads the following inputs and assembles them into a BST: 
The first line contains an integer, `T` (the number of test cases). 
The `T` subsequent lines each contain an integer, `data`, denoting the value of an element that must be added to the BST.

**Output Format**

Print the `data` value of each node in the tree's level-order traversal as a single line of `N` space-separated integers.

Sample Input

6 <br>
3 <br>
5 <br>
4 <br>
7 <br>
2 <br>
1 <br>

**Sample Output**

3 2 5 1 4 7 

**Explanation**

The input forms the following binary search tree: 

![BTS](img/0-BST.png)

We traverse each level of the tree from the root downward, and we process the nodes at each level from left to right. The resulting level-order traversal is 3->2->5->1->4->7, and we print these data values as a single line of space-separated integers.