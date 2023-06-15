package com.array3;
import java.util.*;
public class perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        perfect obj=new perfect();
        obj.method(n);
    }
    public void method(int num)
    {
        int c=0;
        int a=num/2;
        for(int i=1;i<=a;i++)
        {
            if(num%i==0)
                c=c+i;
        }
        if(c==num)
            System.out.println(num+" is a perfect number");
        else
            System.out.println(num+" is not a perfect number");
    }

}
