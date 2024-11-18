import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int h = c.nextInt();
        int n = 1;
        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
        c.close();
    }
}
