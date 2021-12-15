package mySets;

protected class MySetElement <T>{
    MySetElement <T> next;
    T value;

   public MySetElement(mySetElement <T> pNext, T pValue){
       this.next = pNext;
       this.value = pValue;
   }

   public boolean contains(T compareObject) {
       if(next == null){
            return false;
       } else if(value == compareObject) {
            return true;
       } else {
           return next.contains();
       }
   }

   public boolean containsAll(T[] compareObjects) {
        for(int i = 0; i < compareObjects.length; i++) {
            if(!this.contains(compareObjects[i])) {
                return false;
            }
        }

        return true;
   }

   public int size() {
       if(next != null) {
           if(value == null) {
               return 0;
           }
           return 1;
       } else {
            return 1 + next.size();
       }
   }

   public boolean isEmpty() {
        return this.size() == 0;
   }

   String toString() {
        if(next == null) {
            return this.value;
        } else {
            return this.value + "," + this.next.toString();
        }
   }

   void add(T addObject) {
       if(!this.contains(addObject)) {
            this.next = new MySetElement<MySetElement.T>(this.next, addObject) ;
       }
   }

}
