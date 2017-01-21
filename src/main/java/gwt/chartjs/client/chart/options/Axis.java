package gwt.chartjs.client.chart.options;

import com.google.gwt.dom.client.Document;

import gwt.chartjs.client.chart.options.OptionScales.GridLines;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class Axis {

    @JsFunction @FunctionalInterface
    public static interface TickCallback {
        String f(Double value, int index, Double[] data);
    }

    private @JsProperty String id;

    private @JsProperty String type;

    private @JsProperty String position;

    private @JsProperty GridLines gridLines;

    private @JsProperty OptionTick ticks;

    public @JsOverlay final String getType() {
        return type;
    }

    public @JsOverlay final void setType(String type) {
        this.type = type;
    }

    public @JsOverlay final Position getPosition() {
        return Position.fromProperty(position);
    }

    public @JsOverlay final void setPosition(Position position) {
        this.position = position.asProperty();
    }

    public @JsOverlay final String getId() {
        return id;
    }

    public @JsOverlay final void setId(String id) {
        this.id = id;
    }

    public @JsOverlay final GridLines getGridLines() {
        return gridLines;
    }

    public @JsOverlay final void setGridLines(GridLines gridLines) {
        this.gridLines = gridLines;
    }

    public @JsOverlay final OptionTick getTicks() {
        return ticks;
    }

    public @JsOverlay final void setTicks(OptionTick ticks) {
        this.ticks = ticks;
    }

    public static class Builder {

        private String id;

        private GridLines gridLines;

        private Position position;

        public Builder id(final String id) {
            this.id = id;
            return this;
        }

        public Builder position(Position position) {
            this.position = position;
            return this;
        }

        public Builder gridLines(GridLines gridLines) {
            this.gridLines = gridLines;
            return this;
        }

        public Axis build() {
            if (position == null) {
                throw new IllegalStateException("Axis: position is a required field, use builder position(Position)");
            }

            final Axis axis = new Axis();
            axis.setGridLines(gridLines);
            axis.setPosition(position);
            axis.setId(id == null ? generateAxisId() : id);
            return axis;
        }

        private final String generateAxisId() {
            return Document.get().createUniqueId();
        }

    }
}