DROP TABLE IF EXISTS cr_adress_person;
DROP TABLE IF EXISTS cr_district;
DROP TABLE IF EXISTS cr_street;
DROP TABLE IF EXISTS cr_address;
DROP TABLE IF EXISTS cr_person;

CREATE TABLE cr_district (
    district_code integer not null,
    district_name text,
    PRIMARY KEY (district_code)
);

CREATE TABLE cr_street (
    street_code integer not null,
    street_name text,
    PRIMARY KEY (street_code)
);

CREATE TABLE cr_address (
    address_id SERIAL,
    district_code integer not null,
    street_code integer not null,
    building text not null,
    extension varchar(10),
    apartment varchar(10),
    PRIMARY KEY (address_id),
    FOREIGN KEY (disrict_code) REFERENCES cr_district(district_code) ON UPDATE NO ACTION ON DELETE RESTRICT,
    FOREIGN KEY (street_code) REFERENCES cr_streets (street_code) ON UPDATE NO ACTION ON DELETE RESTRICT
);

CREATE TABLE cr_person (
    person_id SERIAL,
    sur_name text NOT NULL,
    given_name text NOT NULL,
    patronymic text NOT NULL,
    date_of_birth date NOT NULL,
    passport_serial text,
    passport_number text,
    passport_date date,
    certificate_number text,
    certificate_date date,
    PRIMARY KEY (person_id)
)

CREATE TABLE cr_adress_person (
    person_address_id SERIAL,
    address_id integer not null,
    person_id not null,
    start_date date not null,
    end_date date,
    PRIMARY KEY (person_address_id),
    FOREIGN KEY (address_id) REFERENCES cr_address(address_id) ON UPDATE NO ACTION ON DELETE RESTRICT,
    FOREIGN KEY (person_id) REFERENCES cr_person(person_id) ON UPDATE NO ACTION ON DELETE RESTRICT

)


