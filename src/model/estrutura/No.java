package model.estrutura;

public class No<T> {
	private T elemento;
	private No<T> anterior;
	
	public No(T elemento) {
		this.elemento = elemento;
		this.anterior = null;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public No<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(No<T> anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return this.elemento.toString();
	}
}
