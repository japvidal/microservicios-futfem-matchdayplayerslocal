package com.microservicios.app.futfem.matchdayplayerslocal.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservicios.app.common.services.CommonServiceImpl;
import com.microservicios.app.futfem.matchdayplayerslocal.models.entity.MatchdayPlayersLocal;
import com.microservicios.app.futfem.matchdayplayerslocal.models.repository.MatchdayPlayerRepository;

@Service
public class MatchdayPlayersLocalServiceImpl extends CommonServiceImpl<MatchdayPlayersLocal, MatchdayPlayerRepository> implements MatchdayPlayersLocalService {

	public List<MatchdayPlayersLocal> findByPositionmatch(String positionmatch){
		return repository.findByPositionmatch(positionmatch);
	}
	
	public void eliminarDatos(){
		repository.deleteAll();
	}
}
