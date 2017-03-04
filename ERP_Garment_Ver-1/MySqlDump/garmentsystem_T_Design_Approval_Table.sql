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
-- Table structure for table `T_Design_Approval_Table`
--

DROP TABLE IF EXISTS `T_Design_Approval_Table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_Design_Approval_Table` (
  `ApprovalId` varchar(45) NOT NULL,
  `ApprovedBy` varchar(45) NOT NULL,
  `StyleId` varchar(45) NOT NULL,
  `Status` varchar(45) NOT NULL,
  `Comment` varchar(45) NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`ApprovalId`),
  UNIQUE KEY `idT_Design_Approval_UNIQUE` (`ApprovalId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_Design_Approval_Table`
--

LOCK TABLES `T_Design_Approval_Table` WRITE;
/*!40000 ALTER TABLE `T_Design_Approval_Table` DISABLE KEYS */;
INSERT INTO `T_Design_Approval_Table` VALUES ('AID188898789','Diana Bacca','','Approve','Start','2017-03-01'),('AID1898d2921','Surosh','STY2548795','Approve','Done','2017-03-01');
/*!40000 ALTER TABLE `T_Design_Approval_Table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-04 12:02:15
