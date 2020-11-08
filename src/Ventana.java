import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana extends JFrame implements ActionListener{

	private JFrame marco = new JFrame();
	private JPanel panel = new JPanel();
	private JButton btnRojo = new JButton ("Rojo");
	private JButton btnAzul = new JButton ("Azul");
	private JButton btnAmarillo = new JButton ("Amarillo");
    private Color colorActual;
    private String colorNombre;
    private String arrayColores[]=new String[3];
    private int clics;
    private String colorMezcla;
    
    
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
		btnRojo.setForeground(Color.black);
		btnRojo.setBounds(200, 200, 100, 100);
		btnRojo.setBackground(Color.red);
		btnRojo.addActionListener(this);
		

		btnAzul.setForeground(Color.white);
		btnAzul.setBounds(300, 200, 100, 100);
		btnAzul.setBackground(Color.blue);
		btnAzul.addActionListener(this);
		
		btnAmarillo.setForeground(Color.black);
		btnAmarillo.setBounds(400, 200, 100, 100);
		btnAmarillo.setBackground(Color.yellow);
		btnAmarillo.addActionListener(this);
		
		
		panel.add(btnRojo);
		panel.add(btnAzul);
		panel.add(btnAmarillo);
		
		
	}
	public void cambio() {
		
		panel.setBackground(colorActual);
		if(clics==2) {
			
			if(arrayColores[0]=="Rojo"&&arrayColores[1]=="Azul"||arrayColores[1]=="Rojo"&&arrayColores[0]=="Azul") {
				colorMezcla="Morado";
				
			}
			if(arrayColores[0]=="Rojo"&&arrayColores[1]=="Amarillo"||arrayColores[1]=="Rojo"&&arrayColores[0]=="Amarillo") {
				colorMezcla="Naranja";
				
			}
			if(arrayColores[0]=="Azul"&&arrayColores[1]=="Amarillo"||arrayColores[1]=="Azul"&&arrayColores[0]=="Amarillo") {
				colorMezcla="Verde";
				
			}
			
			clics=0;
			actualizacion();
			
			
			
		}
		
	}
	public void actualizacion() {
		System.out.printf("");
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnRojo) {
			clics++;
			colorActual=Color.red;
			colorNombre="Rojo";
			arrayColores[clics-1]=colorNombre;
			cambio();
		}
		if(e.getSource()==btnAzul) {
			clics++;
			colorActual=Color.blue;
			colorNombre="Azul";
			arrayColores[clics-1]=colorNombre;
			cambio();
		}
		if(e.getSource()==btnAmarillo) {
			clics++;
			colorActual=Color.yellow;
			colorNombre="Amarillo";
			arrayColores[clics-1]=colorNombre;
			cambio();
		}
	}
	
	public Color getColorActual() {
		return colorActual;
	}


	public void setColorActual(Color colorActual) {
		this.colorActual = colorActual;
	}


	public String getColorNombre() {
		return colorNombre;
	}


	public void setColorNombre(String colorNombre) {
		this.colorNombre = colorNombre;
	}
	public String getColorMezcla() {
		return colorMezcla;
	}


	public void setColorMezcla(String colorMezcla) {
		this.colorMezcla = colorMezcla;
	}
}
