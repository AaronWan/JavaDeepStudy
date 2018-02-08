package com.aita.element.hello;

import org.junit.Test;

/**
 * Created by Aita on 17/9/27.
 */
public class ObjectTest {
    @Test
    public void testArray2(){
        String[] strs2 = {"Java","Java","Java","Java","Java"};
        for(String str2: strs2){
            System.out.println(str2.hashCode());
        }
        strs2[0]="Java2";
        for(String str2: strs2){
            System.out.println(str2);
        }
    }
    @Test
    public void testArray3(){
        String java=new String("Java");
        String[] strs2 = {"Java","Java","Java","Java","Java"};


        String java1="Java";
        System.out.println(java==strs2[0]);
        System.out.println(strs2[0]==java1);
        System.out.println(java==java1);

    }    @Test
    public void testArray4(){
        String java1=new String("Java").intern();
        String java=java1.intern();
        System.out.println(java==java1);

    }
    @Test
    public void testA(){
        System.out.println(new A().equals(new A()));
    }
    public class A{
        @Override
        public int hashCode() {
            return 1;
        }

        @Override
        public boolean equals(Object obj) {
            return this.hashCode()==obj.hashCode();
        }
    }
    @Test
    public void testArray1(){
        String[][] strs ={
                {"Java","Java","Java"},
                {"Java","Java","Java","Java"}
        };
        System.out.println(strs.length);
        System.out.println(strs[0].length);
        System.out.println(strs[1].length);
        for(String[] row: strs){
            for(String str: row){
                System.out.println(str);
            }
        }

    }
}
