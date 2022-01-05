/*
* Run Length Encoding - GeekForGeeks - Easy
*
* Given a string, Your task is to  complete the function encode that returns the run length encoded string for the given string.
eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
You are required to complete the function encode that takes only one argument the string which is to be encoded and returns the encoded string.
 *
 *
 * Input:
str = aaaabbbccc
Output: a4b3c3
Explanation: a repeated 4 times
consecutively b 3 times, c also 3
times.
*
*
* Input:
str = abbbcdddd
Output: a1b3c1d4
* */

public class runLengthEncoding {
    public static String encode(String src)
    {
        //Your code here
        StringBuffer sf = new StringBuffer();
        for(int i=0;i<src.length();i++){
            int count=1;
            while(i<src.length()-1 && src.charAt(i)==src.charAt(i+1)){
                count++;
                i++;
            }
            sf.append(src.charAt(i));
            sf.append(count);
        }
        return new String(sf);
    }

    public static void main(String[] args) {
        String str = "abbbcdddd";
        String res = encode(str);
        System.out.println(res);
    }
}

