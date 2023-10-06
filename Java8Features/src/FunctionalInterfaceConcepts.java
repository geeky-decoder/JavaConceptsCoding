
/*
 * This annotation is not mandatory if you like it than use otherwise 
 * no need till the time you are following the definition of a functional interface.
 */
@FunctionalInterface
public interface FunctionalInterfaceConcepts {

    /*
     * This is the one and only one abstract method
     * present in the functional interface as per its definition.
     * If you will declare another method as abstract it will give compile error
     */
    // void functionalMethod();

    // void tellMeTheNumber(int number);

    // void doAddition(int num1, int num2);

    void findTheGreatest(int num1, int num2);

    /*
     * This is the default method which can have multiple occurencces
     */
    default void method1() {
        System.out.println("Default Method");
    }

    /*
     * This is the default method which can have multiple occurencces
     */
    default void method2() {
        System.out.println("Default Method");
    }

    /*
     * This is the static method which can have multiple occurencces
     */
    static void method3() {
        System.out.println("Static Method");
    }

}
