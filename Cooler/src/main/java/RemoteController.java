
public class RemoteController {
    private Condition condition = Condition.OFF;
    // FIXME 暫定的に室内の空気を固定
    private Air indoorAir = new Air(24.0, 50.0, Direction.NORTH);
    private HygrothermalControl hygrothermalControl = new HeatingHygrothermalControl();

    public void start(HygrothermalControl hygrothermalControl, double expectTemperature, double expectHumidity, Direction expectDirection) {
        this.condition = Condition.ON;
        this.hygrothermalControl = hygrothermalControl;
        Air expectAir = new Air(expectTemperature, expectHumidity, expectDirection);
        this.indoorAir = hygrothermalControl.control(indoorAir, expectAir);
    }

    public void stop() {
        this.condition = Condition.OFF;
    }

    public Condition condition() {
        return condition;
    }

    public double indoorTemperature() {
        return indoorAir.temperature();
    }
    public double indoorHumidity() {
        return indoorAir.humidity();
    }
}
