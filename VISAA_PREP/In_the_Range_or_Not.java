import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int t = c.nextInt();
        for(int i = 0; i < t; i++){
            int x = c.nextInt();
            if(x>=67 && x<=45000){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
        c.close();
    }
}
