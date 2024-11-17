import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int u = c.nextInt();
        int h = c.nextInt();
        int n = c.nextInt();
        if(n >= 0 && n <= u * h && n % h == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        c.close();
    }
}
