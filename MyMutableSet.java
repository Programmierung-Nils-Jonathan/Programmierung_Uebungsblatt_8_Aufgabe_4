
package mySets;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;

abstract class MyMutableSet<T> extends MyAbstractSet<T> implements java.util.Set<T> {

        MyMutableSet() {
            super(null);
        }

        public boolean retainAll() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override
        public boolean add(T insert) {
            if (! contains(insert)) {
                head = new  MySetElement <>(head , insert);
                return  true;
            } else
            {
                return  false;
            }
        }



        public  boolean  addAll(Collection<?  extends T> c) {
            boolean  changed = false;

             for (T t: c) {
            changed = changed | add(t);
            }
            return  changed;
        }


        @Override
        public void clear() {
            head = null;
        }

        @Override
        public  boolean  remove(Object o) {
            if (head == null) {
                return  false;
            }
            if (head.value==o) {
            head = head.next;
            return  true;
            }
        MySetElement <T> previous = head;
        MySetElement <T> current = head.next;
        while (current  != null) {
            if (current.value.equals(o)) {
                previous.next = current.next;
                return true;
        }
            else
        {
            previous = previous.next;
            current = current.next;
        }
        }
        return false;
    }



        public  boolean  removeAll(Collection<?> c) {
             boolean  changed = false;

            for (Object o: c) {
                changed = changed | remove(o);
            }
                return  changed;
        }
        public MyMutableSet<MyMutableSet<T>> powerSet() {
            MyMutableSet<MyMutableSet<T>> pot = new MyMutableSet<MyMutableSet<T>>() {
                @Override
                public boolean hasNext() {
                    return false;
                }

                @Override
                public MyMutableSet<T> next() {
                    return null;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean retainAll(@NotNull Collection<?> c) {
                    return false;
                }
            };
            MyMutableSet<T> neu = new MyMutableSet<T>() {
                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean retainAll(@NotNull Collection<?> c) {
                    return false;
                }

                @Override
                public boolean hasNext() {
                    return false;
                }

                @Override
                public T next() {
                    return null;
                }
            };
            MySetIterator<T> it = this.iterator();
            MyMutableSet<T> result = this;
            ArrayList<MySetElement<T>> help=new ArrayList<MySetElement<T>>();
            while(this.hasNext())
            {
                help.add(this.head);
                this.next();
            }
            for (int i=0; i < help.size(); ++i) {
                for (int j=0; j < help.size(); ++j) {
                    for (int k=0; k < help.size(); ++k) {
                        if(help.get(i).equals(help.get(j))&&help.get(i).equals(help.get(k)))
                        {
                            neu.add(help.get(i).value);
                            pot.add(neu);
                            neu.remove();
                        }
                        else if(help.get(i).equals(help.get(j)))
                        {
                            neu.add(help.get(i).value);
                            neu.add(help.get(k).value);
                            pot.add(neu);
                            neu.remove();
                            neu.remove();
                        }
                        else if(help.get(k).equals(help.get(j)))
                        {
                            neu.add(help.get(k).value);
                            neu.add(help.get(i).value);
                            pot.add(neu);
                            neu.remove();
                            neu.remove();
                        }
                        else if(help.get(i).equals(help.get(k)))
                        {
                            neu.add(help.get(j).value);
                            neu.add(help.get(i).value);
                            pot.add(neu);
                            neu.remove();
                            neu.remove();
                        }
                        else
                        {
                            neu.add(help.get(j).value);
                            neu.add(help.get(k).value);
                            neu.add(help.get(i).value);
                            pot.add(neu);
                            neu.remove();
                            neu.remove();
                            neu.remove();
                        }
                    }
                }
            }
            return pot;

        }
        public MyMutableSet<MyPair<T,T>> pairs()
        {
            MyMutableSet<MyPair<T,T>> returnen= new MyMutableSet<MyPair<T, T>>() {
                @Override
                public boolean hasNext() {
                    return false;
                }

                @Override
                public MyPair<T, T> next() {
                    return null;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean retainAll(@NotNull Collection<?> c) {
                    return false;
                }
            };
            ArrayList<MySetElement<T>> help=new ArrayList<MySetElement<T>>();
            while(this.hasNext())
            {
                help.add(this.head);
                this.next();
            }
            for (int i=0; i < help.size(); ++i) {
                for (int j=0; j < help.size(); ++j) {
                    if (help.get(j).equals(help.get(i))) {
                    } else {
                        MyPair<T, T> helpful = new MyPair<T, T>(help.get(i), help.get(j));
                        returnen.add(helpful);
                    }
                }
            }
            return returnen;
        }
        public MyMutableSet<MyPair<Integer,T>> enumerate()
        {
            return null;
        }
        public MyMutableSet<MyPair<MyMutableSet<T>,Integer>> numberOfSubsets()
        {
            return null;
        }
        public  MyMinimalSet <T> freezeAndClear () {
                MyMinimalSet <T> res = new  MyImmutableSet <>(head);
                clear ();
                return  res;
        }
}
