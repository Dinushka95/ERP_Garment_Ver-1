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
-- Table structure for table `Contactor`
--

DROP TABLE IF EXISTS `Contactor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Contactor` (
  `Contactor_ID` varchar(45) NOT NULL DEFAULT '0',
  `Contactor_Name` varchar(45) DEFAULT NULL,
  `Phone` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  `Date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Contactor_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Contactor`
--

LOCK TABLES `Contactor` WRITE;
/*!40000 ALTER TABLE `Contactor` DISABLE KEYS */;
INSERT INTO `Contactor` VALUES ('CONT17eefb2b8','abans','0112729729','rumanabaanu@gmail.com','11350','2017-02-27'),('CONT17ef140be','iuyu34ooiu',',hiu4tuuuiou','0t95i','t5oiuh7t','2017-02-27'),('CONT17ef2d9d7','sin','0112877849','uyiugtdj','vdfgiutyu','2017-02-27'),('CONT17ef50917','fdfhg','0777258878','vugjkkg','gcgg','2017-02-27'),('CONT17f0b4d6f','vcdhbj','0112589637','ftuhioysiuyfe','hfg5ehso','2017-02-27'),('CONT17f0c8d2b','cyggcsdgyug','0112587936','jhdvug','jhudgi','2017-02-27'),('CONT17f0f0f8e','dgfirgr','01125527','ufgyeifsihg8we','hfgtouhergi','2017-02-27'),('CONT17f1000a1','aba','0112748387','cfrytgyfte@gmail.com','vgdfywf','2017-02-27'),('CONT189010a77','t7dy875w49f','0112855727','duyttwterug@gmail.com','colombo','2017-03-01'),('CONT1890bacc9','Abans','0112798327','cdgft@gamail.com','Wattala','2017-03-01'),('CONT189a3d88f','rfuko','0111298765','67dtuvguktln','nguytroh','2017-03-01');
/*!40000 ALTER TABLE `Contactor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-04 11:56:40
