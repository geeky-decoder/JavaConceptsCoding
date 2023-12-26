## MultiTasking v/s MultiThreading
----------------------------------

- In multitasking no resources are shared, they work separately but in mutlithreading resources are being shared so that they can work parallely.

>>>>>>>>>>>>>>>>>

## MultiThreading and its benefits/challenges
----------------------------------------------

![Alt text](image-3.png)

>>>>>>>>>>>>>>>>>>

### Process
-----------

![Alt text](image.png)

>>>>>>>>>>>>>>>>>>

### Thread
----------

![Alt text](image-1.png)

>>>>>>>>>>>>>>>>>>>

### Working of Process and Thread together
-------------------------------------------

![Alt text](image-2.png)

![Alt text](image-4.png)

![Alt text](image-5.png)

>>>>>>>>>>>>>>>>>>>>>>>>

## Basics of Thread
-------------------

- ### Ways of creating Thread
  ---------------------------  

![Alt text](image-6.png)

![Alt text](image-7.png)

![Alt text](image-8.png)

![Alt text](image-9.png)

![Alt text](image-10.png)

>>>>>>>>>>>>>>>>>>>>>>>>>

- ### Thread lifecycle
  --------------------

![Alt text](image-11.png)

![Alt text](image-12.png)

>>>>>>>>>>>>>>>>>>>>>>>>>

- ### Monitor Lock
------------------

![Alt text](image-13.png)

>>>>>>>>>>>>>>>>>>>>>>>>>

![Alt text](image-14.png)

![Alt text](image-15.png)

![Alt text](image-16.png)

![Alt text](image-50.png)
![Alt text](image-51.png)

![Alt text](image-18.png)

![Alt text](image-19.png)

![Alt text](image-17.png)

## Locks and Semaphores
-----------------------

- Locking does not depend on Objects as like synchronize method.

- We have await() [same as wait()]  and signal() [same as notify()] method for working with different kinds of locks in inter-thread communication.

![Alt text](image-20.png)

![Alt text](image-21.png)

![Alt text](image-28.png)
![Alt text](image-29.png)

![Alt text](image-27.png)
![Alt text](image-26.png)

![Alt text](image-30.png)
![Alt text](image-31.png)
![Alt text](image-32.png)

![Alt text](image-34.png)
![Alt text](image-33.png)

![Alt text](image-35.png)

>>>>>>>>>>>>>>>>>>>>>>>>>

## Ways of achieving Concurrency/MultiThreading
-----------------------------------------------

![Alt text](image-36.png)

![Alt text](image-37.png)

- ### CAS & FAA
---------------

![Alt text](image-43.png)

![Alt text](image-44.png)
![Alt text](image-47.png)

![Alt text](image-48.png)
![Alt text](image-49.png)

- - ### ABA Problem with CAS
----------------------------

![Alt text](image-45.png)

- #### Exapmle and problem

- To demonstrate the problem via a practical example, let’s consider a simple bank account class, where an integer variable holds the amount of the actual balance. We also have two functions: one for withdrawals and one for deposits. These operations use CAS to decrease and increase the balance of the account.

- Let’s think about a multithreaded scenario when Thread 1 and Thread 2 are operating on the same bank account. When Thread 1 wants to withdraw some money, it reads the actual balance to use that value for comparing the amount in the CAS operation later. However, for some reason, Thread 1 is a bit slow — maybe it’s blocked.

In the meantime, Thread 2 performs two operations on the account using the same mechanism while Thread 1 is suspended. First, it changes the original value, which has already been read by Thread 1, but then, it changes it back to the original value.

Once Thread 1 resumes, it will appear as if nothing has changed, and CAS will succeed:

![Alt text](image-46.png)

- ### Atomic
------------

![Alt text](image-39.png)

![Alt text](image-38.png)

![Alt text](image-40.png)

- When there is a use case of Read-Write-Modify lock free concurrency can be used.

### Volatile
------------

![Alt text](image-41.png)

![Alt text](image-42.png)

>>>>>>>>>>>>>>>>>>>>>>>>>

## Thread Pools and ThreadPoolExecutor
--------------------------------------

- Comes from `package java.util.concurrent`

![Alt text](image-52.png)
![Alt text](image-53.png)
![Alt text](image-54.png)
------------------------

![Alt text](image-55.png)
![Alt text](image-56.png)
![Alt text](image-57.png)
------------------------

![Alt text](image-58.png)


## Future
---------

![Alt text](image-59.png)
![Alt text](image-60.png)
![Alt text](image-61.png)

>>>>>>>>>>>>>>>>>>>>>>>>>

## CompletableFuture
--------------------

![Alt text](image-64.png)
![Alt text](image-65.png)
![Alt text](image-66.png)
![Alt text](image-67.png)
![Alt text](image-68.png)
![Alt text](image-69.png)
![Alt text](image-70.png)

>>>>>>>>>>>>>>>>>>>>>>>>>

## Callable
-----------

![Alt text](image-62.png)
![Alt text](image-63.png)

>>>>>>>>>>>>>>>>>>>>>>>>>

## Fork/Join Pool, Single, Fixed, CachedPool
--------------------------------------------

![Alt text](image-71.png)
![Alt text](image-72.png)
![Alt text](image-73.png)
![Alt text](image-74.png)
![Alt text](image-75.png)