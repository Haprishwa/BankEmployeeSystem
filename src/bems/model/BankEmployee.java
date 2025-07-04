package bems.model;

//Another comment 

public abstract class BankEmployee implements Comparable<BankEmployee> {
    protected int id;
    protected String name;
    protected double salary;

    public BankEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public int compareTo(BankEmployee other) {
        return Double.compare(this.salary, other.salary);
    }

    public abstract String getRole();

    @Override
    public String toString() {
        return id + " - " + name + " - " + getRole() + " - $" + salary;
    }
}