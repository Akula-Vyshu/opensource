import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    if(x < z && x+y > z){
    System.out.println("1");
    }
    else if(x+y <= z){
    System.out.println("2");
    }
    else {
    System.out.println("0");
    }
    sc.close();
    }
}
