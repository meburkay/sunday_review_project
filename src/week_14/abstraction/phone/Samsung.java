package week_14.abstraction.phone;

public  class Samsung extends Phone implements HasAndroid,HasBixby{


    public Samsung(String model, String color) {
        super(model, color);
    }

    @Override
    void text() {

    }

    @Override
    void call(String name) {

    }

    @Override
    public void hasAndroid() {

    }

    @Override
    public void hasBixby() {

    }
}
