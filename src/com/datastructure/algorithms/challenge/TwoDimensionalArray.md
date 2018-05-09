_Complexity level: Easy_

**Context** 
Given a 2D Array :

<pre><code>
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
</code></pre>

We define an hourglass in `A` to be a subset of values with indices falling in this pattern in `A`'s graphical representation:

<pre><code>a b c
  d
e f g
</code></pre>

There are `16` hourglasses in `A`, and an _hourglass sum_ is the sum of an hourglass' values.

**Task** 

Calculate the hourglass sum for every hourglass in `A`, then print the maximum hourglass sum.

**Input Format**

There are 6 lines of input, where each line contains 6 space-separated integers describing _2D Array_ `A`; every value in `A` will be in the inclusive range of -9 to 9.

**Constraints**

 * -9<=A[i][j]<=9
  * 0<=i,j<=5
  
**Output Format**

Print the largest (maximum) hourglass sum found in `A`.

**Sample Input**

<pre><code>1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
</code></pre>


**Sample Output**

`19`

**Explanation**

 contains the following hourglasses:
 <pre><code>1 1 1   1 1 0   1 0 0   0 0 0
   1       0       0       0
 1 1 1   1 1 0   1 0 0   0 0 0
 
 0 1 0   1 0 0   0 0 0   0 0 0
   1       1       0       0
 0 0 2   0 2 4   2 4 4   4 4 0
 
 1 1 1   1 1 0   1 0 0   0 0 0
   0       2       4       4
 0 0 0   0 0 2   0 2 0   2 0 0
 
 0 0 2   0 2 4   2 4 4   4 4 0
   0       0       2       0
 0 0 1   0 1 2   1 2 4   2 4 0
 </code></pre>
The hourglass with the maximum sum (19) is:

<pre><code>2 4 4
  2
1 2 4
</code></pre>
