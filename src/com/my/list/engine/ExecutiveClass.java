package com.my.list.engine;

import com.my.list.model.MyList;

/**
 * Created by Admin on 09.03.2016.
 */
public class ExecutiveClass {
    public static void main(String[] args)
    {
        MyList<Integer> list = new MyList<Integer>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(60);

        System.out.println(list.containts(10));
        System.out.println(list.containts(50));

    }
}
