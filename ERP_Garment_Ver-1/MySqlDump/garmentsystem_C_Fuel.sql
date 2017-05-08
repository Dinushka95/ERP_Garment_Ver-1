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
-- Table structure for table `C_Fuel`
--

DROP TABLE IF EXISTS `C_Fuel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `C_Fuel` (
  `Fuel_ID` varchar(45) NOT NULL,
  `Vehical_ID` varchar(45) DEFAULT NULL,
  `Driver_ID` varchar(45) DEFAULT NULL,
  `Fuel_StationName` varchar(45) DEFAULT NULL,
  `BillNum` varchar(45) DEFAULT NULL,
  `Unit_price` varchar(45) DEFAULT NULL,
  `Units` varchar(45) DEFAULT NULL,
  `Cost` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `Fuel_Type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Fuel_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `C_Fuel`
--

LOCK TABLES `C_Fuel` WRITE;
/*!40000 ALTER TABLE `C_Fuel` DISABLE KEYS */;
INSERT INTO `C_Fuel` VALUES ('FUEL1e62be633','VEH134aca984','DR1459','Jayawardhena','11','120','25','3000.0','2017-05-08','Petrol'),('FUEL1e68a4924','VEH12cecb9ae','Ya789','Select','123','120','45','5400.0','2017-05-08','Petrol'),('FUEL1e6b01018','VEH12cecb9ae','Ya789','COOP','1','120','40','4800.0','2017-05-01','Petrol'),('FUEL1e6b0ab21','VEH12d020b59','DR1459','Jayawardhena','2','105','20','2100.0','2017-05-03','Diesel'),('FUEL1e6b12b0d','VEH1a06fc46e','DR249','DSI','3','105','25','2625.0','2017-05-04','Diesel'),('FUEL1e6b1d6ab','VEH1e6a3dbfa','DR5789','United','4','120','15','1800.0','2017-05-02','Petrol'),('FUEL1e6b29d4c','VEH134aca984','DR1459','COOP','5','105','20','2100.0','2017-04-03','Diesel'),('FUEL1e6b4b47e','VEH12d020b59','Ya789','Jayawardhena','6','120','25','3000.0','2017-05-01','Petrol'),('FUEL1e6baf4ac','VEH134aca984','DR249','COOP','6','120','5','600.0','2017-05-02','Petrol'),('FUEL1e6bb942a','VEH1a06fc46e','DR5789','Jayawardhena','8','105','12','1260.0','2017-05-03','Diesel'),('FUEL1e6be110e','VEH1e6a3dbfa','DR1459','DSI','9','120','20','2400.0','2017-05-05','Petrol'),('FUEL1e8af4e79','VEH134aca984','DR249','Select','10','120','30','3600.0','2017-05-08','Petrol');
/*!40000 ALTER TABLE `C_Fuel` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-08 17:47:37
