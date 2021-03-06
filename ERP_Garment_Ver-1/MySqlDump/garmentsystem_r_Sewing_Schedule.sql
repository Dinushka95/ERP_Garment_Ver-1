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
-- Table structure for table `r_Sewing_Schedule`
--

DROP TABLE IF EXISTS `r_Sewing_Schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `r_Sewing_Schedule` (
  `Schedue_ID` varchar(45) NOT NULL,
  `Style_ID` varchar(45) NOT NULL,
  `Minutes_per_Sample` int(11) NOT NULL,
  `Start_Date` date NOT NULL,
  `End_Date` date NOT NULL,
  `Supervisor_ID` varchar(45) NOT NULL,
  `No_of_Labourers` int(11) NOT NULL,
  `No_of_Lines` int(11) NOT NULL,
  `Room_No` varchar(45) NOT NULL,
  `Cutting_ID` varchar(45) DEFAULT NULL,
  `Qty` int(11) DEFAULT NULL,
  PRIMARY KEY (`Schedue_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `r_Sewing_Schedule`
--

LOCK TABLES `r_Sewing_Schedule` WRITE;
/*!40000 ALTER TABLE `r_Sewing_Schedule` DISABLE KEYS */;
INSERT INTO `r_Sewing_Schedule` VALUES ('SWG-SHI125284391','STY124da5ebd',777,'2017-03-09','2017-03-24','6',99,2,'S002','CUT-SHI1252445de',44),('SWG-SHI12726ab9e','STY1887b74a8',66,'2017-04-13','2017-04-20','6',66,2,'S001','CUT-SHI19d57369f',5),('SWG-SHI12817a864','STY124da5ebd',666,'2017-04-07','2017-04-20','6',66,3,'S002','CUT-SHI1252445de',44),('SWG-SHI1283fce94','STY124da5ebd',333,'2017-04-12','2017-04-27','6',77,2,'S005','CUT-SHI1252445de',44),('SWG-SHI129da5eb4','STY124da5ebd',44,'2017-04-20','2017-04-22','6',33,2,'S002','CUT-SHI1252445de',44),('SWG-SHI131f68a19','STY1887b74a8',56,'2017-04-26','2017-04-27','6',56,2,'S003','CUT-SHI19d57369f',5),('SWG-SHI131f9b585','STY1887b74a8',56,'2017-04-06','2017-04-28','Adith',56,2,'S003','CUT-SHI19d57369f',5),('SWG-SHI13210e9f7','STY1887b74a8',56,'2017-04-20','2017-04-06','Adith',56,2,'S003','CUT-SHI19d57369f',5),('SWG-SHI1325ea7fa','STY1887b74a8',566,'2017-04-12','2017-04-06','Adith',666,3,'S002','CUT-SHI19f0d05c9',3),('SWG-SHI1b0349f23','STY1887b74a8',55,'2017-05-23','2017-05-25','Ziyan',44,2,'S001','CUT-SHI19d57369f',5),('SWG-SHI1b0426fab','STY1887b74a8',87,'2017-04-29','2017-06-15','Adith',88,2,'S004','CUT-SHI19d57369f',5),('SWG-SHI1e2c8db88','STY12550b6d7',321,'2017-05-11','2017-05-25','Ziyan',22,3,'S001','CUT-SHI129d86020',44);
/*!40000 ALTER TABLE `r_Sewing_Schedule` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-08 17:49:35
