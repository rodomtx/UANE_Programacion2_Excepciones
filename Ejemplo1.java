
public class Ejemplo1 {

	public static void main (String [] args){
		double x = 15.0;
		double y = 0.0;
		/* se generan dos variables dobles para ejemplificar la excepcion y uso
		* el metodo division real 
		 */
		
		try{
	/*
	 * inicia el bloque try donde intentara ejecutar el metodo division_real
	 * si los numeros fueran validos para la operacion solo imprimiria
	 * el resultado con el texto enmarcandolo
	 * 
	 */
			System.out.println ("El resultado de la division entera de " + x +
		 " entre " + y + " es " + division_real (x, y));
		}
		catch (Exception mi_excepcion){
		/*
		 * aunado al bloque try esta el bloque catch
		 * que "Atrapara" la excepcion lanzada por el metodo division_real
		 * en el bloque try y le dara un tratamiento , en este caso avisando
		 * que se intento realizar la division por 0 e imprimiendo el toString de
		 * la excepcion
		 */
			System.out.println ("Has intentado dividir por 0.0;");
		 System.out.println ("El objeto excepcion lanzado: " +
		mi_excepcion.toString());
		}
		}
	

	public static double division_real (double dividendo, double divisor) throws Exception{
	/* definicion del metofo divicion real donde se especifica
	 * que el metodo puede lanzar una excepcion
	 */
	double aux;
	if (divisor != 0){
	 aux = dividendo/divisor;
	/*
	 * en el bloque if se asegura que el valolor del parametri divisor no se igual a cero,
	 * si esta condicions se cumple , realiza la operacion y regresa el valor en aux
	 */
	}
	else {
		/*
		 * en caso contrario lanza una instancia del objeto Exception
		 * para que indicar que se presento una exepcion
		 */
	 throw new Exception();
	}
	return aux;
	} 
	
}
