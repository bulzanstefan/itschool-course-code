package ro.itschool.curs17.enumerations;

public class DayName {
    public String sayMyNameAgain(Days day) {
        return day.getName();
    }

    public String sayMyName(Days day) {
        switch (day) {
            case MONDAY:
                return "Luni";
            case TUESDAY:
                return "Marti";
            case WEDNESDAY:
                return "Miercuri";
            case THURSDAY:
                return "Joi";
            case FRIDAY:
                return "Vineri";
            case SATURDAY:
                return "Sambata";
            case SUNDAY:
                return "Duminica";
            default:
                throw new IllegalArgumentException();
        }
    }

    public int sayMyNumber(Days day) {
        return day.getNumber();
    }
}
