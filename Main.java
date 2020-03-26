

/**
 *
 * @author Diego Alvarez
 */
import java.util.*;
import java.io.*; 
public class Main {    
    public static void main(String[] args) {
    PriorityQueue<String> pQueue = new PriorityQueue<String>();
    ArrayList<String> info = new ArrayList<String>();
    // Se agregan las palabras del diccionario
    //Se lee el archivo
    File f = new File("pacientes.txt"); 
    BufferedReader entrada;
    try 
    {
        entrada = new BufferedReader(new FileReader(f));
        while(entrada.ready())
        {
            info.add(entrada.readLine());
        }
    }catch (IOException e)
    {
        e.printStackTrace();
    }
    for(int i = 0; i < info.size(); i++){
        System.out.println(info.get(i));
    }
    /*
    // Add tambien sirve
    pQueue.add("Diego");
    pQueue.add("Andrea");
    pQueue.add("Brandon");
    pQueue.add("Martin");
    pQueue.add("Alejandra");
    pQueue.add("Mario");
    pQueue.add("Pedro");
    pQueue.add("Jhon");
 
    
    
    System.out.println("Head :: " + pQueue.peek());
    System.out.println("Head :: " + pQueue.element() + "\n");
    
    while(!pQueue.isEmpty()){
        System.out.println(pQueue.poll() + " ");
    }
    System.out.println("\n");
    pQueue.add("Diego");
    pQueue.offer("Andrea");
    pQueue.add("Brandon");
    pQueue.offer("Martin");
    pQueue.add("Alejandra");
    pQueue.offer("Mario");
    pQueue.add("Pedro");
    pQueue.offer("Jhon");
    while(!pQueue.isEmpty()){
        System.out.println(pQueue);
        System.out.println("Removed :: " + pQueue.remove());
        System.out.println(pQueue);
        System.out.println();
    }
    System.out.println();
    
    */
    }
}
