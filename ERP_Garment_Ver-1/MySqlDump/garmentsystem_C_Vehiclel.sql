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
-- Table structure for table `C_Vehiclel`
--

DROP TABLE IF EXISTS `C_Vehiclel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `C_Vehiclel` (
  `VehicalID` varchar(45) NOT NULL,
  `Type` varchar(45) DEFAULT NULL,
  `LysonNum` varchar(45) DEFAULT NULL,
  `Milage` float DEFAULT NULL,
  `DriverID` varchar(45) DEFAULT NULL,
  `DriverName` varchar(45) DEFAULT NULL,
  `Engine_num` varchar(45) DEFAULT NULL,
  `Service_duration` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`VehicalID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `C_Vehiclel`
--

LOCK TABLES `C_Vehiclel` WRITE;
/*!40000 ALTER TABLE `C_Vehiclel` DISABLE KEYS */;
INSERT INTO `C_Vehiclel` VALUES ('VEH12cecb9ae','Lorry','A458S4568',6,'Ya789','Kumar','3month','3month'),('VEH12d020b59','Bike','Ne457A65',98,'DR1459','Wenura','MV49761','5'),('VEH134aca984','Lorry','MG4569',497,'DR249','Aman','AIY498','3month'),('VEH1a06fc46e','Van','HY47895',500000,'DR5789','Kelum','M1428888','5month');
/*!40000 ALTER TABLE `C_Vehiclel` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  3:27:48
