import static org.junit.Assert.*;
import junio2013.Anuncio;

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
	@Test
	public void testAnuncioEmpresaIncrementa() {
		int anuncios=tablon.anunciosPublicados();
		Anuncio empresa=new Anuncio("Prueba","AnuncioEmpresa","LA EMPRESA");
		tablon.publicarAnuncio(empresa, null,null);
		assertEquals(tablon.anunciosPublicados(),anuncios+1);
		
	}
}
