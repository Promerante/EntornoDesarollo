package Test;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import Algoritmos.Algoritmos;



public class AlgortimosTest {
	
	@Test
	void sumatorio() {
		int sumaEsperada=10;
		int sumaObtenida=Algoritmos.sumatorio(4);
		assertEquals(sumaEsperada,sumaObtenida);	
	}
	
	@Test
	void sumatorioParamIncorrecto() {
		Exception excepcion=assertThrows(IllegalArgumentException.class,() ->Algoritmos.sumatorio(-1));
		String esperado= "El numero debe ser mayor a 0";
		String obtenido=excepcion.getMessage();
		assertEquals(esperado,obtenido);
		
	}

}
