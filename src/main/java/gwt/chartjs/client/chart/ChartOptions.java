package gwt.chartjs.client.chart;

import gwt.chartjs.client.chart.options.OptionLegend;
import gwt.chartjs.client.chart.options.OptionScales;
import gwt.chartjs.client.chart.options.OptionTooltips;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartOptions {

    private @JsProperty boolean responsive;

    private @JsProperty int responsiveAnimationDuration;

    private @JsProperty boolean maintainAspectRatio;

    private @JsProperty String[] events;

    private @JsProperty OptionScales scales;

    private @JsProperty OptionLegend legend;

    private @JsProperty OptionTooltips tooltips;

    public @JsOverlay final boolean isResponsive() {
        return responsive;
    }

    public @JsOverlay final void setResponsive(boolean responsive) {
        this.responsive = responsive;
    }

    public @JsOverlay final int getResponsiveAnimationDuration() {
        return responsiveAnimationDuration;
    }

    public @JsOverlay final void setResponsiveAnimationDuration(int responsiveAnimationDuration) {
        this.responsiveAnimationDuration = responsiveAnimationDuration;
    }

    public @JsOverlay final boolean isMaintainAspectRatio() {
        return maintainAspectRatio;
    }

    public @JsOverlay final void setMaintainAspectRatio(boolean maintainAspectRatio) {
        this.maintainAspectRatio = maintainAspectRatio;
    }

    public @JsOverlay final String[] getEvents() {
        return events;
    }

    public @JsOverlay final void setEvents(String[] events) {
        this.events = events;
    }

    public @JsOverlay final OptionScales getScales() {
        return scales;
    }

    public @JsOverlay final void setScales(OptionScales scales) {
        this.scales = scales;
    }

    public @JsOverlay final OptionLegend getLegend() {
        return legend;
    }

    public @JsOverlay final void setLegend(OptionLegend legend) {
        this.legend = legend;
    }

    public @JsOverlay final OptionTooltips getTooltips() {
        return tooltips;
    }

    public @JsOverlay final void setTooltips(OptionTooltips tooltips) {
        this.tooltips = tooltips;
    }

    public static class Builder {
        private boolean responsive;

        private int responsiveAnimationDuration;

        private boolean maintainAspectRatio;

        private String[] events;

        private OptionScales scales;

        private OptionLegend legend;

        private OptionTooltips tooltips;

        public final Builder responsive(boolean responsive) {
            this.responsive = responsive;
            return this;
        }

        public final Builder responsiveAnimationDuration(int responsiveAnimationDuration) {
            this.responsiveAnimationDuration = responsiveAnimationDuration;
            return this;
        }

        public final Builder maintainAspectRatio(boolean maintainAspectRatio) {
            this.maintainAspectRatio = maintainAspectRatio;
            return this;
        }

        public final Builder events(String[] events) {
            this.events = events;
            return this;
        }

        public final Builder scales(OptionScales scales) {
            this.scales = scales;
            return this;
        }

        public final Builder legend(OptionLegend legend) {
            this.legend = legend;
            return this;
        }

        public final Builder tooltips(OptionTooltips tooltips) {
            this.tooltips = tooltips;
            return this;
        }

        /**
         * Build it
         * 
         * @return
         */
        public ChartOptions build() {
            final ChartOptions options = new ChartOptions();
            options.setResponsive(responsive);
            options.setResponsiveAnimationDuration(responsiveAnimationDuration);
            options.setMaintainAspectRatio(maintainAspectRatio);
            options.setEvents(events);
            options.setScales(scales);
            options.setLegend(legend);
            options.setTooltips(tooltips);
            return options;

        }

    }

}
