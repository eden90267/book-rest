# book-rest #

## DDL Script(mysql version: 5.7.12) ##

    # for 5.7.x
    SET GLOBAL  validate_password_policy='LOW';
    
    CREATE SCHEMA `books` DEFAULT CHARACTER SET utf8 ;

    CREATE USER booksadmin@localhost IDENTIFIED BY 'bookspassword';
    GRANT ALL PRIVILEGES ON books.* TO booksadmin@localhost IDENTIFIED BY 'bookspassword';
    FLUSH PRIVILEGES;

    CREATE TABLE `books`.`book` (
      `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
      `bookname` VARCHAR(255) NULL DEFAULT NULL COMMENT '圖書名稱',
      `bookprice` DOUBLE NULL DEFAULT NULL COMMENT '圖書價格',
      `bookimage` VARCHAR(255) NULL DEFAULT NULL COMMENT '圖書封面',
      `createtime` DATETIME NULL DEFAULT NULL COMMENT '創建時間',
      PRIMARY KEY (`id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8;

## Step. ##

1. exec DDL Script to mysql(as stated above)
2. terminal: java -jar build/libs/book-rest-1.0.0.jar

*P.S. db username and db password must correspond with application.properties