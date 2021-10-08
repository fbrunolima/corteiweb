package com.corteiweb.api.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corteiweb.api.dto.EnderecoDTO;
import com.corteiweb.exceptions.RegraNegocioException;
import com.corteiweb.model.entity.Endereco;
import com.corteiweb.service.EnderecoService;

public class EnderecoResource {
	
	//private final EnderecoService service;
	
	//public EnderecoResource ( EnderecoService service) {
		//this.service = service;
	//}
	
	//@PostMapping
	//public ResponseEntity salvar( @RequestBody EnderecoDTO dto) {
		//Endereco endereco = Endereco.builder().cep(dto.getCep()).tipoUsuario(dto.getTipoUsuario()).bairro(dto.getBairro()).cidade(dto.getCidade())
				//.estado(dto.getEstado()).build();
		//try {
			//Endereco enderecoSalvo = service.salvar(endereco);
			//return new ResponseEntity(enderecoSalvo, HttpStatus.CREATED);
		//}catch (RegraNegocioException e) {
			//return ResponseEntity.badRequest().body(e.getMessage());
		//}
	//}

}
