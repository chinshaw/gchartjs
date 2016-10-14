package gwt.chartjs.client.chart;

import java.util.HashMap;
import java.util.Map;

public enum ChartType {

    BAR("bar"), LINE("line"), RADAR("radar"), POLAR_AREA("polar_area"), PIE("pie"), DOUGHNUT("doughnut"), BUBBLE(
            "bubble");

    private String type;

    private static Map<String, ChartType> TYPE_MAP = new HashMap<String, ChartType>();

    static {
        for (ChartType t : values()) {
            TYPE_MAP.put(t.getType(), t);
        }
    }

    ChartType(final String type) {
        this.type = type;
    }

    public final String getType() {
        return type;
    }

    public final void setType(String type) {
        this.type = type;
    }

    public static ChartType asType(final String type) {
        return TYPE_MAP.get(type);
    }

}
