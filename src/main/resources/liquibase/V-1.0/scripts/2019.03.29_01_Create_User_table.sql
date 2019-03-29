--liquibase formatted sql
--changeset 2b:CREATE_TABLE_Users
CREATE TABLE Users (
                     id       VARCHAR(32)            NOT NULL PRIMARY KEY,
                     username VARCHAR(50) NOT NULL,
                     password VARCHAR(60)            NOT NULL,
                     enabled  BOOLEAN                NOT NULL
);
--rollback drop table Users;