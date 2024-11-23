
public class empleado {
	

		public String Nombre;
		public int id;
		private String puesto;
		public boolean active;
		
		
		public empleado(String Nombre, int id, String puesto) {
			
			this.Nombre=Nombre;
			this.id=id;
			this.puesto=puesto;
			
			
}
		
		   // Métodos getter y setter
	    public String getNombre() { 
	    	return Nombre; 
	    	}
	    
	    public int getId() {
	    	return id;
	    	}
	    
	    
	    public String getPuesto() {
	    	return puesto; 
	    	}
	    
	    
	    public boolean isActive() {
	    	return active;
	    	}
	    
	    
	    public void desactivar() {
	    	this.active = false; 
	    	}
	    
	    public void activar() { 
	    	this.active = true; 
	    	
	    	
	    	}

		
		
}
