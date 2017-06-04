import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int [] ns=  new  int[1000];
		int sum=0;
		for(int  k =0; k<ns.length;k++){
			ns[k]=sum++;
		}

	
	List<Somador> soma= new ArrayList<Somador> ();
	for (int k=0 ;k<10; k++){
		soma.add(new Somador(ns));
		Somador aux = soma.get(k);
		aux.setInicio(k);
		Thread t1= new Thread (aux);
		t1.start();
	
		
	
	}
	

	
	}
}
