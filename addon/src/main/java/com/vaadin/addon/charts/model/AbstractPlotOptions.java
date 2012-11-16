package com.vaadin.addon.charts.model;

import com.vaadin.addon.charts.model.style.Color;

/**
 * Common plot options shared by all extending PlotOptions classes
 */
public abstract class AbstractPlotOptions extends AbstractConfigurationObject {
    private Labels dataLabels;

    private Stacking stacking;

    private Color lineColor;
    private Color fillColor;

    private Number fillOpacity;
    private Number lineWidth;
    private Number zIndex;
    private Number pointStart;
    private Number pointInterval;

    private Boolean visible;
    private Boolean selected;
    private Boolean shadow;
    private Boolean allowPointSelect;
    private Boolean showInLegend;
    private Boolean enableMouseTracking;

    private Cursor cursor;

    private Boolean animation;

    private Marker marker;
    private PointPlacement pointPlacement;

    /**
     * Labels for plot point items (points/bars/columns etc.)
     * 
     * @return
     */
    public Labels getDataLabels() {
        if (dataLabels == null) {
            dataLabels = new Labels();
        }
        return dataLabels;
    }

    /**
     * @see #getDataLabels()
     * @param dataLabels
     */
    public void setDataLabels(Labels dataLabels) {
        this.dataLabels = dataLabels;
    }

    /**
     * Whether to select the series initially. If showCheckbox is true, the
     * checkbox next to the series name will be checked for a selected series.
     * Defaults to false.
     * 
     * @return Selection state or null if not defined
     */
    public boolean isSelected() {
        return selected == null ? false : selected;
    }

    /**
     * @see #isSelected()
     * @param selected
     */
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    /**
     * Define the z index of the series. Defaults to null.
     * 
     * @return Z index or null if not defined
     */
    public Number getzIndex() {
        return zIndex;
    }

    /**
     * @see #getzIndex()
     * @param zIndex
     */
    public void setzIndex(Number zIndex) {
        this.zIndex = zIndex;
    }

    /**
     * Set the initial visibility of the series. Defaults to true.
     * 
     * @return Visibility or null if not defined
     */
    public boolean isVisible() {
        return visible == null ? true : visible;
    }

    /**
     * @see #isVisible()
     * @param visible
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    /**
     * Whether to stack the values of each series on top of each other. Possible
     * values are null to disable, "normal" to stack by value or "percent".
     * Defaults to null.
     * 
     * @return Stacking or null if not defined
     */
    public Stacking getStacking() {
        return stacking;
    }

    /**
     * @see #getStacking()
     * @param stacking
     */
    public void setStacking(Stacking stacking) {
        this.stacking = stacking;
    }

    /**
     * A separate color for the graph line. By default the line takes the color
     * of the series, but the lineColor setting allows setting a separate color
     * for the line without altering the fillColor. Defaults to null
     */
    public Color getLineColor() {
        return lineColor;
    }

    /**
     * Set line color
     * 
     * @param lineColor
     */
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    /**
     * Pixel with of the graph line. Defaults to 2.
     * 
     * @return Line width or null if undefined
     */
    public Number getLineWidth() {
        return lineWidth;
    }

    /**
     * @see #getLineWidth()
     * @param lineWidth
     */
    public void setLineWidth(Number lineWidth) {
        this.lineWidth = lineWidth;
    }

    /**
     * Fill color or gradient for the area. When null, the series' color is used
     * with the series' fillOpacity. Defaults to null.
     * 
     * @return
     */
    public Color getFillColor() {
        return fillColor;
    }

    /**
     * @see #getFillColor()
     * @param fillColor
     */
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    /**
     * Fill opacity for the area. Defaults to .75.
     * 
     * @return Fill opacity or null if not defined
     */
    public Number getFillOpacity() {
        return fillOpacity;
    }

    /**
     * @see #getFillOpacity()
     * @param fillOpacity
     */
    public void setFillOpacity(Number fillOpacity) {
        this.fillOpacity = fillOpacity;
    }

    /**
     * Whether to apply a drop shadow to the graph line. Defaults to true.
     */
    public void setShadow(Boolean shadows) {
        shadow = shadows;
    }

