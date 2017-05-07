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
-- Temporary view structure for view `emp_view`
--

DROP TABLE IF EXISTS `emp_view`;
/*!50001 DROP VIEW IF EXISTS `emp_view`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `emp_view` AS SELECT 
 1 AS `emp_id`,
 1 AS `f_name`,
 1 AS `l_name`,
 1 AS `gender`,
 1 AS `nic`,
 1 AS `nationaliy`,
 1 AS `address`,
 1 AS `dob`,
 1 AS `depid`,
 1 AS `email`,
 1 AS `mobile_no`,
 1 AS `catergory`,
 1 AS `userId`,
 1 AS `UserName`,
 1 AS `Password`,
 1 AS `emp_table_emp_id`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `emp_view`
--

/*!50001 DROP VIEW IF EXISTS `emp_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`rosliit216v`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `emp_view` AS select `e`.`emp_id` AS `emp_id`,`e`.`f_name` AS `f_name`,`e`.`l_name` AS `l_name`,`e`.`gender` AS `gender`,`e`.`nic` AS `nic`,`e`.`nationaliy` AS `nationaliy`,`e`.`address` AS `address`,`e`.`dob` AS `dob`,`e`.`depid` AS `depid`,`e`.`email` AS `email`,`e`.`mobile_no` AS `mobile_no`,`e`.`catergory` AS `catergory`,`u`.`userId` AS `userId`,`u`.`UserName` AS `UserName`,`u`.`Password` AS `Password`,`u`.`emp_table_emp_id` AS `emp_table_emp_id` from (`emp_table` `e` left join `users_table` `u` on((`e`.`emp_id` = `u`.`userId`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  3:29:16
