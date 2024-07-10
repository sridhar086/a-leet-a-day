package com.sridhar.code.library.acompany.oracle;


/*
Leet 378.

Given an n x n matrix where each of the rows and columns is sorted in ascending order, return the kth smallest element in the matrix.

Note that it is the kth smallest element in the sorted order, not the kth distinct element.

You must find a solution with a memory complexity better than O(n2).



Example 1:

Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
Output: 13
Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13
Example 2:

Input: matrix = [[-5]], k = 1
Output: -5


Constraints:

n == matrix.length == matrix[i].length
1 <= n <= 300
-109 <= matrix[i][j] <= 109
All the rows and columns of matrix are guaranteed to be sorted in non-decreasing order.
1 <= k <= n2


Follow up:

Could you solve the problem with a constant memory (i.e., O(1) memory complexity)?
Could you solve the problem in O(n) time complexity? The solution may be too advanced for an interview but you may find reading this paper fun.
 */


import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class KthSmallestElementFromSortedMatrix {


    class Element {

        int row;
        int col;
        int val;
        public Element(int row, int col, int val) {
            this.row = row;
            this.col = col;
            this.val = val;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Element element = (Element) o;
            return row == element.row && col == element.col && val == element.val;
        }

    }

    class MyComparator implements Comparator<Element> {
        @Override
        public int compare(Element o1, Element o2) {
            int result = Integer.compare(o1.val, o2.val);
            if (result == 0) {
                int subResult1 = Integer.compare(o1.row, o2.row);
                if (subResult1 == 0) {
                    return Integer.compare(o1.col, o2.col);
                } else {
                    return subResult1;
                }
            } else return result;
        }
    }


    public int kthSmallest(int[][] matrix, int k) {

        PriorityQueue<Element> pq = new PriorityQueue<>(matrix.length, new MyComparator());

        int count = 0;
        pq.offer(new Element(0, 0, matrix[0][0]));
        while(!pq.isEmpty()) {
            Element element = pq.poll();
            count+=1;
            if(count == k) {
                return element.val;
            }
            int row = element.row;
            int col = element.col;
            if(col+1 < matrix.length) {
                Element temp = new Element(row, col+1, matrix[row][col+1]);
                if(!pq.contains(temp)){
                    pq.offer(temp);
                }
            }
            if(row+1 < matrix.length) {
                Element temp = new Element(row+1, col, matrix[row+1][col]);
                if(!pq.contains(temp)){
                    pq.offer(temp);
                }
            }
        }
        return -1;
    }

}
