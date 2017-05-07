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
INSERT INTO `C_Fuel` VALUES ('100','VEH12cecb9ae','Ya789','Select','456','120','485','58200.0','2017-05-06',NULL),('FUEL1314b15a8','njvv','bd fgf','nydfy','ygecu','100','50','5000.0','2017-04-02',NULL),('FUEL131523bee','hjbds',' hagxf','haf','25248','100','61','6100.0','2017-04-02',NULL),('FUEL13153d617','usncf','jhcf','aiucwh','uacg','1000','100','100000.0','2017-04-02',NULL),('FUEL1325a1238','dnvkj','gjb hj','tgnjrh','gnvj','78','14','1092.0','2017-04-02',NULL),('FUEL1326d0346','dsrd','fdg','gz','1162','120','10','1200.0','2017-04-03',NULL),('FUEL134881038','jhdf','jhef','sjdfh','459','425','10','4250.0','2017-04-03',NULL),('FUEL1a08066cc','furhruhq','eofjeorimwoi','woemri3m','imeowrmei','40','50','2000.0','2017-03-06',NULL),('FUEL1dc7e29fb','VEH12cecb9ae','Ya789','Select','123ED','120','-234','-28080.0','2017-05-05',NULL),('FUEL1df6dd57d','VEH12cecb9ae','Ya789','Select','45','105','45','4725.0','2017-05-06',NULL),('FUEL1dfbb9644','VEH12cecb9ae','Ya789','Select','4875','120','78','9360.0','2017-05-06','Petrol'),('FUEL1e019c361','VEH12cecb9ae','Ya789','Select','789','120','48','5760.0','2017-05-06','Petrol'),('FUEL1e01c8c9c','VEH12cecb9ae','Ya789','Select','155','120','588d','70560.0','2017-05-06','Petrol');
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

-- Dump completed on 2017-05-07  3:21:13
