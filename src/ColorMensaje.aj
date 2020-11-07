
public aspect ColorMensaje {
	
	pointcut mostrarColor(Ventana v ): call(* Ventana.cambio())
	&& target(v)	;
	 
	after(Ventana v) : mostrarColor(v )  {
	        System.out.println("El color de la ventana es: "+v.getColorNombre());
	}
}
