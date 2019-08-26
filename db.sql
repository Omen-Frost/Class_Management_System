-- MySQL dump 10.13  Distrib 5.7.25, for Linux (x86_64)
--
-- Host: localhost    Database: testdb
-- ------------------------------------------------------
-- Server version	5.7.25-0ubuntu0.16.04.2

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
-- Table structure for table `17CS20001`
--

DROP TABLE IF EXISTS `17CS20001`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `17CS20001` (
  `courses` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `17CS20001`
--

LOCK TABLES `17CS20001` WRITE;
/*!40000 ALTER TABLE `17CS20001` DISABLE KEYS */;
INSERT INTO `17CS20001` VALUES ('C1');
/*!40000 ALTER TABLE `17CS20001` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `17CS20015`
--

DROP TABLE IF EXISTS `17CS20015`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `17CS20015` (
  `courses` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `17CS20015`
--

LOCK TABLES `17CS20015` WRITE;
/*!40000 ALTER TABLE `17CS20015` DISABLE KEYS */;
INSERT INTO `17CS20015` VALUES ('C2'),('C1'),('C1'),('C8');
/*!40000 ALTER TABLE `17CS20015` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `17CS40001`
--

DROP TABLE IF EXISTS `17CS40001`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `17CS40001` (
  `courses` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `17CS40001`
--

LOCK TABLES `17CS40001` WRITE;
/*!40000 ALTER TABLE `17CS40001` DISABLE KEYS */;
INSERT INTO `17CS40001` VALUES ('C1'),('C1');
/*!40000 ALTER TABLE `17CS40001` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `17CS40002`
--

DROP TABLE IF EXISTS `17CS40002`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `17CS40002` (
  `courses` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `17CS40002`
--

LOCK TABLES `17CS40002` WRITE;
/*!40000 ALTER TABLE `17CS40002` DISABLE KEYS */;
INSERT INTO `17CS40002` VALUES ('C1');
/*!40000 ALTER TABLE `17CS40002` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `A1`
--

DROP TABLE IF EXISTS `A1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `A1` (
  `course` varchar(80) DEFAULT NULL,
  `student` varchar(80) DEFAULT NULL,
  `grade` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `A1`
--

LOCK TABLES `A1` WRITE;
/*!40000 ALTER TABLE `A1` DISABLE KEYS */;
INSERT INTO `A1` VALUES ('C1','17CS40001','85'),('C1','17CS40002','74'),('C1','17CS20001','60');
/*!40000 ALTER TABLE `A1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `A2`
--

DROP TABLE IF EXISTS `A2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `A2` (
  `course` varchar(80) DEFAULT NULL,
  `student` varchar(80) DEFAULT NULL,
  `grade` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `A2`
--

LOCK TABLES `A2` WRITE;
/*!40000 ALTER TABLE `A2` DISABLE KEYS */;
INSERT INTO `A2` VALUES ('C1','17CS20015','55');
/*!40000 ALTER TABLE `A2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `A3`
--

DROP TABLE IF EXISTS `A3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `A3` (
  `course` varchar(80) DEFAULT NULL,
  `student` varchar(80) DEFAULT NULL,
  `grade` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `A3`
--

LOCK TABLES `A3` WRITE;
/*!40000 ALTER TABLE `A3` DISABLE KEYS */;
INSERT INTO `A3` VALUES ('C2','17CS20015','96');
/*!40000 ALTER TABLE `A3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `C1`
--

DROP TABLE IF EXISTS `C1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `C1` (
  `student` varchar(80) DEFAULT NULL,
  `faculty` varchar(80) DEFAULT NULL,
  `ta` varchar(80) DEFAULT NULL,
  `grade` varchar(80) DEFAULT NULL,
  `course` varchar(80) DEFAULT NULL,
  `info` varchar(80) DEFAULT NULL,
  `attendance` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `C1`
--

LOCK TABLES `C1` WRITE;
/*!40000 ALTER TABLE `C1` DISABLE KEYS */;
INSERT INTO `C1` VALUES (NULL,'F1',NULL,NULL,'Math','Linear algebra ....',0),('17CS40001',NULL,NULL,'Ex',NULL,NULL,1),(NULL,NULL,'T1',NULL,NULL,NULL,0),('17CS40002',NULL,NULL,'A',NULL,NULL,4),('17CS20015',NULL,NULL,NULL,NULL,NULL,3),('17CS20001',NULL,NULL,'B',NULL,NULL,1),(NULL,NULL,'T2',NULL,NULL,NULL,0),('17CS20015',NULL,NULL,NULL,NULL,NULL,0);
/*!40000 ALTER TABLE `C1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `C2`
--

DROP TABLE IF EXISTS `C2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `C2` (
  `student` varchar(80) DEFAULT NULL,
  `faculty` varchar(80) DEFAULT NULL,
  `ta` varchar(80) DEFAULT NULL,
  `grade` varchar(80) DEFAULT NULL,
  `course` varchar(80) DEFAULT NULL,
  `info` varchar(80) DEFAULT NULL,
  `attendance` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `C2`
--

LOCK TABLES `C2` WRITE;
/*!40000 ALTER TABLE `C2` DISABLE KEYS */;
INSERT INTO `C2` VALUES (NULL,'F1',NULL,NULL,'Software Engineering','Software development and project management',0),('17CS20015',NULL,NULL,NULL,NULL,NULL,0),(NULL,NULL,'T1',NULL,NULL,NULL,0);
/*!40000 ALTER TABLE `C2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `C6`
--

DROP TABLE IF EXISTS `C6`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `C6` (
  `student` varchar(80) DEFAULT NULL,
  `faculty` varchar(80) DEFAULT NULL,
  `ta` varchar(80) DEFAULT NULL,
  `grade` varchar(80) DEFAULT NULL,
  `course` varchar(80) DEFAULT NULL,
  `info` varchar(80) DEFAULT NULL,
  `attendance` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `C6`
--

LOCK TABLES `C6` WRITE;
/*!40000 ALTER TABLE `C6` DISABLE KEYS */;
INSERT INTO `C6` VALUES (NULL,'F1',NULL,NULL,'DISCRETE','etc etc',0);
/*!40000 ALTER TABLE `C6` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `C8`
--

DROP TABLE IF EXISTS `C8`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `C8` (
  `student` varchar(80) DEFAULT NULL,
  `faculty` varchar(80) DEFAULT NULL,
  `ta` varchar(80) DEFAULT NULL,
  `grade` varchar(80) DEFAULT NULL,
  `course` varchar(80) DEFAULT NULL,
  `info` varchar(80) DEFAULT NULL,
  `attendance` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `C8`
--

LOCK TABLES `C8` WRITE;
/*!40000 ALTER TABLE `C8` DISABLE KEYS */;
INSERT INTO `C8` VALUES (NULL,'F2',NULL,NULL,'Flat','automata',0),('17CS20015',NULL,NULL,NULL,NULL,NULL,2);
/*!40000 ALTER TABLE `C8` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `F1`
--

DROP TABLE IF EXISTS `F1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `F1` (
  `courses` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `F1`
--

LOCK TABLES `F1` WRITE;
/*!40000 ALTER TABLE `F1` DISABLE KEYS */;
INSERT INTO `F1` VALUES ('C1'),('C2'),('C6');
/*!40000 ALTER TABLE `F1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `F2`
--

DROP TABLE IF EXISTS `F2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `F2` (
  `courses` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `F2`
--

LOCK TABLES `F2` WRITE;
/*!40000 ALTER TABLE `F2` DISABLE KEYS */;
INSERT INTO `F2` VALUES ('C8');
/*!40000 ALTER TABLE `F2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T1`
--

DROP TABLE IF EXISTS `T1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T1` (
  `courses` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T1`
--

LOCK TABLES `T1` WRITE;
/*!40000 ALTER TABLE `T1` DISABLE KEYS */;
INSERT INTO `T1` VALUES ('C1'),('C2');
/*!40000 ALTER TABLE `T1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T2`
--

DROP TABLE IF EXISTS `T2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T2` (
  `courses` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T2`
--

LOCK TABLES `T2` WRITE;
/*!40000 ALTER TABLE `T2` DISABLE KEYS */;
INSERT INTO `T2` VALUES ('C1');
/*!40000 ALTER TABLE `T2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `cid` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES ('C1'),('C2'),('C6'),('C8');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registered`
--

DROP TABLE IF EXISTS `registered`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registered` (
  `username` varchar(80) NOT NULL,
  `password` varchar(80) DEFAULT NULL,
  `actor` varchar(80) DEFAULT NULL,
  `name` varchar(80) DEFAULT NULL,
  `id` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registered`
--

LOCK TABLES `registered` WRITE;
/*!40000 ALTER TABLE `registered` DISABLE KEYS */;
INSERT INTO `registered` VALUES ('Faculty1','pass','Faculty','A','F1'),('Faculty2','pass','Faculty','Rohini','F2'),('Praagy','0','Admin','Praagy Rastogi','007'),('Student1','pass','Student','Earth','17CS40001'),('Student2','pass','Student','Rakesh','17CS40002'),('Student3','pass','Student','pluto','17CS20015'),('Student4','pass','Student','Jupiter','17CS20001'),('T1','pass','Teaching Assistant','Mercury','T1'),('T2','pass','Teaching Assistant','Saturn','T2');
/*!40000 ALTER TABLE `registered` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-10 20:57:27
