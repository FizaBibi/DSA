//use list to find the maximum candies and return the result in a list of boolean values.
package org.example;

import java.util.ArrayList;
import java.util.List;

public class MaximumCandies {
    public List<Boolean> maximumCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy + extraCandies);
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        MaximumCandies solution = new MaximumCandies();
        List<Boolean> result = solution.maximumCandies(candies, extraCandies);
        System.out.println(result);
    }
}
