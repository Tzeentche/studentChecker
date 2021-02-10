package edu.javacourse.city.dao;

import edu.javacourse.city.domain.PersonRequest;
import edu.javacourse.city.domain.PersonResponse;
import edu.javacourse.city.exception.PersonCheckException;
import edu.javacourse.studentProj.domain.Person;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PersonCheckDaoTest {

    @Test
    public void checkPerson() throws PersonCheckException {

        PersonRequest pr = new PersonRequest();
        pr.setSurName("Васильев");
        pr.setGivenName("Павел");
        pr.setPatronymic("Николаевич");
        pr.setDateOfBirth(LocalDate.of(1995, 3, 18));
        pr.setStreetCode(1);
        pr.setBuilding("10");
        pr.setExtension("2");
        pr.setApartment("121");

        PersonCheckDao dao = new PersonCheckDao();
        dao.setConnectionBuilder(new DirectConnectionBuilder());
        PersonResponse ps = dao.checkPerson(pr);
        Assert.assertTrue(ps.isRegistered());
        Assert.assertTrue(ps.isTemporal());
    }

    @Test
    public void checkPerson2() throws PersonCheckException {

        PersonRequest pr = new PersonRequest();
        pr.setSurName("Васильева");
        pr.setGivenName("Ирина");
        pr.setPatronymic("Петровна");
        pr.setDateOfBirth(LocalDate.of(1995, 3, 18));
        pr.setStreetCode(1);
        pr.setBuilding("271");
        pr.setApartment("4");

        PersonCheckDao dao = new PersonCheckDao();
        dao.setConnectionBuilder(new DirectConnectionBuilder());
        PersonResponse ps = dao.checkPerson(pr);
        Assert.assertTrue(ps.isRegistered());
        Assert.assertTrue(ps.isTemporal());
    }
}