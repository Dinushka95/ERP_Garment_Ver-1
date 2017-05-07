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
-- Table structure for table `F_LOANDETAILS`
--

DROP TABLE IF EXISTS `F_LOANDETAILS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `F_LOANDETAILS` (
  `BankName` varchar(45) DEFAULT NULL,
  `BranchName` varchar(45) DEFAULT NULL,
  `AccNo` varchar(45) NOT NULL,
  `Date` date DEFAULT NULL,
  `Period` varchar(45) DEFAULT NULL,
  `Ammount` float DEFAULT NULL,
  `Month Interest` varchar(45) DEFAULT NULL,
  `Payment` float DEFAULT NULL,
  PRIMARY KEY (`AccNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `F_LOANDETAILS`
--

LOCK TABLES `F_LOANDETAILS` WRITE;
/*!40000 ALTER TABLE `F_LOANDETAILS` DISABLE KEYS */;
INSERT INTO `F_LOANDETAILS` VALUES ('BOC','iiiiiiiiiiiiii','4444444444','2017-05-06','12',10000,'7',700),('UNION','wellawaththe','483957','2017-04-03','2',45000,'10',4500),('Peoples Bank','xcvz','7516','2017-05-01','12',120000,'5',6000),('BOC','xcvz','751685','2017-05-01','12',120000,'5',6000),('Peoples Bank','homagama','758263','2017-04-03','4',780000,'12',93600),('HNB ','kaluthara','857934','2017-04-03','2',4870000,'15',730500),('BOC','pliyandala','859647','2017-04-03','4',100000,'10',10000);
/*!40000 ALTER TABLE `F_LOANDETAILS` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  3:25:45
