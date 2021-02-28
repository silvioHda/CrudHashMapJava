import java.util.HashMap;

public class Implementacion implements Metodos{

	HashMap<String, Serie> hash = new HashMap<String, Serie>();
	
	Serie s = null;
	
	@Override
	public void guardar(Object o) {
		// TODO Auto-generated method stub
		s = (Serie) o;
		hash.put(s.getNombre(), s);
	}

	@Override
	public void editar(Object o) {
		// TODO Auto-generated method stub
		s = (Serie) o;
		hash.put(s.getNombre(), s);
	}

	@Override
	public void eliminar(Object o) {
		// TODO Auto-generated method stub
		s = (Serie) o;
		hash.remove(s.getNombre());
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);
	}

	@Override
	public Object buscarNombre(Object o) {
		// TODO Auto-generated method stub
		s = (Serie) o;
		return hash.get(s.getNombre());
	}

}
