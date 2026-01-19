package Lecture17;

import java.util.*;

public class Math_Class_Usage_Method {
    public static void main(String[] args) {
        System.out.println(Math.floor(1.59826)); // gives the floor value of the number only as 1 here in float
        System.out.println(Math.ceil(1.59826)); // gives the ceil value if the number only as 2 here in float
        System.out.println(Math.abs(-10.45465)); // used to get the absolute value of the number irrespective of the sign
        System.out.println(Math.max(20,30)); // returns the maximum value from 2 choices
        System.out.println(Math.min(20,30)); // returns the minimum value from 2 choices
        System.out.println(Math.random()); // provide a random value range from 0-1
        System.out.println(Math.cbrt(4645155)); // provide the cube root of the number
        System.out.println(Math.sqrt(46451555)); // provide the square root of the number
        System.out.println(Math.log(46451555)); // provide the logarithmic value of number with natural base of e
        System.out.println(Math.log10(46451555)); // provide the logarithmic value of the number with base of 10
        System.out.println(Math.pow(8,2)); // provide the power functionality 8 to the power of 2
        // etc
    }
}
