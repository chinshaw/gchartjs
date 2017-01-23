package gwt.chartjs.client.chart;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

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

    private @JsProperty Double[] data;

    private @JsProperty String label;

    private @JsProperty JavaScriptObject backgroundColor;

    private @JsProperty Object borderColor;

    private @JsProperty int borderWidth;

    private @JsProperty String xAxisID;

    private @JsProperty String yAxisID;

    private @JsProperty boolean fill;

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

//    public @JsOverlay final String getBackgroundColor() {
//        return null;
//        // return this.backgroundColor.isString().stringValue();
//    }
//
//    public @JsOverlay final void setBackgroundColor(final String color) {
//        // this.backgroundColor = new JSONString(color);
//    }

    public @JsOverlay final String[] getBackgroundColors() {
        final JsArrayString array = this.backgroundColor.cast();
        int len = array.length();
        String[] colors = new String[len];
        for (int i = 0; i < len; i++) {
            colors[i] = array.get(i).toString();
        }

        return colors;
    }

    public @JsOverlay final void setBackgroundColors(String[] backgroundColors) {
        final JsArrayString _backgroundColors = JavaScriptObject.createArray().cast();

        int len = backgroundColors.length;
        for (int i = 0; i < len; i++) {
            _backgroundColors.push(backgroundColors[i]);
        }

        this.backgroundColor = _backgroundColors;
    }
    

    public @JsOverlay final void getBorderColor() {
        if (! (borderColor instanceof String)){
            throw new RuntimeException("border color is not a string");
        }
    }
    
    public @JsOverlay final void setBorderColor(final String borderColor) {
        this.borderColor = borderColor;
    }
    

    public @JsOverlay final String[] getBorderColors() {
        if (! (this.borderColor instanceof JavaScriptObject))  {
            throw new RuntimeException("Border color is not a js array");
        }
        final JsArrayString array = ((JavaScriptObject)this.borderColor).cast();
        int len = array.length();
        String[] colors = new String[len];
        for (int i = 0; i < len; i++) {
            colors[i] = array.get(i).toString();
        }

        return colors;
    }

    public @JsOverlay final void setBorderColors(String[] borderColors) {
        final JsArrayString _borderColors = JavaScriptObject.createArray().cast();

        int len = borderColors.length;
        for (int i = 0; i < len; i++) {
            _borderColors.push(borderColors[i]);
        }

        this.borderColor = _borderColors;
    }

    public @JsOverlay final int getBorderWidth() {
        return borderWidth;
    }

    public @JsOverlay final ChartType getType() {
        if (type == null) {
            return null;
        }
        return ChartType.asType(type);
    }

    public @JsOverlay final void setType(ChartType type) {
        this.type = type.getType();
    }

    /**
     * The ID of the x axis to plot this dataset on
     * 
     * @return
     */
    public @JsOverlay final String getxAxisID() {
        return xAxisID;
    }

    /**
     * The ID of the x axis to plot this dataset on
     * 
     * @param xAxisID
     */
    public @JsOverlay final void setxAxisID(String xAxisID) {
        this.xAxisID = xAxisID;
    }

    /**
     * The ID of the y axis to plot this dataset on
     * 
     * @return
     */
    public @JsOverlay final String getyAxisID() {
        return yAxisID;
    }

    /**
     * The ID of the y axis to plot this dataset on
     * 
     * @param yAxisID
     */
    public @JsOverlay final void setyAxisID(String yAxisID) {
        this.yAxisID = yAxisID;
    }

    /**
     * If true, fill the area under the line
     * 
     * @return
     */
    public @JsOverlay final boolean isFill() {
        return fill;
    }

    /**
     * If true, fill the area under the line
     * 
     * @param fill
     */
    public @JsOverlay final void setFill(boolean fill) {
        this.fill = fill;
    }

}
