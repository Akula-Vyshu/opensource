import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int l = b.nextInt();
        int c1 = (int)(l * 0.1);
        int c2 = 100;
        if (c1 > c2){
            System.out.println(l-c1);
        }
        else {
            System.out.println(l-c2);
        }
        b.close();
        
    }
}
