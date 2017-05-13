import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class AgendaTeste {

	@Test
	public void testAddContato() {
		Contato co1 = new Contato(991809090, "eidson.cecilia");
		Contato co2 = new Contato(9999890, "eidmar.love");
		Map<String, Contato> con = new HashMap<String, Contato>();
		AgendaEletronicaMap agenda = new AgendaEletronicaMap(con);
		agenda.addContato("Eidson", co1);
		agenda.addContato("Eidmar", co2);
		assertEquals(2, agenda.geListContato());
	}

	@Test
	public void testremoverContato() {
		Contato co1 = new Contato(991809090, "eidson.cecilia");
		Contato co2 = new Contato(9999890, "eidmar.love");
		Map<String, Contato> con = new HashMap<String, Contato>();
		AgendaEletronicaMap agenda = new AgendaEletronicaMap(con);
		agenda.addContato("Eidson", co1);
		agenda.addContato("Eidmar", co2);
		agenda.removerContato(co1);
		assertTrue(agenda.removerContato(co1)==true);
	}

	@Test
	public void testremoverContatos() {
		Contato co1 = new Contato(991809090, "eidson.cecilia");
		Contato co2 = new Contato(9999890, "eidmar.love");
		Map<String, Contato> con = new HashMap<String, Contato>();
		AgendaEletronicaMap agenda = new AgendaEletronicaMap(con);
		agenda.addContato("Eidmar", co1);
		agenda.addContato("Eidson", co2);
		agenda.removerContatos("Eidmar");
		agenda.removerContatos("Eidson");
		assertNotEquals(1,agenda.geListContato());
		assertEquals(0,agenda.geListContato());

	}

	@Test
	public void testListarContato() {
		Contato co1 = new Contato(991809090, "eidson.cecilia");
		Contato co2 = new Contato(9999890, "eidmar.love");
		Map<String, Contato> con = new HashMap<String, Contato>();
		AgendaEletronicaMap agenda = new AgendaEletronicaMap(con);
		agenda.addContato("Eidmar", co1);
		agenda.addContato("Eidson", co2);
		List<Contato> con1 = agenda.listarContato("Eidmar");
		assertEquals(1, con1.size());

	}

}
