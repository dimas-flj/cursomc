package com.learn.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.cursomc.domain.Categoria;
import com.learn.cursomc.repositories.CategoriaRepository;
import com.learn.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository cr;
	
	public Categoria buscar(Integer id_busca) throws ObjectNotFoundException {
		Optional<Categoria> cat = cr.findById(id_busca);
//		este sem tratamento -> return cat.orElse(null);
		// OR 
		return cat.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! id: " + id_busca + ", Tipo: " + Categoria.class.getName()));
	}
}