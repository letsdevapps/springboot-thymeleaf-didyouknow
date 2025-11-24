
CREATE TABLE tb_awards (
    award_id INT PRIMARY KEY AUTO_INCREMENT,
    award_year INT NOT NULL,
    category VARCHAR(255),
    author VARCHAR(255),
    title VARCHAR(255) NOT NULL,
    text VARCHAR(255),
    text_html VARCHAR(255)
);

CREATE TABLE tb_didyouknow (
    didyouknow_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    text VARCHAR(255),
    text_html VARCHAR(255)
);
