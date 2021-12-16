package mySets;

import java.util.Collection;

abstract class MyAbstractSet <T> implements java.util.Iterator<T> {

    MySetElement<T> head;
    MyAbstractSet(MySetElement<T> set) {
        this.head = set;
    }


    public MySetIterator iterator() {
        return  new  MySetIterator <>(head);
    }


    public Object[] toArray() {
        throw new java.lang.UnsupportedOperationException();
    }


    public <T> T[] toArray(T[] a) {
        throw new java.lang.UnsupportedOperationException();
    }


    public boolean contains(Object compareObject) {
        for (MyAbstractSet<T> it = this; it.hasNext(); ) {
            T t = it.next();
            if (t.equals(compareObject)) {
                return  true;
            }
        }
        return  false;
    }



    public  boolean  containsAll(Collection<?> c) {
        for (Object o: c) {
            if (! contains(o)) {
                return  false;
            }
        }
        return  true;
    }


    public int size() {
        int  res = 0;
        for (MyAbstractSet<T> it = this; it.hasNext(); ) {
            T t = it.next();
            res ++;
        }
        return  res;
    }

    public String toString() {
        String  res = "{";
        MySetElement <T> current = head;
        while (current  != null) {
            res +=  current.value;
            if (current.next != null) res += ", ";
            current = current.next;
        }
        return  res + "}";
    }
    @Override
    public boolean equals ( Object other ) {
        if ( other instanceof MyAbstractSet <? >) {
            return this . containsAll (( Collection <? >) other )
                    && this . size () == (( MyAbstractSet <? >) other ). size ();
        }
        return false ;
    }
}

