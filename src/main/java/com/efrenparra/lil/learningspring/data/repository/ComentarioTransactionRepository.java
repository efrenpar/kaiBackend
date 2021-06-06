package com.efrenparra.lil.learningspring.data.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.efrenparra.lil.learningspring.data.entity.Comentario;

@Repository
public class ComentarioTransactionRepository {
	
	@PersistenceContext
    private EntityManager entityManager;
	
	@Transactional
	public void insertWithEntityManager(Comentario comentario) {
	    this.entityManager.persist(comentario);
	}
	

}
