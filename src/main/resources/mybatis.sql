/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.44 : Database - springboot-mybatis
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`springboot-mybatis` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `springboot-mybatis`;

/*Table structure for table `tbl_class` */

DROP TABLE IF EXISTS `tbl_class`;

CREATE TABLE `tbl_class` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(20) DEFAULT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`c_id`),
  KEY `fk_teacher_id` (`teacher_id`),
  CONSTRAINT `fk_teacher_id` FOREIGN KEY (`teacher_id`) REFERENCES `tbl_teacher` (`t_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `tbl_class` */

insert  into `tbl_class`(`c_id`,`c_name`,`teacher_id`) values (1,'科技一班',1),(2,'科技二班',2),(3,'科技三班',3);

/*Table structure for table `tbl_item` */

DROP TABLE IF EXISTS `tbl_item`;

CREATE TABLE `tbl_item` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(20) DEFAULT NULL,
  `parent_item_id` int(11) DEFAULT NULL COMMENT '父ID',
  `zt` int(11) DEFAULT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `tbl_item` */

insert  into `tbl_item`(`item_id`,`item_name`,`parent_item_id`,`zt`) values (1,'测评项1',NULL,1),(2,'测评项1-1',1,1),(3,'测评项1-2',1,1),(4,'测评项1-3',1,1),(5,'测评项1-2-1',3,1),(6,'测评项1-2-2',3,1),(7,'测评项1-3-1',4,1),(8,'测评项1-3-2',4,1),(9,'测评项2',NULL,1),(10,'测评项2-1',9,1),(11,'测评项2-2',9,1),(12,'测评项2-1-1',10,1),(13,'测评项2-1-2',10,NULL);

/*Table structure for table `tbl_student` */

DROP TABLE IF EXISTS `tbl_student`;

CREATE TABLE `tbl_student` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(20) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`s_id`),
  KEY `fk_class_id` (`class_id`),
  CONSTRAINT `fk_class_id` FOREIGN KEY (`class_id`) REFERENCES `tbl_class` (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `tbl_student` */

insert  into `tbl_student`(`s_id`,`s_name`,`class_id`) values (1,'学生1',1),(2,'学生2',1),(3,'学生3',2),(4,'学生4',2),(5,'学生5',2),(6,'学生6',3);

/*Table structure for table `tbl_teacher` */

DROP TABLE IF EXISTS `tbl_teacher`;

CREATE TABLE `tbl_teacher` (
  `t_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `tbl_teacher` */

insert  into `tbl_teacher`(`t_id`,`t_name`) values (1,'张三'),(2,'李四'),(3,'王五');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
