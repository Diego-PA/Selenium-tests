package registro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static java.lang.System.*;

public class PruebaRegistro {
    public static void main(String[] args) {

        //Importante: Para poder interactuar con los elementos deben de estar visibles.

        /*
        //Para ms edge
        //Elegimos el driver
        setProperty("webdriver.edge.driver", "C:\\Users\\diego\\IdeaProjects\\SeleniumTestProject\\src\\Drivers\\msedgedriver.exe");

        //Inicializa el navegador
        WebDriver driver = new EdgeDriver();
        */

        //Para chrome
        //Elegimos el driver
        setProperty("webdriver.chrome.driver", "C:\\Users\\diego\\IdeaProjects\\SeleniumTestProject\\src\\Drivers\\chromedriver.exe");

        //Inicializa el navegador
        WebDriver driver = new ChromeDriver();

        //Le damos la propiedad de ejecutar scripts de JS
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();

        //Abrimos la página web
        driver.get("http://127.0.0.1:8001/control/register");

        //Llenamos el formulario
        driver.findElement(By.id("name")).sendKeys("Juan");
        driver.findElement(By.id("primer_apellido")).sendKeys("Pérez");
        driver.findElement(By.id("segundo_apellido")).sendKeys("López");

        //Tengo un select entonces
        Select selPlantel = new Select(driver.findElement(By.id("id_plantel")));
        selPlantel.selectByValue("411");

        //Checkbox Carrera
        driver.findElement(By.id("carrera_110")).click();

        //Credenciales
        driver.findElement(By.id("email")).sendKeys("correo@mail.com");
        driver.findElement(By.id("password")).sendKeys("hola123.");
        driver.findElement(By.id("password_confirmation")).sendKeys("hola123.");

        //Scroll al fondo
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        //Permisos
        driver.findElement(By.id("permiso_9")).click();
        driver.findElement(By.id("permiso_10")).click();
        driver.findElement(By.id("permiso_11")).click();
        driver.findElement(By.id("permiso_12")).click();
        driver.findElement(By.id("permiso_13")).click();
        driver.findElement(By.id("permiso_14")).click();
        driver.findElement(By.id("permiso_15")).click();
        driver.findElement(By.id("permiso_16")).click();
        driver.findElement(By.id("permiso_17")).click();
        driver.findElement(By.id("permiso_18")).click();

        //enviar
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[10]/button")).click();
    }
}
