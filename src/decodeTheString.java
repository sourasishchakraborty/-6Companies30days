/*
* Decode the string - GeekForGeeks - Easy
*
* An encoded string (s) is given, the task is to decode it. The pattern in which the strings were encoded were as follows
original string: abbbababbbababbbab
encoded string : 3[a3[b]1[ab]]

Example 1:

Input: s = 1[b]
Output: b
Explanation: 'b' is present only one time.
Example 2:

Input: s = 3[b2[ca]]
Output: bcacabcacabcaca
Explanation: 2[ca] means 'ca' is repeated
twice which is 'caca' which concatenated with
'b' becomes 'bcaca'. This string repeated
thrice becomes the output.
*
* */

public class decodeTheString {
    static int i=0;
    static String decodedString(String s){
        // code here

        StringBuilder sb = new StringBuilder();
        while(i<s.length() && s.charAt(i)!=']'){
            if(Character.isDigit(s.charAt(i))){
                int k=0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    k = k*10 + s.charAt(i++) - '0';
                }
                i++;
                String next = decodedString(s);
                while(k-->0){
                    sb.append(next);
                }
                i++;


            }else{
                sb.append(s.charAt(i));
                i++;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "3[b2[ca]]";
        String ans = decodedString(s);
        System.out.println(ans);
    }
}
