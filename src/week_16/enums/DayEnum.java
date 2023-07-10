package week_16.enums;

public enum DayEnum {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    int value;
    DayEnum(int i) {
        value=i;
    }
}
