package com.efrenparra.lil.learningspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efrenparra.lil.learningspring.data.entity.Comentario;
import com.efrenparra.lil.learningspring.data.entity.Participante;
import com.efrenparra.lil.learningspring.data.repository.ComentarioRepository;
import com.efrenparra.lil.learningspring.data.repository.ParticipanteRepository;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}
	

	
	
	
	
	/*

	@RestController
	@RequestMapping("/rooms")
	public class RoomController{
		
		@Autowired
		private RoomRepository roomRepository;
		
		@GetMapping
		public Iterable<Room> getRooms(){
			return this.roomRepository.findAll();
		}
		
	}
	
	@RestController
	@RequestMapping("/guests")
	public class GuestController{
		@Autowired
		private GuestRepository gestRepository;
		
		@GetMapping
		public Iterable<Guest> getGests(){
			return this.gestRepository.findAll();
		}
	}
	
	@RestController
	@RequestMapping("/reservations")
	public class ReservationController{
		@Autowired
		private ReservationRepository reservationRepository;
		
		@GetMapping
		public Iterable<Reservation> getReservation(){
			return this.reservationRepository.findAll();
		}
	}
		
	
	
	*/
	
	
}
