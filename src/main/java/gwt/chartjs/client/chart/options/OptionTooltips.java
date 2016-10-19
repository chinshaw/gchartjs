package gwt.chartjs.client.chart.options;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class OptionTooltips {

    private @JsProperty boolean display;

    public @JsOverlay final boolean isDisplay() {
        return display;
    }

    public @JsOverlay final void setDisplay(boolean display) {
        this.display = display;
    }
}
