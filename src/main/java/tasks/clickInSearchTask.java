package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import userinterfaces.demoInterface;
import userinterfaces.paginaInterface;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class clickInSearchTask implements Task {
    private String texto;
    public clickInSearchTask(String url){
        this.texto = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(paginaInterface.clickEnBuscador, isVisible()),
                Enter.theValue(texto).into(paginaInterface.clickEnBuscador),
                DelayTask.ofMilliseconds(3000),
                Click.on(demoInterface.clickData)

        );

    } public static clickInSearchTask in(String url){
        return new clickInSearchTask(url);
    }

}
