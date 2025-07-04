package bems.repository;

import bems.model.BankEmployee;
import java.util.*;

public class BankEmployeeRepository {
    private Map<Integer, BankEmployee> employeeMap = new HashMap<>();

    public void add(BankEmployee emp) {
        employeeMap.put(emp.getId(), emp);
    }

    public List<BankEmployee> getAll() {
        return new ArrayList<>(employeeMap.values());
    }

    public BankEmployee getById(int id) {
        return employeeMap.get(id);
    }

    public void update(BankEmployee emp) {
        employeeMap.put(emp.getId(), emp);
    }

    public void delete(int id) {
        employeeMap.remove(id);
    }
}
