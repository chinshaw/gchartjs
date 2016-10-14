package gwt.chartjs.client.chart;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartDataSet {

    /**
     * Type for a possible mixed type.
     */
    private @JsProperty String type;

    private @JsProperty String label;

    private @JsProperty Double[] data;

    private @JsProperty String[] backgroundColor;

    private @JsProperty String[] borderColor;

    private @JsProperty int borderWidth;

    public @JsOverlay final void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public @JsOverlay final String getLabel() {
        return label;
    }

    public @JsOverlay final void setLabel(String label) {
        this.label = label;
    }

    public @JsOverlay final Double[] getData() {
        return data;
    }

    public @JsOverlay final void setData(Double[] data) {
        this.data = data;
    }

    public @JsOverlay final String[] getBackgroundColor() {
        return backgroundColor;
    }

    public @JsOverlay final void setBackgroundColor(String[] backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public @JsOverlay final String[] getBorderColor() {
        return borderColor;
    }

    public @JsOverlay final void setBorderColor(String[] borderColor) {
        this.borderColor = borderColor;
    }

    public @JsOverlay final int getBorderWidth() {
        return borderWidth;
    }

    public @JsOverlay final String getType() {
        if (type == null) {
            return "bar";
        }
        return type;
    }

    public @JsOverlay final void setType(String type) {
        this.type = type;
    }

}
