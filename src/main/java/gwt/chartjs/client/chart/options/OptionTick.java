package gwt.chartjs.client.chart.options;

import gwt.chartjs.client.chart.options.Axis.TickCallback;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class OptionTick {

    private @JsProperty boolean autoSkip;

    private @JsProperty int autoSkipPadding;

    private @JsProperty TickCallback callback;

    private @JsProperty boolean display;

    private @JsProperty String fontColor;

    private @JsProperty String fontFamily;

    private @JsProperty int fontSize;

    private @JsProperty String fontStyle;

    private @JsProperty int labelOffset;

    private @JsProperty int maxRotation;

    private @JsProperty int minRotation;

    private @JsProperty boolean mirror;

    private @JsProperty int padding;

    private @JsProperty int reverse;

    private @JsProperty boolean beginAtZero;

    private @JsProperty int min;

    private @JsProperty int max;

    private @JsProperty int maxTicksLimit;

    private @JsProperty int fixedStepSize;

    private @JsProperty int stepSize;

    private @JsProperty int suggestedMax;

    private @JsProperty int suggestedMin;

    public OptionTick() {
    }

    /**
     * If true, automatically calculates how many labels that can be shown and
     * hides labels accordingly. Turn it off to show all labels no matter what
     * 
     * @return
     */
    public @JsOverlay final boolean isAutoSkip() {
        return autoSkip;
    }

    /**
     * If true, automatically calculates how many labels that can be shown and
     * hides labels accordingly. Turn it off to show all labels no matter what
     * 
     * @param autoSkip
     */
    public @JsOverlay final void setAutoSkip(boolean autoSkip) {
        this.autoSkip = autoSkip;
    }

    /**
     * Padding between the ticks on the horizontal axis when autoSkip is
     * enabled. Note: Only applicable to horizontal scales.
     * 
     * @return
     */
    public @JsOverlay final int getAutoSkipPadding() {
        return autoSkipPadding;
    }

    /**
     * Padding between the ticks on the horizontal axis when autoSkip is
     * enabled. Note: Only applicable to horizontal scales.
     * 
     * @param autoSkipPadding
     */
    public @JsOverlay final void setAutoSkipPadding(int autoSkipPadding) {
        this.autoSkipPadding = autoSkipPadding;
    }

    /**
     * If true, show the ticks.
     * 
     * @return
     */
    public @JsOverlay final boolean isDisplay() {
        return display;
    }

    /**
     * If true, show the ticks.
     * 
     * @param display
     */
    public @JsOverlay final void setDisplay(boolean display) {
        this.display = display;
    }

    /**
     * Font color for the tick labels.
     * 
     * @return
     */
    public @JsOverlay final String getFontColor() {
        return fontColor;
    }

    /**
     * Font color for the tick labels.
     * 
     * @param fontColor
     */
    public @JsOverlay final void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    /**
     * Font family for the tick labels, follows CSS font-family options. <code>
     *  "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
     *  </code>
     * 
     * @return
     */
    public @JsOverlay final String getFontFamily() {
        return fontFamily;
    }

    /**
     * Font family for the tick labels, follows CSS font-family options. <code>
     *  "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
     *  </code>
     * 
     * @return
     */
    public @JsOverlay final void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    /**
     * Font size for the tick labels.
     * 
     * @return
     */
    public @JsOverlay final int getFontSize() {
        return fontSize;
    }

    /**
     * Font size for the tick labels.
     * 
     * @param fontSize
     */
    public @JsOverlay final void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * Font style for the tick labels, follows CSS font-style options (i.e.
     * normal, italic, oblique, initial, inherit).
     * 
     * @return
     */
    public @JsOverlay final String getFontStyle() {
        return fontStyle;
    }

    /**
     * Font style for the tick labels, follows CSS font-style options (i.e.
     * normal, italic, oblique, initial, inherit).
     * 
     * @return
     */
    public @JsOverlay final void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }

    /**
     * Distance in pixels to offset the label from the centre point of the tick
     * (in the y direction for the x axis, and the x direction for the y axis).
     * Note: this can cause labels at the edges to be cropped by the edge of the
     * canvas
     * 
     * @return
     */
    public @JsOverlay final int getLabelOffset() {
        return labelOffset;
    }

    /**
     * Distance in pixels to offset the label from the centre point of the tick
     * (in the y direction for the x axis, and the x direction for the y axis).
     * Note: this can cause labels at the edges to be cropped by the edge of the
     * canvas
     * 
     * @param labelOffset
     */
    public @JsOverlay final void setLabelOffset(int labelOffset) {
        this.labelOffset = labelOffset;
    }

    /**
     * Maximum rotation for tick labels when rotating to condense labels. Note:
     * Rotation doesn't occur until necessary. Note: Only applicable to
     * horizontal scales.
     * 
     * @return
     */
    public @JsOverlay final int getMaxRotation() {
        return maxRotation;
    }

    /**
     * Maximum rotation for tick labels when rotating to condense labels. Note:
     * Rotation doesn't occur until necessary. Note: Only applicable to
     * horizontal scales.
     * 
     * @param maxRotation
     */
    public @JsOverlay final void setMaxRotation(int maxRotation) {
        this.maxRotation = maxRotation;
    }

    /**
     * Minimum rotation for tick labels. Note: Only applicable to horizontal
     * scales.
     * 
     * @return
     */
    public @JsOverlay final int getMinRotation() {
        return minRotation;
    }

    /**
     * Minimum rotation for tick labels. Note: Only applicable to horizontal
     * scales.
     * 
     * @param minRotation
     */
    public @JsOverlay final void setMinRotation(int minRotation) {
        this.minRotation = minRotation;
    }

    /**
     * Flips tick labels around axis, displaying the labels inside the chart
     * instead of outside. Note: Only applicable to vertical scales.
     * 
     * @return
     */
    public @JsOverlay final boolean isMirror() {
        return mirror;
    }

    /**
     * Flips tick labels around axis, displaying the labels inside the chart
     * instead of outside. Note: Only applicable to vertical scales.
     * 
     * @param mirror
     */
    public @JsOverlay final void setMirror(boolean mirror) {
        this.mirror = mirror;
    }

    /**
     * Padding between the tick label and the axis. Note: Only applicable to
     * horizontal scales.
     * 
     * @return
     */
    public @JsOverlay final int getPadding() {
        return padding;
    }

    /**
     * Padding between the tick label and the axis. Note: Only applicable to
     * horizontal scales.
     * 
     * @param padding
     */
    public @JsOverlay final void setPadding(int padding) {
        this.padding = padding;
    }

    /**
     * Reverses order of tick labels.
     * 
     * @return
     */
    public @JsOverlay final int getReverse() {
        return reverse;
    }

    /**
     * Reverses order of tick labels.
     * 
     * @param reverse
     */
    public @JsOverlay final void setReverse(int reverse) {
        this.reverse = reverse;
    }

    /**
     * Returns the string representation of the tick value as it should be
     * displayed on the chart. See callback section below.
     * 
     * @param callback
     */
    public @JsOverlay final void setTickCallback(TickCallback callback) {
        this.callback = callback;
    }

    /**
     * Returns the string representation of the tick value as it should be
     * displayed on the chart. See callback section below.
     * 
     * @return
     */
    public @JsOverlay final TickCallback getTickCallback() {
        return callback;
    }

    /**
     * if true, scale will include 0 if it is not already included.
     * 
     * @return
     */
    public @JsOverlay final boolean isBeginAtZero() {
        return beginAtZero;
    }

    /**
     * if true, scale will include 0 if it is not already included.
     * 
     * @param beginAtZero
     */
    public @JsOverlay final void setBeginAtZero(boolean beginAtZero) {
        this.beginAtZero = beginAtZero;
    }

    /**
     * User defined minimum number for the scale, overrides minimum value from
     * data.
     * 
     * @return
     */
    public @JsOverlay final int getMin() {
        return min;
    }

    /**
     * User defined minimum number for the scale, overrides minimum value from
     * data.
     * 
     * @param min
     */
    public @JsOverlay final void setMin(int min) {
        this.min = min;
    }

    /**
     * User defined maximum number for the scale, overrides maximum value from
     * data.
     * 
     * @return
     */
    public @JsOverlay final int getMax() {
        return max;
    }

    /**
     * User defined maximum number for the scale, overrides maximum value from
     * data.
     * 
     * @param max
     */
    public @JsOverlay final void setMax(int max) {
        this.max = max;
    }

    /**
     * Maximum number of ticks and gridlines to show. If not defined, it will
     * limit to 11 ticks but will show all gridlines.
     * 
     * @return
     */
    public @JsOverlay final int getMaxTicksLimit() {
        return maxTicksLimit;
    }

    /**
     * Maximum number of ticks and gridlines to show. If not defined, it will
     * limit to 11 ticks but will show all gridlines.
     * 
     * @param maxTicksLimit
     */
    public @JsOverlay final void setMaxTicksLimit(int maxTicksLimit) {
        this.maxTicksLimit = maxTicksLimit;
    }

    /**
     * User defined fixed step size for the scale. If set, the scale ticks will
     * be enumerated by multiple of stepSize, having one tick per increment. If
     * not set, the ticks are labeled automatically using the nice numbers
     * algorithm.
     * 
     * @return
     */
    public @JsOverlay final int getFixedStepSize() {
        return fixedStepSize;
    }

    /**
     * User defined fixed step size for the scale. If set, the scale ticks will
     * be enumerated by multiple of stepSize, having one tick per increment. If
     * not set, the ticks are labeled automatically using the nice numbers
     * algorithm.
     * 
     * @param fixedStepSize
     */
    public @JsOverlay final void setFixedStepSize(int fixedStepSize) {
        this.fixedStepSize = fixedStepSize;
    }

    /**
     * if defined, it can be used along with the min and the max to give a
     * custom number of steps. See the example below.
     * 
     * @return
     */
    public @JsOverlay final int getStepSize() {
        return stepSize;
    }

    /**
     * if defined, it can be used along with the min and the max to give a
     * custom number of steps. See the example below.
     * 
     * @param stepSize
     */
    public @JsOverlay final void setStepSize(int stepSize) {
        this.stepSize = stepSize;
    }

    /**
     * User defined maximum number for the scale, overrides maximum value except
     * for if it is lower than the maximum value.
     * 
     * @return
     */
    public @JsOverlay final int getSuggestedMax() {
        return suggestedMax;
    }

    /**
     * User defined maximum number for the scale, overrides maximum value except
     * for if it is lower than the maximum value.
     * 
     * @param suggestedMax
     */
    public @JsOverlay final void setSuggestedMax(int suggestedMax) {
        this.suggestedMax = suggestedMax;
    }

    /**
     * User defined minimum number for the scale, overrides minimum value except
     * for if it is higher than the minimum value.
     * 
     * @return
     */
    public @JsOverlay final int getSuggestedMin() {
        return suggestedMin;
    }

    /**
     * User defined minimum number for the scale, overrides minimum value except
     * for if it is higher than the minimum value.
     * 
     * @param suggestedMin
     */
    public @JsOverlay final void setSuggestedMin(int suggestedMin) {
        this.suggestedMin = suggestedMin;
    }
}
