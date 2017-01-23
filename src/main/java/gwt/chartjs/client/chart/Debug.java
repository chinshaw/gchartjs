package gwt.chartjs.client.chart;

public class Debug {

//    public static native String stringify(JavaScriptObject obj)
//    /*-{
//        seen = [];
//        JSON.stringify(obj, function(key, val) {
//            if (val != null && typeof val == "object") {
//                if (seen.indexOf(val) >= 0) {
//                return;
//            }
//                seen.push(val);
//            }
//            return val;
//        });
//    }-*/;
    
    public static native String stringify(Object obj)
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
