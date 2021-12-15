package mySets;

import java.util.Iterator;

protected class MySetIterator <T> implements java.util.Iterator {
    mySetElement<T> current;
    public mySetIterator(mySetElement<T> pCurrent){
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
    public mySetElement<T> next() {
        mySetElement<T> neu = current;
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
