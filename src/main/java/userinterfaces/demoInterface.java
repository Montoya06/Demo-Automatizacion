package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class demoInterface {

    public static Target clickData = Target.the("Click en la primer sugerencia").
            locatedBy("//span[contains(text(), 'Datacenter Colombia Sas')]");

    public static Target clickPrimeraOpcion = Target.the("Click en la primer opcion del resultado").
            locatedBy("//h3[contains(text(), 'Datacenter Colombia')]");

    public static Target Bajar = Target.the("Scroll hacia abajo").
            locatedBy("//strong[contains(text(), 'Contacto')]");

    public static Target direccionExacta = Target.the("Direccion exacta de Data").
            locatedBy("//p[contains(text(), 'Datacenter Colombia S.A.S')]");
}
