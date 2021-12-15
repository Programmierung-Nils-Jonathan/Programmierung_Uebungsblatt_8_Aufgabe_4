package mySets;

public class mySetElement <T>{
    mySetElement <T> next;
    T value;

   public mySetElement(mySetElement <T> pNext, T pValue){
       this.next = pNext;
       this.value = pValue;
   }

}
