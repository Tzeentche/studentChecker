package edu.javacourse.register.dao;

import edu.javacourse.register.domain.MarriageCertificate;
import edu.javacourse.register.view.MarriageRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public interface MarriageDao extends JpaRepository<MarriageCertificate, Long> {

//    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageDao.class);
//
//    private EntityManager entityManager;
//    @Value("${test.value}")
//    private String test;
//
//    public void setTest(String test) {
//        this.test = test;
//    }
//
//    public MarriageCertificate findMarriageCertificate(MarriageRequest request) {
//
//        LOGGER.info("findMarriageCertificate called:{}", test);
//        return null;
//    }
}
