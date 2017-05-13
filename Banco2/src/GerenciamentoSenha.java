
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class GerenciamentoSenha {

	private Queue<Senha> senhas;
	
	public GerenciamentoSenha (boolean prioridadePorIdade){
		if(prioridadePorIdade == true){
			senhas = new PriorityQueue<Senha>();
		
		}else{
			senhas = new LinkedList<Senha>();
	}
	}
	public  Senha emitirSenha(String  nome, int idade ,String cpf){
		Senha senha = new  Senha(nome, idade , cpf);
		 senhas.offer(senha);
		 return senha;
	}
	public Senha  proximaSenha(){
		return senhas.poll();
	}
}
