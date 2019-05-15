package stepDefinition;

import PageObject.Google.GooglePageObject;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

    WebDriver driver;

    GooglePageObject google;
    String txt_consulta= "mobile";

    @Before
    public void Setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lcordoba\\workspace\\prueba\\src\\test\\utils\\chromedriver.exe");
        driver = new ChromeDriver();
        google = new GooglePageObject(driver);
    }

    @Given("usuario se encuentra en la pagina de google")
    public void usuarioSeEncuentraEnLaPaginaDeGoogle() {
        google.GoToUrl();
    }

    @When("ingresa para buscar cheese")
    public void ingresaParaBuscarCheese() {
        google.IngresarBusqueda(txt_consulta);

    }

    @And("presiona enter")
    public void presionaEnter() {
        google.buscar();
    }

    @Then("se visualiza los resultados de la busqueda")
    public void seVisualizaLosResultadosDeLaBusqueda() {

        Assert.assertEquals(txt_consulta + " - Buscar con Google",driver.getTitle());
        System.out.println("PASA OK, RESULTADO: "+driver.getTitle());
        driver.quit();
    }
}
