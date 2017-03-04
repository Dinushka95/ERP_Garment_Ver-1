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
INSERT INTO `d_customer_table` VALUES ('cus117ae8487','ann','anns','1234567890','asdfghjk','nugegoda','2016-12-19',0),('cus117aef1ad','bob','bobs','0987654321','lkjhgfdsa','mnbvcxz','2016-12-19',0),('cus117af5300','cat','catss','1234567890','asdfghjkl','qwertyuiop','2016-12-19',0),('cus172a652a0','wwwwwwwww','wwwww','55555555','fs@fd','3543gf','2017-02-25',1),('cus178d439cd','qwqwwq','wqwqw','12121212','121asasa','asasa','2017-02-26',1),('cus178d4b06c','sadsdasd','asdasdd','2313123','sadasd','asdasd','2017-02-26',1);
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

-- Dump completed on 2017-03-04 11:58:36
