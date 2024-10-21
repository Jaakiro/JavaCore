public class Cashier extends Worker {

    public Cashier(String name, String dateBirth, int salary) {
        super(name, dateBirth, salary);
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "name='" + super.getName() + '\'' +
                ", dateBirth='" + super.getDateBirth() + '\'' +
                ", dateSalary='" + super.getSalary() + '\'' +
                '}';
    }
}
