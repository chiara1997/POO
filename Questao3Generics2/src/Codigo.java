
public class Codigo<C1,C2> {
	private C1 p1;
	private C2 p2;
	
	
	public Codigo ( C1 p ,C2 p2){
		this.p1=p;
		this.p2=p2;
	}
	public C1 getP1() {
		return p1;
	}
	public void setP1(C1 p1) {
		this.p1 = p1;
	}
	public C2 getP2() {
		return p2;
	}
	public void setP2(C2 p2) {
		this.p2 = p2;
	}

}
