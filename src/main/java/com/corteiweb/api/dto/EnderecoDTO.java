package com.corteiweb.api.dto;



import com.corteiweb.model.enums.EnumUsuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EnderecoDTO {
	
	private String cep;
	private String tipoUsuario;
	
	private String bairro;
	
	private String cidade;
	
	private String estado;

}
