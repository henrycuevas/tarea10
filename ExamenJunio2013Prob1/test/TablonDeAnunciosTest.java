import static org.junit.Assert.*;
import junio2013.Anuncio;
import junio2013.IBaseDeDatosDeAnunciantes;

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
	public void testAnuncioNOEmpresaIncrementa() {
		IBaseDeDatosDePagos pagos=mock(IBaseDeDatosDePagos.class);
		IBaseDeDatosDeAnunciantes anunciantes=mock(IBaseDeDatosDeAnunciantes.class);
		when(anunciantes.buscarAnunciante("Juan")).thenReturn(false);
		when(pagos.anuncianteTieneSaldo("Juan")).thenReturn(true);
		int anuncios=tablon.anunciosPublicados();
		Anuncio noEmpresa=new Anuncio("Prueba","AnuncioNOEmpresa","Juan");
		tablon.publicarAnuncio(noEmpresa, anunciantes,pagos);
		assertEquals(tablon.anunciosPublicados(),anuncios);
		
	}
	private IBaseDeDatosDeAnunciantes mock(Class<IBaseDeDatosDeAnunciantes> class1) {
		
		return null;
	}
	private Object when(boolean buscarAnunciante) {
		
		return buscarAnunciante;
	}
}
