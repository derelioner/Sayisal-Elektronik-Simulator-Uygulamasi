package derelioner;
import java.awt.Color;
import java.awt.Graphics;
public class Nand extends LogicGate {
	public Nand(int x, int y, int in1, int in2) {		
		super(x, y, in1, in2);
	}
	public void paintComponent(Graphics g){
	           g.setColor(Color.black); 
	           g.drawString("NAND", 13, 35);
                   g.drawOval(41, 27, 7, 7);
                   g.setColor(Color.black);      
                   g.drawLine(8, 10, 10, 50);
	           g.drawArc(-36, 10, 80, 40, 90, -180);
	           switch(inputFlag){
	           case 1:
		           g.fillOval(7, 37, 8, 8);
	        	   g.setColor(Color.red);
	        	   g.fillOval(7, 15,8, 8);
		           break;
	           case 2:
		           g.fillOval(7, 15,8, 8);
	        	   g.setColor(Color.red);
		           g.fillOval(7, 37, 8, 8);
		           break;
		       default:
		    	   g.setColor(Color.BLACK);
		    	   g.fillOval(7, 15,8, 8);
		           g.fillOval(7, 37, 8, 8);      
	           }
	           switch(outputFlag){
	           case 1:
		           g.setColor(Color.red);
		           g.fillOval(47, 26, 8, 8);
		           break;
		       default:
		    	   g.setColor(Color.BLACK);
		           g.fillOval(47, 26, 8, 8);  
	           } 
}
	@Override
	public boolean processGate(boolean in1, boolean in2) {
		boolean x = !(in1&&in2);
		setOutput(x==false?0:1);
		return x;
	}
}