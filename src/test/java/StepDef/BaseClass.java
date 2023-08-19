package StepDef;

import Object_Repo.HomePageObject;
import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;

    public  static HomePageObject Homepageobj;


    public static void driverinit() throws IOException {

        String dir =System.getProperty("user.dir");
        System.out.println(dir);

        Properties prop = new Properties();
        InputStream input = new FileInputStream(dir + "/src/test/java/Resources/Config.properties");
        prop.load(input);
        String browser = prop.getProperty("Browser");

        switch (browser) {

            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;

            case "Edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                break;

        }

        driver.get(prop.getProperty("URL"));
        driver.manage().window().maximize();
        Homepageobj = new HomePageObject(driver);


    }

    @After
    public void closebrowser(){
       // driver.close();
    }

}
