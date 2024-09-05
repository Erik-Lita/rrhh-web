package com.distribuida.dao;

import java.util.List;


import com.distribuida.entities.Pagos;

public interface PagosDAO {

public List<Pagos> findAll();
	
	public Pagos findOne(int id);
	
	public void add(Pagos pagos);
	
	public void up(Pagos pagos);

	public void del(int id);

}