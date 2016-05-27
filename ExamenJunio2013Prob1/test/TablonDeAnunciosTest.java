import static org.junit.Assert.*;
import junio2013.Anuncio;
import junio2013.IBaseDeDatosDeAnunciantes;
import junio2013.IBaseDeDatosDePagos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

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
	public void testAnuncioNOEmpresaSinSaldo() {
		IBaseDeDatosDePagos pagos=(IBaseDeDatosDePagos) mock(IBaseDeDatosDePagos.class);
		IBaseDeDatosDeAnunciantes anunciantes=mock(IBaseDeDatosDeAnunciantes.class);
		when(anunciantes.buscarAnunciante("Juan")).thenReturn(true);
		when(pagos.anuncianteTieneSaldo("Juan")).thenReturn(true);
		Anuncio noEmpresa=new Anuncio("Prueba","AnuncioNOEmpresa","Juan");
		tablon.publicarAnuncio(noEmpresa, anunciantes,pagos);
		pagos.anuncioPublicado("Juan");
		assertEquals(tablon.anunciosPublicados(),2);
		
	}
}