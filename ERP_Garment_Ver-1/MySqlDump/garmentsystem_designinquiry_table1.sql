CREATE DATABASE  IF NOT EXISTS `garmentsystem` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `garmentsystem`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: garmentsystem
-- ------------------------------------------------------
-- Server version	5.7.15-log

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
-- Table structure for table `designinquiry_table1`
--

DROP TABLE IF EXISTS `designinquiry_table1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `designinquiry_table1` (
  `designinquiry_table_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Size` varchar(45) NOT NULL,
  `Quantity` varchar(45) NOT NULL,
  `Colour` varchar(45) DEFAULT NULL,
  `status-DesignCreated` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`designinquiry_table_ID`,`Size`,`Quantity`),
  KEY `fk_designinquiry_table1_designinquiry_table1_idx` (`designinquiry_table_ID`),
  CONSTRAINT `fk_designinquiry_table1_designinquiry_table1` FOREIGN KEY (`designinquiry_table_ID`) REFERENCES `designinquiry_table` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `designinquiry_table1`
--

LOCK TABLES `designinquiry_table1` WRITE;
/*!40000 ALTER TABLE `designinquiry_table1` DISABLE KEYS */;
INSERT INTO `designinquiry_table1` VALUES (4,'1','1',NULL,NULL),(4,'1','2',NULL,NULL),(4,'11111','11111',NULL,NULL),(4,'1111111','111111111',NULL,NULL),(4,'1111111','11111111111',NULL,NULL),(4,'111111111','11111111',NULL,NULL),(4,'111111111','111111111111',NULL,NULL),(4,'2','2',NULL,NULL),(4,'22','22',NULL,NULL),(4,'3','3',NULL,NULL),(4,'3','4',NULL,NULL),(9,'222222222','2222222',NULL,NULL),(10,'111','11111',NULL,NULL),(11,'44444444','4444444',NULL,NULL),(11,'44444444','44444444',NULL,NULL),(12,'69','69','69','false'),(12,'96','96','96','false');
/*!40000 ALTER TABLE `designinquiry_table1` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-17 14:03:02
