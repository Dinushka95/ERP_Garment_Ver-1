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
INSERT INTO `emp_table` VALUES (1,'dinush','dias','Male','245245','Sri','dghdgh','2017-04-21','cutting','dghdgh',245245245,NULL,'Admin'),(2,'Harry styles','Style','Male','942345098v','Sri','7789jh','2017-04-21','1','vihangi@gmail.com',776789876,NULL,'Manager'),(3,'Surosh Chavi','Daluwatte','Male','941247812V','Sri','264/3','2017-04-14','cutting','c@gmail.com',777859875,NULL,'Employee'),(4,'Aaquiff','Rauf','Male','245245','Sri','dghdgh','2017-04-24','iron&packing','dghdgh',24545,NULL,'Manager'),(5,'Bhagya','Witharana','Female','908976543v','Sri','78,colombo','2017-04-28','washing','bhagya@gmail.com',332289765,NULL,'Technian'),(6,'Adith','Perera','Male','891254879v','Sri','Galle,pinnadoowa','2017-04-21','sewing','adithya89@gmail.com',987654321,NULL,'Technician'),(7,'hbadhbfh','habdfhbakdf','Male','58597','Sri','hjhvjhv','2017-04-20','5','hjvjvhj',58757,NULL,'Technician'),(8,'Ziyan','Mohommad','Male','679012345v','Sri','78,Gampaha','2014-12-01','3','ziyan@gmail.com',987654321,NULL,'Designer'),(9,'Uvini','Galappaththi','Female','945678907v','Sri','67,galle','2014-12-15','2','2',981235678,NULL,NULL),(10,'dimansha','Malrindu','Male','781298678v','Sri','78,kurunagala','2017-04-02','3','dimansha@gmail.com',789765439,NULL,NULL),(11,'Vimal','Perera','Male','781234567v','Sri','78,ja ela','2016-08-15','5','vimal@gmail.com',771234567,NULL,NULL),(12,'Isuru','kamal','Male','901234567v','Sri','89,gmpaha','2015-11-16','3','isuru@gmail.com',779023456,NULL,NULL),(13,'dinushaka','perera','Female','907612345v','Sri','12,colombo','2017-04-21','7','di@gmail.com',771628264,NULL,NULL),(78,'m sl','zk ml f','Male','941571840v','Sri','VWPVowk','2017-05-24',' nSLJV s','t@gmail.com',775465235,NULL,NULL),(79,'adflkj','akdflkajdf','Male','951193852v','Sri','AKJFDAF','2017-05-09','Sample1','aaquiff@gmail.com',773946070,NULL,NULL);
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

-- Dump completed on 2017-05-07  3:22:11
