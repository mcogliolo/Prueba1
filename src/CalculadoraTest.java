import org.junit.Assert;
import org.junit.Test;


public class CalculadoraTest {
	
	@Test
	public void sumaTest(){
		
		Calculadora calculadoraFea = new Calculadora(); 
		int resultadoSuma = calculadoraFea.sumar(3, 6);
	
		int resEspSuma = 9;
	
		Assert.assertEquals("Comoooooooooooooooo", resEspSuma, resultadoSuma);
	}
	@Test
	public void restaTest(){
		
		Calculadora calculadoraFea = new Calculadora(); 
		int resultadoResta = calculadoraFea.restar(9, 6);
	
		int resEspResta = 3;
	
		Assert.assertEquals("Comoooooooooooooooo", resEspResta, resultadoResta);
		
	}
	@Test
	public void multiTest(){
		
		Calculadora calculadoraFea = new Calculadora(); 
		int resultadoMulti = calculadoraFea.multi(3, 2);
	
		int resEspMulti = 6;
	
		Assert.assertEquals("Comoooooooooooooooo", resEspMulti, resultadoMulti);
		
	}
	
	
	@Test
	public void divTest(){
		
		Calculadora calculadoraFea = new Calculadora();
		Double resultadoDiv = calculadoraFea.div(3.0,0.0);
		
		Double resEspDiv = 1.5;
		
		Assert.assertEquals("El resto obtenido es: " + resultadoDiv, resEspDiv, resultadoDiv);
		
	}
	
	
	
}
