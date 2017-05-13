package agenda;



import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class AgendaEletronica {
	   Set<Contatos> contatos;

	 public  AgendaEletronica (Set<Contatos> contatos){
		 this.contatos= contatos;
	 }

	 public void addContato( Contatos c){
		contatos.add(c);
	 }
	 public boolean removerContato( Contatos c){
		 Iterator<Contatos>  con = contatos.iterator();
		 while(con.hasNext()){
			 Contatos conta = con.next();
			 if(conta.equals(c)){
			  con.remove();
			  return  true;
			 } 
		 }
		 return false;
	 }


	 public void removerContato(String id){
		 Iterator<Contatos> con = contatos.iterator();
		 while(con.hasNext()){
			 Contatos conta = con.next();
			 if(conta.getNome().contains(id)){
			  con.remove();
			 }

		 }
	}
	 public Set<Contatos>listarContatos(String id){
		 Set<Contatos>conta = new  TreeSet<Contatos>();
		 for(Contatos c : contatos){
			 if( c.getNome().contains(id)){
				 conta.add(c);
			 }
		 }
		 return conta;
	 }
	 public  int getTamanho(){
			return this.contatos.size();
	
}

	
}
