--liquibase formatted sql
--changeset 2b:CREATE_TABLE_ROLES
CREATE TABLE ROLES
(
    ROLE_ID UUID DEFAULT uuid_generate_v4() NOT NULL PRIMARY KEY,
    USER_ID UUID                            NOT NULL,
    ROLE    INT  CHECK (ROLE < 3)           NOT NULL
);

ALTER TABLE ROLES
    ADD CONSTRAINT USERS_ID_FK
        FOREIGN KEY (USER_ID) REFERENCES USERS
            ON UPDATE CASCADE ON DELETE CASCADE;

--rollback drop table ROLES;