/*
* Find max 10 numbers in a list having 10M entries - Heapsort
* */
import java.util.*;
public class max10NumbersHeapSort {


    public static List<Integer> firstKElements(int arr[],int n, int k){
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        List<Integer> res= new ArrayList<>();
        for(int i=0;i<k;i++){
            minheap.add(arr[i]);
        }
        for(int i=k;i<n;i++){
            if(minheap.peek()>arr[i]){
                continue;
            }
            else{
                minheap.poll();
                minheap.add(arr[i]);
            }
        }

        Iterator iterator = minheap.iterator();
        while(iterator.hasNext()){
            res.add((Integer) iterator.next());
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {23,40,45,26,33,90,9,56,17,83,65,19,1,100};
        int n = 14;
        int k = 10;
        List<Integer> lst = firstKElements(arr, n, k);
        lst.sort(Collections.reverseOrder());
        for(Integer elm:lst){
            System.out.print(elm + " ");
        }

    }
}
