package com.efrenparra.lil.learningspring.data.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.efrenparra.lil.learningspring.data.entity.Comentario;

@Repository
public interface ComentarioRepository extends CrudRepository<Comentario,Long> {
	
	List<Comentario>  findByParticipanteEquals(int participante);
	List<Comentario>  findByOfusquidadEquals(int ofusquidad);
	
	

}
