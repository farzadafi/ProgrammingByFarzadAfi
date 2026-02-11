package ir.farzadafi;

import ir.farzadafi.model.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        System.out.println("Test");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // CREATE OPERATION
//        Student ali = new Student(1, "ali", 20);
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        entityManager.persist(ali);
//        transaction.commit();

        //READ OPERATION
//        Student student = entityManager.find(Student.class, 1);
//        System.out.println(student);

        //UPDATE OPERATION
//        Student student = entityManager.find(Student.class, 1);
//        student.setAge(25);
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        entityManager.merge(student);
//        transaction.commit();

        //DELETE OPERATION
//        Student student = entityManager.find(Student.class, 1);
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        entityManager.remove(student);
//        transaction.commit();
    }
}