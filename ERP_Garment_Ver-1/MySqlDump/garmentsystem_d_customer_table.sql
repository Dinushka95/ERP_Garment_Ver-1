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
-- Table structure for table `d_customer_table`
--

DROP TABLE IF EXISTS `d_customer_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `d_customer_table` (
  `CustomerId` varchar(45) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `CompanyName` varchar(45) DEFAULT NULL,
  `Phone` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  `AddedDate` date DEFAULT NULL,
  `userId` int(11) NOT NULL,
  PRIMARY KEY (`CustomerId`),
  UNIQUE KEY `CustomerId_UNIQUE` (`CustomerId`),
  KEY `fk_customer_table_users_table1_idx` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `d_customer_table`
--

LOCK TABLES `d_customer_table` WRITE;
/*!40000 ALTER TABLE `d_customer_table` DISABLE KEYS */;
INSERT INTO `d_customer_table` VALUES ('cus12cecaefe','Bob','Bob','0122334455','Bob@bob.lk','35 Jaya Road, Jayawatha ','2017-01-02',1),('cus12cef4dfc','Candy','Candices','0778632145','Candy@candices.lk','No 101 Candy Street, Malabe','2017-02-02',1),('cus12d3cc7f2','Dave','Dave','0781234567','Dava@davids.lk','32 Dugmud Road, Madapara','2017-04-02',1),('cus12de21000','Evana','Evanas','1212121212','Evana@Evanas.lk','No 99 Elvitigama, Evelen Road','2017-04-02',1),('cus132129746','aa aa','asdasd','1234567890','sadas@jhj.lk','dsffdsds','2017-04-03',1),('cus1324a1b3d','jack','jack','1234567890','sdsd@dr','dssdds','2017-04-03',1),('cus1324b20bd','fdfd','dffd','1235678906','sdsss2@KJ.LK','dffd','2017-04-03',1);
/*!40000 ALTER TABLE `d_customer_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  3:23:16
