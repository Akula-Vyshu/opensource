import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int N = c.nextInt();
        int[] a = new int[N];
        int m = c.nextInt();
        int n1 = 0;
        int n2 = 0;
        for(int i = 0; i < N; i++){
            a[i] = c.nextInt();
        }
        for(int i = 0; i < N;i++){
            if(a[i] % m == 0){
                n1 += a[i];
            }
            else{
                n2 += a[i];
            }
        }
        System.out.println((n1 - n2));
        c.close();
    }
}
