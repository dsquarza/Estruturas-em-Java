public class Fila{
	private int prim = 0, ult = 0, cont = 0;
	private int v[];
	
	//construtor
	public Fila(int capacidade){
		v = new int[capacidade];
	}
	
	//modificadores
	public boolean filaVazia(){
		return cont == 0;
	}
	
	public boolean filaCheia(){
		return cont == v.length;
	}
	
	int proxima(int pos){
		return (pos + 1) % v.length;
	}
	
	public void insereFila(int i){
		v[ult] = i;
		ult = proxima(ult);
		cont++;
	}
	
	public int removeFila(){
		int sai = v[prim];
		prim = proxima(prim);
		cont--;
		return sai;
	}
	
	public boolean insereComTeste(int i){
		if (filaCheia())
			return false;
		v[ult] = i;
		ult = proxima(ult);
		cont++;
		return true;
	}
		
	public boolean removeComTeste(Integer i){
		if (filaVazia())
			return false;
		i = new Integer(v[prim]);
		prim = proxima(prim);
		cont--;
		return true
	}
		
	public String toString() {
		String s = "";
		if (filaVazia())
			s = "Fila vazia";
		else {
			int i = prim;
			do {
				s = s + v[i] + " ";
				i = proxima(i);
			}while (i != ult);
		}
		s = s + "\n";
		return s;
	}
}