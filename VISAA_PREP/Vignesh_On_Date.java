import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        BigInteger v = c.nextBigInteger();
        BigInteger g = c.nextBigInteger();
        if(v.compareTo(g) >= 0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        c.close();
        
        
    }
}
