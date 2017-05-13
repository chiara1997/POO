import static org.junit.Assert.*;

import org.junit.Test;

public class Tete {

	@Test
	public void test() {
	 Codigo<String,String> co1= new  Codigo<String,String>("jejeje","ueuue");
	 ValorMonetario vm= new ValorMonetario(93);
	 ProdutoGenerico<Codigo,ValorMonetario>pG= 
			 new ProdutoGenerico<Codigo,ValorMonetario>(co1,"tuberculose",vm);
	 	assertEquals(pG.getCodigo().toString(),co1.toString());
		assertEquals(pG.getDescricao(),pG.getDescricao());
		assertTrue(pG.getPreco()==pG.getPreco());
	 
	}

}
