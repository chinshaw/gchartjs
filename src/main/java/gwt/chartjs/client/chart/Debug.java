package gwt.chartjs.client.chart;

import com.google.gwt.core.client.JavaScriptObject;

public class Debug {

    public static native String stringify(JavaScriptObject obj)
    /*-{
        seen = [];
        JSON.stringify(obj, function(key, val) {
            if (val != null && typeof val == "object") {
                if (seen.indexOf(val) >= 0) {
                return;
            }
                seen.push(val);
            }
            return val;
        });
    }-*/;
}
