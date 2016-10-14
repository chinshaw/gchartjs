package gwt.chartjs.client.chart;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.user.client.ui.Composite;

public class ChartJsWidget extends Composite {

    private NativeChart nativeChart;

    private ChartConfig chartConfig;

    private final Canvas canvas;

    public ChartJsWidget(ChartConfig chartConfig) {
        canvas = Canvas.createIfSupported();
        this.chartConfig = chartConfig;
        initWidget(canvas);
    }

    @Override
    public void onLoad() {
        Scheduler.get().scheduleDeferred(new ScheduledCommand() {

            @Override
            public void execute() {
                nativeChart = new NativeChart(getElement(), chartConfig);
            }
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
}
