package com.my.list.model;

/**
 * Created by Admin on 09.03.2016.
 */
public class Iterator<T> {
    private Node currentValue;
    private boolean headDone;
    private MyList list;

    public Iterator(MyList list)
    {
        this.list = list;
        this.currentValue = list.head;
        headDone = false;
    }

    public T next()
    {
        if (!list.isEmpty())
        {
            if (headDone == false)
            {
                headDone = true;
                return (T) currentValue.value;
            }

            else currentValue = currentValue.next;
            return (T) currentValue.value;
        }

        return null;

    }

    public boolean hasNext()
    {
        if (currentValue == null || currentValue.next == null) return false;
        return true;
    }
}
