package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import userinterfaces.paginaInterface;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class openPageTask implements Task {
    @Override
    @Step("Abrir pagina de google")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.browserOn(new paginaInterface())
        );
    }
    public static openPageTask on(){
        return instrumented(openPageTask.class);
    }
}
