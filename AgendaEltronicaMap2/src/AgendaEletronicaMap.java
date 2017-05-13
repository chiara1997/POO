import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AgendaEletronicaMap {
	private Map<String,Contato> mapa;

	
	public AgendaEletronicaMap(Map<String,Contato> mapa){
		this.setMapa(mapa);
		
	}
	public Map<String,Contato> getMapa() {
		return mapa;
	}
	public void setMapa(Map<String,Contato> mapa) {
		this.mapa = mapa;
	}
	public void addContato(String  n,Contato c){
		mapa.put(n,c);
	}
	public boolean removerContato(Contato c){
		mapa.remove(c);
		return mapa.containsValue(c);
	}
	
	public void removerContatos(String  id ){
		Iterator i = mapa.entrySet().iterator();
		while(i.hasNext()){
			Entry <String,Contato>con= (Entry<String, Contato>) i.next();	
			String nome = (String)  con.getKey();
			if(nome.contains(id)){
				i.remove();
			}
			
		}
	}
	public List<Contato>listarContato(String id){
		List<Contato> lista = new ArrayList<Contato>();
		Iterator i = mapa.entrySet().iterator();
		while(i.hasNext()){
			Entry <String,Contato>con= (Entry<String,Contato>) i.next();	
			String nome = (String)  con.getKey();
			Contato c =  (Contato) con.getValue();
			if(nome.contains(id)){
				lista.add(c);
			}
			 
			}
		return lista;
	}
	public int geListContato(){
		return mapa.size();
	}
}
