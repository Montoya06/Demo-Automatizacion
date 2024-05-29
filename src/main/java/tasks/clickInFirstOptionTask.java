package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.demoInterface;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class clickInFirstOptionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(demoInterface.clickPrimeraOpcion, isVisible()),
                Click.on(demoInterface.clickPrimeraOpcion),
                DelayTask.ofMilliseconds(2000)
        );
    }
    public static clickInFirstOptionTask in(){
        return new clickInFirstOptionTask ();
    }
}
