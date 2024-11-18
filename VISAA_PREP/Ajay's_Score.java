import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int T = c.nextInt();
        int[] r = new int[T];
        for(int i = 0; i < T; i++){
            int p = c.nextInt();
            int a = c.nextInt();
            int h = p/10;
            r[i] = a * h;
        }
        for(int i = 0; i < r.length; i++){
            System.out.println(r[i]);
        }
        c.close();
    }
}
