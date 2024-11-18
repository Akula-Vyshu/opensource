import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine().trim();
        int s = 0;
        for(int  i = 0; i < N.length(); i++){
            char c = N.charAt(i);
            if (Character.isDigit(c)){
                s += Character.getNumericValue(c);
            }
        }
        if(s % 2 == 0){
            System.out.println("Vignesh");
        }
        else{
            System.out.println("Charan");
        }
        sc.close();
    }
}
