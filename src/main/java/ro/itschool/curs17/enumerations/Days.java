package ro.itschool.curs17.enumerations;

public enum Days {
    MONDAY(1, "Luni"),
    TUESDAY(2, "Marti"),
    WEDNESDAY(3, "Miercuri"),
    THURSDAY(4, "Joi"),
    FRIDAY(5, "Vineri") {
        @Override
        public boolean bestDay() {
            return true;
        }
    },
    SATURDAY(6, "Sambata"),
    SUNDAY(7, "Duminica");

    private final int number;
    private final String name;

    Days(int dayNumber, String name) {
        this.number = dayNumber;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public boolean bestDay() {
        return false;
    }
}
