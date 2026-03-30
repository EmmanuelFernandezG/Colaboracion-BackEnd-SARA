package com.back.cd.back.cd.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.back.cd.back.cd.Modelo.Repositorio.socsProjection;
import com.back.cd.back.cd.Modelo.Repositorio.socsRepository;

@RestController
@RequestMapping("/imp")
@CrossOrigin
public class controller {
	@Autowired
    private service Service;
	@Autowired
    private socsRepository socsRepository;
	
	@GetMapping("/socs")
//	public List<socsProjection> verTabla() {
//	    return Service.getTablaSocs();
//	}
	public List<socsProjection> getTabla(@RequestParam("usuario") String usuario) {
		System.out.println(">>> Usuario recibido: [" + usuario + "]");
	    
	    if ("prueba".equalsIgnoreCase(usuario)) {
	        return socsRepository.obtenerDataTabla(usuario);
	    }
	    
	    return socsRepository.obtenerDataTabla(usuario);
    }
}