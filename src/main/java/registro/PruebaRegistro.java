package registro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.edge.EdgeDriver;
import static java.lang.System.*;

public class PruebaRegistro {
    public static void main(String[] args) {

        //Elegimos el driver
        setProperty("webdriver.edge.driver", "C:\\Users\\diego\\IdeaProjects\\SeleniumTestProject\\src\\Drivers\\msedgedriver.exe");

        //Inicializa el navegador
        WebDriver driver = new EdgeDriver();

        //Abrimos la página web
        driver.get("http://127.0.0.1:8001/control/register");

        driver.manage().window().maximize();

        //Llenamos el formulario
        driver.findElement(By.id("name")).sendKeys("Juan");
        driver.findElement(By.id("primer_apellido")).sendKeys("Pérez");
        driver.findElement(By.id("segundo_apellido")).sendKeys("López");

        //Tengo un select entonces
        Select selPlantel = new Select(driver.findElement(By.id("id_plantel")));
        selPlantel.selectByValue("411");

        //Checkbox Carrera
        /* WebElement checkCarrera = driver.findElement(By.id("carrera_110"));
        checkCarrera.click(); */
        driver.findElement(By.id("carrera_110")).click();
        driver.findElement(By.id("permiso_9")).click();

        //Credenciales
        driver.findElement(By.id("email")).sendKeys("correo@mail.com");
        driver.findElement(By.id("password")).sendKeys("hola123.");
        driver.findElement(By.id("password_confirmation")).sendKeys("hola123.");

        //Permisos
        /*
        System.out.println("Hola");
        try{
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[9]/input[1]")).click();
        }catch(Exception e){
            out.println(e);
        }
        WebElement checkP9 = driver.findElement(By.id("permiso_10"));
        checkP9.click();

         */

        driver.findElement(By.id("permiso_10")).click();
        driver.findElement(By.id("permiso_11")).click();
        driver.findElement(By.id("permiso_12")).click();
        driver.findElement(By.id("permiso_13")).click();
        driver.findElement(By.id("permiso_14")).click();
        driver.findElement(By.id("permiso_15")).click();
        driver.findElement(By.id("permiso_16")).click();
        driver.findElement(By.id("permiso_17")).click();
        driver.findElement(By.id("permiso_18")).click();
    }
}
