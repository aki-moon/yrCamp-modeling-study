public class Air {
    private final double temperature;
    private final double humidity;
    private final Direction direction;

    public Air(double temperature, double humidity, Direction direction) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.direction = direction;
    }

    public double temperature() {
        return temperature;
    }

    public double humidity() {
        return humidity;
    }

    public Direction direction() {
        return direction;
    }
}
