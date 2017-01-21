package gwt.chartjs.client.chart;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RequiresResize;

import gwt.chartjs.client.GChartJs;

public class ChartJsWidget extends Composite implements RequiresResize {

    private static final Logger logger = Logger.getLogger(ChartJsWidget.class.getName());

    private NativeChart nativeChart;

    private ChartConfig chartConfig;

    private final Canvas canvas;

    public ChartJsWidget(ChartConfig chartConfig) {
        this.canvas = Canvas.createIfSupported();
        this.chartConfig = chartConfig;
        initWidget(canvas);
    }

    @Override
    public void onLoad() {
        GChartJs.bootstrap(() -> {
            // Wrap in deferred so that js has a chance to load.
            Scheduler.get().scheduleDeferred(() -> {
                try {
                    final Element element = getElement();
                    if (element == null) {
                        logger.log(Level.WARNING, "attempt to initialize chart when composite is not initialized");
                    }
                    nativeChart = new NativeChart(element, chartConfig);
                } catch (JavaScriptException e) {
                    // Have to implicitly catch JavaScriptException
                    logger.log(Level.WARNING, "Unable to create native chart", e);
                } catch (Exception e) {
                    logger.log(Level.WARNING, "Unable to create native chart", e);
                }
            });
        });
    }

    /**
     * Returns the underlying js wrapped native chart.
     * 
     * @return
     */
    public NativeChart getNativeChart() {
        return nativeChart;
    }

    public void redraw() {
        if (nativeChart == null) {
            logger.log(Level.WARNING, "Attempt to redraw null gchart, maybe redraw?");
            return;
        }
        nativeChart.update();
    }

    public ChartConfig getChartConfig() {
        return chartConfig;
    }

    @Override
    public void onResize() {
        try {
            if (nativeChart != null) {
                Scheduler.get().scheduleDeferred(() -> {
                    final Element parent = getElement().getParentElement();
                    canvas.setPixelSize(parent.getClientWidth(), parent.getClientHeight());
                    nativeChart.update();
                });
            }
        } catch (JavaScriptException e) {
            GWT.log("Chart resize failed => " + e.getMessage());
        }
    }
}