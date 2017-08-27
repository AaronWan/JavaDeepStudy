package com.aita.collection;

import org.junit.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Aita on 17/8/27.
 */
public class SetTest {
    @Test
    public void testSet(){
        Set<Person> set=new HashSet<>();
        set.add(new Person("name1"));
        set.add(new Person("name1"));
        set.add(new Person("name2"));
        System.out.println(set);


        Set<Person> set1=new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().equals(o2.getName())?0:1;
            }
        });

        set1.add(new Person("name1"));
        set1.add(new Person("name1"));
        set1.add(new Person("name2"));
        System.out.println(set1);
    }
}
