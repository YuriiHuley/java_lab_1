package com.company;

public class Tasks {
    public static void IsEven (int n){

        if(n%2 != 0){
            System.out.println("Number is even");
        }else
            System.out.println("Eror, number is Odd");

    }

    public static void FindMin(float a,float b, float c){

        if(Math.abs(a) < Math.abs(b) && Math.abs(a) < Math.abs(c)){
            System.out.println("Min = " + a);
        }
        if(Math.abs(b) < Math.abs(a) && Math.abs(b) < Math.abs(c)){
            System.out.println("Min = " + b);
        }if (Math.abs(c) < Math.abs(a) && Math.abs(c) < Math.abs(b)){
            System.out.println("Min = " + c);
        }

    }
}
