package week_15.polymorphism.drivers;

public class RemoteWebDriver implements WebDriver,JavaScriptExecuter,TakeScreenshot{
    @Override
    public void findElement() {
        System.out.println("We will  find element in " + getClass().getSimpleName());
    }

    @Override
    public void findElements() {
        System.out.println("We will  find elements in " + getClass().getSimpleName());
    }

    @Override
    public void get(String url) {
        System.out.println("I will go to that " +url+ " in " +getClass().getSimpleName() );
    }

    @Override
    public void close() {
        System.out.println("I will close the " +getClass().getSimpleName() );
    }

    @Override
    public void executeScript() {
        System.out.println("executing javascript in " +getClass().getSimpleName());
    }

    @Override
    public void takeScreenshot() {
        System.out.println("taking screenshot in " + getClass().getSimpleName());
    }
}
