/*
* Squares in N*N Chessboard - GeekForGeeks - Easy
*
* Find total number of Squares in a N*N cheesboard.

Example 1:

Input:
N = 1
Output:
1
Explanation:
A 1*1 chessboard has only 1 square.
Example 2:

Input:
N = 2
Output:
5
Explanation:
A 2*2 chessboard has 5 squares.
4 1*1 squares and a 2*2 square.
* */

public class squaresInNxNChessboard {
    static Long squaresInChessBoard(Long N) {
        // code here
        return ((N) * (N+1) * ((2*N)+1))/6;
    }

    public static void main(String[] args) {
        Long n= Long.valueOf(2);
        Long ans = squaresInChessBoard(n);
        System.out.println(ans);
    }
}
