import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int h = c.nextInt();
        int u = c.nextInt();
        if((u>0)&&(h>0)){
            int c_c = h*100;
            if(c_c >= u){
                System.out.println("0");
            }
            else{
                int r_p = u - c_c;
                int a_p = (r_p+99)/100;
                System.out.println(a_p);
                
            }
        }
        c.close();
    }
}
