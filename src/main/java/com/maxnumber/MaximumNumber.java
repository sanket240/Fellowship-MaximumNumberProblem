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
    public static <E extends Comparable<E>> void testMaximum( E[] a)
    {
        E temp = null,x,y;
        int i,n=a.length;
        int maxValue=n-1;
        for(i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if(a[i].compareTo(a[j])>0)
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        temp=a[maxValue];
        System.out.println("Sorted Array is:");
        for(i=0;i< a.length;i++)
        {
            System.out.println(a[i]);
        }
        printMax(temp);
    }
    public static <E> void printMax(E a)
    {
        System.out.println("The maximum value is:"+a);
    }
    public static void main(String args[])
    {
        System.out.println("Maximum among three integers values:"+Maximum(20,30,40));
        System.out.println("Maximum among three string values:"+Maximum("ABC","SSD","WCD"));
        System.out.println("Maximum among three double values:"+Maximum(20.90,30.34,40.45));
        Integer[] a={1,2,3,4,5,6};
        String[] s={"san","ssd","abc","rty"};
        Double[] d={11.09,20.59,12.45,23.67};
        testMaximum(a);
        testMaximum(s);
        testMaximum(d);
    }
}
