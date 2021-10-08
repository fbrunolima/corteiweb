package com.corteiweb.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "endereco")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
	
	@Column(name = "cep")
	private String cep;
	
	@Column(name = "tipo_usuario")
	private String tipoUsuario;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "estado")
	private String estado;
	
	

}
