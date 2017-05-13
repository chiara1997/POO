import java.util.ArrayList;
import java.util.List;

public class Dicionario<K , V> {

	private List <K> chave;
	private  List<V> valor;

	public Dicionario(){
		chave= new ArrayList<K>();
		valor=new ArrayList<V>();
		
	}

	public List<V> getValor() {
		return valor;
	}

	public List <K> getChave() {
		return chave;
	}

	public void addTudo(K c, V v){
		chave.add(c);
		valor.add(v);
		
	}
	public V getVAlor(K chaves){
		for(int k=0; k<chave.size();k++){
			if(chaves==chave.get(k)){
				return valor.get(k);
				
			}
		}
		return null;
	}
	public int getElementos(){
		return  valor.size();
		
	}

		
	}

