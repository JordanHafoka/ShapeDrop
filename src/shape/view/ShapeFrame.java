package shape.view;

import javax.swing.*;

import shape.controller.ShapeController;

public class ShapeFrame extends JFrame
{
	private ShapeController baseController;
	private ShapePanel basePanel;

	public ShapeFrame(ShapeController baseController)
	{
		this.baseController = baseController;
		basePanel = new ShapePanel();
		
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(1000,1000);
		this.setVisible(true);
		
	}
	
}
