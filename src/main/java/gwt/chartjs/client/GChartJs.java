package gwt.chartjs.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;

import gwt.chartjs.client.resources.Resources;

public class GChartJs {

    private static boolean injected = false;

    public static void bootstrap(final Runnable runnable) {
        // Check if the js is injected.
        if (injected) {
            runnable.run();
            return;
        }

        Resources res = GWT.create(Resources.class);
        String source = res.chartJsSource().getText();

        ScriptInjector.fromString(source).setWindow(ScriptInjector.TOP_WINDOW).inject();
        injected = true;

        runnable.run();
    }
}
