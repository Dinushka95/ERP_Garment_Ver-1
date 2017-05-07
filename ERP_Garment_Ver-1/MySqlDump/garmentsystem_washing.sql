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
-- Table structure for table `washing`
--

DROP TABLE IF EXISTS `washing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `washing` (
  `washing_ID` varchar(45) NOT NULL,
  `style_ID` varchar(45) DEFAULT NULL,
  `WashSchedule` varchar(45) DEFAULT NULL,
  `damages` int(11) DEFAULT NULL,
  `pcs` int(11) DEFAULT NULL,
  `Sewing_ID` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`washing_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `washing`
--

LOCK TABLES `washing` WRITE;
/*!40000 ALTER TABLE `washing` DISABLE KEYS */;
INSERT INTO `washing` VALUES ('WASH-12e797861','STY124da5ebd','WSH-SHI129dbc5c0',5,69,NULL),('WASH-1c2dc4978','STY1887b74a8','WSH-SHI12a46d39d',45,4,NULL),('WASH-1d9b86257','STY124da5ebd','WSH-SHI129dbc5c0',2,3,NULL),('WASH-1dc947979','STY124da5ebd','WSH-SHI129dbc5c0',32,22,NULL),('WASH-1dc9621df','STY124da5ebd','WSH-SHI12d3e2368',3,51,NULL),('WASH-1dc9be960','STY124da5ebd','WSH-SHI12d3e2368',3,51,'SEW-12e4e8eeb'),('WASH-1deada077','STY124da5ebd','WSH-SHI129dbc5c0',3,51,'SEW-12e4e8eeb');
/*!40000 ALTER TABLE `washing` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  3:26:59
