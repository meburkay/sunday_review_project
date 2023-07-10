package week_14.abstraction.phone;

public class Iphone extends Phone implements HasIOS{

    public Iphone(String model, String color) {
        super(model, color);
    }

    @Override
    public void hasIOS() {

    }

    @Override
    void text() {

    }

    @Override
    void call(String name) {

    }
}
