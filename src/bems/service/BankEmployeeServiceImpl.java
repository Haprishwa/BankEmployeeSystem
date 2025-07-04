package bems.service;

import bems.repository.BankEmployeeRepository;
import bems.model.BankEmployee;
import java.util.*;

public class BankEmployeeServiceImpl implements BankEmployeeService {
    private BankEmployeeRepository dao = new BankEmployeeRepository();

    public void addEmployee(BankEmployee emp) {
        dao.add(emp);
    }

    public List<BankEmployee> viewAll() {
        return dao.getAll();
    }

    public BankEmployee searchById(int id) {
        return dao.getById(id);
    }

    public void updateEmployee(BankEmployee emp) {
        dao.update(emp);
    }

    public void deleteEmployee(int id) {
        dao.delete(id);
    }

    public List<BankEmployee> sortedBySalary() {
        List<BankEmployee> list = dao.getAll();
        list.sort(null); // Uses Comparable
        return list;
    }
}