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
-- Table structure for table `Profitandloss`
--

DROP TABLE IF EXISTS `Profitandloss`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Profitandloss` (
  `sales` varchar(45) DEFAULT NULL,
  `sales_return` varchar(45) DEFAULT NULL,
  `cost_sales` varchar(45) DEFAULT NULL,
  `opening_stock` varchar(45) DEFAULT NULL,
  `purchase` varchar(45) DEFAULT NULL,
  `purchase_return` varchar(45) DEFAULT NULL,
  `costofgoods` varchar(45) DEFAULT NULL,
  `closing_stock` varchar(45) DEFAULT NULL,
  `shippingcost` varchar(45) DEFAULT NULL,
  `costofsales` varchar(45) DEFAULT NULL,
  `gross_profit` varchar(45) DEFAULT NULL,
  `expences` varchar(45) DEFAULT NULL,
  `netprofit` varchar(45) DEFAULT NULL,
  `incometax` varchar(45) DEFAULT NULL,
  `netprofit_per_year` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Profitandloss`
--

LOCK TABLES `Profitandloss` WRITE;
/*!40000 ALTER TABLE `Profitandloss` DISABLE KEYS */;
INSERT INTO `Profitandloss` VALUES ('55800','6095','49705.0','10000000','15000','10000','1.0025E7','100000','100000','9825000.0','15927.0','22700','-6773.0','-677.2999877929688','-6095.7001953125'),('55800','6095','49705.0','10000','15000','10000','35000.0','780','503','33717.0','15988.0','22700','-6712.0','-671.2000122070312','-6040.7998046875'),('55800','6095','49705.0','100','15000','10000','25100.0','200','100','24800.0','24905.0','22700','2205.0','220.5','1984.5'),('55800','6095','49705.0','1000','15000','10000','26000.0','100','200','25700.0','24005.0','22700','1305.0','130.5','1174.5'),('55800','6095','49705.0','2000','15000','10000','27000.0','100','150','26750.0','22955.0','22700','255.0','25.5','229.5'),('55800','6095','49705.0','800','15000','10000','25800.0','50','100','25650.0','24055.0','22700','1355.0','135.5','1219.5'),('55800','6095','49705.0','','15000','10000','','','','','','22700','','',''),('55800','6095','49705.0','','15000','10000','','','','','','22700','','',''),('55800','6095','49705.0','45','15000','10000','25045.0','','','','','9700','','',''),('55800','6095','49705.0','','15000','10000','','','','','','9700','','',''),('55800','6095','49705.0','','15000','10000','','','','','','9700','','',''),('55800','6095','49705.0','','15000','10000','','','','','','9700','','',''),('55800','7314','48486.0','500','15000','10000','25500.0','100','50','25350.0','23136.0','9700','13436.0','1343.5999755859375','12092.400390625'),('55800','7314','48486.0','500','15000','10000','25500.0','100','50','25350.0','23136.0','9700','13436.0','1343.5999755859375','12092.400390625'),('55800','7314','48486.0','200','15000','10000','25200.0','10','50','25140.0','23346.0','9700','13646.0','1364.5999755859375','12281.400390625'),('55800','7314','48486.0','200','15000','10000','25200.0','10','50','25140.0','23346.0','9700','13646.0','1364.5999755859375','12281.400390625'),('55800','8533','47267.0','250','40000','10000','50250.0','20','10','50220.0','-2953.0','9700','-12653.0','',''),('55800','8533','47267.0','250','40000','10000','50250.0','20','10','50220.0','-2953.0','9700','-12653.0','','');
/*!40000 ALTER TABLE `Profitandloss` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-08 17:51:32
