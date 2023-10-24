package Streams;

import java.util.List;
import java.util.Optional;

public class OptionalConcepts {

    public static void main(String[] args) {
        List<EmployeeModel> employeeModel = List.of(
                new EmployeeModel(106, "Vivek", "Engineer", null, 60000, List.of("123456789", "345678901")),
                new EmployeeModel(100, "Ankit", "Manager", "Male", 150000, List.of("123456789", "345678901")),
                new EmployeeModel(101, "Harsh", "Lead", "Male", 120000, List.of("123456789", "345678901")),
                new EmployeeModel(108, "Deepak", "Architect", "Male", 180000, List.of("123456789", "345678901")),
                new EmployeeModel(102, "Nitin", "PO", "Male", 90000, List.of("123456789", "345678901")));

        System.out.println("-----------------------------------------");
        optionalMethodsUsage(employeeModel);
    }

    private static void optionalMethodsUsage(List<EmployeeModel> employeeModel) {

        // if of() used than the request should not be null else it will throw NullPointerException
        // Optional<String> genderOf = Optional.of(employeeModel.get(0).getEmpGender());
        // System.out.println(genderOf);
        // System.out.println("-----------------------------------------");

        // if ofNullable() used than the request can be null or not null. It will return empty optional object if found null
        Optional<String> genderofNullable = Optional.ofNullable(employeeModel.get(0).getEmpGender());
        System.out.println(genderofNullable);
        System.out.println("-----------------------------------------");

        String orElseUsage = Optional.ofNullable(employeeModel.get(0).getEmpGender())
                .orElse("I am called because queried request was NULL");
        System.out.println(orElseUsage);
        System.out.println("-----------------------------------------");

        // Optional.ofNullable(employeeModel.get(0).getEmpGender())
        // .orElseThrow(() -> new IllegalArgumentException("Request cannot be NULL"));

        System.out.println("-----------------------------------------");

        Optional<List<EmployeeModel>> ofNullable = Optional.ofNullable(employeeModel);

        // check if the optional contains any value or element
        if (ofNullable.isPresent()) {

            // get the actual value from optional object
            System.out.println(ofNullable.get());
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("Encountered NULL object");
            System.out.println("-----------------------------------------");
        }
    }
}
