## Exception Handling concepts
------------------------------

- It is an event which disrupts the normal flow a program.
- Runtime system creates an Exception Object which contains information such as:
    - type of excpetion and message
    - stack trace etc
- Runtime system uses this Exception Object and finds the class that can handle it

- Below is the example that explains how the runtime system on getting the exception creates the exception object internally and looks for the class than can handle it. The flow starts from the `main` method itself.

![Alt text](image.png)

![Alt text](image-1.png)

----------------------
----------------------
## Exception Hierarchy
----------------------

- Object is the topmost class/parent class in whole java world.
- Error is a type of runtime exception or unchecked exception as it occurs while you run the program.


![Alt text](image-5.png)

------------------------

![Alt text](image-4.png)

------------------------

![Alt text](image-2.png)

------------------------

![Alt text](image-3.png)

------------------------

- Checked exception is something you need to handle compulsory else your code will not evern compile and will fail.

![Alt text](image-7.png)

------------------------

-  Now we will try to handle this checked exception by delegating the exception to caller as below:

![Alt text](image-6.png)

------------------------

- Now finally we will see how to actually handle the exception below:

![Alt text](image-8.png)

----------------------
----------------------
## Ways of Handling exception using try, catch, finally, throws, throw
----------------------------------------------------------------------

![Alt text](image-9.png)

- catch block can only catch those exception which can be thrown by the try block

-----------------------

> To catch all exceptions that might occur you need to use parent exception.

- **** While using parent exception make sure that it is the last catch block(mandatory) i.e. all the child exceptions must be placed before using parent exception catch block.

![Alt text](image-10.png)

------------------------

![Alt text](image-11.png)

------------------------

> To catch multiple exceptions in one catch block use below:

![Alt text](image-12.png)

-------------------------

![Alt text](image-13.png)

------------------------

![Alt text](image-14.png)

------------------------

> To create your own custom exceptions either checked/unchecked below is the way to achieve that:

![Alt text](image-15.png)

------------------------
------------------------

![Alt text](image-16.png)



