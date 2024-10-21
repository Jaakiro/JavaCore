public class Manager extends Worker {

    public Manager(String name, String dateBirth, int salary) {
        super(name, dateBirth, salary);
    }

    static void upSalary(Worker worker) {
        if (!(worker instanceof Manager)) {
            worker.setSalary(worker.getSalary() * 20 / 100 + worker.getSalary());
        }
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + super.getName() + '\'' +
                ", dateBirth='" + super.getDateBirth() + '\'' +
                ", dateSalary='" + super.getSalary() + '\'' +
                '}';
    }
}
