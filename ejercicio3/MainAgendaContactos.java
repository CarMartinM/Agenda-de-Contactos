/*
 * Ejercicio 3. Crea una agenda de contactos con las funcionalidades de leer, añadir y borrar
 * contactos haciendo uso de un ArrayList de tipo Contacto (se debe crear dicha clase con
 * los atributos necesarios) para almacenar los contactos de dicha agenda. Constará de un
 * menú en la función main que llamará a las funciones correspondientes para cada acción.
 * Dicho menú deberá mostrarse indefinidamente una vez realizada cada acción, pudiendo
 * salir del programa cuando se introduzca el valor ‘s’ (el programa únicamente lo tendrá en
 * cuenta si el carácter se ha Stringroducido en minúsculas, en caso contrario o si la opción del
 * menú Stringroducida no existe, deberá indicar que la opción no es válida, informando de ello
 * al usuario, volviendo a solicitar la introducción de una opción válida de manera
 * indefinida).
 */

package dam2.inicial.ejercicio3;

import java.util.Scanner;
import java.util.ArrayList;

public class MainAgendaContactos
{
// Función para borrar un contacto de la lista.
	
	public static void borrarContacto (ArrayList <Contacto> listaContactosPrm)
	{
		Scanner scan = new Scanner (System.in);
		
		//Buscamos el contacto en la agenda a través de su teléfono
		
		long telefono = 0;
		boolean telefonoEncontrado = false;
		
		System.out.println("Introduzca el número de teléfono del contacto que quiere eliminar de la agenda");
		
		telefono = scan.nextLong();
		
		for (int i=0; i<listaContactosPrm.size(); i++)
		{
			if (telefono == listaContactosPrm.get(i).getTelefono())
			{
				telefonoEncontrado = true;
				listaContactosPrm.remove(i);
				System.out.println("El contacto con el número de teléfono " + telefono + " ha sido eliminado de la lista");
			}
		}
		
		if (telefonoEncontrado == false)
		{
			System.out.println("Contacto no encontrado");
		}
		
	}
	
// Función para agregar un contacto a la lista.
	
	public static Contacto agregarContacto (Contacto contactoAuxiliarPrm , ArrayList <Contacto> listaContactosPrm)
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduzca un nombre");
		String nombre = scan.nextLine();
		contactoAuxiliarPrm.setNombre(nombre);
		
		System.out.println("Introduzca un primer apellido");
		String apellido1 = scan.nextLine();
		contactoAuxiliarPrm.setApellido1(apellido1);
		
		System.out.println("Introduzca un segundo apellido");
		String apellido2 = scan.nextLine();
		contactoAuxiliarPrm.setApellido2(apellido2);
		
		System.out.println("Introduzca la edad");
		int edad = scan.nextInt();
		contactoAuxiliarPrm.setEdad(edad);
		
		System.out.println("Introduzca el telefono");
		long telefono = scan.nextLong();
		contactoAuxiliarPrm.setTelefono(telefono);
		
		scan.nextLine();// Colocamos esta línea para evitar el error de los nextLines.
		
		System.out.println("Introduzca el email");
		String email = scan.nextLine();
		contactoAuxiliarPrm.setEmail(email);
		
		listaContactosPrm.add(contactoAuxiliarPrm);
		
		System.out.println("Contacto añadido");
		
		return contactoAuxiliarPrm;
	}
	
//Función que muestra los contactos existentes en la agenda.
	
	public static void leerAgenda (ArrayList<Contacto>listaContactosPrm)
	{
		if (listaContactosPrm.size()== 0)
		{
			System.out.println("La agenda está vacía");
		}
		for (int i =0; i<listaContactosPrm.size(); i++)
		{
			System.out.println(listaContactosPrm.get(i).toString());
		}
	}
	
//Funcion que nos muestra el menú.
	
	public static String menu ()
	{
		Scanner scan = new Scanner (System.in);
		
		String opcionMenu = "";
		
		do
		{
			System.out.println("-------- MENÚ --------");
			System.out.println("a. Leer agenda de contactos");
			System.out.println("b. Agregar contactos a la agenda");
			System.out.println("c. Borrar contactos de la agenda");
			System.out.println("s. Salir del programa");
			
			System.out.println("Escoja una opcion");
			
			opcionMenu = scan.nextLine();
			
			if ((!(opcionMenu.equals("a"))) && (!(opcionMenu.equals("b"))) && (!(opcionMenu.equals("c"))) && (!(opcionMenu.equals("s"))))
			{
				System.out.println("La opción no es válida");
			}
		}
		while(!(opcionMenu.equals("s")) &&(!(opcionMenu.equals("a"))) && (!(opcionMenu.equals("b"))) && (!(opcionMenu.equals("c"))));
		
		if(opcionMenu.equals("s"))
		{
			System.out.println("Ha salido del programa");
			System.exit(0);
		}
		return opcionMenu;
	}

// Función principal del programa.
	
	public static void main(String[] args) 
	{
		ArrayList <Contacto> listaContactos = new ArrayList <Contacto> ();
		
		String opcion = "";
		
		do
		{
			opcion = menu();
			
			if (opcion.equals("a"))
			{
				leerAgenda (listaContactos);
			}
			else if (opcion.equals("b"))
			{
				Contacto contactoAuxiliar = new Contacto ();
				agregarContacto (contactoAuxiliar,listaContactos);
			}
			else if (opcion.equals("c"))
			{
				borrarContacto (listaContactos);
			}
		}
		while (!(opcion.equals("s")));	
	}

}
