package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.distribuida.entities.Formapago;
@Repository
public class FormapagoDAOImpl implements FormapagoDAO {
	

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	////ACTUALIZACION
	public List<Formapago> findAll(){
		//
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Formapago",Formapago.class).getResultList();
		
	}
	
	@Override
	@Transactional
	public Formapago findOne(int id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		return session.get(Formapago.class,id);
	}

	@Override
	@Transactional
	public void add(Formapago formapago) {
	Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
	session.saveOrUpdate(formapago);
	
	}

	@Override
	@Transactional
	public void up(Formapago formapago) {
		Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
		session.saveOrUpdate(formapago);
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