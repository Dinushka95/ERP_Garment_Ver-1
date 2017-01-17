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
-- Table structure for table `designinquiry_table`
--

DROP TABLE IF EXISTS `designinquiry_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `designinquiry_table` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `SalesDesignInquiryId` varchar(45) DEFAULT NULL,
  `MarketDesignInquiryId` varchar(45) DEFAULT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `AddedDate` date DEFAULT NULL,
  `DueDate` date DEFAULT NULL,
  `status-Approval` varchar(45) DEFAULT NULL,
  `status-ApprovalName` varchar(45) DEFAULT NULL,
  `status-DesignCreated` varchar(45) DEFAULT NULL,
  `status-DesignCreatedName` varchar(45) DEFAULT NULL,
  `users_table_userId` int(11) NOT NULL,
  `customer_table_CustomerId` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_designinquiry_table_users_table1_idx` (`users_table_userId`),
  KEY `fk_designinquiry_table_customer_table1_idx` (`customer_table_CustomerId`),
  CONSTRAINT `fk_designinquiry_table_customer_table1` FOREIGN KEY (`customer_table_CustomerId`) REFERENCES `customer_table` (`CustomerId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_designinquiry_table_users_table1` FOREIGN KEY (`users_table_userId`) REFERENCES `users_table` (`userId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `designinquiry_table`
--

LOCK TABLES `designinquiry_table` WRITE;
/*!40000 ALTER TABLE `designinquiry_table` DISABLE KEYS */;
INSERT INTO `designinquiry_table` VALUES (4,'sdi16929608d',NULL,'test','2017-01-04','2017-01-04','false','null','false','null',1,'cus117ae8487'),(8,NULL,'mdi18b5f3f31','1111111111111','2017-01-11','2017-01-11','false','null','false','null',1,NULL),(9,NULL,'mdi18b656164','22222222222222','2017-01-11','2017-01-11','false','null','false','null',1,NULL),(10,'sdi18b668a93',NULL,'11111111111','2017-01-11','2017-01-11','false','null','false','null',1,'cus13b6b8b78'),(11,NULL,'mdi18b67394b','44444444444444','2017-01-11','2017-01-11','true','test','false','null',1,NULL),(12,'sdi1968f15c7',NULL,'9669','2017-01-13','2017-01-13','false','null','false','null',1,'cus13b6b8b78');
/*!40000 ALTER TABLE `designinquiry_table` ENABLE KEYS */;
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
