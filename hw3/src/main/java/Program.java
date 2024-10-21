import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Worker> list = new ArrayList<>();
        list.add(new Cashier("Axe", "2000-10-10", 1000));
        list.add(new Manager("Ewe", "2001-11-11", 1000));
        list.add(new Seller("Qwe", "2002-12-12", 1000));
        list.add(new Manager("ASD", "1999-02-02", 1000));
        list.add(new Seller("ZXC", "1998-03-03", 1000));

        for (Worker worker : list) {
            Manager.upSalary(worker);
        }

        list.sort(Worker::compareTo);

        for (Worker worker : list) {
            System.out.println(worker);
        }

    }
}
