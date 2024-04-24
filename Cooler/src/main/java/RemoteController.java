
public class RemoteController {
    private Condition condition = Condition.OFF;
    public void start() {
        this.condition = Condition.ON;
    }

    public void stop() {
        this.condition = Condition.OFF;
    }

    public Condition condition() {
        return condition;
    }
}
