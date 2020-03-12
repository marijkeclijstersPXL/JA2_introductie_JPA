package be.pxl.ja2.jpa;

import be.pxl.ja2.jpa.model.Contact;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo2Persist {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("musicdb_pu");
			entityManager = entityManagerFactory.createEntityManager();
			//toegevoegd
			EntityTransaction transaction = entityManager.getTransaction ();
			transaction.begin ();
			Contact sophie = new Contact("Sophie", 555666, "sophie@pxl.be");
			entityManager.persist(sophie);//=toevoegen in de databank, nadien transactie aanmaken en committen
			transaction.commit ();
			System.out.println(sophie);
		}
		finally {
			if (entityManager != null) {
				entityManager.close();
			}
			if (entityManagerFactory != null) {
				entityManagerFactory.close();
			}
		}
	}
}
