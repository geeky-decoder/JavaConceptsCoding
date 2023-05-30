Collection and iterable/iterators concepts
---------------------------------
-> By implementing these interfaces, classes can be made iterable, allowing for easy iteration over their elements.
-> Collection interface extends the Iterable interface because each collection wants to use the methods of Iterator so that each collection could be iterated for different usecases.

Collection Interface Methods
-----------------------------
-> boolean addAll(Collection<? extends E> C)
-> boolean retainAll(Collection<?> C)
-> boolean containsAll(Collection<?> C)
-> boolean removeAll(Collection<?> C)
-> void clear()

Iterable
*********
-> It is used to represent a collection of elements that can be iterated over.

Methods available :
-----------------
-> Iterator<T> iterator()


<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>


Iterator
********
-> It provides a way to iterate over the elements of the collection.


Methods available :
-----------------
-> void forEachRemaining(Consumer<? super T> action)
-> boolean hasNext()
-> T next()
-> void remove()