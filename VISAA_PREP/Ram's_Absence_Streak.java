import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = c.nextInt();
        }
        int count = 0;
        int m = 0;
        for(int i = 0; i < n; i++){
            if(arr[i]==0){
                count++;
                m = Math.max(m, count);
            }
            else{
                count = 0;
            }
        }
        System.out.println(m);
        c.close();
    }
}
