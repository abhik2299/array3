package com.array3;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        Reverse obj=new Reverse();
        obj.reverse(n);
    }
    public void reverse(int num)
    {
        int rev=0,c;
        int a=num;
        while(a!=0)
        {
            c=a%10;
            rev=rev*10+c;
            a=a/10;
        }
        System.out.println("the reverse of "+num+" is "+rev);
    }
}
