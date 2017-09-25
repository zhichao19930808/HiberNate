show DATABASES ;
SELECT *
FROM db_test.paging;
DROP TABLE IF EXISTS db_test.person;
CREATE TABLE db_test.person (
  id   INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255),
  age  VARCHAR(255)
);
SELECT *
FROM db_test.person;
SHOW TABLES FROM db_test;
SELECT *
FROM db_test.m2o_classs;
SELECT *
FROM db_test.m2o_student;

