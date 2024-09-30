package model.estrutura;

public class Pilha<T> {
	private No<T> ultimo = null;
	
	public void push(T elemento) {
		No<T> novo = new No<>(elemento);
		if(this.ultimo != null) {
			novo.setAnterior(this.ultimo);
		}
		this.ultimo = novo;
	}
	
	public T pop() {
		if(this.ultimo == null)
			return null;

		No<T> retorno = this.ultimo;
		this.ultimo = retorno.getAnterior();
		return retorno.getElemento();
	}
	
	public int getSize() {
		if(this.ultimo == null)
			return 0;
		
		No<T> buffer = this.ultimo;
		int i = 1;
		while(buffer.getAnterior() != null) {
			++i;
			buffer = buffer.getAnterior();
		}
		
		return i;
	}
	
	@Override
	public String toString() {
		if(this.ultimo == null)
			return "[]";
		
		StringBuilder builder = new StringBuilder("[");
		No<T> buffer = this.ultimo;
		builder.append(buffer);
		
		while(buffer.getAnterior() != null) {
			builder.append(",");
			buffer = buffer.getAnterior();
			builder.append(buffer);
		}
		builder.append("]");
		
		return builder.toString();
	}
}
