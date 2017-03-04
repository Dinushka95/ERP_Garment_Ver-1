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
-- Table structure for table `d_salesInvoice_table`
--

DROP TABLE IF EXISTS `d_salesInvoice_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `d_salesInvoice_table` (
  `salesInvoiceId` varchar(45) NOT NULL,
  `CustomerId` varchar(45) DEFAULT NULL,
  `SalesInquiryId` varchar(45) DEFAULT NULL,
  `discount` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `total` varchar(45) DEFAULT NULL,
  `GrandTotal` varchar(45) DEFAULT NULL,
  `userId` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`salesInvoiceId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `d_salesInvoice_table`
--

LOCK TABLES `d_salesInvoice_table` WRITE;
/*!40000 ALTER TABLE `d_salesInvoice_table` DISABLE KEYS */;
INSERT INTO `d_salesInvoice_table` VALUES ('sin17fda24b4','cus178d439cd','','2.5','2017-02-27','8750.0','8750.0','1');
/*!40000 ALTER TABLE `d_salesInvoice_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-04 12:05:44
