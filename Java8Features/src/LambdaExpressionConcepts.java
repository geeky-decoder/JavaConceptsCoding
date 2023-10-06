
/*
 * Old way of implementing the interface and calling the method using class object
 */
// public class LambdaExpressionConcepts implements FunctionalInterfaceConcepts {

//     @Override
//     public void functionalMethod() {
//         System.out.println("Functional Interface Abstract Method");
//     }

//     public static void main(String[] args) {
//         LambdaExpressionConcepts lExpressionConcepts = new LambdaExpressionConcepts();
//         lExpressionConcepts.functionalMethod();
//     }
// }

/*
 * Lambda expression way of doing the same thing done above.
 * But this can only be applied to functional interfaces.
 */
public class LambdaExpressionConcepts {

    public static void main(String[] args) {

        /*
         * Different ways to use use and define lambda expressions
         */
        
        // FunctionalInterfaceConcepts fInterfaceConcepts = () ->
        // System.out.println("Functional Interface Abstract Method");
        // fInterfaceConcepts.functionalMethod();

        // FunctionalInterfaceConcepts fInterfaceConcepts = number ->
        // System.out.println("The number is : " + number);
        // fInterfaceConcepts.tellMeTheNumber(20);

        // FunctionalInterfaceConcepts fInterfaceConcepts = (num1, num2) ->
        // System.out.println(num1 + num2);
        // fInterfaceConcepts.doAddition(32, 28);

        FunctionalInterfaceConcepts fInterfaceConcepts = (num1, num2) -> {
            if (num1 > num2) {
                System.out.println("Greatest number is : " + num1);
            } else {
                System.out.println("Greatest number is : " + num2);
            }
        };

        fInterfaceConcepts.findTheGreatest(23, 32);
    }
}