package com.array3;

public class fibonacci1 {
    public static void main(String[] args) {
        int a=0,b=1,n=10,c=0;
        int[] arr=new int[n];
        arr[0]=a;
        arr[1]=b;
        for(int i=2;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            arr[i]=c;
        }
        for(int j=0;j< arr.length;j++)
            System.out.print(arr[j]+" ");
    }
}
