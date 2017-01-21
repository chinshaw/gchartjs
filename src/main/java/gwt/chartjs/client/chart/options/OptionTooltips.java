package gwt.chartjs.client.chart.options;

import com.google.gwt.core.client.JavaScriptObject;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class OptionTooltips {

    @JsFunction
    @FunctionalInterface
    public interface LabelCallback {
        String f(TooltipItem tooltipItem, JavaScriptObject data);
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class TooltipItem {

        private @JsProperty String xLabel;

        private @JsProperty Double yLabel;

        private @JsProperty int index;

        public @JsOverlay final String getxLabel() {
            return xLabel;
        }

        public @JsOverlay final void setxLabel(String xLabel) {
            this.xLabel = xLabel;
        }

        public @JsOverlay final Double getyLabel() {
            return yLabel;
        }

        public @JsOverlay final void setyLabel(Double yLabel) {
            this.yLabel = yLabel;
        }

        public @JsOverlay final int getIndex() {
            return index;
        }

        public @JsOverlay final void setIndex(int index) {
            this.index = index;
        }

    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class Callbacks {

        private @JsProperty LabelCallback label;

        public @JsOverlay final void setLabelCallback(LabelCallback label) {
            this.label = label;
        }
    }

    private @JsProperty Callbacks callbacks;

    private @JsProperty boolean display;

    public @JsOverlay final boolean isDisplay() {
        return display;
    }

    public @JsOverlay final void setDisplay(boolean display) {
        this.display = display;
    }

    public @JsOverlay final void addLabelCallback(LabelCallback lblCallback) {
        if (callbacks == null) {
            callbacks = new Callbacks();
            callbacks.setLabelCallback(lblCallback);
        }
    }

}
