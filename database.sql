
CREATE DATABASE exam_db;
USE exam_db;

CREATE TABLE users (
 id INT AUTO_INCREMENT PRIMARY KEY,
 username VARCHAR(50),
 password VARCHAR(50)
);

CREATE TABLE questions (
 id INT AUTO_INCREMENT PRIMARY KEY,
 question VARCHAR(255),
 option1 VARCHAR(100),
 option2 VARCHAR(100),
 option3 VARCHAR(100),
 option4 VARCHAR(100),
 answer VARCHAR(100)
);

INSERT INTO users(username,password) VALUES ('student','pass123');
INSERT INTO questions(question,option1,option2,option3,option4,answer)
VALUES ('Java is a ?', 'Language','OS','Browser','Tool','Language');
