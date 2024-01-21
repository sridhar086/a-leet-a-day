package com.sridhar.code.library.easy;

// Leet 179.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

/*
Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.



Example 1:

Input: nums = [10,2]
Output: "210"
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330"


Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 109
 */
public class LargestNumber {

    class IntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer num1, Integer num2) {
            int leadingDigitNum1 = getLeadingDigit(num1);
            int leadingDigitNum2 = getLeadingDigit(num2);
            if(leadingDigitNum1 == leadingDigitNum2) {
                long a = Long.parseLong(num1 + "" + num2);
                long b = Long.parseLong(num2 + "" + num1);
                if(a > b) {
                    return -1;
                } else {
                    return 1;
                }
            } else if(leadingDigitNum1 > leadingDigitNum2) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    public String largestNumber(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : nums) {
            arrayList.add(num);
        }
        arrayList.sort(new IntegerComparator());
        if(arrayList.get(0) == 0) {
            return "0";
        } else {
            return arrayList.stream().map(String::valueOf).collect(Collectors.joining());
        }
    }

    public int getLeadingDigit(int num) {
        if(num >= 10) {
            int modulo = num/10;
            while(modulo >= 10) {
                modulo = modulo/10;
            }
            return modulo;
        }
        return num;
    }



}
