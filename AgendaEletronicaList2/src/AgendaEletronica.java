


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AgendaEletronica {

	List<Contato> contatos = new ArrayList<Contato>();

	public AgendaEletronica(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public void addContato(Contato c) {
		contatos.add(c);

	}

	public boolean removerContatos(Contato c) {
		Iterator<Contato> con = contatos.iterator();
		while (con.hasNext()) {
			Contato conta = con.next();
			if (conta.equals(c)) {
				con.remove();
				return true;
			}
		}
		return false;
	}

	public List<Contato> getListContatos() {
		return this.contatos;
	}

	public void removerContato(String id) {
		Iterator<Contato> con = contatos.iterator();
		while (con.hasNext()) {
			Contato conta = con.next();
			if (conta.getNome().contains(id)) {
				con.remove();
			}

		}
	}

	public List<Contato> listarContatos(String id) {
		List<Contato> conta = new ArrayList<Contato>();
		for (Contato c : contatos) {
			if (c.getNome().contains(id)) {
				conta.add(c);
			}
		}
		return conta;
	}

	public List<Contato> getContato() {
		return this.contatos;
	}

}
