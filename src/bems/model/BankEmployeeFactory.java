package bems.model;

public class BankEmployeeFactory {
    public static BankEmployee createEmployee(String role, int id, String name, double salary) {
        if (role.equalsIgnoreCase("Manager")) {
            return new BankManager(id, name, salary);
        } else {
            return new BankTeller(id, name, salary);
        }
    }
}