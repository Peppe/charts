package com.vaadin.addon.charts.model;

import com.vaadin.addon.charts.model.style.Color;

/**
 * Marker (symbol) for series points
 */
public class Marker extends AbstractConfigurationObject {

    private Boolean enabled;
    private MarkerSymbol symbol;
    private Number radius;
    private MarkerStates states;
    private Number lineWidth;
    private Color lineColor;
    private Color fillColor;

    /**
     * Default constructor
     */
    public Marker() {

    }

    /**
     * Create marker with enabled state
     * 
     * @param enabled
     *            false to disable
     */
    public Marker(Boolean enabled) {
        setEnabled(enabled);
    }

    /**
     * Enable or disable the point marker. Defaults to true.
     * 
     * @return
     */
    public boolean isEnabled() {
    	return enabled == null ? true : enabled;
    }

    /**
     * @see Marker#isEnabled()
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * @see #setRadius(Number)
     * @return
     */
    public Number getRadius() {
        return radius;
    }

    /**
     * The radius of the point marker. Defaults to 0.
     * 
     * @param radius
     */
    public void setRadius(Number radius) {
        this.radius = radius;
    }

    /**
     * @see #setStates(MarkerStates)
     * @return
     */
    public MarkerStates getStates() {
        return states;
    }

    /**
     * Marker state for hover and select events
     * 
     * @param states
     */
    public void setStates(MarkerStates states) {
        this.states = states;
    }

    /**
     * @see #setLineWidth(Number)
     * @return
     */
    public Number getLineWidth() {
        return lineWidth;
    }

    /**
     * The width of the point marker's outline. Defaults to 0.
     * 
     * @param lineWidth
     */
    public void setLineWidth(Number lineWidth) {
        this.lineWidth = lineWidth;
    }

    /**
     * @see #setLineColor(Color)
     * @return
     */
    public Color getLineColor() {
        return lineColor;
    }

    /**
     * The color of the point marker's outline. When null, the series' or
     * point's color is used. Defaults to "#FFFFFF".
     * 
     * @param lineColor
     */
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    /**
     * A predefined shape or symbol for the marker. When null, the symbol is
     * pulled from options.symbols. Other possible values are "circle",
     * "square", "diamond", "triangle" and "triangle-down". Additionally, the
     * URL to a graphic can be given on this form: "url(graphic.png)". Defaults
     * to null.
     * 
     * @param symbol
     */
    public void setSymbol(MarkerSymbol symbol) {
        this.symbol = symbol;
    }

    /**
     * @see #setSymbol(MarkerSymbol)
     * @return
     */
    public MarkerSymbol getSymbol() {
        return symbol;
    }

    /**
     * The fill color of the point marker. When null, the series' or point's
     * color is used. Defaults to null.
     * 
     * @return Fill color or null if not defined
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

}