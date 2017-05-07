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
INSERT INTO `T_Design_Approval_Table` VALUES ('AID12a7295b4','Harry ','STY124da5ebd','Approve','Start','2017-04-01'),('AID12ee6dc3c','Bhagya','STY124c9f493','Approve','Approved','2017-04-02'),('AID13258ea3f','Bhagya Engi','STY12ba57794','Approve','Approved','2017-04-03'),('AID1bf366e5f','Bhagya','STY12d52cdfb','Approve','Approved','2017-04-30'),('AID1d514fcfc','Bhagya','STY12fd7b4c4','Approve','Approved','2017-05-05'),('AID1d8b15391','L Rajendra','STY1ae2fcb46','Approve','Start ','2017-03-17'),('AID1ddf3b694','Bhagya','STY12ee4ae88','Approve','Approved','2017-05-06'),('AID1f43a168d','Surosh Chavi','STY1ae2fcb46','Approve','56555','2017-03-22'),('AID1fa99c220','Surosh Chavi','STY1d89659a9','Approve','Done','2017-03-23'),('AID1faa0fb1e','dinu','STY1ae2fcb46','Approve','XXXXX','2017-03-23');
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

-- Dump completed on 2017-05-07  3:25:11
