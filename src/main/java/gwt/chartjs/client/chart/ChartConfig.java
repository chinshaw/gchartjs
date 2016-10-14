package gwt.chartjs.client.chart;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartConfig {

    private @JsProperty String type;

    private @JsProperty ChartData data;

    private @JsProperty ChartOptions options;

    public @JsOverlay final String getType() {
        return type;
    }

    public @JsOverlay final void setType(String type) {
        this.type = type;
    }

    public @JsOverlay final ChartData getData() {
        return data;
    }

    public @JsOverlay final void setData(ChartData data) {
        this.data = data;
    }

    public @JsOverlay final ChartOptions getOptions() {
        return options;
    }

    public @JsOverlay final void setOptions(ChartOptions options) {
        this.options = options;
    }

}
