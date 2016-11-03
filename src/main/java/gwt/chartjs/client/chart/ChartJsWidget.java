package gwt.chartjs.client.chart;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RequiresResize;

import gwt.chartjs.client.GChartJs;

public class ChartJsWidget extends Composite implements RequiresResize {

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
                nativeChart = new NativeChart(getElement(), chartConfig);
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
        nativeChart.update();
    }

    public ChartConfig getChartConfig() {
        return chartConfig;
    }

    @Override
    public void onResize() {
        final Element parent = getElement().getParentElement();
        canvas.setPixelSize(parent.getClientWidth(), parent.getClientHeight());
        nativeChart.update();
    }
}