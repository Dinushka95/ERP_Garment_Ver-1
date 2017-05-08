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
-- Table structure for table `C_Maintaince`
--

DROP TABLE IF EXISTS `C_Maintaince`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `C_Maintaince` (
  `MaintainceID` varchar(15) NOT NULL,
  `VehicalID` varchar(45) DEFAULT NULL,
  `Maintainc_discription` varchar(75) DEFAULT NULL,
  `Cost` varchar(45) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Arage_name` varchar(45) DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  `Phone` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `C_Maintaince`
--

LOCK TABLES `C_Maintaince` WRITE;
/*!40000 ALTER TABLE `C_Maintaince` DISABLE KEYS */;
INSERT INTO `C_Maintaince` VALUES ('MAIN130fce279','MG4598','punch','4865','2017-04-02','Unitad','Colombo','011147896'),('MAIN1326dcfbd','VT4879','Fuel Tank','7500','2017-04-02','Staferd','Nugegoda','014789654'),('MAIN1327173cb','Qt1549','Seat repair','94000','2017-04-02','Rathna','Anuradhapura','02578948'),('MAIN134b16f5c','MG4569','Body Repair','150000','2017-04-03','Unitad','Negambo','03879546'),('MAIN1e6a96481','VEH12d020b59','Engine Repair','17800','2017-05-07','Rthna','Kelaniya','01124893278'),('MAIN1e6ad9ebc','VEH134aca984','Fuel Tank','17500','2017-05-04','United','Colombo','0114789641'),('MAIN1e6af0aeb','VEH1a06fc46e','Punch','1000','2017-05-01','Stafed','Nugegoda','014789456');
/*!40000 ALTER TABLE `C_Maintaince` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-08 17:50:08
