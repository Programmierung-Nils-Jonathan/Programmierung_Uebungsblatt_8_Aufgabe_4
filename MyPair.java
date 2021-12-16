package mySets;

public class MyPair <T, U>{
    MySetElement<T> T;
    MySetElement<U> U;
    public MyPair(MySetElement<T>pT,MySetElement<U>pU)
    {
        this.T=pT;
        this.U=pU;
    }
    public String toString()
    {
        return this.U.value+", "+this.T.value+"!";
    }

    public MySetElement<T> getT() {
        return T;
    }

    public MySetElement<U> getU() {
        return U;
    }

    public void setT(MySetElement<T> t) {
        this.T = t;
    }

    public void setU(MySetElement<U> u) {
        this.U = u;
    }
}
