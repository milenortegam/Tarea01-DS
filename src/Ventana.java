import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {

	private JFrame marco = new JFrame();
	private JPanel panel = new JPanel();
	private JButton btnVerde = new JButton ("Verde");
	private JButton btnAzul = new JButton ("Azul");
	private JButton btnAmarillo = new JButton ("Amarillo");
    
    
    
    public Ventana() {
		this.setSize(1000, 600);
		this.setLocationRelativeTo(null);
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

		btnAzul.setForeground(Color.white);
		btnAzul.setBounds(300, 200, 100, 100);
		btnAzul.setBackground(Color.blue);

		btnAmarillo.setForeground(Color.black);
		btnAmarillo.setBounds(400, 200, 100, 100);
		btnAmarillo.setBackground(Color.yellow);
		
		
		
		panel.add(btnVerde);
		panel.add(btnAzul);
		panel.add(btnAmarillo);
		
		
	}
}
