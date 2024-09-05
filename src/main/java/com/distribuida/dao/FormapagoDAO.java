package com.distribuida.dao;

import java.util.List;


import com.distribuida.entities.Formapago;

public interface FormapagoDAO {

public List<Formapago> findAll();
	
	public Formapago findOne(int id);
	
	public void add(Formapago formapago);
	
	public void up(Formapago formapago);

	public void del(int id);

}