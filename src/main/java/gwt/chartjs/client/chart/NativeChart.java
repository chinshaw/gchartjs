package gwt.chartjs.client.chart;

import com.google.gwt.dom.client.Element;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Chart", namespace = JsPackage.GLOBAL)
public class NativeChart {

    public NativeChart(Element element, ChartConfig chartConfig) {
    }

    /**
     * Use this to destroy any chart instances that are created. This will clean
     * up any references stored to the chart object within Chart.js, along with
     * any associated event listeners attached by Chart.js. This must be called
     * before the canvas is reused for a new chart.
     */
    @JsMethod
    public native void destroy();

    /**
     * Triggers an update of the chart. This can be safely called after
     * replacing the entire data object. This will update all scales, legends,
     * and then re-render the chart.
     */
    @JsMethod
    public native void update();

    /**
     * Triggers a redraw of all chart elements. Note, this does not update
     * elements for new data. Use .update() in that case.
     */
    @JsMethod
    public native void render();

    /**
     * Use this to stop any current animation loop. This will pause the chart
     * during any current animation frame. Call .render() to re-animate.
     */
    @JsMethod
    public native void stop();

    /**
     * Use this to manually resize the canvas element. This is run each time the
     * canvas container is resized, but you can call this method manually if you
     * change the size of the canvas nodes container element.
     */
    @JsMethod
    public native void resize();

    /**
     * Will clear the chart canvas. Used extensively internally between
     * animation frames, but you might find it useful.
     */
    @JsMethod
    public native void clear();

    /**
     * This returns a base 64 encoded string of the chart in it's current state.
     */
    @JsMethod
    public native String toBase64Image();

    /**
     * Returns an HTML string of a legend for that chart. The legend is
     * generated from the legendCallback in the options.
     */
    @JsMethod
    public native String generateLegend();

}
