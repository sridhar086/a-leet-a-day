package com.sridhar.code.library.medium.arrays;

public class FindIfElementIsInSortedArray {

    public int search(int[] nums, int target) {
        return recursiveSearch(target, nums, 0, nums.length-1);
    }

    private int recursiveSearch(int searchNum, int[] array, int left, int right) {
        if(left == right) {
            if(array[left] == searchNum) {
                return left;
            } else {
                return -1;
            }
        }
        int mid = (left + right) / 2;
        if(searchNum <= array[mid]) {
            return recursiveSearch(searchNum, array, left, mid);
        } else {
            return recursiveSearch(searchNum, array, mid+1, right);
        }
    }
}
