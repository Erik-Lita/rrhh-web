package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.distribuida.entities.Pagos;
@Repository
public class PagosDAOImpl implements PagosDAO {
	

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	////ACTUALIZACION
	public List<Pagos> findAll(){
		//
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Pagos",Pagos.class).getResultList();
		
	}
	
	@Override
	@Transactional
	public Pagos findOne(int id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		return session.get(Pagos.class,id);
	}

	@Override
	@Transactional
	public void add(Pagos pagos) {
	Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
	session.saveOrUpdate(pagos);
	
	}

	@Override
	@Transactional
	public void up(Pagos pagos) {
		Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
		session.saveOrUpdate(pagos);
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void del(int id) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(findOne(id));
		// TODO Auto-generated method stub

	}

}