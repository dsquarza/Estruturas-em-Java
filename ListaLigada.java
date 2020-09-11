public class ListaLigada{
	private No primeiro;
	
	public ListaLigada(){
		primeiro = null;
	}
	
	public No getPrimeiro(){return primeiro;}
	public void setPrimeiro(No primeiro){this.primeiro = primeiro;}
	
	public String toString() {
		String msg = "Lista: ";
		if (this.vazia()){
			msg += "vazia.";
		}
		else{
			No aux = this.primeiro;
			while (aux != null){
				msg += aux;
				aux = aux.getProx();
			}
		}
		return msg;
	}
	public boolean vazia(){
		if (this.primeiro == null){
			return true;
		}
		return false;
	}
	public void insereInicio(int i){
		No novo = new No(i);
		if (!this.vazia()){
			novo.setProx(this.primeiro);
		}
		this.primeiro = novo;
	}
	public int removeInicio(Integer i){
		if (this.vazia()){
			return false;
		}
		i= new Integer(this.primeiro.getInfo());
		this.primeiro = this.primeiro.getProx();
		return true;
	}
}