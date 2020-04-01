package clinic.programming.training;

import org.apache.commons.lang3.StringUtils;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
		
		 
    }
    
    public int contarLetras(String palabras){
		String[] separaPalabras=StringUtils.split(palabras," ");
	
	return (separaPalabras==null)?0 : separaPalabras.length;
	}

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	
	int contador=app.contarLetras("Tengo cuatro palabras si.");
    System.out.println("Palabras : "+contador);
	}
}