/**
___________________________________________________________________________________
| VectorHeap.java																   |
| Fecha de creacion: 17/02/2020													   |
|                                                                                  |
* @author Diego Alvarez #19498                                                     | 
|__________________________________________________________________________________|
*/
public class Paciente implements Comparable<Paciente> {
	
	private String nombre;
	private String asunto;
	private String nivel;

	public Paciente(String nombre, String asunto, String nivel) {
		this.nombre = nombre;
		this.asunto = asunto;
		this.nivel = nivel;
	}
	/**
	 * @return nombre
	 */
	public String getName() {
		return nombre;
	}
	/**
	 * @param nombre set nombre
	 */
	public void setName(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return retorna el asunto
	 */
	public String getSick() {
		return asunto;
	}
	/**
	 * @param asunto set asunto
	 */
	public void setSick(String asunto) {
		this.asunto = asunto;
	}
	/**
	 * @return el nivel
	 */
	public String getCode() {
		return nivel;
	}
	/**
	 * @param nivel set nvel
	 */
	public void setCode(String nivel) {
		this.nivel = nivel;
	}
	
	// Hace que se vea bonito
	public String toString() {
		return   nombre + ", " + asunto + ", " + nivel;
	}
	
	// Comparable
	@Override
	public int compareTo(Paciente arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

