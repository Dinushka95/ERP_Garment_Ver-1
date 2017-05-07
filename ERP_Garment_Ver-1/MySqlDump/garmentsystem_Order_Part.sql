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
-- Table structure for table `Order_Part`
--

DROP TABLE IF EXISTS `Order_Part`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Order_Part` (
  `OrderID` varchar(45) NOT NULL DEFAULT '0',
  `Description` varchar(45) DEFAULT NULL,
  `CompanyName` varchar(45) DEFAULT NULL,
  `Amount` float DEFAULT NULL,
  `TechnicianID` varchar(45) DEFAULT NULL,
  `TechnicianName` varchar(45) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  PRIMARY KEY (`OrderID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Order_Part`
--

LOCK TABLES `Order_Part` WRITE;
/*!40000 ALTER TABLE `Order_Part` DISABLE KEYS */;
INSERT INTO `Order_Part` VALUES ('ACC12ff3a7e9','Good','SINGER',1000,'Technician ID','Manesha','2017-04-03'),('ACC12ff83ebb','good','SINGER',155,'Technician ID','suni','2017-04-03'),('ACC131cdddda','Bad','SINGER',500,'Technician ID','Nimal','2017-04-03'),('ACC132052000','Normal','SINGER',500,'Technician ID','Tiny','2017-04-03'),('ACC1321c4b0b','Bad','SINGER',500,'Technician ID','Tiny','2017-04-03'),('ACC1321d5b56','Normal','SINGER',10000,'Technician ID','Vihan','2017-04-03'),('ACC1327c8fff','good','SINGER',1000,'6','Adith','2017-04-03'),('ACC1d18db06d','bad','SINGER',5000,'Technician ID','sunil','2017-05-04'),('CONT18947a346','hu',NULL,9000,'fyt12','gu','2017-03-01'),('o_1296f7900','good','ABANS',8768,'6','Adithya','2017-04-01');
/*!40000 ALTER TABLE `Order_Part` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  3:21:46
