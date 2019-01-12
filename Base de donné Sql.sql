/*
SQLyog Ultimate v11.5 (64 bit)
MySQL - 10.1.29-MariaDB : Database - bdcoc
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bdcoc` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `bdcoc`;

/*Table structure for table `cine` */

DROP TABLE IF EXISTS `cine`;

CREATE TABLE `cine` (
  `idEtudiant` int(4) NOT NULL AUTO_INCREMENT,
  `noms` varchar(20) NOT NULL,
  `prenoms` varchar(20) DEFAULT NULL,
  `matricule` varchar(10) NOT NULL,
  `telephone` varchar(25) NOT NULL,
  `filmreservés` varchar(25) NOT NULL,
  `nbreplaces` int(3) NOT NULL,
  `date` varchar(20) NOT NULL,
  PRIMARY KEY (`idEtudiant`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `cine` */

insert  into `cine`(`idEtudiant`,`noms`,`prenoms`,`matricule`,`telephone`,`filmreservés`,`nbreplaces`,`date`) values (1,'BODIONG','JOSPIN','14T7389','678390385','TONY',3,'Samedi1janvier'),(2,'BODIONG','JOSPIN','14T841','678920730','HITMan',7,'15janvier');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
