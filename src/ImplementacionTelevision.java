
import java.util.HashMap;

public class ImplementacionTelevision implements Metodos{

	HashMap<Integer, Television> hash = new HashMap<Integer, Television>();
	
	Television t = null;
	
	@Override
	public void guardar(Object o) {
		// TODO Auto-generated method stub
		t = (Television)o;
		hash.put(t.getClave(), t);
	}

	@Override
	public void editar(Object o) {
		// TODO Auto-generated method stub
		t = (Television) o;
		hash.put(t.getClave(), t);
	}

	@Override
	public void eliminar(Object o) {
		// TODO Auto-generated method stub
		t = (Television)o;
		hash.remove(t.getClave());
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);
	}

	@Override
	public Object buscarNombre(Object o) {
		// TODO Auto-generated method stub
		t = (Television)o;
		return hash.get(t.getClave());
	}

	public void contar() {
		System.out.println("Resultado" +hash.size());
	}
	
}
