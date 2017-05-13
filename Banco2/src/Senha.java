
public class Senha  implements Comparable<Senha> {
	private String nome ;
	private int idade;
	private String cpf;
	
	public Senha (String nome ,int idade ,String  cpf){
		this.nome=nome;
		this.idade=idade;
		this.cpf=cpf;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public int compareTo(Senha senha) {
		 return Integer.compare(idade, senha.getIdade());
	}
	
	
	public boolean  equals(Object s){
		Senha senha = (Senha)s;
		if( senha==null){
			return false ;
		}else if( this.nome.equals(senha.getNome())&& this.idade== senha.getIdade()&& this.cpf.equals(senha.getCpf())){
			return true;
		}
		return false;
	}
	

}
