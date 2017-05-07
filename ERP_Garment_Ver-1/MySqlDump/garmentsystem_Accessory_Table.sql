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
-- Table structure for table `Accessory_Table`
--

DROP TABLE IF EXISTS `Accessory_Table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Accessory_Table` (
  `accessory_id` varchar(45) NOT NULL,
  `accessory_name` varchar(45) DEFAULT NULL,
  `accessory_cost` varchar(45) DEFAULT NULL,
  `accessory_qty` varchar(45) DEFAULT NULL,
  `accessory_value` varchar(45) DEFAULT NULL,
  `accessory_type` varchar(45) DEFAULT NULL,
  `Accessory_reorder` varchar(45) DEFAULT NULL,
  `accessory_date` date DEFAULT NULL,
  PRIMARY KEY (`accessory_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Accessory_Table`
--

LOCK TABLES `Accessory_Table` WRITE;
/*!40000 ALTER TABLE `Accessory_Table` DISABLE KEYS */;
INSERT INTO `Accessory_Table` VALUES ('ACC12fdbf040','Sequences','4','5200','23400.0','Sequences','2','2017-04-02'),('ACC131f1b6cb','GreenRibbons','150','50','7500.0','Ribbon','25','2017-04-03'),('ACC13278e919','RedRibbons','150','50','','Zippers','25','2017-04-03'),('ACC17080db4c','pins','7','567','3969.0','pin','200','2017-02-24'),('ACC1cd1428d8','RedRibbons','150','50','7500.0','Ribbon','25','2017-05-03'),('ACC1cd73d048','Blahh','150','50','7500.0','Threads','12','2017-05-03'),('ACC1cdf3f3d6','Linen','18','45','810.0','Neckline','12','2017-05-03'),('ACC1dddfe1ca','Linnen','95','1250','118750.0','Badge','45','2017-05-06'),('ACC1dde06408','BlackThreads','150','50','','Threads','25','2017-05-06'),('ACC1f475d77b','Pins','100','20','2000.0','Pins','10','2017-03-22'),('ACC1f54451f5','Lace','10','200','2000.0','Lace','100','2017-03-22');
/*!40000 ALTER TABLE `Accessory_Table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  3:27:15
