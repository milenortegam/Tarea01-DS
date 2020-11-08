
public aspect ColorMensaje {
	
	pointcut mostrarColor(Ventana v ): call(* Ventana.cambio())
	&& target(v)	;
	 
	after(Ventana v) : mostrarColor(v )  {
	        System.out.println("El color de la ventana es: "+v.getColorNombre());
	}
	pointcut mostrarMezcla(Ventana v2 ): call(* Ventana.actualizacion())
	&& target(v2)	;
	 
	after(Ventana v2) : mostrarMezcla(v2)  {
	        
			System.out.println("\nEl color de la mezcla es: "+ v2.getColorMezcla());
	}
}
