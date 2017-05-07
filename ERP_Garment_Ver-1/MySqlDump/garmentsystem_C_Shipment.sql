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
INSERT INTO `C_Shipment` VALUES ('SHI4879g56','Arise','Dilli','1048952','Select','2017-05-03','2017-04-19','Chathu','Low '),('SHPMT1326a65a7','aw','ras','14792','UK','2017-04-03','2017-04-03','fdr','kase'),('SHPMT13498d4db','chathu','colombo','0113497853','UK','2017-04-03','2017-04-03','tiny','High Qulity'),('SHPMT1349a169d','Andrw','Hydrabath','05579842','India','2017-03-01','2017-03-21','Tiny','Half '),('SHPMT134a1fa70','Benjamin','London','79451258','UK','2017-02-13','2017-04-01','Chathu','Out of qulity'),('SHPMT134a50f0d','Mifraz','Lahor','0987456','Pakisthan','2017-01-03','2017-03-21','Umana','Good Servise'),('SHPMT18774b02f','tiny','angoda','0112729729','Pakisthan','2017-02-16','2017-02-28','rumana','MNFT'),('SHPMT1d6e153a2','gh','hg','1234','USA','2017-05-04','2017-05-04','gfy','ghyt'),('SHPMT1dc45f200','dffgf','sdfgsdf','dfgsdf','Select','2017-05-05','2017-05-17','uyt8','hgfruyr'),('SHPMT1df233c9f','jfhgj','uitooi','164855','Select','2017-05-06','2017-05-01','yrt75t','hrgt7we5'),('SHPMT1df308e58','jfhgf','jhdguia','huitwg','India','2017-05-02','2017-04-25','jdhfgu','ne7rqw'),('SHPMT1df375321','jhdfd','jeuer','jhere','Select','2017-05-06','2017-05-01','yawg','jheru');
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

-- Dump completed on 2017-05-07  3:24:23
