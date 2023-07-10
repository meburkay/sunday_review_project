package week_15.polymorphism.drivers;

public class TestDrivers {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("cydeo.com"); //I will go to that cydeo.com in .....
        //reference type casting
        //   ((JavaScriptExecuter) driver).executeScript();

        driver = new FirefoxDriver();
        driver.get("cydeo.com");

        ((TakeScreenshot)driver).takeScreenshot();



    }
}
