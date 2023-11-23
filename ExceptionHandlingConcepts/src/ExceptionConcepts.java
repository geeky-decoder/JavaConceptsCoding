public class ExceptionConcepts {

    private void getSum() throws UserDefinedUnCheckedException {
        System.out.println("Method for throwing unchecked exception");
        throw new UserDefinedUnCheckedException();
    }

    private void getClassNotFound() throws UserDefinedCheckedException {
        System.out.println("Method for throwing checked exception");
        // throw new UserDefinedCheckedException();
    }

    public static void main(String[] args) {
        ExceptionConcepts exceptionConcepts = new ExceptionConcepts();
        try {
            exceptionConcepts.getClassNotFound();
            exceptionConcepts.getSum();
        } catch (UserDefinedUnCheckedException unCheckedException) {
            System.out.println(unCheckedException.getMessage());
        } catch (UserDefinedCheckedException checkedException) {
            System.out.println(checkedException.getMessage());
        }
        System.out.println("This is all about exception handling");
    }

}
