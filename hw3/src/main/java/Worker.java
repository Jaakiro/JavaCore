import com.google.common.collect.ComparisonChain;

public abstract class Worker implements Comparable<Worker> {

    private final String name;
    private final String dateBirth;
    private int salary;

    public Worker(String name, String dateBirth, int salary) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Worker o) {

        return ComparisonChain.start()
                .compare(Integer.parseInt(this.getDateBirth().substring(0, 4)),
                        Integer.parseInt(o.getDateBirth().substring(0, 4)))
                .compare(Integer.parseInt(this.getDateBirth().substring(5, 7)),
                        Integer.parseInt(o.getDateBirth().substring(5, 7)))
                .compare(Integer.parseInt(this.getDateBirth().substring(8, 10)),
                        Integer.parseInt(o.getDateBirth().substring(8, 10)))
                .result();
    }
}

