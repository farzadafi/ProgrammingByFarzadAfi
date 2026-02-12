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
        Student ali = new Student("naser", 10);
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(ali);
        transaction.commit();

//        Student ali1 = new Student("naser", 10);
//        EntityTransaction transaction1 = entityManager.getTransaction();
//        transaction1.begin();
//        entityManager.persist(ali1);
//        transaction1.commit();
////
////
//        Student ali2 = new Student("naser", 10);
//        EntityTransaction transaction2 = entityManager.getTransaction();
//        transaction2.begin();
//        entityManager.persist(ali2);
//        transaction2.commit();
//
//        Student ali3 = new Student("naser", 10);
//        EntityTransaction transaction3 = entityManager.getTransaction();
//        transaction3.begin();
//        entityManager.persist(ali3);
//        transaction3.commit();
//
//        Student ali4 = new Student("naser", 10);
//        EntityTransaction transaction4 = entityManager.getTransaction();
//        transaction4.begin();
//        entityManager.persist(ali4);
//        transaction4.commit();



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