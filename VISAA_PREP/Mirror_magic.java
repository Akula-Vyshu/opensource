import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int N = c.nextInt();
        int[][] dim = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j <N; j++){
                dim[i][j] = c.nextInt();
            }
        }
        
        for(int i = 0; i < N; i++){
            for(int j = N - 1; j >= 0; j--){
                System.out.print(dim[i][j]+" ");
            }
            System.out.println();
        }
        c.close();
    }
}
