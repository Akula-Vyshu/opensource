import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int[][] t = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                t[i][j] = c.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(t[j][i]+" ");
            }
            System.out.println();
        }
        c.close();
    }
}
