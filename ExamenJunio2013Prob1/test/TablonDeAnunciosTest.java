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
	public void testBuscarPorTituloEmpresa() {
		Anuncio empresa1=new Anuncio("Prueba1","AnuncioEmpresa1","LA EMPRESA");
		tablon.publicarAnuncio(empresa1, null,null);
		Anuncio empresa2=new Anuncio("Prueba2","AnuncioEmpresa2","LA EMPRESA");
		tablon.publicarAnuncio(empresa2, null,null);
		int publicados=tablon.anunciosPublicados();
		tablon.buscarAnuncioPorTitulo("Prueba2");
		assertEquals(tablon.anunciosPublicados(),publicados);
		
	}
}