/*
* Find Missing And Repeating - GeekForGeeks - Medium
*
* Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two numbers.

Example 1:

Input:
N = 2
Arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and
smallest positive missing number is 1.
Example 2:

Input:
N = 3
Arr[] = {1, 3, 3}
Output: 3 2
Explanation: Repeating number is 3 and
smallest positive missing number is 2.
* */


public class findMissingAndRepeating {
    static int[] findTwoElement(int arr[], int n) {
        // code here
        int[] ans = new int[2];
        int[] count = new int[n+1];
        for(int i=0;i<arr.length;i++){
            int index = arr[i];
            count[index]++;
        }
        for(int i=1;i<count.length;i++){
            if(count[i]==2){
                ans[0]=i;
            }
            if(count[i]==0){
                ans[1]=i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int N = 3;
        int[] arr = {1,3,3};
        int[] res = findTwoElement(arr,N);
        System.out.println(res[0]+" "+res[1]);
    }
}
