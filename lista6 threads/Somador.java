
public class Somador  implements Runnable{
	private  int  inicio;
	 private int soma;
	 private int  numeroSomador[] ;
	 
	 public Somador( int [] ns){
		 this.numeroSomador=ns;
		 this.soma=0;
	 }
	@Override
	public void run() {
		for( int k=0;k<inicio;k++){
			soma+= numeroSomador[inicio];
		}
		System.out.println(soma);
		
	}
	
	public int getSoma() {
		return soma;
	}
	public void setSoma(int soma) {
		this.soma = soma;
	}
	public int[] getNumeroSomador() {
		return numeroSomador;
	}
	public void setNumeroSomador(int numeroSomador[]) {
		this.numeroSomador = numeroSomador;
	}
	public int getInicio() {
		return inicio;
	}
	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

}
