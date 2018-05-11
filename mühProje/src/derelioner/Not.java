package derelioner;
import java.awt.Color;
import java.awt.Graphics;
public class Not extends LogicGate {
	public Not(int x, int y, int in1, int in2) {		
		super(x, y, in1, in2);
	}
	public void paintComponent(Graphics g){
	           g.setColor(Color.black); 
	           g.drawString("NOT", 20, 35);
                   g.drawLine(10, 10, 10, 50);
                   g.drawLine(10, 10, 47, 28);
                   g.drawLine(10, 50, 47, 28);
	           switch(inputFlag){
	           case 1:
	        	   g.setColor(Color.red);
	        	   g.fillOval(7, 25,8, 8);
		           break;
	           case 2:
                       g.setColor(Color.red);
	        	   g.fillOval(7, 25,8, 8);
                           break;
		       default:
		    	   g.setColor(Color.BLACK);
		    	   g.fillOval(7, 25,8, 8); 
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
		boolean x = !(in1);
		setOutput(x==false?0:1);
		return x;
	}
}