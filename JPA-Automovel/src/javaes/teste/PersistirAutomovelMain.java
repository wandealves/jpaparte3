package javaes.teste;

import java.util.List;

import javaes.modelo.Automovel;
import javaes.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class PersistirAutomovelMain 
{
	public static void main(String[] args)
	{
		EntityManager em = JPAUtil.getEntityManager();
	
		Query q = em.createQuery("select a from Automovel a");
		
		List<Automovel> automoveis = q.getResultList();
		
		for(Automovel a : automoveis)
		{
			System.out.println(a.getMarca());
		}
		
		/*Insert
		 * 
		 * Automovel auto = new Automovel();
		auto.setMarca("marca M");
		auto.setModelo("modelo M");
		auto.setAnoFabricacao(2000);
		auto.setAnoModelo(2001);
		auto.setObservacao("O melhor carro dos anos 2000");
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(auto);
		tx.commit();
		
		em.close();
		
		*/
		
		/*
		 * Delete
		 * 
		 * Automovel auto = new Automovel();
		auto.setId((long)2);
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		//Para remover um objeto temos que ter a referencia da classe e o ID.
		em.remove(em.getReference(Automovel.class, auto.getId()));
		tx.commit();
		
		em.close();*/
			
	}
}
