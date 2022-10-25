DROP DATABASE IF EXISTS Zoo;
CREATE DATABASE Zoo;

DROP TABLE IF EXISTS Zoo.Site;
CREATE TABLE Zoo.Site(
    site_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    area FLOAT NOT NULL,
    opening_hours VARCHAR(30) NOT NULL
);

DROP TABLE IF EXISTS Zoo.Employee;
CREATE TABLE Zoo.Employee(
    emp_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    birth_date DATE NOT NULL,
    sex CHAR(1) NOT NULL,
    site_id INT NOT NULL,
    FOREIGN KEY(site_id) REFERENCES Zoo.Site(site_id) ON DELETE CASCADE
);

DROP TABLE IF EXISTS Zoo.Employee_post;
CREATE TABLE Zoo.Employee_post(
    post_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    post VARCHAR(30) NOT NULL,
    emp_id INT NOT NULL,
    FOREIGN KEY(emp_id) REFERENCES Zoo.Employee(emp_id) ON DELETE CASCADE
);

DROP TABLE IF EXISTS Zoo.Habitat;
CREATE TABLE Zoo.Habitat(
    habitat_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL,
    location VARCHAR(30) NOT NULL,
    description VARCHAR(255) NOT NULL,
    capacity INT NOT NULL,
    site_id INT NOT NULL,
    FOREIGN KEY(site_id) REFERENCES Zoo.Site(site_id) ON DELETE CASCADE
);

DROP TABLE IF EXISTS Zoo.User;
CREATE TABLE Zoo.User(
    user_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    username VARCHAR(30) NOT NULL,
    password VARCHAR(30) NOT NULL,
    sex CHAR(1) NOT NULL,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    post_code VARCHAR(30) NOT NULL,
    city VARCHAR(30) NOT NULL,
    street VARCHAR(30) NOT NULL,
    number INT NOT NULL
);

DROP TABLE IF EXISTS Zoo.Animal;
CREATE TABLE Zoo.Animal(
    animal_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL,
    racial VARCHAR(30) NOT NULL,
    description VARCHAR(255) NOT NULL,
    habitat_id INT NOT NULL,
    user_id INT,
    FOREIGN KEY(habitat_id) REFERENCES Zoo.Habitat(habitat_id) ON DELETE CASCADE,
    FOREIGN KEY(user_id) REFERENCES Zoo.User(user_id) ON DELETE CASCADE
);

DROP TABLE IF EXISTS Zoo.Food;
CREATE TABLE Zoo.Food(
    food_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL,
    is_delicious BOOLEAN NOT NULL
);

DROP TABLE IF EXISTS Zoo.Food_company;
CREATE TABLE Zoo.Food_company(
    comp_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    company VARCHAR(30) NOT NULL,
    food_id INT NOT NULL,
    FOREIGN KEY(food_id) REFERENCES Zoo.Food(food_id) ON DELETE CASCADE
);

DROP TABLE IF EXISTS Zoo.Eat;
CREATE TABLE Zoo.Eat(
    animal_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    food_id INT NOT NULL,
    feeding_time VARCHAR(30) NOT NULL,
    FOREIGN KEY(food_id) REFERENCES Zoo.Food(food_id) ON DELETE CASCADE
);