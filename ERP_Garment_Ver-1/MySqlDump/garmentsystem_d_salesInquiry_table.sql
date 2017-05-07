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
-- Table structure for table `d_salesInquiry_table`
--

DROP TABLE IF EXISTS `d_salesInquiry_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `d_salesInquiry_table` (
  `SalesInquiryId` varchar(45) NOT NULL,
  `Date` date DEFAULT NULL,
  `Note` varchar(45) DEFAULT NULL,
  `EstimatePurchaseDate` date DEFAULT NULL,
  `discountRate` varchar(45) DEFAULT NULL,
  `total` varchar(45) DEFAULT NULL,
  `CustomerId` varchar(45) DEFAULT NULL,
  `userId` varchar(45) DEFAULT NULL,
  `grandTotal` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`SalesInquiryId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `d_salesInquiry_table`
--

LOCK TABLES `d_salesInquiry_table` WRITE;
/*!40000 ALTER TABLE `d_salesInquiry_table` DISABLE KEYS */;
INSERT INTO `d_salesInquiry_table` VALUES ('sii12ea8e452','2017-04-02','','2017-04-19','7.5','1300.0','cus12de21000','1','1202.5'),('sii12eb5dfa4','2017-04-02','','2017-04-04','2.5','2100.0','cus12d3cc7f2','1','2047.5'),('sii12ebbc75f','2017-04-02','','2017-04-19','10','6250.0','cus12de21000','1','5625.0'),('sii132510b6d','2017-04-03','','2017-04-20','5','4200.0','cus12cef4dfc','1','3990.0'),('sii17d95ffa9','2017-02-27','hahha hari hava ','2017-02-28','2.5','11750.0','cus117af5300','1','11456.25'),('sii1dcd9f62c','2017-05-06','','2017-05-09','5','12500.0','cus1324a1b3d','1','11875.0');
/*!40000 ALTER TABLE `d_salesInquiry_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  3:25:03
