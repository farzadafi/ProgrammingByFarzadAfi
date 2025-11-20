package ir.farzadafi;

import ir.farzadafi.model.Car;
import ir.farzadafi.model.Person;
import ir.farzadafi.orm.InsertStatement;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IllegalAccessException {
//        GogoliORM gogoliORM = new GogoliORM();
//        gogoliORM.init();
        Car car = new Car("dfkfj", "dkjfd", 2345, true);
//        Person person = new Person("farzad", "afi", 20, true);
        InsertStatement insertStatement = new InsertStatement();
        insertStatement.insertStatementCreator(car);


    }
}
