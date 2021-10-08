package com.fbruno.minhasfinancas.model.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.corteiweb.model.entity.Usuario;
import com.corteiweb.model.repository.UsuarioRepository;

@SpringBootTest
@ExtendWith( SpringExtension.class )
@ActiveProfiles("teste")
public class UsuarioRepositoryTest {
	
	@Autowired
	UsuarioRepository repository;
	
	@org.junit.jupiter.api.Test
	public void deveRetornarFalsoQuandoNaoHouverUsuarioCadastradoComOEmail(){
		
		repository.deleteAll();
	
		boolean result = repository.existsByEmail("usuario@email.com");
		
		Assertions.assertThat(result).isFalse();
		

		

}
}
