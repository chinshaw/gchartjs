package gwt.chartjs.client.chart;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartConfig {

    private @JsProperty String type;

    private @JsProperty ChartData data;

    private @JsProperty ChartOptions options;

    public @JsOverlay final String getType() {
        return type;
    }

    public @JsOverlay final void setType(ChartType type) {
        this.type = type.getType();
    }

    public @JsOverlay final ChartType getJsType() {
        return ChartType.asType(type);
    }

    public @JsOverlay final ChartData getData() {
        return data;
    }

    public @JsOverlay final void setData(ChartData data) {
        this.data = data;
    }

    public @JsOverlay final ChartOptions getOptions() {
        return options;
    }

    public @JsOverlay final void setOptions(ChartOptions options) {
        this.options = options;
    }

    public static class Builder {

        private ChartType type;
        private ChartData chartData;
        private ChartOptions options;

        public Builder(ChartType type) {
            this.type = type;
        }

        public Builder type(ChartType type) {
            this.type = type;
            return this;
        }

        public Builder withData(ChartData chartData) {
            this.chartData = chartData;
            return this;
        }

        public Builder withOptions(ChartOptions options) {
            this.options = options;
            return this;
        }

        public ChartConfig build() {
            final ChartConfig config = new ChartConfig();
            config.setType(type);
            config.setOptions(options);
            config.setData(chartData);
            return config;
        }
    }
}
