package loom.hola_mundo;

/** Returns a String object that can be seen on the screen. 
 * This method always returns a greeting, whether or not the 
 * method receives a name to say hello to.
 * @author Axel
 * @version 1.0
 * @param  persona  a person name to say hello to
 * @return      the greeting to the person
 * @see         Image */
public class HolaMundo {
	/**Metodo para saludar
	 **/
	public String saludar(final String persona) {
		
		if (persona != "") {
			return "¡Hola, " + persona + "!";/*saludo gral*/
		}
		else {
			return "Hola";	/*retorno saludo generico*/
		}
			
	}
}