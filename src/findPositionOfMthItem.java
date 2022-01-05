/*
*Find the position of M-th item - GeekForGeeks - Basic
*
* M items are to be delivered in a circle of size N. Find the position where the M-th item will be delivered if we start from a given position K. Note that items are distributed at adjacent positions starting from K.

Input:
N = 5, M = 2, K = 1
Output:
2
Explanation:
If we start from 1st position, the
2nd item will land at the 2nd position.
*
* Input:
N = 5, M = 8, K = 2
Output:
4
Explanation:
If we start from 2nd position, the
8th item will land at the 4th position.
 *
* */


public class findPositionOfMthItem {

    static int findPosition(int N , int M , int K) {
        // code here
        if(M <= N-K+1){
            return M+K-1;
        }
        M = M - (N-K+1);

        return M%N==0 ? N : M%N;

    }

    public static void main(String[] args) {
        int N=5,M=8,K=2;
        int ans = findPosition(N,M,K);
        System.out.println(ans);
    }
}
