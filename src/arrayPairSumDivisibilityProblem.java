/*
* Array Pair Sum Divisibility Problem - GeekForGeeks - Easy
*
* Given an array of integers and a number k, write a function that returns true if given array can be divided into pairs such that sum of every pair is divisible by k.


Example 1 :

Input : arr = [9, 5, 7, 3], k = 6
Output: True
Explanation: {(9, 3), (5, 7)} is a
possible solution. 9 + 3 = 12 is divisible
by 6 and 7 + 5 = 12 is also divisible by 6.

Example 2:

Input : arr = [2, 4, 1, 3], k = 4
Output: False
Explanation: There is no possible solution.
*
* */

import java.util.HashMap;

public class arrayPairSumDivisibilityProblem {
    public static boolean canPair(int[] nums, int k) {
        // Code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            int rem = num%k;
            // int rem = ((num%k)+k)%k; negative test cases
            int freq = map.getOrDefault(rem,0);
            map.put(rem,freq+1);
        }
        for(int num:nums){
            int rem = num % k;
            if(rem==0){
                int freq = map.get(rem);
                if(freq%2!=0){
                    return false;
                }
            }else if(rem*rem == k){
                int freq = map.get(rem);
                if(freq%2!=0){
                    return false;
                }
            }else{
                int freq = map.get(rem);
                int otherfreq = map.getOrDefault(k-rem,0);
                if(freq!=otherfreq){
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] nums = {2,4,1,3};
        int k = 4;
        boolean res = canPair(nums,k);
        System.out.println(res);
    }
}
