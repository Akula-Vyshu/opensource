import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int m = c.nextInt();
        int t = c.nextInt();
        int b = c.nextInt();
        if(m+t < b){
            System.out.println((b - t) / m);
        }
        else {
            System.out.println("0");
        }
        
        c.close();
       
    }
}
