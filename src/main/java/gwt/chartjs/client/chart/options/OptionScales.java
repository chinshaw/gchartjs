package gwt.chartjs.client.chart.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class OptionScales {

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class GridLines {

        private @JsProperty boolean display;

        @JsConstructor
        public GridLines() {
        }

        public @JsOverlay final boolean isDisplay() {
            return display;
        }

        public @JsOverlay final void setDisplay(boolean display) {
            this.display = display;
        }

    }

    private @JsProperty Axis[] xAxes;

    private @JsProperty Axis[] yAxes;

    public @JsOverlay final Axis[] getxAxes() {
        return xAxes;
    }

    public @JsOverlay final void setxAxes(Axis[] xAxes) {
        this.xAxes = xAxes;
    }

    public @JsOverlay final Axis[] getyAxes() {
        return yAxes;
    }

    public @JsOverlay final void setyAxes(Axis[] yAxes) {
        this.yAxes = yAxes;
    }

}
