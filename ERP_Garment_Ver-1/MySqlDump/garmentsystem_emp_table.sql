CREATE DATABASE  IF NOT EXISTS `garmentsystem` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `garmentsystem`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: itp2016ver1fdgd.cht0bvbob1wj.us-west-2.rds.amazonaws.com    Database: garmentsystem
-- ------------------------------------------------------
-- Server version	5.6.27-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `emp_table`
--

DROP TABLE IF EXISTS `emp_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emp_table` (
  `emp_id` int(11) NOT NULL,
  `f_name` varchar(100) DEFAULT NULL,
  `l_name` varchar(100) DEFAULT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `nic` varchar(10) DEFAULT NULL,
  `nationaliy` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `depid` varchar(50) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobile_no` int(11) DEFAULT NULL,
  `catergory` varchar(45) DEFAULT NULL,
  `position` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp_table`
--

LOCK TABLES `emp_table` WRITE;
/*!40000 ALTER TABLE `emp_table` DISABLE KEYS */;
INSERT INTO `emp_table` VALUES (1,'admin','admin','Male','908765432v','Sri','90,galle road','2017-04-21','0','a@gmail.com',771276548,NULL,'Admin'),(2,'Harry ','Style','Male','942345098v','Sri','77,jaffna','2017-04-21','1','vihangi@gmail.com',776789876,NULL,'Manager'),(3,'Surosh Chavi','Daluwatte','Male','941247812V','Sri','264/3','2017-04-14','2','c@gmail.com',777859875,NULL,'Employee'),(4,'Aaquiff','Rauf','Male','951278690v','Sri','90.boralla','2017-04-24','3','r@gmail.com',771234567,NULL,'Manager'),(5,'Bhagya','Witharana','Female','908976543v','Sri','78,colombo','2017-04-28','4','bhagya@gmail.com',332289765,NULL,'Technian'),(6,'Adith','Perera','Male','891254879v','Sri','Galle,pinnadoowa','2017-04-21','5','adithya89@gmail.com',987654321,NULL,'Technician'),(7,'Ruth','Perera','Male','679876543v','Sri','6,ja ela','2017-04-20','5','r@gmail.com',987654320,NULL,'Technician'),(8,'Ziyan','Mohommad','Male','679012345v','Sri','78,Gampaha','2014-12-01','11','ziyan@gmail.com',987654321,NULL,'Supervisor'),(9,'Uvini','Galappaththi','Female','945678907v','Sri','67,galle','2014-12-15','2','v@gmail.com',981235678,NULL,'Supervisor'),(10,'dimansha','Malrindu','Male','781298678v','Sri','78,kurunagala','2017-04-02','3','dimansha@gmail.com',789765439,NULL,'Supervisor'),(11,'Vimal','Perera','Male','781234567v','Sri','78,ja ela','2016-08-15','5','vimal@gmail.com',771234567,NULL,'Supervisor'),(12,'Isuru','kamal','Male','901234567v','Sri','89,gmpaha','2015-11-16','8','isuru@gmail.com',779023456,NULL,'Supervisor'),(13,'dinushaka','perera','Female','907612345v','Sri','12,colombo','2017-04-21','7','di@gmail.com',771628264,NULL,'Supervisor'),(78,'m sl','zk ml f','Male','941571840v','Sri','VWPVowk','2017-05-24','12','t@gmail.com',775465235,NULL,'Supervisor'),(79,'adflkj','akdflkajdf','Male','951193852v','Sri','AKJFDAF','2017-05-09','10','aaquiff@gmail.com',773946070,NULL,'Supervisor'),(80,'Uvini','Galappaththi','Female','941278965v','Sri','78,Matara','2017-05-10','13','u@gmail.com',771628264,NULL,'Supervisor'),(81,'Dilan','perera','Male','973563378V','Sri','Colombo','2017-05-18','11','a@gmail.com',876524562,NULL,NULL),(82,'admin','admin','Male','908765432v','Sri','90,galle road','2017-04-21','0','a@gmail.com',771276548,NULL,NULL),(83,'admin','admin','Male','908765432v','Sri','90,galle road','2017-04-21','0','a@gmail.com',771276548,NULL,NULL),(84,'Kalpa','Dias','Male','954512345v','Sri','7,dgalle','2016-12-13','','k@gmail.com',771628264,NULL,NULL),(85,'Amal','Perera','Male','890978654v','Sri','7,galles','2015-12-07','2','a@gmail.com',771234567,NULL,NULL),(86,'Rangana','Gune','Male','901234567v','Sri','5,galle','2017-05-31','3','v@gmail.com',771628264,NULL,NULL),(87,'Rangana','Gune','Male','901234567v','Sri','5,galle','2017-05-31','3','v@gmail.com',771628264,NULL,NULL);
/*!40000 ALTER TABLE `emp_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-08 17:48:35
