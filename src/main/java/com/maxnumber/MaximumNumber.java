package com.maxnumber;

public class MaximumNumber <T>{
    public static <T>void printMax(T x,T y,T z,T max)
    {
        System.out.println("1st Value:"+x+" 2nd Value:"+y+"3rd Value:"+z);
        System.out.println("Maximum Value is:"+max);
    }
    //UC1-Find Maximum Integer among 3 integers
    public static Integer testMaxInteger(Integer x,Integer y,Integer z)
    {
        Integer max=x;
        if(y.compareTo(max)>0)
            max=y;
        if(z.compareTo(max)>0)
            max=z;
        printMax(x,y,z,max);
        return max;
    }
    public static void main(String args[])
    {
        System.out.println(testMaxInteger(90,40,50)); //Test Case-1.1
        System.out.println(testMaxInteger(10,90,40)); //Test Case-1.2
        System.out.println(testMaxInteger(20,50,90)); //Test Case-1.3
    }
}
