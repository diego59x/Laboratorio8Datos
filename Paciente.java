public class Paciente<K> implements ComparableI<K>
{
	// Compara la informacion del paciente 
    public int compareTo(String raiz ,String nuevo)
    {
        return raiz.compareTo(nuevo);
    }

}