DROP TABLE if EXISTS person;
DROP TABLE if EXISTS passport;

CREATE TABLE ro_person (
    person_id SERIAL,
    first_name varchar(100),
    last_name varchar(100),
    patronymic varchar(100),
    date_birth date not null,
    PRIMARY KEY (person_id)
);

CREATE TABLE ro_passport (
    passport_id SERIAL,
    seria varchar(10),
    nummber varchar(10),
    date_issue date not null,
    issue_department varchar(200),
    PRIMARY KEY (passport_id)
);