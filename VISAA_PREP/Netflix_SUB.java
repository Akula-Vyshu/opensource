import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int v = c.nextInt();
        int ch = c.nextInt();
        int r = c.nextInt();
        int s = c.nextInt();
        if((v+ch >= s) || (ch+r >= s) || (r+v >= s)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        c.close();
    }
}
