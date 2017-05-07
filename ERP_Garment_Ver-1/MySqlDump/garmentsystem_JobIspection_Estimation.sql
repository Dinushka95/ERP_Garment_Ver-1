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
-- Table structure for table `JobIspection_Estimation`
--

DROP TABLE IF EXISTS `JobIspection_Estimation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `JobIspection_Estimation` (
  `MachineID` varchar(45) NOT NULL DEFAULT '',
  `Description` varchar(45) DEFAULT NULL,
  `Department` varchar(45) DEFAULT NULL,
  `MachinePart` varchar(45) DEFAULT NULL,
  `TechnianID` varchar(45) DEFAULT NULL,
  `TechnicianName` varchar(45) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  PRIMARY KEY (`MachineID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `JobIspection_Estimation`
--

LOCK TABLES `JobIspection_Estimation` WRITE;
/*!40000 ALTER TABLE `JobIspection_Estimation` DISABLE KEYS */;
INSERT INTO `JobIspection_Estimation` VALUES ('ACC13110c27a','bad','Inventory','MAC_PRT1f46d7a0e','ACC13110c279','Tharanga','2017-04-03'),('ACC131111f27','Normal','Inventory','MAC_PRT1f46d7a0e','ACC131111f26','Sajan','2017-04-03'),('ACC131239dff','Normal','Inventory','MAC_PRT1f46d7a0e','ACC131239dff','Maleesha','2017-04-03'),('ACC13211421a','good','Maintenance','MAC_PRT1f470c6a4','ACC13211421a','Nadun','2017-04-03');
/*!40000 ALTER TABLE `JobIspection_Estimation` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  3:23:33
