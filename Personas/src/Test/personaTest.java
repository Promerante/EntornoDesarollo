package Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import model.Persona;


public class personaTest {
	
	@Test
	void menorEdad() {
		String esperada="Menor de edad";		
		Persona p2=new Persona("A","B",0);
		String obtenida=p2.mostrarEdad();
		assertEquals(esperada,obtenida);		
	}
	
	@Test
	void mayorEdad() {
		String esperada="Mayor de edad";		
		Persona p2=new Persona("A","B",18);
		String obtenida=p2.mostrarEdad();
		assertEquals(esperada,obtenida);	
	}
	@Test
	void jubilada() {
		String esperada="Jubilado";		
		Persona p2=new Persona("A","B",66);
		String obtenida=p2.mostrarEdad();
		assertEquals(esperada,obtenida);	
	}
	
	@Test
	void edadLimMin() {
		Persona pe=new Persona("TEXTO","EJEMPLO",-1);
		Exception exception=assertThrows(IllegalArgumentException.class,() -> pe.getEdad());
		String esperado="La edad no es valida";
		String obtenida=exception.getMessage();
		assertEquals(esperado,obtenida);
	}

	@Test
	void edadLimMax() {
		Persona pe=new Persona("TEXTO","EJEMPLO",130);
		Exception exception=assertThrows(IllegalArgumentException.class,() -> pe.getEdad());
		String esperado="La edad no es valida";
		String obtenida=exception.getMessage();
		assertEquals(esperado,obtenida);
	}
	
	
	

}
