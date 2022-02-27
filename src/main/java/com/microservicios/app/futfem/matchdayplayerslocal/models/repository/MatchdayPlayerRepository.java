package com.microservicios.app.futfem.matchdayplayerslocal.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.microservicios.app.futfem.matchdayplayerslocal.models.entity.MatchdayPlayersLocal;

public interface MatchdayPlayerRepository extends CrudRepository<MatchdayPlayersLocal, Long> {

	@Query("select mpl from MatchdayPlayersLocal mpl where mpl.positionmatch = ?1 ")  
	public List<MatchdayPlayersLocal> findByPositionmatch(String positionmatch );
	
}
