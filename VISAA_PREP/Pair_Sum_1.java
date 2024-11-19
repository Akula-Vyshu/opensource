import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int N = c.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = c.nextInt();
        }
        int k = c.nextInt();
        boolean f = false;
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                    if(a[i]+a[j]==k){
                        f = true;
                        break;
                    }
                }
            if(f){
                break;
            }
        }
        
        if(f){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        c.close();
    }
}
