package ejercicio1;

public class Calculadora {

	    public int sumar(int sumando1, int sumando2) {
	        return sumando1 + sumando2;
	    }

	    public int restar(int minuendo, int sustraendo) {
	        return minuendo - sustraendo;
	    }

	    public int multiplicar(int factor1, int factor2) {
	       return factor1 * factor2;
	    }

	    public int dividir(int dividendo, int divisor) {
	    	
	    	try {
	    		
	    		if(divisor == 0) {
	    			throw new Exception("Error: No se puede dividir por cero");
	    		}
	    		else {
	    			int resultado = dividendo / divisor;
	    			return resultado;
	    		}
	    	}
	    	catch(Exception e) {
	    		System.out.println(e.getMessage());
	    	}
			return divisor;
	    }

}
