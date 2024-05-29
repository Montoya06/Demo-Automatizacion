package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.demoQuestion;
import tasks.BajarHastaLoUltimoTask;
import tasks.clickInFirstOptionTask;
import tasks.clickInSearchTask;
import tasks.openPageTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class demoDefinition {
    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Esteban = Actor.named("Esteban");
    @Before
    public void setUp(){
        Esteban.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^El usuario ingresa a la pagina de google y da click en el buscador$")
    public void elUsuarioIngresaALaPaginaDeGoogleYDaClickEnElBuscador() {
        Esteban.wasAbleTo(
                openPageTask.on()
        );
    }

    @When("^ingresa el nombre datacenter colombia y da click en buscar \"([^\"]*)\"$")
    public void ingresaElNombreDatacenterColombiaYDaClickEnBuscar(String texto) {
        Esteban.wasAbleTo(
                clickInSearchTask.in(texto)
        );
    }

    @When("^el usuario ve el resultado y selecciona la primera opcion$")
    public void elUsuarioVeElResultadoYSeleccionaLaPrimeraOpcion() {
        Esteban.wasAbleTo(
                clickInFirstOptionTask.in()
        );
    }

    @When("^el usuario ingresa a la pagina y hace scroll hasta el final$")
    public void elUsuarioIngresaALaPaginaYHaceScrollHastaElFinal() {
        Esteban.wasAbleTo(
                BajarHastaLoUltimoTask.in()
        );
    }

    @Then("^El usuario ve la direccion exacta de la empresa$")
    public void elUsuarioVeLaDireccionExactaDeLaEmpresa() {
        Esteban.should(
                seeThat("La ubicacion esta visible",
                        demoQuestion.ubi(),
                        is(true))
        );
    }

}
