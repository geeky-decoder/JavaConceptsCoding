package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<EmployeeModel> employeeModel = List.of(
                new EmployeeModel(106, "Vivek", "Engineer", "Male", 60000, List.of("123456789", "345678901")),
                new EmployeeModel(100, "Ankit", "Manager", "Male", 150000, List.of("123456789", "345678901")),
                new EmployeeModel(101, "Harsh", "Lead", "Male", 120000, List.of("123456789", "345678901")),
                new EmployeeModel(108, "Deepak", "Architect", "Male", 180000, List.of("123456789", "345678901")),
                new EmployeeModel(102, "Nitin", "PO", "Male", 90000, List.of("123456789", "345678901")));

        System.out.println("-----------------------------------------");
        mapInStreams(employeeModel);
        System.out.println("-----------------------------------------");
        flatMapInStreams(employeeModel);
        System.out.println("-----------------------------------------");
    }

    private static void flatMapInStreams(List<EmployeeModel> employeeModel) {
        // convert list of list of employees phoneNumbers into single list of string (List<List<String>> to List<String>)
        // here it is one-to-many mappping of single employee list of phone numbers to one single list of string

        // used flatMap and passed another stream inside it so as to map and flatter
        System.out.println(employeeModel.stream().flatMap(employee -> employee.getPhoneNumbers().stream())
                .collect(Collectors.toList()));

    }

    private static void mapInStreams(List<EmployeeModel> employeeModel) {
        // convert list of employees empRole to list of strings
        // here it is one-to-one mapping of single employee role to single list of string (one stream to another stream)
        System.out.println(employeeModel.stream().map(EmployeeModel::getEmpRole).collect(Collectors.toList()));
    }
}
