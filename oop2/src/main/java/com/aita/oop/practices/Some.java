package com.aita.oop.practices;

import com.aita.oop.Other;

/**
 * @author 万松(Aaron)
 * @since 5.7
 */
public class Some {
    private String kkkk = "dkjfkdjfkdf";

    void doSomething(){
        System.out.print(kkkk);
        System.out.println("do Some");
    }

    public static void main(String[] args) {
        Some some=new Other();
        some.doSomething();
    }
}


