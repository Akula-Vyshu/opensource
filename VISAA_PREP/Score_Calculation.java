import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int T = c.nextInt();
        for(int i = 0; i < T; i++){
            int p = c.nextInt();
            int ch = c.nextInt();
            int pp = p/10;
            int r = pp*ch;
            System.out.println(r);
        }
        c.close();  
    }
}
