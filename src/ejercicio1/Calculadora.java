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

	    public int dividir(int a, int b) {
	    	
	        if (b == 0) {
	            // TODO division por cero. ¿LANZAR EXCEPCION?
	            return 0;
	        } 
	        else {
	            int resultado = a / b;
	            return resultado;
	        }
	    }
}

