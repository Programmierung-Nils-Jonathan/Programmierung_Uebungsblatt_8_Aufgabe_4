package mySets;

protected class MyMutableSet extends MyAbstractSet implements java.util.Set {

    MyMutableSet() {
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
            this.head.add(addObject[i]);
        }
    }

    @Override
    void clear() {
        this.head.clear();
    }

    @Override
    void remove(T removeObject) {
        this.head.remove(removeObject);
    }

    @Override
    void removeAll(T[] removeObjects) {
        for(int i = 0; i < removeObjects.length; i++) {
            this.head.remove(removeObjects[i]);
        }
    }
}
