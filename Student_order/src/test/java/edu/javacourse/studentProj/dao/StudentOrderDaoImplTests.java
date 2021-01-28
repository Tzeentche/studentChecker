package edu.javacourse.studentProj.dao;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import java.util.stream.Collectors;

class DictionaryDaoImplTests {

    @BeforeClass
    public static void startUp() throws Exception {
        URL url1 = DictionaryDaoImplTests.class.getClassLoader()
                .getResource("student_project.sql");
        URL url2 = DictionaryDaoImplTests.class.getClassLoader()
                .getResource("student_data.sql");

        List<String> str1 = Files.readAllLines(Paths.get(url1.toURI()));
        String sql1 = str1.stream().collect((Collectors.joining()));

        List<String> str2 = Files.readAllLines(Paths.get(url1.toURI()));
        String sql2 = str1.stream().collect((Collectors.joining()));

        try (Connection con = ConnectionBuilder.getConnection();
             Statement stmt1 = con.createStatement();) {

            stmt1.executeUpdate(sql1);
            stmt1.executeUpdate(sql2);
        }
    }

    @Before
    public void startTest() {
        System.out.println("START TEST");
    }

    @Test
    public void TestExample1() {
        System.out.println("TEST 1");
    }

    @Test
    @Ignore
    public void TestExample2() {
        System.out.println("TEST 2");
    }

    @Test
    public void TestExample3() {
        System.out.println("TEST 3");
        throw new RuntimeException("Bad Result");
    }

}