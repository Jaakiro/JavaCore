public class Seller extends Worker {

    public Seller(String name, String dateBirth, int salary) {
        super(name, dateBirth, salary);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + super.getName() + '\'' +
                ", dateBirth='" + super.getDateBirth() + '\'' +
                ", dateSalary='" + super.getSalary() + '\'' +
                '}';
    }
}
