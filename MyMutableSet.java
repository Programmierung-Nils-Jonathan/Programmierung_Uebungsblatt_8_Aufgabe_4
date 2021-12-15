package mySets;

public class MyMutableSet extends MyAbstractSet implements java.util.Set {

    public MyMutableSet() {
        super(null);
    }

    boolean retainAll() {
        throw java.lang.UnsupportedOperationException;
    }

    @Override
    void add(T addObject) {
        this.head.add(addObject);
    }

    @Override
    void addAll(T[] addObjects) {
        for(int i = 0; i < addObjects.length; i++) {
            this.head.add(addObject);
        }
    }

}
