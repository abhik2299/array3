package com.array3;
import java.util.*;
public class Stopwatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the start time in format HHMMSS ");
        int start= sc.nextInt();
        System.out.println("enter the end time in format HHMMSS ");
        int  end= sc.nextInt();
        Stopwatch obj=new Stopwatch();
        obj.watch(start,end);
    }
    public void watch(int a,int b)
    {
        int hour = b/10000-a/10000;
        int min= b;


    }
}
