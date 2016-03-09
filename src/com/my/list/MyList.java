package com.my.list;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Admin on 08.03.2016.
 */
public class MyList<T> {

    public MyList()
    {
        this.count = 0;
    }

    private int count;
    public Node head;
    public Node tail;

    public void add(T item)
    {
        Node node = new Node(item);
        if (count == 0)
        {
            this.head = node;
            this.tail = node;
        }
        else
        {
            this.tail.next = node;
            this.tail = node;
        }

        count++;
    }

    public int size()
    {
        return this.count;
    }

    public void clear()
    {
        this.head = null;
        this.tail = null;
    }

    public boolean containts(T item)
    {
        throw new NotImplementedException();
    }

    public void copyTo(T[] array, int arrayIndex)
    {
        throw new NotImplementedException();
    }

    public boolean isReadOnly()
    {
        throw new NotImplementedException();
    }

    public boolean remove(T item)
    {
        throw new NotImplementedException();
    }


}
