--liquibase formatted sql
--changeset 2b:CREATE_TABLE_TOPICS
CREATE TABLE TOPICS
(
    TOPICS_ID       UUID DEFAULT uuid_generate_v4() NOT NULL PRIMARY KEY,
    USER_ID         UUID                            NOT NULL,
    DATE_OF_CREATED TIMESTAMP                       NOT NULL,
    DATE_OF_UPDATE  TIMESTAMP                       NOT NULL,
    TOPIC           VARCHAR(10000)                  NOT NULL
);

ALTER TABLE TOPICS
    ADD CONSTRAINT USERS_ID_FK
        FOREIGN KEY (USER_ID) REFERENCES USERS
            ON UPDATE CASCADE ON DELETE CASCADE;

--rollback drop table TOPICS;