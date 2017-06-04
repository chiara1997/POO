
public class Questao  implements Runnable{
	private int  num1;
	private int  nume2;
	
	public Questao( int n1,int n2){
		this.num1=n1;
		this.nume2=n2;
		
	}
	@Override
	public void run() {
		for( int k = num1 ;k<=nume2;k++){
			if(numeroPrimo(k)){
				System.out.println(k);
				
			}
		}
	}
	  public boolean numeroPrimo( int n){
		  int contador=0;
		  for(int i=1; i<=n;i++){
			  if(n%i==0){
				  contador++; 
			  }
		  }
		  if(contador==2){
			  return true;
		  }
		  return false;
	  }
	  

}