CREATE TABLE USER_ACCOUNT 
        (
                USER_ID VARCHAR(20) NOT NULL PRIMARY KEY, 
                FIRST_NAME VARCHAR(30) NOT NULL, 
                LAST_NAME VARCHAR(30) NOT NULL,
                MIDDLE_NAME VARCHAR(30),
                EMAIL VARCHAR(60) UNIQUE NOT NULL, 
                DISPLAY_NAME VARCHAR(30), 
                GENDER VARCHAR(1) NOT NULL,
                BEGIN_DT DATE NOT NULL,
                END_DT DATE NOT NULL,
                LAST_UPDATED_TS TIMESTAMP NOT NULL, 
                LAST_UPDATED_BY VARCHAR(20) NOT NULL,
                CREATED_DT TIMESTAMP NOT NULL
        );

        
CREATE TABLE USER_LOGIN 
        (
                USER_ID VARCHAR(20) NOT NULL PRIMARY KEY,
                PASSWORD_HASH VARCHAR(128),
                PASSWORD_SALT VARCHAR(128),
                LAST_UPDATED_TS TIMESTAMP NOT NULL, 
                LAST_UPDATED_BY VARCHAR(20) NOT NULL,
                CREATED_DT TIMESTAMP NOT NULL,
                CONSTRAINT USER_ID_FK FOREIGN KEY (USER_ID) REFERENCES USER_ACCOUNT(USER_ID)
        );        
        
CREATE TABLE ROLE
        (
                ROLE_ID VARCHAR(10) NOT NULL PRIMARY KEY,
                ROLE_DESC VARCHAR(20) NOT NULL,
                BEGIN_DT DATE NOT NULL,
                END_DT DATE NOT NULL,
                LAST_UPDATED_TS TIMESTAMP NOT NULL, 
                LAST_UPDATED_BY VARCHAR(20) NOT NULL,
                CREATED_DT TIMESTAMP NOT NULL
        );

CREATE TABLE USER_ROLE
        (
                ID INT PRIMARY KEY, -- make this column as auto increment. It will most probably not used.
                USER_ID VARCHAR(20) NOT NULL,
                ROLE_ID VARCHAR(10) NOT NULL,
                CONSTRAINT USER_ID1_FK FOREIGN KEY (USER_ID) REFERENCES USER_ACCOUNT(USER_ID),
                CONSTRAINT ROLE_ID1_FK FOREIGN KEY (ROLE_ID) REFERENCES ROLE(ROLE_ID)
        );        

        
        
INSERT INTO USER_ACCOUNT VALUES ('amkumar712', 'Muthukumar', 'Arumugam', '', 'amkumar712@gmail.com', 'Muthu', 'M', current_date, '9999-12-31', current_timestamp, 'amkumar712', current_timestamp);
INSERT INTO USER_LOGIN VALUES ('amkumar712', 'Muthu0712', '1234567', current_timestamp, 'amkumar712', current_timestamp);
INSERT INTO ROLE VALUES ('ADMIN', 'ROLE_ADMIN', current_date, '9999-12-31', current_timestamp, 'amkumar712', current_timestamp);
INSERT INTO ROLE VALUES ('USER', 'ROLE_USER', current_date, '9999-12-31', current_timestamp, 'amkumar712', current_timestamp);
INSERT INTO USER_ROLE VALUES (1, 'amkumar712', 'USER');

SELECT * FROM USER_ACCOUNT;

Update User_role set role_id='USER' where id = 1



--ALTER TABLE USER_ACCOUNT DROP CONSTRAINT USER_ID_PK;
       
DROP TABLE USER_LOGIN;
DROP TABLE USER_ACCOUNT;
DROP TABLE ROLE;
DROP TABLE USER_ROLE;
