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
-- Table structure for table `r_Iron_and_Packing_Schedule`
--

DROP TABLE IF EXISTS `r_Iron_and_Packing_Schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `r_Iron_and_Packing_Schedule` (
  `Schedule_ID` varchar(45) NOT NULL,
  `Style_ID` varchar(45) NOT NULL,
  `Type` varchar(45) NOT NULL,
  `Room_No` varchar(45) NOT NULL,
  `No_of_Labourers` int(11) NOT NULL,
  `Start_Date` date NOT NULL,
  `End_Date` date NOT NULL,
  `Supervisor_ID` varchar(45) NOT NULL,
  `Days_per_Sample` int(11) NOT NULL,
  `Washing_ID` varchar(45) DEFAULT NULL,
  `Quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`Schedule_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `r_Iron_and_Packing_Schedule`
--

LOCK TABLES `r_Iron_and_Packing_Schedule` WRITE;
/*!40000 ALTER TABLE `r_Iron_and_Packing_Schedule` DISABLE KEYS */;
INSERT INTO `r_Iron_and_Packing_Schedule` VALUES ('eed','trt','Final ironinng/ pressing','tyu',5,'2017-04-03','2017-04-03','44',88,'dgf',45),('IAP-SHI12d589bfc','STY124da5ebd','No ironing/ pressing','I003',33,'2017-04-01','2017-04-02','4',33,'WSH-SHI129dbc5c0',5),('IAP-SHI12d645df8','STY124da5ebd','Final ironinng/ pressing','I002',55,'2017-04-19','2017-04-13','4',445,'5',5),('IAP-SHI1e6562aab','STY124da5ebd','Under ironing/ pressing','I003',22,'2017-05-12','2017-05-18','Uvini',222,'WSH-SHI129dbc5c0',5);
/*!40000 ALTER TABLE `r_Iron_and_Packing_Schedule` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-08 17:55:05
