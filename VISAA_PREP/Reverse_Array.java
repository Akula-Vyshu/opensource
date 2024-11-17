import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int k = c.nextInt();
        int arr[] = new int[k];
        for(int i = 0; i < k; i++){
            arr[i] = c.nextInt();
        }
        for(int i = k - 1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
        c.close();
    }
}
