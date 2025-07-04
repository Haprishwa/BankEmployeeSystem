package bems.model;

public class BankTeller extends BankEmployee {
    public BankTeller(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public String getRole() {
        return "Teller";
    }
}