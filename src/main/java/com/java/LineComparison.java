package com.java;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x1 coordinates");
        int x1=sc.nextInt();
        System.out.println("Enter x2 coordinates");
        int x2=sc.nextInt();
        System.out.println("Enter y1 coordinates");
        int y1=sc.nextInt();
        System.out.println("Enter y2 coordinates");
        int y2=sc.nextInt();
        float LengthOfLine=(float)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Length of the line = "+LengthOfLine);
    }
}
