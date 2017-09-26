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

SELECT *
FROM db_test.m2m_classs;
SELECT *
FROM db_test.m2m_student;
SELECT *
FROM db_test.m2m_classs_students;
DROP TABLE db_test.m2m_classs;
DROP TABLE db_test.m2m_student;
DROP TABLE db_test.m2m_student_classs;

SELECT *
FROM db_test.xml_person;
DROP TABLE db_test.xml_person;
