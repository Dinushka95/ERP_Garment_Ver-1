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
-- Table structure for table `r_Cutting_Schedule_table`
--

DROP TABLE IF EXISTS `r_Cutting_Schedule_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `r_Cutting_Schedule_table` (
  `Shedule_ID` varchar(45) NOT NULL,
  `Style_ID` varchar(45) NOT NULL,
  `Material_ID` varchar(45) NOT NULL,
  `Supervisor_ID` varchar(45) NOT NULL,
  `No_of_Labourers` int(11) NOT NULL,
  `Room_No` varchar(45) NOT NULL,
  `No_of_Lines` int(11) NOT NULL,
  `Minutes_per_Sample` int(11) NOT NULL,
  `Start_Date` date NOT NULL,
  `End_Date` date NOT NULL,
  `Length_per_Sample` float NOT NULL,
  `Stock_Availability` varchar(45) NOT NULL,
  `Quantity` int(11) DEFAULT NULL,
  `Colour` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Shedule_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `r_Cutting_Schedule_table`
--

LOCK TABLES `r_Cutting_Schedule_table` WRITE;
/*!40000 ALTER TABLE `r_Cutting_Schedule_table` DISABLE KEYS */;
INSERT INTO `r_Cutting_Schedule_table` VALUES ('CUT-SHI1252445de','STY124da5ebd','MAT1f444e1b5','3',66,'C002',4,66,'2017-03-15','2017-03-24',6,'null',44,'Blue'),('CUT-SHI128110d2e','STY124c9f493','MAT1f444e1b5','3',545,'C004',2,555,'2017-03-01','2017-03-31',555,'aaa',44,'Red'),('CUT-SHI1283cef67','STY1260ee5f8','MAT1f444e1b5','3',555,'C002',5,7,'2017-04-12','2017-04-21',66,'null',66,'Red'),('CUT-SHI129d86020','STY12550b6d7','MAT1f444e1b5','1',33,'C003',5,33,'2017-04-14','2017-04-21',33,'null',44,'Red'),('CUT-SHI12f26848b','STY124e1b385','MAT12d0142b5','3',33,'C003',4,55,'2017-04-14','2017-04-13',344,'',34,'Red'),('CUT-SHI131ded808','STY129fbf121','mat123','1',44,'C004',4,6,'2017-04-13','2017-04-27',776,'Available',6,'Blue'),('CUT-SHI132103a6e','STY129fbf121','mat123','1',44,'C004',4,6,'2017-04-13','2017-04-26',776,'Available',6,'Blue'),('CUT-SHI1325acc36','STY12cd064e3','MAT12d0142b5','3',44,'C003',4,56,'2017-04-13','2017-04-14',567,'Available',6,'Red'),('CUT-SHI14dab3353','STY12cd064e3','MAT132750492','3',78,'C003',5,77,'2017-04-11','2017-05-10',435,'',566,'Red'),('CUT-SHI19d4e916d','STY1887b74a8','mat1544a2f0f','1',1,'1',5,1,'2017-03-09','2017-03-30',1,'null',3,NULL),('CUT-SHI19d50583c','STY1887b74a8','mat1544a2f0f','1',1,'1',5,1,'2017-03-03','2017-03-16',1,'null',4,NULL),('CUT-SHI19d57369f','STY1887b74a8','mat1544a2f0f','3',65,'6',4,6,'2017-03-01','2017-03-30',5,'null',5,NULL),('CUT-SHI19f0d05c9','STY1887b74a8','mat123','1',6,'8',9,6,'2017-03-01','2017-03-24',8,'null',3,NULL),('CUT-SHI1a2959412','STY1887b74a8','mat123','3',6,'4',3,8,'2017-03-02','2017-04-28',9,'',5,'Red'),('CUT-SHI1a335ba86','STY1a1ea783c','MAT18068f799','1',5,'1',2,9,'2017-03-02','2017-03-05',1,'',6,'Red'),('CUT-SHI1adc9c347','STY12ba57794','MAT131ecc3fa','1',43,'C003',3,345,'2017-04-19','2017-04-20',45,'Available',45,'Red'),('CUT-SHI1ae3c7d1e','STY12fd7b4c4','MAT131ecc3fa','1',67,'C002',5,788,'2017-04-28','2017-04-30',78,'Available',34,'Red'),('CUT-SHI1af5caa7c','STY12ee4ae88','MAT131ecc3fa','Ruth',353,'C001',3,667,'2017-05-19','2017-05-26',677,'Not available',566,'Red'),('CUT-SHI1b03938fb','STY129fbf121','mat123','1',44,'C004',4,6,'2017-04-29','2017-05-25',776,'Available',6,'Blue'),('CUT-SHI1b7c52d0','STY1f42b4d2a','mat123','1',44,'C003',3,55,'2017-03-23','2017-03-31',55,'Available',44,'Blue'),('CUT-SHI1b88cfce5','STY129fbf121','mat123','1',44,'C004',4,6,'2017-04-30','2017-05-18',776,'Available',6,'Blue'),('CUT-SHI1c2b7da6e','STY13253f033','mat123','1',44,'C004',4,6,'2017-05-31','2018-05-17',776,'Available',6,'Blue'),('CUT-SHI1c2c6ff9b','STY12d52cdfb','MAT131ecc3fa','3',33,'C004',3,34,'2017-05-11','2017-05-12',6554,'Not Available',33,'Red'),('CUT-SHI1c2c80059','STY12d52cdfb','MAT131ecc3fa','3',44,'C004',4,6,'2017-05-04','2017-05-18',776,'Available',6,'Blue'),('CUT-SHI1c472601f','STY12fd7b4c4','mat123','1',44,'C004',4,6,'2017-05-10','2017-05-12',776,'Available',6,'Red'),('CUT-SHI1d3fcb23a','STY12bb5ar36','mat123','dinush',443,'C004',4,6,'2017-05-25','2017-05-26',776,'Available',6,'Blue'),('CUT-SHI1d53725bb','STY12ee4ae88','mat123','dinush',443,'C004',4,6,'2017-05-20','2017-05-27',776,'',6,'Blue'),('CUT-SHI1dce82fed','STY1bf2b2170','MAT1bcb611fe','Surosh Chavi',44,'C003',3,33,'2017-05-26','2017-05-26',44,'Not Available',34,'Red'),('CUT-SHI1dcf37e39','STY12ee4ae88','mat123','dinush',44,'C004',4,6,'2017-05-19','2017-05-25',776,'Available',6,'Blue'),('CUT-SHI1dcf4a416','STY12ee4ae88','mat123','dinush',44,'C004',4,6,'2017-05-19','2017-05-23',776,'Available',6,'Blue'),('CUT-SHI1dcf78479','STY12ee4ae88','mat123','dinush',44,'C004',4,6,'2017-05-19','2017-05-29',776,'Available',6,'Blue'),('CUT-SHI1dcf9e2f5','STY12ee4ae88','mat123','dinush',44,'C004',4,6,'2017-05-12','2017-05-26',776,'Available',6,'Blue'),('CUT-SHI1ddcbbd93','STY12ee4ae88','mat123','dinush',44,'C004',4,6,'2017-05-18','2017-05-19',776,'Available',6,'Blue'),('CUT-SHI1e0ce569d','STY13253f033','MAT131ecc3fa','Surosh Chavi',45,'C002',2,45,'2017-05-16','2017-05-18',33,'Available',453,'Red'),('CUT-SHI1e2876588','STY1b3b985a','MAT131ecc3fa','Vimal',4557,'C003',4,78,'2017-05-26','2017-05-26',90,'Available',55,'Red'),('CUT-SHI1e2ba69a3','STY12ee4ae88','mat123','Vimal',44,'C004',4,6,'2017-05-19','2017-05-26',776,'Available',6,'Blue'),('CUT-SHI1e3834d6a','STY1cd591b82','MAT1bcb611fe','Ruth',22,'C003',6,78,'2017-05-17','2017-06-09',90,'Not Available',789,'Red'),('CUT-SHI1e653b7d9','STY1bf2b2170','MAT1e6252c94','Ruth',345,'C002',5,353,'2017-06-08','2017-06-23',343,'Not Available',567,'Red'),('CUT-SHI1f18d49f9','STY1adf8b9e6','mat1544a2f0f','3',45,'C003',5,40,'2017-03-01','2017-06-22',45,'',4,'Blood Red');
/*!40000 ALTER TABLE `r_Cutting_Schedule_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-08 17:53:06
