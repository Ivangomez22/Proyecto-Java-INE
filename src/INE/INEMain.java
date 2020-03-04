package INE;

import java.util.List;
import java.util.Scanner;


import INE.DBINE;
import INE.INEPersona;

public class INEMain 
{
	public static void main(String[] args) 
	{
		DBINE d = new DBINE();
		INEPersona p = new INEPersona();
		Scanner datos = new Scanner(System.in);

		do {

			System.out.println("\nINSTITUTO NACIONAL ELECTRORAL\n" + " \nCREDENCIAL PARA VOTAR \n\nMenu de seleccion\n" +
			"1.- Crear cuenta " + 
			"\n2.- Mostrar una Persona" + 
			"\n3.-Mostrar todas las personas ");
			
			
			int ans = datos.nextInt();

			if (ans == 1) {
				//Inicio de creacion
				
				System.out.println("Nombre:");
				p.setNPersona(datos.next());
				System.out.println("Apellido Paterno:");
				p.setAPPersona(datos.next());
				System.out.println("Apellido Materno:");
				p.setAMPersona(datos.next());
				System.out.println("Domicilio:");
				p.setDomicilio(datos.next());
				System.out.println("Clave Elector");
				p.setCElector(datos.next());
				System.out.println("CURP");
				p.setCURP(datos.next());
				System.out.println("Sexo");
				p.setSexo(datos.next());
				System.out.println("Estado");
				p.setEstado(datos.nextInt());
				System.out.println("Localidad");
				p.setLocalidad(datos.nextInt());
				System.out.println("Municipio");
				p.setMunicipio(datos.nextInt());
				System.out.println("Emision");
				p.setEmision(datos.nextInt());
				System.out.println("Seccion");
				p.setSeccion(datos.nextInt());
				System.out.println("Vigencia");
				p.setVigencia(datos.nextInt());
				System.out.println("Año de registro");
				p.setARegistro(datos.nextInt());
				System.out.println("Fecha de nacimiento");
				p.setFNacimiento(datos.nextInt());
				d.insertarRegistro(p);
				System.out.println(p);
			} 
			else if (ans == 2) 
			{
				// Mostrar persona
				System.out.println("CURP");
				p.setCURP(datos.next());
				p = d.seleccionarPersona(p);
				System.out.println(p);
			} 
			
			else 
			{
				// Mostrar todas las personas 
				List<INEPersona> lp = d.seleccionarPersonas();
				for (INEPersona persona : lp) 
				{
					System.out.println(persona);
				}
			}

		} // do

		while (true);
	}
}
