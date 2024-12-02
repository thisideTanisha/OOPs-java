package com.company;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class cwh_collections {
    public static void main(String[] args) {
       // ArrayList
       // Set
        //TreeSet
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(12);
        l1.add(11);
        l1.add(22);
        l.add(6);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(2);
        l.add(0,2);
        l.addAll(0,l1);
        System.out.println(l.contains(0));
        //l.clear();
       for(int i=0;i<l.size();i++){
           System.out.println(l.get(i));
       }

    }
}
