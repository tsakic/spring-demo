CREATE SEQUENCE hibernate_sequence;

CREATE TABLE car (
  id                BIGINT          PRIMARY KEY,
  age               INTEGER,
  color             VARCHAR(255),
  price             BIGINT
);