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
-- Table structure for table `r_Washing_Schedule_table`
--

DROP TABLE IF EXISTS `r_Washing_Schedule_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `r_Washing_Schedule_table` (
  `Schedule_ID` varchar(45) NOT NULL,
  `Style_ID` varchar(45) NOT NULL,
  `Days_per_Sample` int(11) NOT NULL,
  `Start_Date` date NOT NULL,
  `End_Date` date NOT NULL,
  `Supervisor_ID` varchar(45) NOT NULL,
  `No_of_Labourers` int(11) NOT NULL,
  `Type` varchar(45) NOT NULL,
  `Sewing_ID` varchar(45) DEFAULT NULL,
  `Qty` int(11) DEFAULT NULL,
  PRIMARY KEY (`Schedule_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `r_Washing_Schedule_table`
--

LOCK TABLES `r_Washing_Schedule_table` WRITE;
/*!40000 ALTER TABLE `r_Washing_Schedule_table` DISABLE KEYS */;
INSERT INTO `r_Washing_Schedule_table` VALUES ('WSH-SHI129c3c544','STY1887b74a8',55,'2017-04-28','2017-04-29','5',33,'Stone wash','SWG-SHI12817a864',44),('WSH-SHI129dbc5c0','STY124da5ebd',44,'2017-04-07','2017-04-13','5',55,'Normal wash','SWG-SHI12817a864',5),('WSH-SHI12a46d39d','STY1887b74a8',55,'2017-04-13','2017-04-06','5',55,'Normal wash','SWG-SHI12726ab9e',5),('WSH-SHI12a4817a3','STY1887b74a8',44,'2017-04-13','2017-04-21','5',44,'Normal wash','SWG-SHI12726ab9e',4),('WSH-SHI12bf80f32','STY1887b74a8',447,'2017-04-06','2017-04-28','5',44,'Normal wash','SWG-SHI12726ab9e',5),('WSH-SHI12d3e2368','STY124da5ebd',2,'2017-04-01','2017-04-02','5',5,'Normal wash','SWG-SHI1283fce94',44),('WSH-SHI1325fb49e','STY124da5ebd',666,'2017-04-07','2017-04-06','5',44,'Normal wash','SWG-SHI1283fce94',44),('WSH-SHI1e2cf4f5c','STY124da5ebd',33,'2017-05-12','2017-05-19','m sl',32,'Normal wash','SWG-SHI12817a864',44),('WSH-SHI1e3879280','STY124da5ebd',432,'2017-05-11','2017-05-30','m sl',9,'Normal wash','SWG-SHI129da5eb4',44),('WSH-SHI1e6554e1e','STY1887b74a8',453,'2017-05-11','2017-05-26','m sl',34,'Normal wash','SWG-SHI131f68a19',5);
/*!40000 ALTER TABLE `r_Washing_Schedule_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-08 17:50:25
