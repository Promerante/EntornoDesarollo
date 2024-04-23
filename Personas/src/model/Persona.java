package model;

public class Persona {
	String nombre,apellidos;
	int edad;
	
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		if(edad<0||edad >=130) {
			throw new IllegalArgumentException("La edad no es valida");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public  String mostrarEdad() {
		String msg="";
		
		if(edad<18) {
			msg="Menor de edad";	
		}
		else if(edad>=18 &&edad<=65) {
			msg="Mayor de edad";
		}
		else {
			msg="Jubilado";
		}
		return msg;
			
	}
	
	

}
