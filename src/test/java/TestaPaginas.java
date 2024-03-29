import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestaPaginas {
    private WebDriver driver;
    private static final String baseUrl = "https://automacao.testerglobal.com/";
    Home homePage;

    @Test
    @DisplayName("Quando pesquisa pesquisar produto por nome, então deve ser mostrada página do produto")
    public void pesquisaProdutoPorNome(){
        // Entrar no site de teste
        driver.get(baseUrl);

        // Instanciar o Page object
        homePage = new Home(driver);

        // Realizar a busca por um produto
        String nomeProduto = "Camera";
        homePage.inserirProdutoCampoPesquisa(nomeProduto);

        // Clicar no botão de busca
        homePage.clicarBotaoPesquisar();

        // Título esperado (simplificado e sem caracteres especiais)
        // Título esperado
        // Título esperado (simplificado e sem caracteres especiais)
        String tituloPaginaEsperada = "Camera – Praticar Automação CTG – ESTUDOS";
        String tituloPaginaEncontrada = driver.getTitle();

        assertEquals(tituloPaginaEncontrada, tituloPaginaEsperada);
    }
    @BeforeAll
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
    }
    @AfterAll
    public void tearDown(){
        driver.quit();
    }
}
