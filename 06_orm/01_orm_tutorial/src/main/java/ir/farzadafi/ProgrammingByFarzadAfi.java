package ir.farzadafi;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        System.out.println("Test");
    }
}