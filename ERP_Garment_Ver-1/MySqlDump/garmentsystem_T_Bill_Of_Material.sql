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
-- Table structure for table `T_Bill_Of_Material`
--

DROP TABLE IF EXISTS `T_Bill_Of_Material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_Bill_Of_Material` (
  `Number` varchar(40) NOT NULL,
  `StyleID` varchar(45) NOT NULL,
  `Accesories` varchar(45) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Colour` varchar(45) NOT NULL,
  `Cost` float NOT NULL,
  `Final_Cost` float NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`Number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_Bill_Of_Material`
--

LOCK TABLES `T_Bill_Of_Material` WRITE;
/*!40000 ALTER TABLE `T_Bill_Of_Material` DISABLE KEYS */;
INSERT INTO `T_Bill_Of_Material` VALUES ('ACC12fdafc0a','STY12ee4ae88','Velvet',5,'RED',12,60,'2017-05-06'),('ACC14587jklm','STY124c9f493','Sequences',45,'White',12,120,'2017-04-20'),('ACC17080db4c','STY1a1ea783c','BlueLace',10,'Blue',3,120,'2017-03-26'),('ACC1cd73d048','STY12ee4ae88','Ribbon',45,'Black',150,6750,'2017-05-05'),('ACC1cd73d987','STY12ee4ae88','Blahh',45,'Black',150,6750,'2017-05-06'),('ACC1f54451f5','STY12a7ea5c5','Pins',12,'Red',10,600,'2017-04-30');
/*!40000 ALTER TABLE `T_Bill_Of_Material` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  3:28:37
