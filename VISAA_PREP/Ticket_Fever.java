import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int T= c.nextInt();
        for(int i = 0; i < T; i++){
            int N = c.nextInt();
            int M = c.nextInt();
            if(N>=M){
                System.out.println(N-M);
            }
            else{
                System.out.println("0");
            }
        }
        c.close();
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
