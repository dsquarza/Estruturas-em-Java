
public class ListaDupla {
	private NoDuplo prim;
	
	public ListaDupla () {
		prim = null;
	}
	public NoDuplo getPrim() {
		return prim;
	}
	public void setPrim(NoDuplo prim) {
		this.prim = prim;
	}

	public boolean listaDuplaVazia(){
		return this.prim == null;
	}
	public void insereInicioDupla (int i){
		NoDuplo novo = new NoDuplo(i);
		if (!listaDuplaVazia()){
			novo.setProx(prim);
			novo.setAnt(prim.getAnt());
			novo.getProx().setAnt(novo);
			novo.getAnt().setProx(novo);
		}	
		prim = novo;
	}
	
	public void insereFimDuplo(int i){
		insereInicioDupla(i);
		prim = prim.getProx();
	}
	
	
	
	public int RemoveInicioDupla () {
		int i = prim.getInfo();
		if (prim.getProx() == prim.getAnt()){
			prim = null;
		}
		else{
			prim.getProx().setAnt(prim.getAnt());
			prim.getAnt().setProx(prim.getProx());
			prim = prim.getProx();
		}
		return i;
	}
	
	public int RemoveFimDupla () {
		prim = prim.getAnt();
		return RemoveInicioDupla();
	}
	
	int removeKesimo (NoDuplo atual, int k) {
		NoDuplo aux = atual;
		for (int i = 0; i<k ; i++){
			aux = aux.getProx();
		}
		aux.getAnt().setProx(aux.getProx());
		aux.getProx().setAnt(aux.getAnt());
		return aux.getInfo();
	}
	
	@Override
	public String toString () {
		NoDuplo aux = prim;
		String s = "";
		if (listaDuplaVazia()) {
			s = "Lista dupla vazia.";
		}
		else {
			do {
				s += aux + "";
				aux = aux.getProx();
			} while (aux != prim);
		}
		return s;
	}
}
