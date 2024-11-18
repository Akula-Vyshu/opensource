import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int N = c.nextInt();
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        c.close();
    }
}
