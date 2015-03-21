package shape.view;

import java.awt.Canvas;

import javax.swing.*;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class ShapePanel extends JPanel
{
	private SpringLayout baseLayout;
	private Canvas canvas;
	
	
	public ShapePanel()
	{

		setBackground(Color.GRAY);
		canvas = new Canvas();
		canvas.setBounds(new Rectangle(150, 150, 0, 0));
		canvas.setSize(new Dimension(700, 700));
		canvas.setBackground(Color.RED);
		
		setupPanel();
		setupLayout();
		setupListeners(0);
		draw();
	}
	
	private void setupListeners(int key)
	{
		if(key==KeyEvent.VK_LEFT)
		{
			
		}
		else if(key==KeyEvent.VK_RIGHT)
		{
			
		}
		else if(key==KeyEvent.VK_UP)
		{
			
		}
		else if(key==KeyEvent.VK_DOWN)
		{
			
		}
		else if(key==KeyEvent.VK_Q)
		{
			
		}
		else if(key==KeyEvent.VK_W)
		{
			
		}
		else if(key==KeyEvent.VK_E)
		{
			
		}
		else if(key==KeyEvent.VK_R)
		{
			
		}
		else if(key==KeyEvent.VK_T)
		{
			
		}
	}

	private void setupLayout()
	{
		// TODO Auto-generated method stub
		
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setSize(1000,1000);
		this.add(canvas);
		this.setVisible(true);
		
	}
	private void draw()
	{
		
	}
}
