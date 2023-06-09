## Collection and iterable/iterators concepts
- By implementing these interfaces, classes can be made iterable, allowing for easy iteration over their elements.
- Collection interface extends the Iterable interface because each collection wants to use the methods of Iterator so 
    that each collection could be iterated for different usecases.

  <img width="834" alt="Screenshot 2023-05-29 at 2 27 48 PM" src="https://github.com/geeky-decoder/JavaConceptsCoding/assets/110541205/0d392595-e61a-4e48-a83d-f4a49be40cb9">

## Collection Interface Methods
- boolean addAll(Collection<? extends E> C)
- boolean retainAll(Collection<?> C)
- boolean containsAll(Collection<?> C)
- boolean removeAll(Collection<?> C)
- void clear()

## Iterable
- It is used to represent a collection of elements that can be iterated over.

## Methods
- Iterator<T> iterator()

## Iterator
- It provides a way to iterate over the elements of the collection.

## Methods available
- void forEachRemaining(Consumer<? super T> action)
- boolean hasNext()
- T next()
- void remove()

## ListIterator
- List iterator is a bi-directional iterator for lists
- It extends Iterator interface and allows list to traveresed in either direction i.e. next() & previous()
- With ArrayList use the Iterator as it contains elements in one direction but with LinkedList you can use ListIterator 
    just because it internally uses doubly linkedlist.

`interface ListIterator<E> extends Iterator<E> {
    boolean hasNext()
    boolean hasPrevious()
    E next()
    E previous()
}`

## List provides two methods
- ListIterator<E> listIterator()
- ListIterator<E> listIterator(int index)


## Fail-Fast v/s Fail-Safe Iterators concepts (Imp)
![image](https://github.com/geeky-decoder/JavaConceptsCoding/assets/110541205/50234516-95a8-433b-8552-73abc55db23b)
