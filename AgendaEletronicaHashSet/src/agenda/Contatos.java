package agenda;



public class Contatos implements Comparable<Contatos>{
	private String nome ;
	private int numero;
	private String email;
	
	
	public Contatos (String nome,int  numero,String email){
		this.nome=nome;
		this.numero=numero;
		this.email=email;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
		
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int  compareTo(Contatos c){
		int comparacao = this.nome.compareTo(c.nome);
		return comparacao;

}
}
