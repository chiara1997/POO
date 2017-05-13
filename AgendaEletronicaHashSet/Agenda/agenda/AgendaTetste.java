package agenda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import agenda.AgendaEletronica;
import agenda.Contatos;

public class AgendaTetste {
	public void testaddContato() {
		Set<Contatos> contatos = new TreeSet<Contatos>();
		AgendaEletronica agenda = new AgendaEletronica (contatos);
		Contatos co1= new Contatos ("Eidson", 991809090,"eidson.cecilia");
		Contatos co2 =new Contatos ("Eidmar",9999890,"eidmar.love");
		agenda.addContato(co1);
		agenda.addContato(co2);
		Set<Contatos> r = agenda.listarContatos("Eidson");
		assertEquals(1,r.size());
	
	}

	@Test
	public void testremoverContato() {
		Contatos c = new Contatos ("Clara",998988,"clara.feliz");
		Set<Contatos> conta = new TreeSet<Contatos>();
		AgendaEletronica agenda = new AgendaEletronica(conta);
		agenda.addContato(c);
		assertTrue(agenda.removerContato(c) ==true);
		
		
	}
	@Test
	public void testremoverContatos() {
		Set<Contatos> conta = new TreeSet<Contatos>();
		AgendaEletronica agenda = new AgendaEletronica(conta);
		Contatos co1= new Contatos ("Eidson", 991809090,"eidson.cecilia");
		Contatos co2 =new Contatos ("Eidmar",9999890,"eidmar.love");
		agenda.addContato(co1);
		agenda.addContato(co2);
		agenda.removerContato("Eidson");
		agenda.removerContato("Eidmar");
		assertEquals(0,agenda.getTamanho());
		
	}
	@Test
	public void testcompareTo() {
		Contatos c1 = new Contatos("Pedro",10,"pedro.feliz");
		Contatos c2 = new Contatos("Clara",5,"clara.feliz");
		assertEquals(c1.compareTo(c1),0);
		assertNotEquals(c1.compareTo(c2),1);
}
	@Test
	public void testlistarContato(){
		Set<Contatos> conta = new TreeSet<Contatos>();
		AgendaEletronica agenda = new AgendaEletronica(conta);
		Contatos co1= new Contatos ("Eidson", 991809090,"eidson.cecilia");
		Contatos co2 =new Contatos ("Eidmar",9999890,"eidmar.love");
		agenda.addContato(co1);
		agenda.addContato(co2);
		Set<Contatos> contas = agenda.listarContatos("Eidson");
		assertEquals(1,contas.size());
		
	}
}