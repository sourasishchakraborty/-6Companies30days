/*
* Greatest Common Divisor of Strings - LeetCode - Easy
*
* For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
*
*Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
*
* Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
*
* Input: str1 = "LEET", str2 = "CODE"
Output: ""
*
* */

public class greatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        int size1 = str1.length();
        int size2 = str2.length();
        if(size2>size1){
            return gcdOfStrings(str2,str1);
        }
        if(size1==size2){
            if(str1.equals(str2)){
                return str1;
            }else{
                return "";
            }
        }
        if(str1.startsWith(str2)){
            return gcdOfStrings(str1.substring(str2.length()),str2);
        }else{
            return "";
        }

    }
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        String ans = gcdOfStrings(str1,str2);
        System.out.println(ans);
    }
}
