package com.my.list.model;

/**
 * Created by Admin on 09.03.2016.
 */
public class Iterator<T> {
    private Node currentValue;
    private MyList list;

    public Iterator(MyList list)
    {
        this.list = list;
        this.currentValue = null;
    }

    public T next()
    {
        if (!list.isEmpty())
        {
            if (currentValue == null) currentValue = list.head;
            else currentValue = currentValue.next;
            return (T) currentValue.value;
        }

        return null;

//        if (currentValue == null && !list.isEmpty())
//        {
//            currentValue = list.head;
//        }
//        else
//        {
//            currentValue = currentValue.next;
//        }

    }

    public boolean hasNext()
    {
        if (currentValue.next.equals(null)) return false;
        return true;
    }
}
