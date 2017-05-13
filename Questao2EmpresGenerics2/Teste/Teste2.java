import static org.junit.Assert.*;

import org.junit.Test;

public class Teste2 {

	@Test
	public void test() {
		Codigo  codigo1  =  new Codigo("Sejej21","Sej3j3u3");
		ProdutoGenerico<Codigo>  pG = new ProdutoGenerico<Codigo>( codigo1,"2233",393);
		assertEquals(pG.getCodigo().toString(),codigo1.toString());
		assertEquals(pG.getDescricao(),pG.getDescricao());
		assertTrue(pG.getPreco()==pG.getPreco());
		
		
		
		
	}

}
