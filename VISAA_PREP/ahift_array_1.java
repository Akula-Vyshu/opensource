import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = c.nextInt();
        }
        int p = a[0];
        int[] a2 = new int[n];
        for(int i = 1; i < n; i++){
            a2[i-1] = a[i];
        }
        a2[n-1] = p;;
        for(int i = 0; i < n; i++){
            System.out.print(a2[i]+" ");
        }
        c.close();
    }
}
