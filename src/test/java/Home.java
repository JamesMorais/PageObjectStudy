import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    private WebDriver driver;

    // Campo Pesquisa
    By campoPesquisa = By.xpath("//input[contains(@placeholder, 'Pesquisar produtos...')]");

    // Botão Pesquisa
    By botaoPesquisa = By.xpath("//i[@class='la la-search' and @aria-hidden='true']");

    // Inserir nome de produto que será pesquisado

    public void inserirProdutoCampoPesquisa(String nomeDoProdutoParaBuscar){
        driver.findElement(campoPesquisa).sendKeys(nomeDoProdutoParaBuscar);
    }

    // Clicar no botão de pesquisa
    public void clicarBotaoPesquisar(){
        driver.findElement(botaoPesquisa).click();
    }

    public Home(WebDriver driver) {
        this.driver = driver;
    }
}
