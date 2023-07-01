## Queue
- Queue interface extends Collection interface.
- Follows FIFO(First In First Out).

## Methods
`[Avoid using as you need to handle the exceptions these methods throw]`
- boolean add(E element)  Taken from collection interface and if queue is full throws IllegalArgumentException
- E remove()    if queue is empty throws NoSuchElementException
- E element() [to get the head element]  if queue is empty throws NoSuchElementException

`[Recommended to use as these methods doesn't throw any excpetions instead return null or false if any boundary case exist]`
- boolean offer(E element)    Queue interface own method and recommended to use as it saves us from irrelevant exceptions
- E poll() [to remove the element]   used to remove element from queue(recommended)
- E peek() [to get the head element]   used to get the current element from queue(recommended)

## Deque
- Extends Queue interface to allow double ended queues.
- Operations can be performed at both Head & Tail.
- Can work as LIFO & FIFO both.
- If you want to have Stack use `ARRAYDEQUE`

    `Deque<Integer> stack = new ArrayDeque<Integer>();`
- If you want to have normal queue use `LINKEDLIST`

## Methods
- Visit this for all the available methods (https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Deque.html)

## PriorityQueue
- It works on priority.
- Implementation is based on priority heap, a tree like structure that yields element at the head of the queue according to the priority ordering which is either defined by natural ordering of its elements or by a comparator.
- If some elements have same priority than one of the element is chosen arbitarily.
- Elements are not sorted at all.
- Elements could be removed but in priority order.
- Traversing the priorityQueue is not recommended.

  <img width="1213" alt="Screenshot 2023-07-01 at 10 25 23 PM" src="https://github.com/geeky-decoder/JavaConceptsCoding/assets/110541205/83d2f6f7-32ae-4693-9fbf-cab8fd211b27">

## Methods
- Visit this for all the available methods (https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/PriorityQueue.html)


## Stack
- 




## Methods
- 

