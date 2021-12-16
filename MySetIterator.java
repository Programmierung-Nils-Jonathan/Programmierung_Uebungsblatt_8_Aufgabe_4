package mySets;

import java.util.Iterator;

class MySetIterator <T> implements java.util.Iterator {
    MySetElement<T> current;
    public MySetIterator(MySetElement<T> pCurrent){
        this.current = pCurrent;
    }
    @Override
    public boolean hasNext() {
        if(current==null)
        {
            return false;
        }
        else
        {
            return true;
        }

    }

    @Override
    public MySetElement<T> next() {
        MySetElement<T> neu = current;
        try{
            current = current.next;
        }
        catch(java.util.NoSuchElementException e){
            throw e;
        }
        return neu;

    }


    @Override
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}

