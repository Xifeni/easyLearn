--liquibase formatted sql
--changeset 2b:Create_User
INSERT INTO USERS VALUES
('8a59d9547e5b4d9ca0a30804e8a33a94', 'admin', '$2a$10$GZtUdy1Z7Hpk0lYYG92CQeiW1f2c4e3XgA8wunVTDFyQJ2DAmH.x.', TRUE);