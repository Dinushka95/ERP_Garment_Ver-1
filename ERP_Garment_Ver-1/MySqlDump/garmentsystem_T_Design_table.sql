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
-- Table structure for table `T_Design_table`
--

DROP TABLE IF EXISTS `T_Design_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_Design_table` (
  `StyleId` varchar(30) NOT NULL,
  `StyleDesc` varchar(250) NOT NULL,
  `Size` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `Type` varchar(45) NOT NULL,
  `Collection` varchar(45) NOT NULL,
  `Color` varchar(45) NOT NULL,
  `Designer` varchar(45) NOT NULL,
  `Status` varchar(45) NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`StyleId`),
  UNIQUE KEY `StyleId_UNIQUE` (`StyleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_Design_table`
--

LOCK TABLES `T_Design_table` WRITE;
/*!40000 ALTER TABLE `T_Design_table` DISABLE KEYS */;
INSERT INTO `T_Design_table` VALUES ('STY12ee4ae88','Summer','XL','Male','Trouser','Men','Red','Surosh Chavi','Start','2017-04-02'),('STY12fd7b4c4','Winter','XL','Male','Trouser','Men','Red','Surosh Chavi','Start','2017-04-02'),('STY131fc1ca4','Winter','XL','Male','Trouser','Men','Red','Surosh Chavi','Start','2017-04-03'),('STY13253f033','Winter','XL','Male','Trouser','Men','Reddish','Surosh Chavi','Start','2017-04-03'),('STY1b3b985a','Winter','XL','Male','Trouser','Men','Red','Surosh Chavi','Start','2017-03-26'),('STY1bc00c3ae','Winter','XL','Male','Trouser','Men','Red','Surosh Chavi','Start','2017-04-30'),('STY1bc0e1960','Winter','XL','Male','Trouser','Men','Red','Surosh Chavi','Start','2017-04-30'),('STY1bf2b2170','Winter','XL','Male','Trouser','Men','Red','Surosh Chavi','Start','2017-04-30'),('STY1bf2d0025','Winter','XL','Male','Trouser','Men','Red','Surosh Chavi','Start','2017-04-30'),('STY1cac4f977','Winter','XL','Male','Trouser','Men','Red','Surosh Chavi','Start','2017-05-03'),('STY1cd118170','Winter','XL','Male','Trouser','Men','Red','Surosh Chavi','Start','2017-05-03'),('STY1cd591b82','Winter','XL','Male','Trouser','Men','Red','Surosh Chavi','Start','2017-05-03'),('STY1cdb80cf4','Winter','XL','Male','Trouser','Men','Red','Surosh Chavi','Start','2017-05-03'),('STY1cdea3e3c','Winter','XL','Male','Trouser','Men','Red','Surosh Chavi','Start','2017-05-03'),('STY1d511311a','Winter','XL','Male','Trouser','Men','Red','Surosh Chavi','Start','2017-05-05'),('STY1d979c01b','Winter','XL','Male','Trouser','Men','Red','Surosh Chavi','Start','2017-05-05'),('STY1d97ada57','Summer','Select Size','Male','Select Type','Select Collection','Select Color','Select Designer','Start','2017-05-05'),('STY1d9a51232','Winter','XL','Male','Trouser','Men','Red','Surosh Chavi','Start','2017-05-05'),('STY1ddde5bba','Winter','XL','Male','Trouser','Men','Red','Surosh Chavi','Start','2017-05-06'),('STY1f42cb781','Winter','XL','Male','Blouse','Men','Red','Tiny Wijerathna','Start','2017-03-22');
/*!40000 ALTER TABLE `T_Design_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  3:25:53
