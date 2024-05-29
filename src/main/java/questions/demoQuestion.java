package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.demoInterface.direccionExacta;

public class demoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return direccionExacta.resolveFor(actor).isVisible();
    }

    public static demoQuestion ubi() {
        return new demoQuestion();
    }
}
