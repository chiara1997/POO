import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {

	@Test
	public void test() {
		Codigo<String ,String > codigo = new Codigo<String,String>("Gegeg","Geiei");
		ProdutoGenerico<Codigo> pg = new ProdutoGenerico<Codigo>(codigo,"tuberculose",45);
		assertEquals(pg.getCodigo().toString(),codigo.toString());
		assertEquals(pg.getDescricao(),pg.getDescricao());
		assertTrue(pg.getPreco()==pg.getPreco());
		
		
	}

}
