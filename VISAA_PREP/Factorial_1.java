import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int o = c.nextInt();
        if(o < 0){
            System.out.println("Factorial is not defined for negative");
            return;
        }
        else{
        long r = fact(o);
        System.out.println(r);
        c.close();
        }
    }
    
    public static long fact(int o){
        if((o==0)||(o==1)){
            return 1;
        }    
        return o * fact(o-1);
    }
}
