package gwt.chartjs.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;

import gwt.chartjs.client.resources.Resources;

public class GChartJs {

    private static boolean injected = false;

    /**
     * Method injecting native chart.js code into the browser<br/>
     * In case code already been injected do nothing
     */
    public static void bootstrap(final Runnable runnable) {
        if (injected) {
            return;
        }

        Resources res = GWT.create(Resources.class);
        String source = res.chartJsSource().getText();

        ScriptInjector.fromString(source).setWindow(ScriptInjector.TOP_WINDOW).inject();
        runnable.run();

        injected = true;
    }
}
