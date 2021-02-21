DROP TABLE if EXISTS ro_person;
DROP TABLE if EXISTS ro_passport;

CREATE TABLE ro_person (
    person_id SERIAL,
    sex smallInt not null,
    first_name varchar(100),
    last_name varchar(100),
    patronymic varchar(100),
    date_birth date not null,
    PRIMARY KEY (person_id)
);

CREATE TABLE ro_passport (
    passport_id SERIAL,
    person_id Integer not null,
    seria varchar(10),
    nummber varchar(10),
    date_issue date not null,
    issue_department varchar(200),
    PRIMARY KEY (passport_id)
    FOREIGN KEY (person_id) REFERENCES ro_person(person_id) ON DELETE RESTRICT
);

INSERT IN ro_person (sex, first_name, last_name, patronymic, date_birth)
VALUES (1, 'Елена', 'Васильева', 'Сергеевна', 1998-03-24),
VALUES (2, 'Олег', 'Васильев', 'Петрович', 1997-10-16);