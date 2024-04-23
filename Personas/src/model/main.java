package model;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Persona p4=new Persona("a","b",-1);
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());    
		}

	}

}
