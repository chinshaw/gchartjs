package gwt.chartjs.client.chart;

import jsinterop.annotations.JsMethod;
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
}
