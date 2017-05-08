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
-- Table structure for table `C_Distribution`
--

DROP TABLE IF EXISTS `C_Distribution`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `C_Distribution` (
  `DistributionID` varchar(45) NOT NULL,
  `VehicalId` varchar(45) DEFAULT NULL,
  `Driver_ID` varchar(45) DEFAULT NULL,
  `Helper_ID` varchar(45) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Distribution_cost` varchar(45) DEFAULT NULL,
  `Distribution_milage` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`DistributionID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `C_Distribution`
--

LOCK TABLES `C_Distribution` WRITE;
/*!40000 ALTER TABLE `C_Distribution` DISABLE KEYS */;
INSERT INTO `C_Distribution` VALUES ('DIS1cbd6bfd2','VEH12d020b59','DR1459','HP741','2017-05-02','12555','112'),('DIS1df6d836a','VEH12cecb9ae','Ya789','HP487','2017-05-06','4562','456'),('DIS1df8c4543','VEH12cecb9ae','Ya789','HP487','2017-05-06','1546','4899'),('DIS1e381d75e','VEH12cecb9ae','Ya789','HP487','2017-05-07','4591','145'),('DIS1e62aa5b2','VEH1e6c3a61c','Ya789','HP487','2017-05-08','4500','40'),('DIS1e64a8f7f','VEH12cecb9ae','DR1459','HP487','2017-05-07','4563','455'),('DIS1e6849162','VEH12cecb9ae','DR1459','HP741','2017-05-03','456','10'),('DIS1e89844f2','VEH134aca984','DR249','HP487','2017-05-08','4500','80'),('DIS1e8b26ad0','VEH1e6c3a61c','DR5789','HP741','2017-05-08','400','50');
/*!40000 ALTER TABLE `C_Distribution` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-08 17:50:33
