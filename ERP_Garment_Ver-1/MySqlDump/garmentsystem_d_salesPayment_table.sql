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
-- Table structure for table `d_salesPayment_table`
--

DROP TABLE IF EXISTS `d_salesPayment_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `d_salesPayment_table` (
  `salesPaymentId` varchar(45) NOT NULL,
  `customerId` varchar(45) DEFAULT NULL,
  `salesInvoiceId` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `paymentType` varchar(45) DEFAULT NULL,
  `totalPayable` varchar(45) DEFAULT NULL,
  `paymentAmount` varchar(45) DEFAULT NULL,
  `dueAmount` varchar(45) DEFAULT NULL,
  `users_table_userId` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`salesPaymentId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `d_salesPayment_table`
--

LOCK TABLES `d_salesPayment_table` WRITE;
/*!40000 ALTER TABLE `d_salesPayment_table` DISABLE KEYS */;
INSERT INTO `d_salesPayment_table` VALUES ('spi18facc6ea','cus178d439cd','sin17fda24b4',NULL,NULL,'8750','1000','7750',NULL),('spi18face8f6','cus178d439cd','sin17fda24b4',NULL,NULL,'7750','500','7250',NULL),('spi18fed612c','cus178d439cd','sin17fda24b4','2017-03-02','Cash','7250','1000',NULL,'1');
/*!40000 ALTER TABLE `d_salesPayment_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  3:24:39
