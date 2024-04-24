
public class RemoteController {
    private Condition condition = Condition.OFF;
    // FIXME 暫定的に常に24度
    private double indoorTemperature = 24.0;
    private HygrothermalControl hygrothermalControl = new HeatingHygrothermalControl();

    public void start(HygrothermalControl hygrothermalControl, double expectTemperature) {
        this.condition = Condition.ON;
        this.hygrothermalControl = hygrothermalControl;
        indoorTemperature = hygrothermalControl.temperatureControl(indoorTemperature, expectTemperature);
    }

    public void stop() {
        this.condition = Condition.OFF;
    }

    public Condition condition() {
        return condition;
    }

    public double indoorTemperature() {
        return indoorTemperature;
    }
}
