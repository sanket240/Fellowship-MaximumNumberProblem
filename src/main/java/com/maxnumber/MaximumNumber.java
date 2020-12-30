package com.maxnumber;

public class MaximumNumber <T>{
    public static <T extends Comparable<T>> T Maximum(T x, T y, T z)
    {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
    public static void main(String args[])
    {
        System.out.println("Maximum among three integers values:"+Maximum(20,30,40));
        System.out.println("Maximum among three string values:"+Maximum("ABC","SSD","WCD"));
        System.out.println("Maximum among three double values:"+Maximum(20.90,30.34,40.45));
    }
}
