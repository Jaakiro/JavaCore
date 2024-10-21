import java.time.LocalDate;

public enum Holidays {
    NO_HOLIDAY("Нет праздника"),
    NEW_YEAR("Новый Год"),
    MARCH_8("8 Марта"),
    FEBRUARY_23("23 Февраля");

    private final String title;

    Holidays(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }

    public static Holidays currentDay() {
        LocalDate currentDate = LocalDate.now();
        if (currentDate.getMonthValue() == 1 && currentDate.getDayOfMonth() == 1) {
            return NEW_YEAR;
        } else if (currentDate.getMonthValue() == 2 && currentDate.getDayOfMonth() == 23) {
            return FEBRUARY_23;
        } else if (currentDate.getMonthValue() == 3 && currentDate.getDayOfMonth() == 8) {
            return MARCH_8;
        }
        return NO_HOLIDAY;
    }
}
