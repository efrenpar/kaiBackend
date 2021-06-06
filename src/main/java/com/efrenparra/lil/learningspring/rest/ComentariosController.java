package com.efrenparra.lil.learningspring.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.efrenparra.lil.learningspring.data.entity.Comentario;
import com.efrenparra.lil.learningspring.data.repository.ComentarioRepository;
import com.efrenparra.lil.learningspring.data.repository.ComentarioTransactionRepository;
import com.efrenparra.lil.learningspring.utils.Data;
import com.efrenparra.lil.learningspring.utils.Mensaje;

@RestController
@RequestMapping("/comentarios")
public class ComentariosController {

	@Autowired
	private ComentarioRepository comentarioRepository;
	
	@Autowired
	private ComentarioRepository participanteRepository;
	
	@Autowired
	private ComentarioTransactionRepository comentarioTransactionRepository;
	
	@GetMapping
	public ResponseEntity<Mensaje> getComentario(@RequestParam(required = false) String participante,
											@RequestParam(required = false) String ofusquidad){
		
		ArrayList<Data> comentariosList = new ArrayList<Data>();
		Mensaje response = new Mensaje(200,"",true,comentariosList);
		
		
			if(participante!=null) {
				if(Integer.parseInt(participante)!=0) {
					this.comentarioRepository.findByParticipanteEquals(Integer.parseInt(participante)).forEach(comentariosList::add);
					 response = new Mensaje(200,"participante",true,comentariosList);
				}

			}else if(ofusquidad!=null) {
				if(Integer.parseInt(ofusquidad)==0 || Integer.parseInt(ofusquidad)==1) {
					this.comentarioRepository.findByOfusquidadEquals(Integer.parseInt(ofusquidad)).forEach(comentariosList::add);
					response = new Mensaje(200,"ofusquidad",true,comentariosList);
				}
			}
			
		
	
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	
	@PostMapping
	public ResponseEntity<Mensaje> postComentario(@RequestBody Comentario comentario){
		
		ArrayList<Data> comentariosList = new ArrayList<Data>();
		Mensaje response = new Mensaje(200,comentario.getNickname(),true,comentariosList);
		
		comentario.setId(1L);
		this.comentarioTransactionRepository.insertWithEntityManager(comentario);
		
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
