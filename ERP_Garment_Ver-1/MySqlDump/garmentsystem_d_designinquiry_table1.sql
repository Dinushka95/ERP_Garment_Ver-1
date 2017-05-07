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
-- Table structure for table `d_designinquiry_table1`
--

DROP TABLE IF EXISTS `d_designinquiry_table1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `d_designinquiry_table1` (
  `DesignInquiryId` varchar(45) NOT NULL,
  `Size` varchar(45) NOT NULL,
  `Quantity` varchar(45) NOT NULL,
  `Colour` varchar(45) NOT NULL,
  `Description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`DesignInquiryId`,`Size`,`Quantity`,`Colour`),
  KEY `fk_designinquiry_table1_designinquiry_table1_idx` (`DesignInquiryId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `d_designinquiry_table1`
--

LOCK TABLES `d_designinquiry_table1` WRITE;
/*!40000 ALTER TABLE `d_designinquiry_table1` DISABLE KEYS */;
INSERT INTO `d_designinquiry_table1` VALUES ('mdi12fb086a1','MS','1','Magenta',''),('sdi12df09c06','4XL','7','Sky Blue',''),('sdi12df09c06','L','5','Blue','Nave Blue'),('sdi12df09c06','MS','3','Magenta',''),('sdi12dfd8c09','2XL','5','Magenta',''),('sdi12dfd8c09','4XL','4','Blue',''),('sdi12e092b7f','L','5','Blood Red','plan soild colour'),('sdi12e0cec60','3XL','8','Blue',''),('sdi1324e3894','M','2','Magenta',''),('sdi1324e3894','XL','4','Light Blue','');
/*!40000 ALTER TABLE `d_designinquiry_table1` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  3:25:28
