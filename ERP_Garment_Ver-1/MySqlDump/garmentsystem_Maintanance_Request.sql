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
-- Table structure for table `Maintanance_Request`
--

DROP TABLE IF EXISTS `Maintanance_Request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Maintanance_Request` (
  `MaintenancesID` varchar(45) NOT NULL DEFAULT '',
  `Description` varchar(45) DEFAULT NULL,
  `MachineID` varchar(45) DEFAULT NULL,
  `MachineType` varchar(45) DEFAULT NULL,
  `Department` varchar(45) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  PRIMARY KEY (`MaintenancesID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Maintanance_Request`
--

LOCK TABLES `Maintanance_Request` WRITE;
/*!40000 ALTER TABLE `Maintanance_Request` DISABLE KEYS */;
INSERT INTO `Maintanance_Request` VALUES ('464ihbh','hghgu','Maintenance','gh','2017-04-03',NULL),('ma113','ghhh','Maintenance','ljoljoj','2017-05-04',NULL),('ma114','hghgu','Maintenance','gh','2017-05-04',NULL),('ma115','hghgu','Maintenance','gh','2017-05-04',NULL),('ma123-6','good','m23','Swing Machine','Inventory','2017-05-06'),('ma123-623','good','m23','Swing Machine','Inventory','2017-05-06'),('MID1dd4a139e','gegg','rgeggerg','Washing Machine','Maintenance','2017-05-06'),('w223','good','Human Resource','a223','2017-04-03',NULL);
/*!40000 ALTER TABLE `Maintanance_Request` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  3:24:55
