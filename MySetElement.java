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

}
