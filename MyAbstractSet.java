package mySets;

protected class MyAbstractSet <T> implements java.util.Iterator, java.util.Set {
    MySetElement<T> head;

    MyAbstractSet(MySetElement<T> set) {
        head = set;
    }

    @Override
    public MySetIterator iterator() {
    }

    @Override
    public Object[] toArray() {
        throw java.lang.UnsupportedOperationException;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw java.lang.UnsupportedOperationException;
    }
}
