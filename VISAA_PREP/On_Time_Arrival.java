import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int T = c.nextInt();
        for(int i = 0; i < T; i++){
            int x = c.nextInt();
            if(x>=30){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        c.close();
    }
