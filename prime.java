package com.array3;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        prime obj=new prime();
        obj.isprime(n);
    }
    public void isprime(int num)
    {
        int c=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
                c++;

        }
        if(c==1)
            System.out.println(num+" is a prime number");
        else
            System.out.println(num+" is not a prime number");
    }
}
