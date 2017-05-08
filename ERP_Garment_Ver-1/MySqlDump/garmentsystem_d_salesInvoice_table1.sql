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
-- Table structure for table `d_salesInvoice_table1`
--

DROP TABLE IF EXISTS `d_salesInvoice_table1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `d_salesInvoice_table1` (
  `salesInvoiceId` varchar(45) NOT NULL,
  `ProductId` varchar(45) NOT NULL,
  `Quantity` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`salesInvoiceId`,`ProductId`),
  KEY `fk_salesInvoice_table1_salesInvoice_table1_idx` (`salesInvoiceId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `d_salesInvoice_table1`
--

LOCK TABLES `d_salesInvoice_table1` WRITE;
/*!40000 ALTER TABLE `d_salesInvoice_table1` DISABLE KEYS */;
INSERT INTO `d_salesInvoice_table1` VALUES ('sin130fb2758','FGD17a1683cd','2'),('sin1314a7dc7','FGD17a1683cd','2'),('sin1314a7dc7','FGD17a7c3f81','2'),('sin1314ecdfb','FGD17a1683cd','2'),('sin1314ecdfb','FGD17a7c3f81','1'),('sin13151aa2e','FGD17a1683cd','1'),('sin13151aa2e','FGD17a7c3f81','1'),('sin1315e9c3e','FGD17a1683cd','1'),('sin1315e9c3e','FGD17a7c3f81','1'),('sin1322722bb','FGD131ee1f2c','1'),('sin17fda24b4','FGD17a7c3f81','7'),('sin1dce35aee','FGD17a7c3f81','12'),('sin1dcee5321','FGD17a7c3f81','12');
/*!40000 ALTER TABLE `d_salesInvoice_table1` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-08 17:48:01
