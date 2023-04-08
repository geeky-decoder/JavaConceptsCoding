
/*
     * enum are just like Classes and constants defined inside them behaves as object in java
     * each constant in enum have by default int positioning that starts with 0
     * enum are by default public, static and final
     * enum by default extends Enum class hence cannot be extended further else other things work as same as it does in normal java class
     */
enum HttpStatus {
    RUNNING, FAILED, PENDING, SUCCESS;  //enum class objects
}

public class PracticeEnum {

    private static void basicsOfEnum(HttpStatus httpStatus) {
        System.out.println(httpStatus); // to print the enum constant value
        System.out.println(httpStatus.ordinal()); // to print the enum constant position

        HttpStatus[] allHttpStatus = HttpStatus.values(); // to print all values present inside enum
        for (HttpStatus result : allHttpStatus) {
            System.out.println(result + " " + result.ordinal());
        }
    }

    private static void ifElseEnum(HttpStatus httpStatus) {
        if (httpStatus == HttpStatus.RUNNING) {
            System.out.println("Up and Running");
        } else if (httpStatus == HttpStatus.FAILED) {
            System.out.println("Request Failed");
        } else if (httpStatus == HttpStatus.PENDING) {
            System.out.println("Please wait");
        } else {
            System.out.println("Request is successful");
        }
    }

    private static void switchInEnum(HttpStatus httpStatus) {
        switch (httpStatus) { // as httpstatus is already of type HttpStatus so we can directly use object names in cases
            case RUNNING:
                System.out.println("Up and Running");
                break;
            case FAILED:
                System.out.println("Request Failed");
                break;
            case PENDING:
                System.out.println("Please wait");
                break;
            case SUCCESS:
                System.out.println("Request is successful");
                break;
            default:
                System.out.println("No such request received");
        }
    }

    public static void main(String[] args) {
        HttpStatus httpStatus = HttpStatus.RUNNING; // accessing the enum class objects using Class name as by default they are public, static and final
        basicsOfEnum(httpStatus);
        ifElseEnum(httpStatus);
        switchInEnum(httpStatus);
    }
}