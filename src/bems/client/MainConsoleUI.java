package bems.client;

import bems.model.*;
import bems.service.*;
import bems.utility.InputUtil;

//Comment by Yashashawi
//Another comment for testing

public class MainConsoleUI {
    public static void main(String[] args) {
        BankEmployeeService service = new BankEmployeeServiceImpl();

        while (true) {
            System.out.println("\n--- Bank Employee Management ---");
            System.out.println("1. Add Employee\n2. View All\n3. Search\n4. Update\n5. Delete\n6. Sort by Salary\n7. Exit");
            int choice = InputUtil.getInt("Enter choice: ");

            switch (choice) {
                case 1 -> {
                    int id = InputUtil.getInt("Enter ID: ");
                    String name = InputUtil.getString("Enter Name: ");
                    double salary = InputUtil.getDouble("Enter Salary: ");
                    String role = InputUtil.getString("Enter Role (Manager/Teller): ");
                    service.addEmployee(BankEmployeeFactory.createEmployee(role, id, name, salary));
                }
                case 2 -> service.viewAll().forEach(System.out::println);
                case 3 -> {
                    int id = InputUtil.getInt("Enter ID to search: ");
                    System.out.println(service.searchById(id));
                }
                case 4 -> {
                    int id = InputUtil.getInt("Enter ID to update: ");
                    String name = InputUtil.getString("New Name: ");
                    double salary = InputUtil.getDouble("New Salary: ");
                    BankEmployee emp = service.searchById(id);
                    if (emp != null) {
                        emp.setName(name);
                        emp.setSalary(salary);
                        service.updateEmployee(emp);
                    }
                }
                case 5 -> service.deleteEmployee(InputUtil.getInt("Enter ID to delete: "));
                case 6 -> service.sortedBySalary().forEach(System.out::println);
                case 7 -> System.exit(0);
            }
        }
    }
}