package libro.cap09;

public class Nodo<T>{
	
	// Atributo
	private T info;
	private Nodo<T> ref;
	
	// Getters and Setters
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	public Nodo<T> getRef() {
		return ref;
	}
	public void setRef(Nodo<T> ref) {
		this.ref = ref;
	}

}
