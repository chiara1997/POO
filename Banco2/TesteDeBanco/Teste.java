import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {

	@Test
	public void test() {
		Senha senha1= new Senha ("Pedro",35,"9993993");
		Senha senha2 = new Senha ("Clara",45,"95985894");
		GerenciamentoSenha gS = new GerenciamentoSenha(true);
		assertNotEquals(senha1,senha2);
		Senha s1 =gS.emitirSenha("Pedro",35,"9993993");
		Senha s2 =gS.emitirSenha("Clara",45,"95985894");
		assertEquals(senha1,s1);
		assertEquals(senha2,s2);
		assertEquals(s1,gS.proximaSenha());
		assertEquals(s2,gS.proximaSenha());
		
		
		
		
		
	}

}
