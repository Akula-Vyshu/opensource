import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        String y = c.nextLine();
        String r = new StringBuilder(y).reverse().toString();
        if(y.equals(r)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
        c.close();
    }
}
