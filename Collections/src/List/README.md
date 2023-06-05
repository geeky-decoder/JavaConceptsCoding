
List (java.util) package
----
Maintain insertion/retrieval order as they are position based starting from index 0.

Can contain duplicates ()

Can contain null elements

Methods
-------
E get(int index)

E set(int index, E element)

void add(int index, E element)

boolean addAll(int index, Collection<? extends E> c)

E remove(int index)

Types
-----
ArrayList

LinkedList

Vector

ArrayList
---------
Visit this for all the available methods (https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

Dynamic Array

Use when you don't know the size of the array

It is not thread-safe/synchronized 

Size of ArrayList is increased as per the given formula below 
    >>>>>   int newCapacity = oldCapacity + (oldCapacity >> 1);  i.e. by 1.5 times the original size    <<<<<
Default size of ArrayList is 10 but this is virtual capacity reserved.
Actually you will have 0 size which will the physical capacity as soon as you declare an ArrayList in java.
Whenever there is some values added to ArrayList its Physical capacity increases and virtual capacity decreases.
Should use JAVA GENERICS while declaring an ArrayList so that java knows that it will contain only particular type of elements
        >>>>>   ALWAYS USE Interface<K,V> name = new ImplementedClassConstructor<>();   <<<<<

Vector
------
It is a legacy class

Dynamically impplemented

It is thread-safe/synchronized

Due to synchronization it is comparatively slow than ArrayList

LinkedList
----------
Visit this for all the available methods (https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)

Uses doubly linkedlist internally

Insertion/deletion are very efficient in doubly linkedlist

ArrayList V/S Linkedlist
------------------------
Position based access : Takes constant time in ArrayList whereas linear time is taken in case of linkedlist

Frequent insetion/deletion : Takes linear time in ArrayList(as elements need to be shifted) whereas constant time is taken in
case of linkedlist (as we just need to use pointers to traverse) 
