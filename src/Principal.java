import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Implementacion imp = new Implementacion();
		Serie sS = new Serie("El ultimo baile","Documental","Netflix",6);
		Serie sM = new Serie("Mr. Robot","Ficción","HBO",100);
		Serie sG = new Serie("Los guapos","Comedia","Blim",40);
		Serie sC = null;
		
		//guardar
		imp.guardar(sS);
		imp.guardar(sM);
		imp.guardar(sG);
		
		//mostrar
		imp.mostrar();
		
		
		//Buscar
		//sC = new Serie();
		//sC.setNombre("Los guapos");
		
		sC = new Serie("Los guapos");
		sC = (Serie) imp.buscarNombre(sC);
		System.out.println("La serie encontrada fue");
		System.out.println(sC);
		
		//Editar
		sC.setCapitulos(1000);
		imp.editar(sC);
		imp.mostrar();
		
		//Eliminar
		sC = new Serie("Mr. Robot");
		imp.eliminar(sC);
		imp.mostrar();
		*/
		
		ImplementacionTelevision imp = new ImplementacionTelevision();
		
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		Television t = null;
		do {
			System.out.println("Menú");
			System.out.println("1.- Alta");
			System.out.println("2.- Editar");
			System.out.println("3.- Eliminar");
			System.out.println("4.- Buscar");
			System.out.println("5.- Contar");
			System.out.println("6.- Mostrar");
			System.out.println("7.- Salir");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1: {
				System.out.println("Ingrese clave de la television");
				int clave = entrada.nextInt();
				System.out.println("Ingrese modelo");
				String modelo = entrada.next();
				System.out.println("Ingrese marca");
				String marca = entrada.next();
				System.out.println("Ingrese precio");
				double precio = entrada.nextDouble();
				System.out.println("Ingrese pulgadas");
				double pulgadas = entrada.nextDouble();

				t = new Television(clave, modelo,marca,precio,pulgadas);
				imp.guardar(t);
								
				}
				break;
			case 2: {
				System.out.println("que gustaria editar");
				System.out.println("1.- Modelo");
				System.out.println("2.- Marca");
				int opcion2 = entrada.nextInt();
				if (opcion2==1) {
					System.out.println("Ingrese clave de televisión a editar");
					int clave = entrada.nextInt();
					t.setClave(clave);
					Television teleEditar =(Television) imp.buscarNombre(t);
					System.out.println("Ingrese Modelo");
					String modelo = entrada.next();
					teleEditar.setModelo(modelo);
					imp.editar(teleEditar);
					System.out.println("Television Editada");
				}
				if (opcion2==2) {
					System.out.println("Ingrese clave de televisión a editar");
					int clave = entrada.nextInt();
					t.setClave(clave);
					Television teleEditar =(Television) imp.buscarNombre(t);
					System.out.println("Ingrese Marca");
					String marca = entrada.next();
					teleEditar.setMarca(marca);
					imp.editar(teleEditar);
					System.out.println("Television Editada");
				}
			}
				break;
			case 3: {
				System.out.println("Ingrese clave de televisión a eliminar");
				int clave = entrada.nextInt();
				t.setClave(clave);
				Television teleEliminar =(Television) imp.buscarNombre(t);
				imp.eliminar(teleEliminar);

			}
				break;
			case 4: {
				System.out.println("Ingrese clave de televisión a eliminar");
				int clave = entrada.nextInt();
				t.setClave(clave);
				Television teleBuscar =(Television) imp.buscarNombre(t);
				System.out.println(teleBuscar);
			}
				break;
			case 5: {
				System.out.println("Conteo");
				imp.contar();
			}
				break;
			case 6: {
				System.out.println("Todos los elementos");
				imp.mostrar();
			}
			case 7:{}
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}

		} while (opcion != 7);
		
		
	}

}
