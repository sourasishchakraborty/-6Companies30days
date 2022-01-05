/*
Print Anagrams Together - GeekForGeeks - Medium
Given an array of strings, return all groups of strings that are anagrams. The groups must be created
in order of their appearance in the original array. Look at the sample case for clarification.
* Input:
N = 5
words[] = {act,god,cat,dog,tac}
Output:
god dog
act cat tac
Explanation:
There are 2 groups of
anagrams "god", "dog" make group 1.
"act", "cat", "tac" make group 2.
*
*Input:
N = 3
words[] = {no,on,is}
Output:
no on
is
Explanation:
There are 2 groups of
anagrams "no", "on" make group 1.
"is" makes group 2.
* */



import java.util.*;


public class printAnagramsTogether {
    public static List<List<String>> Anagrams(String[] string_list) {
        // Code here
        List<List<String>> result = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        //traverse through each element in the string_list array
        for(String str:string_list){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String k = new String(arr);

            if(map.containsKey(k)){
                map.get(k).add(str);
            }else{
                List<String> lst = new ArrayList<>();
                lst.add(str);
                map.put(k, lst);
            }

        }
        result.addAll(map.values());
        return result;
    }

    public static void main(String[] args) {
        String[] string_list = {"act","god","cat","dog","tac"};
        List<List<String>> res = Anagrams(string_list);

        for(List<String> elm:res){
            System.out.println(elm);
        }
    }
}
