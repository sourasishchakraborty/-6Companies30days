/*
* Overlapping rectangles - GeekForGeeks - Easy
 * Given two rectangles, find if the given two rectangles overlap or not. A rectangle is denoted by providing the x and y coordinates of two points: the left top corner and the right bottom corner of the rectangle. Two rectangles sharing a side are considered overlapping. (L1 and R1 are the extreme points of the first rectangle and L2 and R2 are the extreme points of the second rectangle).

Note: It may be assumed that the rectangles are parallel to the coordinate axis.
*
*
* Input:
L1=(0,10)
R1=(10,0)
L2=(5,5)
R2=(15,0)
Output:
1
Explanation:
The rectangles overlap.
*
*
* Input:
L1=(0,2)
R1=(1,1)
L2=(-2,-3)
R2=(0,2)
Output:
0
Explanation:
The rectangles do not overlap.
*
*  */

public class overlappingRectangles {
    public static int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        // code here
        if( (L1[0] > R2[0]) || (L2[0]>R1[0]) ){
            return 0;
        }
        if( (R2[1]>L1[1]) || (R1[1]>L2[1]) ){
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] l1 = {0,2};
        int[] r1 = {1,1};
        int[] l2 = {-2,-3};
        int[] r2 = {0,2};
        int ans = doOverlap(l1,r1,l2,r2);
        System.out.println(ans);

    }
}
