import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Teste {

	Dicionario<String ,String> variavel;
	@Test
	public void test() {
		Dicionario<String ,String> variavel;

		variavel = new Dicionario<String,String>();
		variavel.addTudo("Leandro","Pedro");
		variavel.addTudo("Clara","Larissa");
		
		assertEquals(variavel.getElementos(),2);
		assertEquals("Pedro",variavel.getVAlor("Leandro"));
		
	}
}