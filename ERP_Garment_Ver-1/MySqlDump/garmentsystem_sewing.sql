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
-- Table structure for table `sewing`
--

DROP TABLE IF EXISTS `sewing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sewing` (
  `Sewing_ID` varchar(45) NOT NULL,
  `Style_ID` varchar(45) DEFAULT NULL,
  `Sewing_Sch_ID` varchar(45) DEFAULT NULL,
  `damages` int(11) DEFAULT NULL,
  `qualified_pcs` int(11) DEFAULT NULL,
  `Cutting_ID` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Sewing_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sewing`
--

LOCK TABLES `sewing` WRITE;
/*!40000 ALTER TABLE `sewing` DISABLE KEYS */;
INSERT INTO `sewing` VALUES ('SEW-12e4e8eeb','STY124da5ebd','SWG-SHI12817a864',56,54,NULL),('SEW-1c2db9589','STY124da5ebd','SWG-SHI1283fce94',4,40,NULL),('SEW-1dc7126ca','STY124da5ebd','SWG-SHI12817a864',7,70,NULL),('SEW-1dc789f4d','STY124da5ebd','SWG-SHI129da5eb4',66,11,NULL),('SEW-1dc9b30cb','STY124da5ebd','SWG-SHI129da5eb4',44,33,'CUT-12da847a4'),('SEW-1dde12d20','STY124da5ebd','SWG-SHI12817a864',6,35,'CUT-132009f8d'),('SEW-1de972694','STY124da5ebd','SWG-SHI12817a864',32,45,'CUT-12da847a4'),('SEW-1de9b576d','STY124da5ebd','SWG-SHI129da5eb4',9,68,'CUT-12da847a4'),('SEW-1e62c22ae','STY124da5ebd','SWG-SHI1283fce94',4,73,'CUT-12da847a4'),('SEW-1e65767ef','STY124da5ebd','SWG-SHI129da5eb4',55,22,'CUT-12da847a4'),('SEW-1e67d560d','STY124da5ebd','SWG-SHI129da5eb4',67,10,'CUT-12da847a4');
/*!40000 ALTER TABLE `sewing` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-08 17:52:41
