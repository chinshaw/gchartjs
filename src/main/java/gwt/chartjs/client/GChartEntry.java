package gwt.chartjs.client;

import java.util.logging.Logger;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.user.client.ui.RootPanel;

import gwt.chartjs.client.chart.ChartConfig;
import gwt.chartjs.client.chart.ChartData;
import gwt.chartjs.client.chart.ChartDataSet;
import gwt.chartjs.client.chart.ChartJsWidget;
import gwt.chartjs.client.chart.ChartOptions;
import gwt.chartjs.client.chart.ChartType;
import gwt.chartjs.client.chart.options.Axis;
import gwt.chartjs.client.chart.options.Axis.TickCallback;
import gwt.chartjs.client.chart.options.OptionScales;
import gwt.chartjs.client.chart.options.OptionTick;
import gwt.chartjs.client.chart.options.OptionTooltips;
import gwt.chartjs.client.chart.options.OptionTooltips.LabelCallback;
import gwt.chartjs.client.chart.options.OptionTooltips.TooltipItem;
import gwt.chartjs.client.chart.options.Position;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GChartEntry implements EntryPoint {

    private static final Logger logger = Logger.getLogger(GChartEntry.class.getName());

    @Override
    public void onModuleLoad() {

        GChartJs.bootstrap(new Runnable() {

            @Override
            public void run() {
                final ChartDataSet dataSet1 = new ChartDataSet();
                dataSet1.setData(new Double[] { 12d, 19.3d, 3d, 5d, 2d, 3d });
                dataSet1.setLabel("# of votes");
                dataSet1.setBackgroundColors(new String[] { "#2196f3", "#42a5f5", "#64b5f6", "#90caf9", "#bbdefb" });
                // dataSet1.setBorderColor(new String[] { "rgba(0,0,0,0.1)" });
                dataSet1.setBorderWidth(1);

                // final ChartDataSet dataSet2 = new ChartDataSet();
                // dataSet2.setType(ChartType.LINE);
                // dataSet2.setLabel("Some Line");
                // dataSet2.setData(new Double[] { .12d, .19d, .3d, .5d, .2d,
                // .3d });
                // dataSet2.setBackgroundColors(new String[] { "transparent" });
                //
                // final ChartDataSet dataSet3 = new ChartDataSet();
                // dataSet3.setData(new Double[] { 12d, 19d, 3d, 5d, 2d, 3d });
                // dataSet3.setLabel("# of stickers");
                // dataSet3.setBackgroundColors(new String[] { "#2196f3",
                // "#42a5f5", "#64b5f6", "#90caf9", "#bbdefb" });

                // dataSet3.setBorderColor(new String[] { "rgba(255,99,132,1)"
                // });
                // dataSet3.setBorderWidth(1);

                final ChartData data = new ChartData();
                data.setLabels((new String[] { "Red", "Blue", "Yellow", "Green", "Purple", "Orange" }));
                data.setDatasets(new ChartDataSet[] { dataSet1 });

                final ChartConfig chartConfig = new ChartConfig();
                chartConfig.setType(ChartType.BAR);
                chartConfig.setData(data);

                final ChartOptions options = new ChartOptions();
                final OptionScales optionScales = new OptionScales();

                final OptionTooltips toolTipOptions = new OptionTooltips();
                toolTipOptions.setDisplay(true);
                toolTipOptions.addLabelCallback(new LabelCallback() {

                    @Override
                    public String f(TooltipItem tooltipItem, JavaScriptObject data) {
                        return NumberFormat.getFormat("###,###.00").format(tooltipItem.getyLabel());
                    }
                });

                options.setTooltips(toolTipOptions);

                final Axis yAxis1 = new Axis();

                final OptionTick ticks = new OptionTick();
                ticks.setTickCallback(new TickCallback() {

                    @Override
                    public String f(Double axis, int index, Double[] data) {
                        return NumberFormat.getFormat("###,###.00").format(axis);
                    }
                });

                yAxis1.setTicks(ticks);

                yAxis1.setId("y-axis-0");
                yAxis1.setPosition(Position.LEFT);
                final Axis yAxis2 = new Axis();
                yAxis2.setId("y-axis-1");
                yAxis2.setPosition(Position.RIGHT);

                optionScales.setyAxes(new Axis[] { yAxis1, yAxis2 });

                options.setScales(optionScales);

                chartConfig.setOptions(options);

                final ChartJsWidget widget = new ChartJsWidget(chartConfig);
                RootPanel.get().add(widget);

                // Scheduler.get().scheduleDeferred(() -> {
                // final NativeChart chart = new
                // NativeChart(widget.getElement(), chartConfig);
                // });
                // logger.info("Chart is " + chart);
            }
        });

    }

}
