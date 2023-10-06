## Lambda Expression
- Used to represent anonymous functions(method which don't have any name or modifier).
- Syntax: Parameter Expression  Body;
Ex.:- `() ->  {method_body};`
- **NOTE:- If you have only one line logic than you don't need {} these braces in method body. But incase you have multiple lines of code than its mandatory to use {} these.
- Methods present in functional interface can only be written using Lambda expressions.



##  Functional Interface
- Interface which contains only one abstract method but can have multiple default and static method.
- For ex:- Runnable ->  run(), Callable ->  call(), Comparable  ->  compareTo(), Comparator ->  compare()
- If you want to create your own functional interface annotate your interface with @FunctionalInterface.

## Consumer
- A Consumer is an in-build functional interface in the java.util.function package. we use consumers when we need to consume objects, the consumer takes an input value and returns nothing. The consumer interface has two methods.
`void accept(T value);`
`default Consumer<T> andThen(Consumer<? super T> after);`

- forEach method in streams uses consumer to do nothing with the input and let the logic perform what it has to do

## Predicate
- A Predicate is a functional interface, which accepts an argument and returns a boolean. 
- It is basically used for conditional checks i.e. functions that returns either true/false.
- Usually, it is used to apply in a filter for a collection of objects.
`boolena test(T t);`

- filter method in streams uses predicate to do the conditional check internally

## Supplier
- It represents a function that does not take in any argument but produces a value of type T. It contains only one method.
`T get();`
- orElseGet method in streams uses supplier to take nothing and return something.

## Streams
- 