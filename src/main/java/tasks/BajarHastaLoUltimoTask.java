package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.demoInterface;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BajarHastaLoUltimoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(demoInterface.Bajar, isVisible()),
                Scroll.to(demoInterface.Bajar),
                DelayTask.ofMilliseconds(2000)
        );
    }
    public static BajarHastaLoUltimoTask in(){
        return new BajarHastaLoUltimoTask ();
    }
}
