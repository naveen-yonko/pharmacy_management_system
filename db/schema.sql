CREATE DATABASE IF NOT EXISTS pharmacy;
USE pharmacy;

CREATE TABLE IF NOT EXISTS app_user (
  app_user_pk INT AUTO_INCREMENT PRIMARY KEY,
  userRole VARCHAR(50),
  name VARCHAR(69),
  mobile_no VARCHAR(50),
  password VARCHAR(25),
  address VARCHAR(200),
  status VARCHAR(50)
);
