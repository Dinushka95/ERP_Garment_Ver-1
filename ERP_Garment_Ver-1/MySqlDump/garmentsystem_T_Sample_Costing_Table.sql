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
-- Table structure for table `T_Sample_Costing_Table`
--

DROP TABLE IF EXISTS `T_Sample_Costing_Table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_Sample_Costing_Table` (
  `SampleId` varchar(45) NOT NULL,
  `SampleName` varchar(45) NOT NULL,
  `StyleId` varchar(45) NOT NULL,
  `Description` varchar(45) NOT NULL,
  `Accessories` varchar(45) NOT NULL,
  `AccId` varchar(45) DEFAULT NULL,
  `Quantity` varchar(45) NOT NULL,
  `Cost` float NOT NULL,
  `Total_Cost` float NOT NULL,
  PRIMARY KEY (`SampleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_Sample_Costing_Table`
--

LOCK TABLES `T_Sample_Costing_Table` WRITE;
/*!40000 ALTER TABLE `T_Sample_Costing_Table` DISABLE KEYS */;
INSERT INTO `T_Sample_Costing_Table` VALUES ('SAMID12c130981','Trouser','STY129fbf121','Blush','RedRibbons','ACC13278e919','12',150,1800),('SAMID12cffb54b','Trouser','Blah','STY12ba57794','hcisauhai','ACC12fdafc0a','45',12,540);
/*!40000 ALTER TABLE `T_Sample_Costing_Table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  3:23:49
