package com.distribuida.dao;

import java.util.List;


import com.distribuida.entities.Asistencia;

public interface AsistenciaDAO {

public List<Asistencia> findAll();
	
	public Asistencia findOne(int id);
	
	public void add(Asistencia asistencia);
	
	public void up(Asistencia asistencia);

	public void del(int id);

}