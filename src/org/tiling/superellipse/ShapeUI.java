package org.tiling.superellipse;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;

import org.tiling.UI;

/**
 * A graphical representation of a Shape.
 */
public class ShapeUI implements UI {

	public static final float LINE_WIDTH = 0.01f;

	protected Color backgroundColor = Color.white;

	protected Shape shape;

	protected RenderingHints qualityHints;
	protected Stroke stroke;

	public ShapeUI(Shape shape) {
		this.shape = shape;
		initialiseGraphics();
	}

	protected void initialiseGraphics() {
		qualityHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
											RenderingHints.VALUE_ANTIALIAS_ON);
		qualityHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		stroke = new BasicStroke(LINE_WIDTH);
	}

	public void paint(Graphics2D g2) {
		g2.setRenderingHints(qualityHints);
		g2.setStroke(stroke);

		g2.setColor(Color.black);
		g2.fill(shape);
	}

	public void setBackground(Color c) {
		backgroundColor = c;
	}

	public Color getBackground() {
		return backgroundColor;
	}

	public Rectangle2D getBounds2D() {
		return shape.getBounds2D();
	}
	public Object clone() {
		try {
			ShapeUI shapeUI = (ShapeUI) super.clone();
			return shapeUI;
		} catch (CloneNotSupportedException e) {
			// this shouldn't happen, since we are Cloneable
			throw new InternalError();
		}		
	}}