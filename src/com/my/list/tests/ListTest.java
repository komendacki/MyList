package com.my.list.tests;
import static org.junit.Assert.*;

import com.my.list.model.*;

import org.junit.Test;
/**
 * Created by Admin on 09.03.2016.
 */
public class ListTest {

    @Test
    public void CommonTestForIntegers()
    {
        MyList<Integer> list = new MyList();
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(17);
        list.add(23);
        list.add(81);
        list.add(33);

        assertTrue(list.contains(5));
        assertTrue(list.contains(17));
        assertTrue(list.contains(33));
        assertFalse(list.contains(0));
        assertFalse(list.contains(18));
        assertFalse(list.contains(22));

        assertFalse(list.isEmpty());

        list.remove(5);
        assertFalse(list.contains(5));
        list.remove(33);
        assertFalse(list.contains(33));
        list.remove(23);
        assertFalse(list.contains(23));
    }

    @Test(timeout = 50)
    public void StrainTest()
    {
        MyList<Integer> list = new MyList();
        for(int i = 0; i < 100000; i++)
        {
            list.add((int)(Math.random() * 100));
        }
        
    }

}
