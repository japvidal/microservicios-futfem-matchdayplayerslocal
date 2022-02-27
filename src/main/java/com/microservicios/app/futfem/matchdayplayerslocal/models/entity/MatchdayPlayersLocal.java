package com.microservicios.app.futfem.matchdayplayerslocal.models.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="matchday_players_local")
public class MatchdayPlayersLocal {
	
	@Id
	private Long id;
	
	private Long idPlayer;
	private Long idTeam;
	private String season;
	private String dorsal;
	
	private String name;
	private String surname;
	private String nickname;
	private String position;
	private String positionmatch;
	private String country;

	private int velocidad;
	private int resistencia;
	private int defaerea;
	private int defestrategia;
	private int defagresividad;
	private int defanticipacion;
	private int visionjuego;
	private int ataquepases;
	private int ataqueremate;
	private int ataqueregate;
	private int ataqueaereo;
	private int ataquefaltas;
	private int ataquepenaltys;
	private int portero;
	
	private int amarillas;
	private int rojas;
	private int goles;
	private int paradas;
	private int faltas;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getIdPlayer() {
		return idPlayer;
	}
	public void setIdPlayer(Long idPlayer) {
		this.idPlayer = idPlayer;
	}
	public Long getIdTeam() {
		return idTeam;
	}
	public void setIdTeam(Long idTeam) {
		this.idTeam = idTeam;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getDorsal() {
		return dorsal;
	}
	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPositionmatch() {
		return positionmatch;
	}
	public void setPositionmatch(String positionmatch) {
		this.positionmatch = positionmatch;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getResistencia() {
		return resistencia;
	}
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	public int getDefaerea() {
		return defaerea;
	}
	public void setDefaerea(int defaerea) {
		this.defaerea = defaerea;
	}
	public int getDefestrategia() {
		return defestrategia;
	}
	public void setDefestrategia(int defestrategia) {
		this.defestrategia = defestrategia;
	}
	public int getDefagresividad() {
		return defagresividad;
	}
	public void setDefagresividad(int defagresividad) {
		this.defagresividad = defagresividad;
	}
	public int getDefanticipacion() {
		return defanticipacion;
	}
	public void setDefanticipacion(int defanticipacion) {
		this.defanticipacion = defanticipacion;
	}
	public int getVisionjuego() {
		return visionjuego;
	}
	public void setVisionjuego(int visionjuego) {
		this.visionjuego = visionjuego;
	}
	public int getAtaquepases() {
		return ataquepases;
	}
	public void setAtaquepases(int ataquepases) {
		this.ataquepases = ataquepases;
	}
	public int getAtaqueremate() {
		return ataqueremate;
	}
	public void setAtaqueremate(int ataqueremate) {
		this.ataqueremate = ataqueremate;
	}
	public int getAtaqueregate() {
		return ataqueregate;
	}
	public void setAtaqueregate(int ataqueregate) {
		this.ataqueregate = ataqueregate;
	}
	public int getAtaqueaereo() {
		return ataqueaereo;
	}
	public void setAtaqueaereo(int ataqueaereo) {
		this.ataqueaereo = ataqueaereo;
	}
	public int getAtaquefaltas() {
		return ataquefaltas;
	}
	public void setAtaquefaltas(int ataquefaltas) {
		this.ataquefaltas = ataquefaltas;
	}
	public int getAtaquepenaltys() {
		return ataquepenaltys;
	}
	public void setAtaquepenaltys(int ataquepenaltys) {
		this.ataquepenaltys = ataquepenaltys;
	}
	public int getPortero() {
		return portero;
	}
	public void setPortero(int portero) {
		this.portero = portero;
	}
	public int getAmarillas() {
		return amarillas;
	}
	public void setAmarillas(int amarillas) {
		this.amarillas = amarillas;
	}
	public int getRojas() {
		return rojas;
	}
	public void setRojas(int rojas) {
		this.rojas = rojas;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	public int getParadas() {
		return paradas;
	}
	public void setParadas(int paradas) {
		this.paradas = paradas;
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	


}
