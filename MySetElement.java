package mySets;

 class MySetElement <T>{
    MySetElement <T> next;
    T value;

    public MySetElement(MySetElement <T> pNext, T pValue){
        this.next = pNext;
        this.value = pValue;
    }


}
