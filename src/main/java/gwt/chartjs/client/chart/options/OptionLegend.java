package gwt.chartjs.client.chart.options;

import gwt.chartjs.client.chart.Function;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class OptionLegend {

    public enum Position {
        TOP("top"), LEFT("left"), BOTTOM("bottom"), RIGHT("right");

        private String position;

        Position(final String position) {
            this.position = position;
        }

        private String getPosition() {
            return position;
        }
    }

    private @JsProperty boolean display;

    private @JsProperty String position;

    private @JsProperty boolean fullWidth;

    private @JsProperty Function onClick;

    public @JsOverlay final Position getPosition(Position position) {
        return Position.valueOf(this.position);
    }

    public @JsOverlay final void setPosition(Position position) {
        this.position = position.getPosition();
    }

    public @JsOverlay final boolean isFullWidth() {
        return fullWidth;
    }

    public @JsOverlay final void setFullWidth(boolean fullWidth) {
        this.fullWidth = fullWidth;
    }

    public @JsOverlay final Function getOnClick() {
        return onClick;
    }

    public @JsOverlay final void setOnClick(Function onClick) {
        this.onClick = onClick;
    }

    public @JsOverlay final boolean isDisplay() {
        return display;
    }

    public @JsOverlay final void setDisplay(boolean display) {
        this.display = display;
    }

    public static class Builder {

        private boolean display;

        public Builder setDisplay(boolean display) {
            this.display = display;
            return this;
        }

        public OptionLegend build() {
            final OptionLegend legend = new OptionLegend();
            legend.setDisplay(display);
            return legend;
        }
    }
}
