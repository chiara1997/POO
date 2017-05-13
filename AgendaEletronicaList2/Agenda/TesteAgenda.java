import static org.junit.Assert.*;

import org.junit.Test;



import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TesteAgenda{
	@Test
	public void testaddContato() {
		List<Contato> cont = new ArrayList<Contato>();
		AgendaEletronica agenda = new AgendaEletronica(cont);
		Contato co1 = new Contato(" Clara", 991809090, "clara.cecilia");
		agenda.addContato(co1);
		assertEquals(1, agenda.getContato().size());
	}

	@Test
	public void testlistarContato() {
		List<Contato> contatos = new ArrayList<Contato>();
		AgendaEletronica agenda = new AgendaEletronica(contatos);
		Contato co1 = new Contato("Eidson", 991809090, "eidson.cecilia");
		Contato co2 = new Contato("Eidmar", 9999890, "eidmar.love");
		agenda.addContato(co1);
		agenda.addContato(co2);
		agenda.listarContatos("Eidson");
		agenda.listarContatos("Eidmar");
		assertEquals(agenda.contatos.get(0).getNome(), "Eidson");
		assertNotEquals(agenda.contatos.get(0).getNome(), "Eidmilson");
	}

	@Test
	public void testremoverContatos() {
		List<Contato> cont = new ArrayList<Contato>();
		AgendaEletronica agenda = new AgendaEletronica(cont);
		Contato co1 = new Contato(" Clara", 991809090, "clara.cecilia");
		Contato co2 = new Contato(" Pedro", 991857895, "pedro.feliz");
		agenda.addContato(co1);
		agenda.addContato(co2);
		assertTrue(agenda.removerContatos(co1));
		assertTrue(agenda.removerContatos(co2));
		assertEquals(0, agenda.getListContatos().size());
	}

	@Test
	public void testremoverContato() {
		List<Contato> contatos = new ArrayList<Contato>();
		AgendaEletronica agenda = new AgendaEletronica(contatos);
		Contato co1 = new Contato(" Eidson", 991809090, "eidson.cecilia");
		Contato co2 = new Contato("Eidmar", 9999890, "eidmar.love");
		agenda.addContato(co1);
		agenda.addContato(co2);
		agenda.removerContato("Eidson");
		assertEquals(1, agenda.getListContatos().size());
	}

	@Test
	public void testEquals() {
		Contato cont = new Contato("Clara", 99988989, "clara.cecilia");
		Contato cont2 = new Contato("Pedro", 99899999, "pedro.feliz");
		assertTrue(cont.equals(cont));
		assertNotEquals(cont, cont2);

	}

}
