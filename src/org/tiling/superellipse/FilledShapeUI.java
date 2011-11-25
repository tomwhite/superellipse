package org.tiling.superellipse;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;

/**
 * A filled graphical representation of a Shape.
 */
public class FilledShapeUI extends ShapeUI {

	public FilledShapeUI(Shape shape) {
		super(shape);
	}

	public void paint(Graphics2D g2) {
		g2.setRenderingHints(qualityHints);
		g2.setStroke(stroke);

		g2.setColor(Color.black);
		g2.fill(shape);
	}
}