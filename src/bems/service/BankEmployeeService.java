package bems.service;

import bems.model.BankEmployee;
import java.util.List;

public interface BankEmployeeService {
    void addEmployee(BankEmployee emp);
    List<BankEmployee> viewAll();
    BankEmployee searchById(int id);
    void updateEmployee(BankEmployee emp);
    void deleteEmployee(int id);
    List<BankEmployee> sortedBySalary();
}
