package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/")
public class paginaInterface extends PageObject{

    public static Target clickEnBuscador  =Target.the("El usuario da click en el buscador")
            .locatedBy("//textarea[@id=\"APjFqb\"]");

}
