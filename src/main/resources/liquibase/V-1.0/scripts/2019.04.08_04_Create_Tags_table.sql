--liquibase formatted sql
--changeset 2b:CREATE_TABLE_TAGS
CREATE TABLE TAGS
(
    TAG_ID      UUID DEFAULT uuid_generate_v4() NOT NULL PRIMARY KEY,
    TOPIC_ID    UUID                            NOT NULL,
    TAG         VARCHAR(128)                    NOT NULL
);

ALTER TABLE TAGS
    ADD CONSTRAINT USERS_ID_FK
        FOREIGN KEY (TOPIC_ID) REFERENCES TOPICS
            ON UPDATE CASCADE ON DELETE CASCADE;

--rollback drop table TAGS;