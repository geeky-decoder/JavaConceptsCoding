- Ordering coming from the classes itself is called as -> `Natural Ordering`
- Ordering given from the Custom implementation is called as -> `Total Ordering`
- Precedence: `Total Ordering > Natural Ordering`


# Comparable
- Comparable interface should be implemented by the class itself.
- It has compareTo(Object obj) method with one argument as the class implementing this interface has its own object to compare with.



# Comparator
- Comparator interface should be implemented by the Comparator class itself.
- It has compare(Object obj1, Object obj2) method with two arguments as it does not have its own main class for implementation