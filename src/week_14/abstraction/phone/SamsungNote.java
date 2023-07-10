package week_14.abstraction.phone;

public class SamsungNote extends Samsung implements HasPen{

    public SamsungNote(String model, String color) {
        super(model, color);
    }

    @Override
    public void hasPen() {

    }
}
