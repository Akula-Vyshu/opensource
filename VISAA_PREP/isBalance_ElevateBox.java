import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] h = new int[N];
        for(int i = 0; i < N; i++){
            h[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            int l = 0, r = 0;
            for(int j = 0; j < i; j++){
                l+=h[j];
            }
            for(int j = i+1; j < N; j++){
                r+=h[j];
            }
            System.out.print(Math.abs(l-r)+" ");
        }
        sc.close();
    }
}
