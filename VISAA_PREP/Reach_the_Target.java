import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int t = c.nextInt();
        for(int i = 0; i < t; i++){
            int tar = c.nextInt();
            int cur = c.nextInt();
            System.out.println(tar-cur+1);
        }
        c.close();
    }
}
