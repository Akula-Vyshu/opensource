import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        char v = c.next().charAt(0);
        char n = c.next().charAt(0);
        if((v == 'S' && n == 'P') || (v == 'R' && n == 'S') || (v == 'P' && n == 'R')){
            System.out.println("Vignesh");
        }
        else if((v == 'P' && n == 'S') || (v == 'S' && n == 'R') || (v == 'R' && n == 'P')){
            System.out.println("Charan");
        }
        else if(v == n){
            System.out.println("NULL");
        }
        
        c.close();
    }
}
