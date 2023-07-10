package week_16.enums;

public enum Month {

    Jan(1,"January"),
    Feb(2,"February"),
    Mar(3,"March");

    int index;
    String name;
    Month(int i,String name) {
        index=i;
        this.name=name;
    }
}
