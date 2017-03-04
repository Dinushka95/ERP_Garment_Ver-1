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
-- Table structure for table `F_DEPOSIT DETAILS`
--

DROP TABLE IF EXISTS `F_DEPOSIT DETAILS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `F_DEPOSIT DETAILS` (
  `Cheque No` varchar(45) NOT NULL DEFAULT '',
  `Customer ID` varchar(45) DEFAULT NULL,
  `Bank Name` varchar(45) DEFAULT NULL,
  `Branch Name` varchar(45) DEFAULT NULL,
  `Deposit Date` date DEFAULT NULL,
  `Amount` float DEFAULT NULL,
  PRIMARY KEY (`Cheque No`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `F_DEPOSIT DETAILS`
--

LOCK TABLES `F_DEPOSIT DETAILS` WRITE;
/*!40000 ALTER TABLE `F_DEPOSIT DETAILS` DISABLE KEYS */;
INSERT INTO `F_DEPOSIT DETAILS` VALUES ('','ghg','HNB ','dgfh','2017-02-12',122),('11','1','BOC','fjj','2017-02-16',100),('12345','hkhj','UNION','malabe','2017-02-23',1000),('123456','Tiny','HNB ','Malabe','2017-02-04',25000),('123456789','scsacisi','UNION','salcnsclksc','2017-02-16',456000),('12452','nhvnm','UNION','ngfjh','2017-02-21',4747),('15','kfdss','BOC','sgfhk','2017-02-15',54),('2156','bgjj','BOC','jhhfgfh','2017-02-15',100),('22','dfh','HNB ','gjgfy','2017-02-14',155),('35','jgj','BOC','jyt','2017-02-08',212),('42','gj','BOC','gk','2017-03-15',7),('44','jhf','Peoples Bank','jhgf','2017-02-15',100),('45','fgjfj','UNION','dgh','2017-02-15',555),('458','j5585','UNION','jgdfn','2017-02-27',145554),('5','bcgj','BOC','kuh','2017-02-15',88),('544','kjh','BOC','iuy','2017-02-09',77),('55','xfg','UNION','hh','2017-02-16',5),('555','jkhkl','BOC','jhf','2017-02-16',711),('656','jkl','BOC','hil','2017-02-15',4),('785','jkg','BOC','gcf','2017-02-15',4755),('789','iug','BOC','mjyf','2017-02-15',70000),('789456','Tiny','HNB ','Malabe','2017-02-09',35000),('bh','vhj','BOC','vgh','2017-03-15',454),('cc','dfb','BOC','fb','2017-02-09',45),('fgfhj','fj','BOC','fj','2017-02-01',4),('fh','gh','Peoples Bank','cg','2017-03-08',45),('ghj','ghk','BOC','ghk','2017-02-08',45),('gjk','ghk','BOC','hgh','2017-03-08',144),('kdg','gbb','BOC','rtfh','2017-03-08',54),('vj','fjhj','BOC','fj','2017-03-08',445);
/*!40000 ALTER TABLE `F_DEPOSIT DETAILS` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-04 11:57:36
