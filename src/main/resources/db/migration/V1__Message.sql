CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `text` varchar(200) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
);
INSERT INTO `message` (id,name,text,created_date) VALUES (
  1,"John" , "Hello Thmeleaf" , "2018/10/11 12:11:13"
);
INSERT INTO `message` (id,name,text,created_date) VALUES (
  2,"Mike" , "Hello JPA" , "2012/1/23 9:34:02"
);