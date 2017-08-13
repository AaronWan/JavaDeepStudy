package com.aita.oop.classoop;

import java.util.Map;

/**
 * @author 万松(Aaron)
 * @since 5.7
 */
public class Person {
    public static void main(String[] args) {
//        byte a=100;
//        byte b= (byte) 200;
//        System.out.println(b);
//        System.out.println((byte)(300));
//        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE+1));
//        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
//        System.out.println(Integer.toBinaryString(-Integer.MAX_VALUE));
//        System.out.println(Integer.MAX_VALUE+1==Integer.MIN_VALUE);
//
//
//
//        int i=24;
//        int j=36;
//        int max=0;
//        for(int k=2;k<Math.min(i,j);k++){
//            int g=i%k;
//            int l=j%k;
//            if(g==0&&l==0){
//                max=k;
//            }
//        }
//
//        System.out.println(max);
//
//
//        for (int k = 1; k <10; k++) {
//            for (int l = 1; l < 10; l++) {
//                for (int m = 1; m <10 ; m++) {
//                    if(Math.pow(k,3)+Math.pow(l,3)+Math.pow(m,3)==Long.valueOf(k+""+l+""+m)){
//                        System.out.printf("%d%d%d,",k,l,m);
//                    }
//
//                }
//
//            }
//        }

        almstrong(3);
    }
//todo error
    public static void almstrong(int n){
         for(double i=Math.pow(10,n-1)+1;i<Math.pow(10,n);i++){
             int[] temps=new int[n];
             double rst=1;
             String t="";
             for(int j=n;j>=1;j--){
                 temps[j-1]= (int) (i/Math.pow(10,j));
                 rst*=Math.pow(temps[j-1],3);
                 t+=temps[j-1];
             }
             if(rst==Double.valueOf(t)){
                 System.out.println(t);
             }
         }
    }
}
