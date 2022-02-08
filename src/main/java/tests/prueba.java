package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class prueba {

    public static void main(String[] args) {

        //Elegimos el driver
        System.setProperty("webdriver.edge.driver", "C:\\Users\\diego\\IdeaProjects\\SeleniumTestProject\\src\\Drivers\\msedgedriver.exe");

        //Inicializa el navegador
        WebDriver driver = new EdgeDriver();

        //Abrimos la página web
        driver.get("https://www.fca.unam.mx");

        //Controlamos el navegador
        driver.manage().window().maximize();

        //cerramos por ejemplo
        driver.close();

    }

}
