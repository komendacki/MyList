package com.my.list.model;

/**
 * Created by Admin on 08.03.2016.
 */
public class MyList<T> {

    public MyList()
    {
        this.count = 0;
        readOnly = false;
    }

    private int count;
    Node head;
    Node tail;
    private boolean readOnly;

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

    public boolean isEmpty()
    {
        if (count == 0) return true;
        return false;
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

    public boolean contains(T item)
    {
        Node current = this.head;

        while (current != null)
        {
            if (current.value == item)
            {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public void copyTo(T[] array, int arrayIndex)
    {
        if (count > array.length - arrayIndex - 1) throw new IndexOutOfBoundsException();

        Node current = head;
        int i = arrayIndex;

        while (current != null)
        {
            array[i] = (T) current.value;
            i++;
            current = current.next;
        }
    }

    public boolean isReadOnly()
    {
        return this.readOnly;
    }

    public boolean remove(T item)
    {
        Node current = this.head;
        Node previous = null;

        while (current != null)
        {
            Node next = current.next;
            if (current.value == item)
            {
                if (previous == null)
                {
                    head = next;
                }

                else if (current.next == null)
                {
                    previous.next = null;
                    tail = previous;
                }

                else
                {
                    previous.next = next;
                }
                count--;
                return true;
            }
            previous = current;
            current = next;
        }
        return false;
    }


}
