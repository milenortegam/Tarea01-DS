import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana extends JFrame implements ActionListener{

	
	private JPanel panel = new JPanel();
	private JButton btnRojo = new JButton ("Rojo");
	private JButton btnAzul = new JButton ("Azul");
	private JButton btnAmarillo = new JButton ("Amarillo");
	private JButton btnMezcla = new JButton ("Crear Mezcla");
    private Color colorActual;
    private String colorNombre;
    private String arrayColores[]=new String[3];
    private int clics;
    private String colorMezcla;
    private JLabel mensaje= new JLabel();
    private JFrame frame = new JFrame();
    
    
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
		mensaje.setText("Escoja 2 colores y después de eso podrá escoger la opción de generar Mezcla");
		
		mensaje.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        mensaje.setHorizontalTextPosition(JLabel.RIGHT);
        frame.add(mensaje);
        frame.pack();
        frame.setVisible(true);
		
		panel.add(mensaje);
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
		
		
		btnMezcla.setBounds(600, 200, 200, 100);
		btnMezcla.setForeground(Color.black);
		btnMezcla.setBackground(Color.white);
		btnMezcla.addActionListener(this);
		
		panel.add(btnRojo);
		panel.add(btnAzul);
		panel.add(btnAmarillo);
		
		
	}
	public void cambio() {
		
		panel.setBackground(colorActual);
		if(clics>2) {
			clics=0;
		}
		else if(clics==2) {
			
			panel.add(btnMezcla);
			
		}
		
		
	}
	public void actualizacion() {
		System.out.println("");
	}
	
	public void actionPerformed(ActionEvent e) {
		if(clics>-1&&clics<3) {
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
		if(e.getSource()==btnMezcla) {
			if(clics==2) {
				if(arrayColores[0]=="Rojo"&&arrayColores[1]=="Azul"||arrayColores[1]=="Rojo"&&arrayColores[0]=="Azul") {
					colorMezcla="Morado";
					btnMezcla.setBackground(new Color(128,0,128));
					actualizacion();
					clics=0;
				}
				if(arrayColores[0]=="Rojo"&&arrayColores[1]=="Amarillo"||arrayColores[1]=="Rojo"&&arrayColores[0]=="Amarillo") {
					colorMezcla="Naranja";
					btnMezcla.setBackground(Color.orange);
					actualizacion();
					clics=0;
				}
				if(arrayColores[0]=="Azul"&&arrayColores[1]=="Amarillo"||arrayColores[1]=="Azul"&&arrayColores[0]=="Amarillo") {
					colorMezcla="Verde";
					btnMezcla.setBackground(Color.green);
					actualizacion();
					clics=0;
					
				}
				
			}
			
			
			
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
