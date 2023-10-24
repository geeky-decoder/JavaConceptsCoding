package Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import javax.swing.RowFilter.Entry;

public class StreamsWithObjects {

    private static List<EmployeeModel> getAllEmployees() {
        List<EmployeeModel> employeeModel = new ArrayList<>();
        employeeModel.add(0,
                new EmployeeModel(106, "Vivek", "Engineer", "Male", 60000, List.of("123456789", "345678901")));
        employeeModel.add(1,
                new EmployeeModel(100, "Ankit", "Manager", "Male", 150000, List.of("123456789", "345678901")));
        employeeModel.add(2,
                new EmployeeModel(101, "Harsh", "Lead", "Male", 120000, List.of("123456789", "345678901")));
        employeeModel.add(3,
                new EmployeeModel(108, "Deepak", "Architect", "Male", 180000, List.of("123456789", "345678901")));
        employeeModel.add(4, new EmployeeModel(102, "Nitin", "PO", "Male", 90000, List.of("123456789", "345678901")));
        return employeeModel;
    }

    private static Map<EmployeeModel, Integer> getAllMappedEmployees() {
        Map<EmployeeModel, Integer> employeeMap = new HashMap<>();
        employeeMap.put(new EmployeeModel(106, "Vivek", "Engineer", "Male", 60000, List.of("123456789", "345678901")),
                32);
        employeeMap.put(new EmployeeModel(100, "Ankit", "Manager", "Male", 150000, List.of("123456789", "345678901")),
                32);
        employeeMap.put(new EmployeeModel(101, "Harsh", "Lead", "Male", 120000, List.of("123456789", "345678901")), 32);
        employeeMap.put(
                new EmployeeModel(108, "Deepak", "Architect", "Male", 180000, List.of("123456789", "345678901")), 32);
        employeeMap.put(new EmployeeModel(102, "Nitin", "PO", "Male", 90000, List.of("123456789", "345678901")), 32);
        return employeeMap;
    }

    public static void main(String[] args) {
        StreamsWithObjects sWithObjects = new StreamsWithObjects();
        sWithObjects.streamsWithObjectList();
        sWithObjects.streamsWithObjectMap();
        sWithObjects.streamsWithMapReduce();
        sWithObjects.streamsWithParallelStreams(getAllEmployees());
    }

    private void streamsWithObjectList() {
        List<EmployeeModel> allEmployees = getAllEmployees();
        System.out.println("-------------------------------------------------------------------------");

        // Using collections method to sort in ascending order
        Collections.sort(allEmployees, ((obj1, obj2) -> obj1.getEmpSalary() - obj2.getEmpSalary()));
        System.out.println(allEmployees);
        System.out.println("-------------------------------------------------------------------------");

        // Using collections method to sort in descending order
        Collections.sort(allEmployees, ((obj1, obj2) -> obj2.getEmpSalary() - obj1.getEmpSalary()));
        System.out.println(allEmployees);
        System.out.println("-------------------------------------------------------------------------");

        allEmployees.stream().filter(t -> t.getEmpId() > 105).map(EmployeeModel::getEmpName)
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------");

        // Using streams sorted method to sort in ascending order
        allEmployees.stream().sorted(Comparator.comparing(EmployeeModel::getEmpSalary)).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------");

        // Using streams sorted method to sort in descending order
        allEmployees.stream().sorted(Comparator.comparing(EmployeeModel::getEmpSalary).reversed())
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------");
    }

    private void streamsWithObjectMap() {
        Map<EmployeeModel, Integer> employeeMap = getAllMappedEmployees();

        List<Entry<EmployeeModel, Integer>> listOfMap = new ArrayList(employeeMap.entrySet());

        // when key is of Object type than we need to use another comparator inside
        // comparingByKey or comparingByValue
        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(EmployeeModel::getEmpRole)))
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------");

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(EmployeeModel::getEmpId)))
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------");

        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(EmployeeModel::getEmpSalary).reversed()))
                .forEach(System.out::println);

        System.out.println("-------------------------------------------------------------------------");

    }

    private void streamsWithMapReduce() {
        List<EmployeeModel> employeeModel = new ArrayList<>();
        employeeModel.add(0,
                new EmployeeModel(106, "Vivek", "Engineer", "Male", 82000, List.of("123456789", "345678901")));
        employeeModel.add(1,
                new EmployeeModel(100, "Ankit", "Lead", "Male", 150000, List.of("123456789", "345678901")));
        employeeModel.add(2,
                new EmployeeModel(101, "Harsh", "Engineer", "Male", 102000, List.of("123456789", "345678901")));
        employeeModel.add(3,
                new EmployeeModel(108, "Deepak", "Architect", "Male", 180000, List.of("123456789", "345678901")));
        employeeModel.add(4,
                new EmployeeModel(102, "Nitin", "Engineer", "Male", 93000, List.of("123456789", "345678901")));

        // find average using map reduce
        OptionalDouble averageUsingMapReduce = employeeModel.stream()
                .filter(emp -> emp.getEmpRole().equalsIgnoreCase("Engineer")).mapToDouble(EmployeeModel::getEmpSalary)
                .average();
        System.out.println(averageUsingMapReduce.getAsDouble());
        System.out.println("-------------------------------------------------------------------------");

        // find sum using map reduce
        OptionalInt sumUsingMapReduce = employeeModel.stream()
                .filter(emp -> emp.getEmpRole().equalsIgnoreCase("Engineer")).mapToInt(EmployeeModel::getEmpSalary)
                .reduce(Integer::sum);
        System.out.println(sumUsingMapReduce.getAsInt());
        System.out.println("-------------------------------------------------------------------------");
    }

    private void streamsWithParallelStreams(List<EmployeeModel> allEmployees) {

        // normal stream


        // parallel stream
    }
}
