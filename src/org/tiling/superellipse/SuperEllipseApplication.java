package org.tiling.superellipse;





import org.tiling.gui.Canvas2D;import org.tiling.gui.Viewer2D;import org.tiling.gui.ViewerApplication;public class SuperEllipseApplication extends ViewerApplication {




	public SuperEllipseApplication() {
		super("Super Ellipses");
		viewer.fitToCanvas();
	}

	public static void main(String[] args) {
		ViewerApplication app = new SuperEllipseApplication();
	}

	public Viewer2D buildViewer() {
		Viewer2D viewer = new Viewer2D("Piet Hein's Superellipse", false, false, false);

		SuperEllipse2D superEllipse = new SuperEllipse2D(0, 0, 16, 10, 3.14);
		ShapeUI ui = new ShapeUI(superEllipse.getShape());
		Canvas2D canvas = new Canvas2D(ui);
		viewer.setCanvas2D(canvas);
		return viewer;
	}}