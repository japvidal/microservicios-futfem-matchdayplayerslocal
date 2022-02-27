package com.microservicios.app.futfem.matchdayplayerslocal.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicios.app.common.controllers.CommonController;
import com.microservicios.app.futfem.matchdayplayerslocal.models.entity.MatchdayPlayersLocal;
import com.microservicios.app.futfem.matchdayplayerslocal.services.MatchdayPlayersLocalService;

@RestController
public class MatchdayPlayersLocalController extends CommonController<MatchdayPlayersLocal, MatchdayPlayersLocalService> {
	
	@GetMapping ("/{positionmatch}/listByPositionmatch")  // sirve para dar una ruta al RestController, es un método Handler
	public ResponseEntity<?> listByPositionmatch(@PathVariable String positionmatch){
		return ResponseEntity.ok().body(service.findByPositionmatch(positionmatch));
	}
	
	@DeleteMapping("/")
	public ResponseEntity<?> eliminarDatos(){
		service.eliminarDatos();
		return ResponseEntity.noContent().build(); // HTTPStatus 204
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody MatchdayPlayersLocal player, @PathVariable Long id){
		Optional<MatchdayPlayersLocal> o = service.findById(id);
		
		if (!o.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		MatchdayPlayersLocal playerDb = o.get();
		playerDb.setIdPlayer(player.getIdPlayer());
		playerDb.setIdTeam(player.getIdTeam());
		playerDb.setSeason(player.getSeason());
		playerDb.setIdPlayer(player.getIdPlayer());
		playerDb.setName(player.getName());
		playerDb.setDorsal(player.getDorsal());
		playerDb.setSurname(player.getSurname());
		playerDb.setNickname(player.getNickname());
		playerDb.setCountry(player.getCountry());
		playerDb.setPosition(player.getPosition());
		playerDb.setPositionmatch(player.getPositionmatch());
		playerDb.setVelocidad(player.getVelocidad());
		playerDb.setResistencia(player.getResistencia());
		playerDb.setDefaerea(player.getDefaerea());
		playerDb.setDefagresividad(player.getDefagresividad());
		playerDb.setDefanticipacion(player.getDefanticipacion());
		playerDb.setDefestrategia(player.getDefestrategia());
		playerDb.setVisionjuego(player.getVisionjuego());
		playerDb.setAtaqueaereo(player.getAtaqueaereo());
		playerDb.setAtaquefaltas(player.getAtaquefaltas());
		playerDb.setAtaquepases(player.getAtaquepases());
		playerDb.setAtaquepenaltys(player.getAtaquepenaltys());
		playerDb.setAtaqueregate(player.getAtaqueregate());
		playerDb.setAtaqueremate(player.getAtaqueremate());
		playerDb.setPortero(player.getPortero());
		playerDb.setGoles(player.getGoles());
		playerDb.setAmarillas(player.getAmarillas());
		playerDb.setRojas(player.getRojas());
		playerDb.setParadas(player.getParadas());
		playerDb.setFaltas(player.getFaltas());
		// service.save(alumnoDb) permite persistir el alumno con los datos editados
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(playerDb));  // HTTPStatus 201
	}
}
