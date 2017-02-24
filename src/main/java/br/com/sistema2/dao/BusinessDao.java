package br.com.sistema2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import br.com.sistema2.models.Business;


@Repository
@Transactional
public class BusinessDao {

	@PersistenceContext
	private EntityManager manager;
	
	
	public void salvar(Business b){
		manager.persist(b);
	}
	
	public List<Business> lista(){
		return manager.createQuery("select b from Business b",Business.class).getResultList();
	}
}
