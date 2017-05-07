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
-- Table structure for table `Raw_Materials`
--

DROP TABLE IF EXISTS `Raw_Materials`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Raw_Materials` (
  `Material_id` varchar(45) NOT NULL DEFAULT '',
  `Material_Name` varchar(45) DEFAULT NULL,
  `Material_cost` varchar(45) DEFAULT NULL,
  `Material_qty` varchar(45) DEFAULT NULL,
  `Material_Value` varchar(45) DEFAULT NULL,
  `Material_reorder` varchar(45) DEFAULT NULL,
  `Material_date` date DEFAULT NULL,
  PRIMARY KEY (`Material_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Raw_Materials`
--

LOCK TABLES `Raw_Materials` WRITE;
/*!40000 ALTER TABLE `Raw_Materials` DISABLE KEYS */;
INSERT INTO `Raw_Materials` VALUES ('mat123','pins','1000','100','100000','100','2017-02-17'),('MAT131ecc3fa','LinenFabrickBlack','450','200','90000.0','100','2017-04-03'),('MAT132750492','gghvh','500',' 10','5000.0','5','2017-04-03'),('MAT1bcb611fe','LinenFabrickBlack','450','10','4500.0','100','2017-04-30'),('MAT1ddb2a4f4','fabrickBlue','500','30','15000.0','15','2017-05-10');
/*!40000 ALTER TABLE `Raw_Materials` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  3:22:19
