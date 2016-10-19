package gwt.chartjs.client.chart.options;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class OptionLegend {

    private @JsProperty boolean display;

    public @JsOverlay final boolean isDisplay() {
        return display;
    }

    public @JsOverlay final void setDisplay(boolean display) {
        this.display = display;
    }

    public static class Builder {

        private boolean display;

        public Builder setDisplay(boolean display) {
            this.display = display;
            return this;
        }

        public OptionLegend build() {
            final OptionLegend legend = new OptionLegend();
            legend.setDisplay(display);
            return legend;
        }
    }
}
