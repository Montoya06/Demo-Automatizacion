package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DelayTask implements Task {
     private final long milliseconds;

    public DelayTask(long milliseconds) {
        this.milliseconds = milliseconds;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static DelayTask ofMilliseconds(long milliseconds) {
        return instrumented(DelayTask.class, milliseconds);
    }
}
