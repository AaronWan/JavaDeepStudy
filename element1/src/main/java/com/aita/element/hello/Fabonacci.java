package com.aita.element.hello;

import java.util.Scanner;

/**
 * Created by Aita on 18/2/8.
 )*/
public class Fabonacci{
    public static int getFabo(int n){
        if(n > 1){
        return getFabo(n-1) + getFabo(n-2);
        }else if(n==0||n==1){
        return n;
        }else{
            System.out.println("请输入正整数");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入想要打印的费式数的个数:\n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Fabonacci.getFabo(n));
        for(int i = 0; i < n; i++){
            System.out.println(Fabonacci.getFabo(i));
        }
    }
}
