package derelioner;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Output extends CircuitComponents{
	private Point xy= new Point();
	public Output(int x,int y) {
		super.setToolTipText("BULB");
		setBounds(x,y,60,60);
		setLayout(null);		
        repaint();
        addMouseListener(new MouseAdapter(){
        	@Override
        	public void mouseClicked(MouseEvent evt) {
				inputFlag=0;
				if((evt.getX()>=0 && evt.getY()>=25 && evt.getX()<=8 && evt.getY()<=33)&& inputFlag==0
						){inputFlag=1;}
				repaint();
        	}
        });
		setLayout(new BorderLayout(0, 0));
		xy.x=x;
		xy.y=y;
	}
	public void paintComponent(Graphics g){
	       super.paintComponent (g);
	       switch(getOutput()){
	           case 1:
	        	   g.setColor(Color.black);
	        	   g.drawOval(10, 10, 30, 40);
	        	   g.setColor(Color.green);
                           g.fillOval(10, 10, 30, 40);
	        	   g.setColor(new Color(0,255,0,30));
	        	   g.fillOval(20, 20, 15, 15);
	        	   g.setColor(new Color(255,0,0,30));
	        	   g.fillOval(35, 35, 5, 5);
	        	   break;
	           default:
	        	   g.setColor(Color.black);
	        	   g.drawOval(10, 10, 30, 40);
                           g.setColor(new Color(255,0,0,100));  
                           g.fillOval(10, 10, 30, 40);
                           g.fillOval(10, 10, 30, 40);
                           g.fillOval(10, 10, 30, 40);
	           }
	       switch(inputFlag){
           case 1:
        	   g.setColor(Color.red);
        	   g.fillOval(0, 25, 8, 8);
        	   break;
           default:
        	   g.setColor(Color.black);
        	   g.drawOval(0, 25, 8, 8);
           }
	}
	@Override
	public boolean processGate(boolean in1, boolean in2) {
		return false;
	}	
}