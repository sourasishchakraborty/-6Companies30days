/*
* Total Decoding Messages - GeekForGeeks - Medium
*
* A top secret message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
You are an FBI agent. You have to determine the total number of ways that message can be decoded, as the answer can be large return the answer modulo 109 + 7.
Note: An empty digit sequence is considered to have one decoding. It may be assumed that the input contains valid digits from 0 to 9 and If there are leading 0’s, extra trailing 0’s and two or more consecutive 0’s then it is an invalid string.

Example 1:

Input: str = "123"
Output: 3
Explanation: "123" can be decoded as "ABC"(123),
"LC"(12 3) and "AW"(1 23).
Example 2:

Input: str = "27"
Output: 1
Explanation: "27" can be decoded as "BG".


Your Task:
You don't need to read or print anything. Your task is to complete the function CountWays() which takes the string as str as input parameter and returns the total number of ways the string can be decoded modulo 109 + 7.
*
*
*
* */


public class totalDecodingMessages {
    public static int CountWays(String str)
    {
        // code here
            if(str.charAt(0)=='0'){
                return 0;
            }
            int[] dp = new int[str.length()];
            dp[0]=1;
            for(int i=1;i<str.length();i++){
                if(str.charAt(i-1)=='0' && str.charAt(i)=='0'){
                    dp[i]=0;
                }else if(str.charAt(i-1)=='0' && str.charAt(i)!='0'){
                    dp[i]=dp[i-1];
                }else if(str.charAt(i-1)!='0' && str.charAt(i)=='0'){
                    if(str.charAt(i-1)=='1' || str.charAt(i-1)=='2'){
                        dp[i]=i>=2 ? dp[i-2] : 1;
                    }else{
                        dp[i]=0;
                    }
                }else{
                    if(Integer.parseInt(str.substring(i-1,i+1)) <= 26){
                        dp[i]=dp[i-1]+ (i>=2 ? dp[i-2] : 1);
                    }else{
                        dp[i]=dp[i-1];
                    }
                }
                dp[i]=dp[i]%1000000007;
            }
            return dp[str.length()-1];
        }


    public static void main(String[] args) {
        String str = "27";
        int ans = CountWays(str);
        System.out.println(ans);
    }
}
