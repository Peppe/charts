package com.vaadin.addon.charts.testbenchtests;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public abstract class AbstractSimpleScreenShotTestBenchTest extends
        AbstractTestBenchTest {

    @Test
    public void test() throws IOException, AssertionError {

        startBrowser();
        try {
            String pack = getPackageName();
            if (!pack.isEmpty()) {
                pack = pack + "/";
            }
            driver.navigate().to(BASEURL + pack + getTestViewName());
            try {
                Thread.sleep(getScreenShotDelay());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            final String imageName = getTestViewName() + ".png";
            final File refImage = getReferenceImage(imageName);

            if (!refImage.exists()) {
                System.err.println("Reference image "
                        + refImage.getAbsolutePath() + " is missing!");
            }
            assertTrue(testBench.compareScreen(refImage));
        } finally {
            driver.quit();
        }
    }

    protected String getPackageName() {
        return "";
    }

    protected int getScreenShotDelay() {
        return 5000;
    }

    protected abstract String getTestViewName();
}