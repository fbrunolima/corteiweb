package com.fbruno.minhasfinancas.model.repository;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.corteiweb.model.repository.UsuarioRepository;
import com.corteiweb.service.UsuarioService;
import com.corteiweb.service.impl.UsuarioServiceImpl;

@SpringBootTest
@ExtendWith( SpringExtension.class )
@ActiveProfiles("teste")
@DataJpaTest
public class UsuarioServiceTest {
	
	@Autowired
	UsuarioService service;
	
	@Autowired
	UsuarioRepository repository;
	
	@Before
	public void setUp() {
		repository = Mockito.mock(UsuarioRepository.class);
		service = new UsuarioServiceImpl(repository);
		
	}
	
	@Test
	public void deveValidarEmail() {
		
		Mockito.when(repository.existsByEmail(Mockito.anyString())).thenReturn(false);
		
		
		service.validarEmail("email@email.com");
	}
	
	@Test
	public void deveLancarErro() {
		
		Mockito.when(repository.existsByEmail(Mockito.anyString())).thenReturn(true);
		
		service.validarEmail("email@email.com");
	}

}
