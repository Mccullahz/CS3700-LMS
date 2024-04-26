# LMS Database Information 
## Access Control:
Server Address: 10.21.58.130:3306
Software: MySQL Server - Docker 
User: ** REDACTED **
Password: ** REDACTED **
Default Database: LMS 

## Docker Configuration
Quite simple configuration, Docker Compose file, SQL script to create database and tables, no inserts.

Docker Compose File:
<pre>
version: '3.7'

services:
  mysql:
    image: mysql
    restart: always
    ports:
            - "3306:3306"
    environment:
      MYSQL_ROOT_PASSWORD: CS3700
    volumes:
      - ./createdb.sql:/docker-entrypoint-initdb.d/createdb.sql

</pre>


And the SQL script:
<pre>   
DROP TABLE IF EXISTS Magazine;
DROP TABLE IF EXISTS ResearchReport;
DROP TABLE IF EXISTS JournalPaper;
DROP TABLE IF EXISTS ConferencePaper;
DROP TABLE IF EXISTS Dissertation;
DROP TABLE IF EXISTS Thesis;
DROP TABLE IF EXISTS Book;
DROP TABLE IF EXISTS Item;
DROP TABLE IF EXISTS Committee;
DROP TABLE IF EXISTS Department;
DROP TABLE IF EXISTS Publisher;
DROP TABLE IF EXISTS Author;


CREATE TABLE IF NOT EXISTS Author (
    author_id INT PRIMARY KEY,
    author_name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Publisher(
    publisher_id INT PRIMARY KEY,
    publisher_name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Committee (
    committee_id INT PRIMARY KEY,
    committee_member_name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Item (
    item_id INT PRIMARY KEY,
    title VARCHAR(255),
    publication_year INT,
    author_id INT,
    publisher_id INT,
    FOREIGN KEY (author_id) REFERENCES Author(author_id),
    FOREIGN KEY (publisher_id) REFERENCES Publisher(publisher_id)
);

CREATE TABLE IF NOT EXISTS Book (
    book_id INT PRIMARY KEY,
    edition_number INT,
    item_id INT,
    FOREIGN KEY (item_id) REFERENCES Item(item_id)
);

CREATE TABLE IF NOT EXISTS Thesis (
    thesis_id INT PRIMARY KEY,
    item_id INT,
    department_id INT,
    committee_id INT,
    FOREIGN KEY (item_id) REFERENCES Item(item_id),
    FOREIGN KEY (department_id) REFERENCES Department(department_id),
    FOREIGN KEY (committee_id) REFERENCES Committee(committee_id)
);

CREATE TABLE IF NOT EXISTS Dissertation (
    dissertation_id INT PRIMARY KEY,
    item_id INT,
    department_id INT,
    committee_id INT,
    FOREIGN KEY (item_id) REFERENCES Item(item_id),
    FOREIGN KEY (department_id) REFERENCES Department(department_id),
    FOREIGN KEY (committee_id) REFERENCES Committee(committee_id)
);

CREATE TABLE IF NOT EXISTS ConferencePaper (
    conference_paper_id INT PRIMARY KEY,
    conference_name VARCHAR(255),
    location VARCHAR(255),
    period VARCHAR(255),
    item_id INT,
    FOREIGN KEY (item_id) REFERENCES Item(item_id)
);

CREATE TABLE IF NOT EXISTS JournalPaper (
    journal_paper_id INT PRIMARY KEY,
    journal_name VARCHAR(255),
    item_id INT,
    FOREIGN KEY (item_id) REFERENCES Item(item_id)
);

CREATE TABLE IF NOT EXISTS ResearchReport (
    research_report_id INT PRIMARY KEY,
    item_id INT,
    FOREIGN KEY (item_id) REFERENCES Item(item_id)
);

CREATE TABLE IF NOT EXISTS Magazine (
    magazine_id INT PRIMARY KEY,
    item_id INT,
    FOREIGN KEY (item_id) REFERENCES Item(item_id)
);
</pre>
