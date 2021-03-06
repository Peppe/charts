package com.vaadin.addon.charts.model;

import com.vaadin.addon.charts.model.style.Color;

/*
 * #%L
 * Vaadin Charts
 * %%
 * Copyright (C) 2014 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <https://vaadin.com/license/cval-3>.
 * #L%
 */

/**
 * Plot options that are specific for {@link ChartType#WATERFALL} charts
 * 
 * @see AbstractPlotOptions
 * @see PlotOptionsColumn
 */
public class PlotOptionsWaterfall extends PlotOptionsColumn {

    private Color upColor;

    @Override
    public ChartType getChartType() {
        return ChartType.WATERFALL;
    }

    /**
     * @see #setUpColor(Color)
     * @return the upColor
     */
    public Color getUpColor() {
        return upColor;
    }

    /**
     * @param upColor
     *            the color to use when item value is positive
     */
    public void setUpColor(Color upColor) {
        this.upColor = upColor;
    }

}
