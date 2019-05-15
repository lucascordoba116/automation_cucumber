package PageObject.Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePageObject {

    @FindBy(name = "q")
   private WebElement buscador;

    private static WebDriver driver;

    public GooglePageObject(WebDriver driverStep){
        this.driver = driverStep;
        PageFactory.initElements(driver,this);
    }

    public void GoToUrl()
    {
        driver.get("https://www.google.com/");
    }

    public void IngresarBusqueda(String arg1){
        this.buscador.clear();
        this.buscador.sendKeys(arg1);
    }

    public void buscar(){
        this.buscador.submit();
    }




}
