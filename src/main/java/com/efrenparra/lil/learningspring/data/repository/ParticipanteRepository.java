package com.efrenparra.lil.learningspring.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.efrenparra.lil.learningspring.data.entity.Participante;

@Repository
public interface ParticipanteRepository extends CrudRepository<Participante,Long> {

}
