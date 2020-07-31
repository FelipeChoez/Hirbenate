package com.CursoOnline;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.entidades.Curso;
import com.entidades.Estudiante;

//import com.entidades.Curso;

public class Main {

	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
	
	static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
	public static void main(String[] args) {
		      // Curso cur1 = new Curso("Fundamentos java");
	          // Curso cur2 = new Curso("hibernate principantes");
	           
	          // ingresarCurso(cur1);
	          // ingresarCurso(cur2);
		
		           Estudiante estu1 = new Estudiante(0,"pedro", "carbo","pedro@gmial.com");
		           ingresarEstudiante(estu1);
		           Estudiante estu2 = new Estudiante(0,"carlos", "lucas","carloso@gmial.com");
		           ingresarEstudiante(estu2);
		           Estudiante estu3 = new Estudiante(0,"jose", "maria","jose@gmial.com");
		           ingresarEstudiante(estu3);
	}
	
	
	
	
	
	static void ingresarCurso(Curso curso) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(curso);
		session.getTransaction().commit();
		session.close();
	}

	
	static void ingresarEstudiante(Estudiante estudiante) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(estudiante);
		session.getTransaction().commit();
		session.close();
	}
}
