/*
 * Ejercicio 3. Crea una agenda de contactos con las funcionalidades de leer, añadir y borrar
 * contactos haciendo uso de un ArrayList de tipo Contacto (se debe crear dicha clase con
 * los atributos necesarios) para almacenar los contactos de dicha agenda. Constará de un
 * menú en la función main que llamará a las funciones correspondientes para cada acción.
 * Dicho menú deberá mostrarse indefinidamente una vez realizada cada acción, pudiendo
 * salir del programa cuando se introduzca el valor ‘s’ (el programa únicamente lo tendrá en
 * cuenta si el carácter se ha introducido en minúsculas, en caso contrario o si la opción del
 * menú Stringroducida no existe, deberá indicar que la opción no es válida, informando de ello
 * al usuario, volviendo a solicitar la Stringroducción de una opción válida de manera
 * indefinida).
 */

package dam2.inicial.ejercicio3;

public class Contacto 
{
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	private long telefono;
	private String email;
	
	// Constructor por defecto
	public Contacto ()
	{
		this.nombre = "";
		this.apellido1 = "";
		this.apellido2 = "";
		this.edad = 0;
		this.telefono = 0;
		this.email = "";
	}
	
	public Contacto(String nombre, String apellido1, String apellido2, int edad, long telefono ,String email)
	{
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.telefono = telefono;
		this.email = email;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public void setApellido1(String apellido1) 
	{
		this.apellido1 = apellido1;
	}

	public void setApellido2(String apellido2) 
	{
		this.apellido2 = apellido2;
	}

	public void setEdad(int edad) 
	{
		this.edad = edad;
	}

	public long getTelefono() 
	{
		return telefono;
	}

	public void setTelefono(long telefono) 
	{
		this.telefono = telefono;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	@Override
	public String toString() 
	{
		return "Contacto [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad
				+ ", telefono=" + telefono + ", email=" + email + "]";
	}
	
	

}
