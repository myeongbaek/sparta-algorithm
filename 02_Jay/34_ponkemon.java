// // Convert array to HashSet in Java
// import java.io.*;
// import java.util.Iterator;
// Importing Set libraries
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        
        Set<Integer> unique = new HashSet<>();
        for (int element : nums){
            unique.add(element);
        }
        
        int unique_ponkemon = unique.size();
        int choice_chance = nums.length / 2;

        if (unique_ponkemon > choice_chance){
            return choice_chance;
        } else {
            return unique_ponkemon;
        }
    }
}