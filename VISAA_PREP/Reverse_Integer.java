import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int N = c.nextInt();
        long reverse = 0;
        while(N!=0){
            int d = N % 10;
            reverse = reverse * 10 + d;
            if((reverse > Integer.MAX_VALUE) || (reverse < Integer.MIN_VALUE)){
            System.out.println("0");
            return;
            }
            N /= 10;
        }
        System.out.println(reverse);
        c.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
