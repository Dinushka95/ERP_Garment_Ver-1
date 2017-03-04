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
  `status-Approval` varchar(45) DEFAULT NULL,
  `status-ApprovalName` varchar(45) DEFAULT NULL,
  `status-ApprovalDate` date DEFAULT NULL,
  `customer_table_CustomerId` varchar(45) NOT NULL,
  `users_table_userId` int(11) NOT NULL,
  PRIMARY KEY (`DesignInquiryId`),
  KEY `fk_designinquiry_table_customer_table1_idx` (`customer_table_CustomerId`),
  KEY `fk_designinquiry_table_users_table1_idx` (`users_table_userId`),
  CONSTRAINT `fk_designinquiry_table_customer_table1` FOREIGN KEY (`customer_table_CustomerId`) REFERENCES `d_customer_table` (`CustomerId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_designinquiry_table_users_table1` FOREIGN KEY (`users_table_userId`) REFERENCES `users_table` (`userId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `d_designinquiry_table`
--

LOCK TABLES `d_designinquiry_table` WRITE;
/*!40000 ALTER TABLE `d_designinquiry_table` DISABLE KEYS */;
INSERT INTO `d_designinquiry_table` VALUES ('sdi179618a5c',NULL,'432434','2017-02-26','2017-02-26','false','null',NULL,'cus117af5300',1),('sdi179654e37',NULL,'addsdsad','2017-02-26','2017-02-26','false','null',NULL,'cus172a652a0',1),('sdi179988519',NULL,'b nb bn ghv','2017-02-26','2017-02-26','false','null',NULL,'cus117aef1ad',1),('sdi1799e4662',NULL,'adsada','2017-02-26','2017-02-26','false','null',NULL,'cus172a652a0',1),('sdi179a9bcb7','sdfdfsdf','zxczx cfdfs','2017-02-26','2017-02-26','false','null',NULL,'cus117ae8487',1),('sdi197e582b3','TAta booohuuu','its looks nice','2017-03-04','2017-03-13','false','null',NULL,'cus117ae8487',1),('sdi197ed3b01','dadada','wqeweqqwwq','2017-03-04','2017-03-22','false','null',NULL,'cus117aef1ad',1),('sdi197efdaa1','asddaasd','asdd','2017-03-04','2017-03-24','false','null',NULL,'cus117aef1ad',1);
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

-- Dump completed on 2017-03-04 11:58:06
