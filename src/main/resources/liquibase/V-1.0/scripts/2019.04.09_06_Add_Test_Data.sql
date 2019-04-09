--liquibase formatted sql
--changeset 2b:Create_User
INSERT INTO USERS (id, username, password, enabled)
    VALUES ('8a59d9547e5b4d9ca0a30804e8a33a94',
            'admin',
            '$2a$10$GZtUdy1Z7Hpk0lYYG92CQeiW1f2c4e3XgA8wunVTDFyQJ2DAmH.x.',
            TRUE);

INSERT INTO USERS (id, username, password, enabled)
    VALUES ('38a2b1b9d50b44e9bfc525b73b8dfa30',
            'not-admin',
            '$2a$10$GZtUdy1Z7Hpk0lYYG92CQeiW1f2c4e3XgA8wunVTDFyQJ2DAmH.x.',
            TRUE);

INSERT INTO TOPICS(topics_id, user_id, date_of_created, date_of_update, topic)
    VALUES ('87a76b5b59ce4eb1b44192b91dffe0f9',
            '8a59d9547e5b4d9ca0a30804e8a33a94',
            '2019-01-01 00:00:38',
            '2019-03-01 00:15:38',
            'testtesttest');

INSERT INTO ROLES(role_id, user_id, role)
    VALUES  ('e6323112288e4e35a1be38e2c644daf4',
             '8a59d9547e5b4d9ca0a30804e8a33a94',
             0);

INSERT INTO TAGS(tag_id, topic_id, tag)
    VALUES ('2a49a7b0b46e447c94f8b8c91d764b14',
            '87a76b5b59ce4eb1b44192b91dffe0f9',
            'GTFO!');

INSERT INTO COMMENTS(comment_id, user_id, topic_id, date_of_created, date_of_update, comment)
    VALUES ('f70970a2aa074202be354212ca36efb9',
            '8a59d9547e5b4d9ca0a30804e8a33a94',
            '87a76b5b59ce4eb1b44192b91dffe0f9',
            '2019-01-01 00:00:52',
            '2019-01-01 00:00:52',
            'bla-bla-bla');
/*
                       _
                     ,' '.
                    /     \
                  ^ |  _  | ^
                 | || / \ || |
                 | |||.-.||| |
                 | |||   ||| |
                 | |||   ||| |
                 | |||   ||| |
                 | |||   ||| |
                 | ,'     '. |
                 ,'__     __`.
                /____  |  ____\
                 /_\ |_|_| /_\
                 .:   : :   :.
                 : .  : .  : :
                  ::   ::   ::
                 : : .: :. : :
                .: :.: : :. : .
                : : .: :  ::  :
               .:  .   : :   ..
 */