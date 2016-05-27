import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TablonDeAnunciosTest {
	
	TablonDeAnuncios tablon;
	@Before
	public void creaTablonInicial() {
		tablon=new TablonDeAnuncios();
	}
	@After
	public void eliminaTablonInicial() {
		tablon=null;
	}

	@Test
	public void testInicial() {
		assertEquals(tablon.anunciosPublicados(),1);
	}
}