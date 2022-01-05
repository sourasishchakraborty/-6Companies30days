/*
* Count the subarrays having product less than k - GeekForGeeks - Hard
*
* Given an array of positive numbers, the task is to find the number of possible contiguous subarrays having product less than a given number k.
*
* n = 4, k = 10
a[] = {1, 2, 3, 4}
Output :
7
Explanation:
The contiguous subarrays are {1}, {2}, {3}, {4}
{1, 2}, {1, 2, 3} and {2, 3} whose count is 7.
 *
*
* n = 7 , k = 100
a[] = {1, 9, 2, 8, 6, 4, 3}
Output:
16
* */


public class countSubarrays {
    public static int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int s=0,e=0,res=0;
        long prod=1;
        for(;e<n;e++){
            prod*=a[e];
            while(s<e && prod>=k){
                prod/=a[s];
                s+=1;
            }
            if(prod<k){
                int len = e-s+1;
                res+=len;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        long[] a = {1, 9, 2, 8, 6, 4, 3};
        long n = 7;
        long k = 100;
        int ans = countSubArrayProductLessThanK(a,n,k);
        System.out.println(ans);
    }
}
