package com.microservicios.app.futfem.matchdayplayerslocal.services;

import java.util.List;

import com.microservicios.app.common.services.CommonService;
import com.microservicios.app.futfem.matchdayplayerslocal.models.entity.MatchdayPlayersLocal;

public interface MatchdayPlayersLocalService extends CommonService<MatchdayPlayersLocal>{
	
	public List<MatchdayPlayersLocal> findByPositionmatch(String positionmatch);
	
	public void eliminarDatos();

}
