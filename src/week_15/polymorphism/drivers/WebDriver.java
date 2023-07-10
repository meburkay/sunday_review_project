package week_15.polymorphism.drivers;

public interface WebDriver extends SearchContext{
    void get(String url);
    void close();

}
