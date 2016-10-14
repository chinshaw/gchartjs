package gwt.chartjs.client.chart;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * To display data, the chart must be passed a data object that contains all of
 * the information needed by the chart. The data object can contain the
 * following parameters
 * 
 * @author chinshaw
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartData {

    private @JsProperty String[] labels;

    private @JsProperty ChartDataSet[] datasets;

    private @JsProperty String[] xLabels;

    private @JsProperty String[] yLabels;

    /**
     * Contains data for each dataset. See the documentation for each chart type
     * to determine the valid options that can be attached to the dataset
     * 
     * @return
     */
    public @JsOverlay final ChartDataSet[] getDatasets() {
        return datasets;
    }

    /**
     * Contains data for each dataset. See the documentation for each chart type
     * to determine the valid options that can be attached to the dataset
     * 
     * @param datasets
     */
    public @JsOverlay final void setDatasets(ChartDataSet[] datasets) {
        this.datasets = datasets;
    }

    /**
     * Optional parameter that is used with the category axis.
     * 
     * @return
     */
    public @JsOverlay final String[] getLabels() {
        return labels;
    }

    /**
     * Optional parameter that is used with the category axis.
     * 
     * @param labels
     */
    public @JsOverlay final void setLabels(String[] labels) {
        this.labels = labels;
    }

    /**
     * Optional parameter that is used with the category axis and is used if the
     * axis is horizontal
     * 
     * @return
     */
    public @JsOverlay final String[] getxLabels() {
        return xLabels;
    }

    /**
     * Optional parameter that is used with the category axis and is used if the
     * axis is horizontal
     * 
     * @param xLabels
     */
    public @JsOverlay final void setxLabels(String[] xLabels) {
        this.xLabels = xLabels;
    }

    /**
     * Optional parameter that is used with the category axis and is used if the
     * axis is vertical
     * 
     * @return
     */
    public @JsOverlay final String[] getyLabels() {
        return yLabels;
    }

    /**
     * Optional parameter that is used with the category axis and is used if the
     * axis is vertical
     * 
     * @param yLabels
     */
    public @JsOverlay final void setyLabels(String[] yLabels) {
        this.yLabels = yLabels;
    }

}
