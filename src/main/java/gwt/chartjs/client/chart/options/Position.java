package gwt.chartjs.client.chart.options;

public enum Position {
    TOP("top"),
    LEFT("left"),
    BOTTOM("bottom"),
    RIGHT("right");

    private String position;

    Position(final String position) {
        this.position = position;
    }

    String asProperty() {
        return position;
    }
    
    public static Position fromProperty(final String prop) {
        return Position.valueOf(prop.toUpperCase());
    }
}
