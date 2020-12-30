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
    //UC2-Find Maximum Float Values among 3 float values
    public static Double testMaxFloat(Double x, Double y, Double z)
    {
        Double max=x;
        if(y.compareTo(max)>0)
            max=y;
        if(z.compareTo(max)>0)
            max=z;
        printMax(x,y,z,max);
        return max;
    }
    //UC3-Find Maximum String value among 3 string values
    public static String testMaxString(String x, String y, String z)
    {
        String max=x;
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
        System.out.println(testMaxFloat(90.56,40.45,50.22)); //Test Case-2.1
        System.out.println(testMaxFloat(10.55,90.6,40.22)); //Test Case-2.2
        System.out.println(testMaxFloat(20.44,50.22,90.67)); //Test Case-2.3
        System.out.println(testMaxString("Peach","Apple","Banana")); //Test Case-3.1
        System.out.println(testMaxString("Apple","Peach","Banana")); //Test Case-3.2
        System.out.println(testMaxString("Banana","Apple","Peach")); //Test Case-3.3

    }
}
