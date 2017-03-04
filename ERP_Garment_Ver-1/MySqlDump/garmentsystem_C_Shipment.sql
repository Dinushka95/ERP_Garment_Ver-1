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
-- Table structure for table `C_Shipment`
--

DROP TABLE IF EXISTS `C_Shipment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `C_Shipment` (
  `Shipment_id` varchar(45) NOT NULL,
  `Supplier` varchar(45) DEFAULT NULL,
  `Adress` varchar(50) DEFAULT NULL,
  `Phone` varchar(10) DEFAULT NULL,
  `From` varchar(45) DEFAULT NULL,
  `Shipped_date` date DEFAULT NULL,
  `Dlivery_date` date DEFAULT NULL,
  `Recieved_by` varchar(45) DEFAULT NULL,
  `Discription` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Shipment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `C_Shipment`
--

LOCK TABLES `C_Shipment` WRITE;
/*!40000 ALTER TABLE `C_Shipment` DISABLE KEYS */;
INSERT INTO `C_Shipment` VALUES ('SHPMT18774b02f','tiny','angoda','0112729729','Pakisthan','2017-02-16','2017-02-28','rumana','buhahaha'),('SHPMT18cd6ae0f','hguy','tr7io','ytr7','UK','2017-03-01','2017-03-02','e6o9bg80','tr8798');
/*!40000 ALTER TABLE `C_Shipment` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-04 12:00:59
