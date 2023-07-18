package org.example;

public class Solution {
    /**
     * Calculates the sum of all numbers in the range [1, n] that are divisible by 3, 5, or 7.
     *
     * @param n the upper bound of the range
     * @return the sum of all numbers divisible by 3, 5, or 7 in the range [1, n]
     */
    public int sumOfMultiples(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
