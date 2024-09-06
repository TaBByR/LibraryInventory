DROP TABLE IF EXISTS book;

CREATE TABLE book (
  id INTEGER NOT NULL AUTO_INCREMENT,
  title VARCHAR(64) NOT NULL,
  author VARCHAR(64) NOT NULL,
  isbn VARCHAR(64) NOT NULL,
  published_date DATE NOT NULL,
  price DOUBLE(10,2) NOT NULL,
  version INTEGER DEFAULT '1',
  creation_time TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  update_time TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);

INSERT INTO book (title, author, isbn, published_date, price)
VALUES
('The Fellowship of the Ring', 'J.R.R.Tolkien', "9780261102354", "1954-07-29", 11.69),
('The Two Towers', 'J.R.R.Tolkien', "9780345339713", "1954-11-11", 12.59),
('The Return of the King', 'J.R.R.Tolkien', "9780345339737", "1955-10-20", 15)
;
