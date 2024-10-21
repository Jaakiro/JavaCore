import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Worker> list = List.of(
                new Worker("Лина", "1999-01-01", 1000, Customer.Gender.FEMALE),
                new Worker("Каземир", "2000-01-01", 1000, Customer.Gender.MALE),
                new Worker("Анастасия", "2001-02-02", 1000, Customer.Gender.FEMALE),
                new Worker("Алиса", "2002-03-03", 1000, Customer.Gender.FEMALE),
                new Worker("Акс", "1999-04-05", 1000, Customer.Gender.MALE)
        );

        congratulate(list.toArray(new Worker[0]));
    }

    public static void congratulate(Worker[] workers) {
        Holidays currentHoliday = Holidays.currentDay();
        switch (currentHoliday) {
            case NEW_YEAR:
                System.out.println("Поздравляю всех сотрудников с праздником " + currentHoliday.getTitle() + "!");
                break;
            case FEBRUARY_23:
                for (Worker worker : workers) {
                    if (worker.getGender() == Customer.Gender.MALE) {
                        System.out.println(worker.getName() + ", поздравляю Вас с " + currentHoliday.getTitle() + "!");
                    }
                }
                break;
            case MARCH_8:
                for (Worker worker : workers) {
                    if (worker.getGender() == Customer.Gender.FEMALE) {
                        System.out.println(worker.getName() + ", поздравляю Вас с " + currentHoliday.getTitle() + "!");
                    }
                }
                break;
            case NO_HOLIDAY:
                System.out.println(currentHoliday.getTitle());
                break;
        }
    }
}
