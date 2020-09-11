public class No{
	private int info;
	private No prox;
	
	public No(int info){
		this.info = info;
		this.prox = null;
	}
	
	public getInfo(){return info;}
	public getProx(){return prox;}
	public setInfo(int info){this.info = info;}
	public setProx(No prox){this.prox = prox;}
	
	public String toString(){
		return info + " ";
	}
}