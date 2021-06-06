package com.efrenparra.lil.learningspring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efrenparra.lil.learningspring.data.entity.Participante;
import com.efrenparra.lil.learningspring.data.repository.ParticipanteRepository;

@RestController
@RequestMapping("/participantes")
public class PerticipantesController {

	@Autowired
	private ParticipanteRepository participanteRepository;
	
	@GetMapping
	public Iterable<Participante> getParticipante(){
		return this.participanteRepository.findAll();
	}
}
