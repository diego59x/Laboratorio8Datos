/**
___________________________________________________________________________________
| VectorHeap.java																   |
| Fecha de creacion: 17/02/2020													   |
|                                                                                  |
* @author Diego Alvarez #19498                                                     | 
|__________________________________________________________________________________|
*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
			 
		Scanner teclado = new Scanner(System.in);
		VectorHeap<Paciente> pacienteVec = new VectorHeap<Paciente>();
		PriorityQueue<Paciente> pacienteQue = new PriorityQueue<Paciente>();
		VectorHeap<Paciente> paciente = leerPacientes(pacienteVec);
		
		System.out.println("_________________________________\n\t Bienvenido\n\t Elija una opcion\n\t1. Priority Queue \n\t2. VectorHeap \t\n_________________________________ ");
		int op = teclado.nextInt();
		if(op == 1) {
				
				System.out.println("No se porque es cero su tamaño  :/ "+pacienteQue.size());	
			
				while(pacienteQue.size() > 0) {
					
		        	System.out.println(pacienteQue.remove());
		        }
				
		
		}else if(op ==2) {
	       System.out.println("No se porque es cero su tamaño  :/ "+pacienteVec.size());	
				while (pacienteVec.size()>0){
					
	                System.out.println(pacienteVec.remove());
				}
	        
		}else{
			System.out.println("\tEsa opcion no existe!");
		}
	}


public static VectorHeap<Paciente> leerPacientes(VectorHeap<Paciente> pacienteVec){
	//Vector pacienteVec= new Vector();
	try {
	BufferedReader br = new BufferedReader(new FileReader("pacientes.txt"));  //lee el archivo  
    //StringBuilder sb = new StringBuilder();
    String line ="";
    //Vector pacienteVec= new Vector();
    
	while ((line = br.readLine())!= null) {
		String[] datos = line.split(", ");
		String nombre = datos[0];
		String asunto = datos[1];
		String nivel = datos[2];
		//Paciente paciente = new Paciente(nombre,asunto,nivel);
		//System.out.println(paciente);
		pacienteVec.add(new Paciente(nombre,asunto,nivel));
		// Se muestra los agregados
		System.out.println(pacienteVec);
		//System.out.println(pacienteVec.size());
	}
	}
	catch (Exception ex) {
        ex.printStackTrace();
    }
	//Vector pacienteVec;
	return pacienteVec;
	

}
}
