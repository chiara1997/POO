
public class Para<T1,T2> {
	private T1 t1;
	private T2 t2;
	
	public Para(T1 t1 , T2 t2){
		this.t1=t1;
		this.t2=t2;
	}	
	
	public T1 getT1(){
		return this.t1;
	}
	public T2 getT2(){
		return this.t2;
	}
	public String toString(){
		return "T1"+ getT1() + "T2"+getT2();
	}
}
