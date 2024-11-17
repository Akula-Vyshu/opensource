import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        String h = c.nextLine();
        StringBuilder r = new StringBuilder();
        int count = 1;
        for(int i = 1; i < h.length(); i++){
            if(h.charAt(i)==h.charAt(i-1)){
                count++;
            }
            else{
                r.append(h.charAt(i-1)).append(count);
                count = 1;
            
            }
        }
        
        r.append(h.charAt(h.length() - 1)).append(count);
        System.out.println(r.toString());
        c.close();
    }
}
