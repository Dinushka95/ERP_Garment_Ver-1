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
-- Table structure for table `d_designinquiry_table`
--

DROP TABLE IF EXISTS `d_designinquiry_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `d_designinquiry_table` (
  `DesignInquiryId` varchar(45) NOT NULL,
  `DesignName` varchar(45) DEFAULT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `AddedDate` date DEFAULT NULL,
  `DueDate` date DEFAULT NULL,
  `StatusApproval` varchar(45) DEFAULT NULL,
  `StatusApprovalName` varchar(45) DEFAULT NULL,
  `StatusApprovalDate` date DEFAULT NULL,
  `customer_table_CustomerId` varchar(45) NOT NULL,
  `users_table_userId` int(11) NOT NULL,
  PRIMARY KEY (`DesignInquiryId`),
  KEY `fk_designinquiry_table_users_table1_idx` (`users_table_userId`),
  CONSTRAINT `fk_designinquiry_table_users_table1` FOREIGN KEY (`users_table_userId`) REFERENCES `users_table` (`userId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `d_designinquiry_table`
--

LOCK TABLES `d_designinquiry_table` WRITE;
/*!40000 ALTER TABLE `d_designinquiry_table` DISABLE KEYS */;
INSERT INTO `d_designinquiry_table` VALUES ('mdi12fb086a1','tubatuo','','2017-04-02','2017-04-02','false','null',NULL,'1',1),('sdi12df09c06','dinusha','This should be targeted to april season','2017-04-02','2017-04-02','Approved','dinusha','2017-04-03','cus12ce9c7f6',1),('sdi12dfd8c09','dinusha','only for testing market','2017-04-02','2017-04-02','Approved','dinusha','2017-04-02','cus12cef4dfc',1),('sdi12e092b7f','dinusha','need  to long slives','2017-04-02','2017-04-02','Approved','admin','2017-05-07','cus12d3cc7f2',1),('sdi12e0cec60','dinusha','need 3xl as main design','2017-04-02','2017-04-02','false','null',NULL,'cus12de21000',1),('sdi1324e3894','dinusha','','2017-04-03','2017-04-03','false','null',NULL,'cus12cef4dfc',1),('sdi1e650ca14','admin','gery','2017-05-08','2017-05-08','false','null',NULL,'cus12d3cc7f2',1);
/*!40000 ALTER TABLE `d_designinquiry_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-08 17:49:17
