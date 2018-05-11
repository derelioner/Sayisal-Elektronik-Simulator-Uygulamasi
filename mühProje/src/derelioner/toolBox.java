package derelioner;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JToggleButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class toolBox extends JPanel {
	private ButtonGroup btnGrp=new ButtonGroup();
	private int selected=0;
	public toolBox() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(1, 10, 0, 0));
		
		JToggleButton toggleButton = new JToggleButton("");
                toggleButton.setIcon(new javax.swing.ImageIcon("cursor.png"));
		toggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selected=0;
			}
		});
		panel.add(toggleButton);
                		
		JToggleButton toggleButton_9 = new JToggleButton("");
                toggleButton_9.setIcon(new javax.swing.ImageIcon("diode.png"));
		toggleButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selected=9;
			}
		});
		panel.add(toggleButton_9);
		
		JToggleButton toggleButton_2 = new JToggleButton("");
                toggleButton_2.setIcon(new javax.swing.ImageIcon("dc.png"));
		toggleButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selected=2;
			}
		});
		panel.add(toggleButton_2);
		
		JToggleButton toggleButton_3 = new JToggleButton("OR");
		toggleButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selected=3;
			}
		});
		panel.add(toggleButton_3);
		
		JToggleButton toggleButton_4 = new JToggleButton("NOR");
		toggleButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selected=4;
			}
		});
		panel.add(toggleButton_4);
		
		JToggleButton toggleButton_5 = new JToggleButton("AND");
		toggleButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selected=5;
			}
		});
		panel.add(toggleButton_5);
		
		JToggleButton toggleButton_6 = new JToggleButton("NAND");
		toggleButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selected=6;
			}
		});
		panel.add(toggleButton_6);
		
		JToggleButton toggleButton_7 = new JToggleButton("XOR");
		toggleButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selected=7;
			}
		});
		panel.add(toggleButton_7);
		
		JToggleButton toggleButton_8 = new JToggleButton("NOT");
		toggleButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selected=8;
			}
		});
		panel.add(toggleButton_8);

		JToggleButton toggleButton_1 = new JToggleButton("");
                toggleButton_1.setIcon(new javax.swing.ImageIcon("delete.png"));
		toggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selected=1;
			}
		});
		panel.add(toggleButton_1);

		btnGrp.add(toggleButton_9);
		btnGrp.add(toggleButton_8);
		btnGrp.add(toggleButton_7);
		btnGrp.add(toggleButton_6);
		btnGrp.add(toggleButton_5);
		btnGrp.add(toggleButton_4);
		btnGrp.add(toggleButton_3);
		btnGrp.add(toggleButton_2);
		btnGrp.add(toggleButton_1);
		btnGrp.add(toggleButton);
	}
	public int getSelected(){
		return selected;	
	}
}