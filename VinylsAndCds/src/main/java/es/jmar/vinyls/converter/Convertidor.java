package es.jmar.vinyls.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import es.jmar.vinyls.entity.Anuncio;
import es.jmar.vinyls.entity.Usuario;
import es.jmar.vinyls.model.MAnuncio;
import es.jmar.vinyls.model.MUsuario;

@Component("convertidor")
public class Convertidor {
	
	public List<MAnuncio> convertirListaAnuncio(List<Anuncio> anuncios){
		List<MAnuncio> list = new ArrayList<>();
		
		for(Anuncio a: anuncios) {
			list.add(new MAnuncio(a));
		}
		return list;
	}
	
	public List<MUsuario> convertirListaUsuario(List<Usuario> usuarios){
		List<MUsuario> list = new ArrayList<>();
		
		for(Usuario u: usuarios) {
			list.add(new MUsuario(u));
		}
		return list;
	}

}
