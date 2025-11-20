package ir.farzadafi;

import ir.farzadafi.orm.GogoliORM;

public class Main {
    public static void main(String[] args) {
        GogoliORM gogoliORM = new GogoliORM();
        gogoliORM.init();
    }
}
