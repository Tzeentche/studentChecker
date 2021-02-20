package edu.javacourse.register.domain;

import java.time.LocalDate;

public class Passport {

    private Long PassportId;
    private String serial;
    private String number;
    private LocalDate issueDate;
    private String issueDepartment;

    public Long getPassportId() {
        return PassportId;
    }

    public void setPassportId(Long passportId) {
        PassportId = passportId;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }
}
