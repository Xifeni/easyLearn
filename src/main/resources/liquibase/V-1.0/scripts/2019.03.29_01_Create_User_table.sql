--liquibase formatted sql
--changeset 2b:CREATE_TABLE_USERS
CREATE TABLE USERS
(
    ID          UUID        DEFAULT uuid_generate_v4()  NOT NULL PRIMARY KEY,
    USERNAME    VARCHAR(32)                             NOT NULL UNIQUE,
    PASSWORD    VARCHAR(64)                             NOT NULL,
    ENABLED     BOOLEAN     DEFAULT FALSE               NOT NULL
);
--rollback drop table USERS;