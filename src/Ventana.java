import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana extends JFrame implements ActionListener{

	private JFrame marco = new JFrame();
	private JPanel panel = new JPanel();
	private JButton btnVerde = new JButton ("Verde");
	private JButton btnAzul = new JButton ("Azul");
	private JButton btnAmarillo = new JButton ("Amarillo");
    
    
    
    public Ventana() {
		this.setSize(1000, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Tarea 1");
		initComponentes();

	}
    public void initComponentes() {
		setPanel();
		setBotones();
	}
    
    public void setPanel() {
		panel.setLayout(null);
		this.getContentPane().add(panel);
		panel.setBackground(Color.WHITE);
		
	}
	
	 
	
	
	public void setBotones() {
		btnVerde.setForeground(Color.black);
		btnVerde.setBounds(200, 200, 100, 100);
		btnVerde.setBackground(Color.green);
		btnVerde.addActionListener(this);
		

		btnAzul.setForeground(Color.white);
		btnAzul.setBounds(300, 200, 100, 100);
		btnAzul.setBackground(Color.blue);
		btnAzul.addActionListener(this);
		
		btnAmarillo.setForeground(Color.black);
		btnAmarillo.setBounds(400, 200, 100, 100);
		btnAmarillo.setBackground(Color.yellow);
		btnAmarillo.addActionListener(this);
		
		
		panel.add(btnVerde);
		panel.add(btnAzul);
		panel.add(btnAmarillo);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnVerde) {
			panel.setBackground(Color.GREEN);
		}
		if(e.getSource()==btnAzul) {
			panel.setBackground(Color.blue);
		}
		if(e.getSource()==btnAmarillo) {
			panel.setBackground(Color.yellow);
		}
	}
}
