import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        long j = c.nextLong();
        int k = c.nextInt();
        long m = 1L << (k - 1);
        boolean isSet = (j & m) != 0;
        System.out.println(isSet?"true":"false");
        c.close();
    }
}
