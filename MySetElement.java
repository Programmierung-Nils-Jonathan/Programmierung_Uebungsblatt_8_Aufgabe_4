package mySets;

protected class MySetElement <T>{
    MySetElement <T> next;
    T value;

   public MySetElement(mySetElement <T> pNext, T pValue){
       this.next = pNext;
       this.value = pValue;
   }

}
