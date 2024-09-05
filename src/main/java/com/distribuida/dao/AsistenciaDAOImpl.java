package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.distribuida.entities.Asistencia;
@Repository
public class AsistenciaDAOImpl implements AsistenciaDAO {
	

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	////ACTUALIZACION
	public List<Asistencia> findAll(){
		//
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Asistencia",Asistencia.class).getResultList();
		
	}
	
	@Override
	@Transactional
	public Asistencia findOne(int id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		return session.get(Asistencia.class,id);
	}

	@Override
	@Transactional
	public void add(Asistencia asistencia) {
	Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
	session.saveOrUpdate(asistencia);
	
	}

	@Override
	@Transactional
	public void up(Asistencia asistencia) {
		Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
		session.saveOrUpdate(asistencia);
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