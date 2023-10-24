package Streams;

import java.util.ArrayList;
import java.util.List;

public class CollectorsConcepts {

        private static List<EmployeeModel> getAllEmployees() {
                List<EmployeeModel> employeeModel = new ArrayList<>();
                employeeModel.add(0,
                                new EmployeeModel(106, "Vivek", "Engineer", "Male", 60000,
                                                List.of("123456789", "345678901")));
                employeeModel.add(1,
                                new EmployeeModel(100, "Ankit", "Manager", "Male", 150000,
                                                List.of("123456789", "345678901")));
                employeeModel.add(2,
                                new EmployeeModel(101, "Harsh", "Lead", "Male", 120000,
                                                List.of("123456789", "345678901")));
                employeeModel.add(3,
                                new EmployeeModel(108, "Deepak", "Architect", "Male", 180000,
                                                List.of("123456789", "345678901")));
                employeeModel.add(4, new EmployeeModel(102, "Nitin", "PO", "Male", 90000,
                                List.of("123456789", "345678901")));
                return employeeModel;
        }

        public static void main(String[] args) {

        }
}
