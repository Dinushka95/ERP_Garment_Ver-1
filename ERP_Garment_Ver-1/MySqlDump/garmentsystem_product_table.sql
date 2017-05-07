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
-- Table structure for table `product_table`
--

DROP TABLE IF EXISTS `product_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_table` (
  `ProductId` varchar(45) NOT NULL,
  `ProductName` varchar(45) DEFAULT NULL,
  `DesignId` varchar(45) DEFAULT NULL,
  `Design_Description` varchar(45) DEFAULT NULL,
  `ProductType` varchar(45) DEFAULT NULL,
  `Cost` varchar(45) DEFAULT NULL,
  `Quantity` varchar(45) DEFAULT NULL,
  `Stock_Value` varchar(45) DEFAULT NULL,
  `Price` varchar(45) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  PRIMARY KEY (`ProductId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_table`
--

LOCK TABLES `product_table` WRITE;
/*!40000 ALTER TABLE `product_table` DISABLE KEYS */;
INSERT INTO `product_table` VALUES ('FGD131ecf66f','TShirt','STY129fbf121','EmbarkBlack','Shirt','1200','100','120000.0','2000','2017-04-03'),('FGD131ee1f2c','TShirt','STY129fbf121','EmbarkBlack','Shirt','1200','99','120000.0','2000','2017-04-03'),('FGD131effd8c','TShirt','STY129fbf121','EmbarkRed','Shirt','1000','100','100000.0','2000','2017-04-03'),('FGD131f0c6a3','TShirt','STY129fbf121','EmbarkRed','Shirt','2000','100','100000.0','2000','2017-04-03'),('FGD13276f4f0','TShirt','STY129fbf121','EmbarkBlack','Socks','1200','100','','2000','2017-04-03'),('FGD132776fdc','TShirt','STY129fbf121','EmbarkBlack','Socks','1200','100','','2000','2017-04-03'),('FGD17a1683cd','blueeei','STY16ef070e4','bule polo t shirt','Shirt','650','24','16250.0','1100','2017-02-26'),('FGD17a7c3f81','checker check','STY16ee54437','check pattern shirt','Shirt','750','10','26250.0','1250','2017-02-26');
/*!40000 ALTER TABLE `product_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  3:26:01
