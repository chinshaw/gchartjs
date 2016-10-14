package gwt.chartjs.client.chart;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class OptionScales {

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class Axis {

        private @JsProperty String id;

        private @JsProperty String type;

        private @JsProperty String position;

        public @JsOverlay final String getType() {
            return type;
        }

        public @JsOverlay final void setType(String type) {
            this.type = type;
        }

        public @JsOverlay final String getPosition() {
            return position;
        }

        public @JsOverlay final void setPosition(String position) {
            this.position = position;
        }

        public @JsOverlay final String getId() {
            return id;
        }

        public @JsOverlay final void setId(String id) {
            this.id = id;
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
