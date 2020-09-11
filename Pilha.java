public class Pilha{
	//atributos
	private int topo;
	private int v[];
	//construtor
	public Pilha(int capacidade){
		v = new int[capacidade];
		topo = 0;
	}
	//metodos de acesso e modificadores nao tem aplicação
	//metodos modificadores
	public void setTopo(int novoTopo){
		topo = novoTopo;
	}
	//metodos especificos
	public boolean estaVazia(){
		return topo==0;
	}
	public boolean estaCheia(){
		return topo==v.length;
	}
	public void push (int i){
		v[topo++] = i;
	}
	public int pop (){
		return v[--topo];
	}
	public int consultaTopo(){
		return v[topo-1];
	}
	public int tamanhoPilha(){
		return topo;
	}
	public String toString(){
		String s = "";
		if(estaVazia()){
			s+= "pilha esta vazia";
		}
		else{
			for(int i=topo-1; i>=0; i--){
				s+= v[i] + "\n";
			}
		}
		return s;
	}
}