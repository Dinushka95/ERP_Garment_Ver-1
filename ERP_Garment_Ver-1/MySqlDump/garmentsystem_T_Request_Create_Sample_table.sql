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
-- Table structure for table `T_Request_Create_Sample_table`
--

DROP TABLE IF EXISTS `T_Request_Create_Sample_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_Request_Create_Sample_table` (
  `SampleId` varchar(50) NOT NULL,
  `SampleName` varchar(50) NOT NULL,
  `StyleId` varchar(45) NOT NULL,
  `StyleDesc` varchar(250) NOT NULL,
  `SampleType` varchar(45) NOT NULL,
  `SampleGroup` varchar(45) NOT NULL,
  `SampleSize` varchar(45) NOT NULL,
  `SampleDesigner` varchar(45) NOT NULL,
  `NumberOfSamples` varchar(45) NOT NULL,
  `SampleGivenTo` varchar(45) NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`SampleId`),
  UNIQUE KEY `SampleId_UNIQUE` (`SampleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_Request_Create_Sample_table`
--

LOCK TABLES `T_Request_Create_Sample_table` WRITE;
/*!40000 ALTER TABLE `T_Request_Create_Sample_table` DISABLE KEYS */;
INSERT INTO `T_Request_Create_Sample_table` VALUES ('SAMID11518f7ef','Trouser','STY1b3b985a','Autumn','Men','Sketch Sample','L','Sethuni ','5','Customer','2017-05-07'),('SAMID11519f010','Short','STY1a1ea783c','Spring','Men','Photo Sample','XL','Hameez','3','Marketing','2017-04-26'),('SAMID1151a9020','Blouse','STY1f42cb781','Summer','Female','Photo Sample','M','St Peterson','3','Customer','2017-03-28'),('SAMID12c130981','Skirt','STY129fbf121','Summer','Female','Sketch Sample','S','Surosh Chavin','4','Customer','2017-04-02'),('SAMID12cffb54b','Shorts','STY12ba57794','Summer','Female','Photo Sample','L','Surosh Chavi','2','Customer/Marketing','2017-04-02'),('SAMID12fb66e31','Shirt','STY129fbf121','Winter','Men','Photo Sample','M','Ekanayake TW','8','Marketing','2017-04-02'),('SAMID12fd6cb3a','Trouser','STY12550b6d7','Summer','Men','Sketch Sample','L','Surosh Chavi','2','Customer','2017-04-02'),('SAMID1e434b0bb','Trouser','STY1cdb80cf4','Blah','Men','Photo Sample','XL','Surosh Chavi','2','Customer','2017-05-08'),('SAMID1e43507a4','Trouser','STY12ee4ae88','Blah','Female','Photo Sample','XL','Surosh Chavi','2','Customer','2017-05-08');
/*!40000 ALTER TABLE `T_Request_Create_Sample_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-08 17:53:56
