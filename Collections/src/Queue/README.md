## Queue
- Queue interface extends Collection interface
- Follows FIFO(First In First Out)

## Methods
- `[Avoid using as you need to handle the exceptions these methods throw]`
- boolean add(E element)  Taken from collection interface and if queue is full throws IllegalArgumentException
- E remove()    if queue is empty throws NoSuchElementException
- E element() [to get the head element]  if queue is empty throws NoSuchElementException

- `[Recommended to use as these methods doesn't throw any excpetions instead return null or false if any boundary case exist]`
- boolean offer(E element)    Queue interface own method and recommended to use as it saves us from irrelevant exceptions
- E poll() [to remove the element]   used to remove element from queue(recommended)
- E peek() [to get the head element]   used to get the current element from queue(recommended)

## Deque
- Extends Queue interface to allow double ended queues.
- Operations can be performed at both Head & Tail
- Can work as LIFO & FIFO both.
- If you want to have Stack use ARRAYDEQUE

     -+-+-+-+-+- Deque<Integer> stack = new ArrayDeque<Integer>(); -+-+-+-+-+-
- If you want to have normal queue use LINKEDLIST

## Methods
- Visit this for all the available methods (https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html)

## Stack
- 




## Methods
- 