    /**
     * @see #setShadow(boolean)
     * @return
     */
    public boolean isShadows() {
        return shadow == null ? true : shadow;
    }

    /**
     * Enable or disable the mouse tracking for a specific series. This includes
     * point tooltips and click events on graphs and points. For large datasets
     * it improves performance. Defaults to true.
     * 
     * @param enableMouseTracking
     */
    public void setEnableMouseTracking(Boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
    }

    /**
     * @see #setEnableMouseTracking(Boolean)
     * @return
     */
    public boolean isEnableMouseTracking() {
    	return enableMouseTracking == null ? true : enableMouseTracking;
    }

    /**
     * You can set the cursor to "pointer" if you have click events attached to
     * the series, to signal to the user that the points and lines can be
     * clicked. Defaults to ''.
     */
    public void setCursor(Cursor cursor) {
        this.cursor = cursor;
    }

    /**
     * @see #setCursor(Cursor)
     * @return
     */
    public Cursor getCursor() {
        return cursor;
    }

    /**
     * Set the animation for initial plotting.
     * 
     * @param animation
     */
    public void setAnimation(Boolean animation) {
        this.animation = animation;
    }

    /**
     * @return true is animation are enabled
     */
    public boolean isAnimation() {
        return animation == null ? true : animation;
    }

    /**
     * If no x values are given for the points in a series, pointStart defines
     * on what value to start. For example, if a series contains one yearly
     * value starting from 1945, set pointStart to 1945. Defaults to 0.
     * 
     * @param pointStart
     */
    public void setPointStart(Number pointStart) {
        this.pointStart = pointStart;
    }

    /**
     * @see #setPointStart(Number)
     * @return
     */
    public Number getPointStart() {
        return pointStart;
    }

    /**
     * If no x values are given for the points in a series, pointInterval
     * defines the interval of the x values. For example, if a series contains
     * one value every decade starting from year 0, set pointInterval to 10. .
     * Defaults to 1.
     * 
     * @param pointInterval
     */
    public void setPointInterval(Number pointInterval) {
        this.pointInterval = pointInterval;
    }

    /**
     * @see #setPointInterval(Number)
     * @return
     */
    public Number getPointInterval() {
        return pointInterval;
    }

    /**
     * Possible values: null, "on", "between".
     * 
     * In a column chart, when pointPlacement is "on", the point will not create
     * any padding of the X axis. In a polar column chart this means that the
     * first column points directly north. If the pointPlacement is "between",
     * the columns will be laid out between ticks. This is useful for example
     * for visualising an amount between two points in time or in a certain
     * sector of a polar chart.
     * 
     * Defaults to null in cartesian charts, "between" in polar charts.
     * 
     * @param pointPlacement
     */
    public void setPointPlacement(PointPlacement pointPlacement) {
        this.pointPlacement = pointPlacement;
    }

    /**
     * @see #setPointPlacement(PointPlacement)
     * @return
     */
    public PointPlacement getPointPlacement() {
        return pointPlacement;
    }

    /**
     * Allow this series' points to be selected by clicking on the markers, bars
     * or pie slices. Defaults to false.
     * 
     * @return
     */
    public boolean isAllowPointSelect() {
    	return allowPointSelect == null ? false : allowPointSelect;
    }

    /**
     * @see #isAllowPointSelect()
     * @param allowPointSelect
     */
    public void setAllowPointSelect(Boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
    }

    /**
     * Whether to display this particular series or series type in the legend.
     * Defaults to false.
     * 
     * @return
     */
    public Boolean isShowInLegend() {
    	return showInLegend == null ? false : showInLegend;
    }

    /**
     * @see #isShowInLegend()
     * @param showInLegend
     */
    public void setShowInLegend(Boolean showInLegend) {
        this.showInLegend = showInLegend;
    }

    /**
     * @see #setMarker(Marker)
     * @return
     */
    public Marker getMarker() {
        if (marker == null) {
            marker = new Marker();
        }
        return marker;
    }

    /**
     * Marker used for the plot point items (points/bars/columns)
     * 
     * @param marker
     */
    public void setMarker(Marker marker) {
        this.marker = marker;
    }
}