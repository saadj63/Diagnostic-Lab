-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: lab
-- ------------------------------------------------------
-- Server version	5.5.62-log

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
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient` (
  `Patient_id` int(11) NOT NULL AUTO_INCREMENT,
  `Date` date DEFAULT NULL,
  `Patients_Name` varchar(100) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `City` varchar(30) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `Contact_No` varchar(10) DEFAULT NULL,
  `Refered_By` varchar(50) DEFAULT NULL,
  `Type_of_Test` varchar(45) DEFAULT NULL,
  `Ultrasonography_Test` varchar(500) DEFAULT NULL,
  `Radiography_Test` varchar(500) DEFAULT NULL,
  `Price` int(11) DEFAULT NULL,
  `Report` varchar(100) DEFAULT NULL,
  `Report1` varchar(100) DEFAULT NULL,
  `Report2` varchar(100) DEFAULT NULL,
  `Report3` varchar(100) DEFAULT NULL,
  `Report4` varchar(100) DEFAULT NULL,
  `Report5` varchar(100) DEFAULT NULL,
  `Report6` varchar(100) DEFAULT NULL,
  `Report7` varchar(100) DEFAULT NULL,
  `Report8` varchar(100) DEFAULT NULL,
  `Report9` varchar(100) DEFAULT NULL,
  `Report10` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Patient_id`),
  KEY `Doctor_Name_idx` (`Refered_By`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES (68,'2019-11-22','VIRAJ JADHAV',18,'JSDFKJHSDK','Male','1234','Dr. Sid','Ultrasonography','Pelvis',NULL,600,'D://Reports//VIRAJ JADHAVPelvis.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(69,'2019-11-22','RAHUL PATIL',45,'ICHALKARANJI','Male','1234','Dr. Sid','Radiography',NULL,'KUB',0,'D://Reports//RAHUL PATILKUB.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(70,'2019-11-22','JO',12,'ICHA','Male','1234','Dr. Sid','Ultrasonography','Follicular Monitoring','KUB',0,'D://Reports//JOFollicular Monitoring.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(71,'2019-11-22','SAAD JAMADAR',19,'ICH','Male','1234','Dr. Mukund Badve','Ultrasonography','Upper Abdomen',NULL,700,'D://Reports//SAAD JAMADARUpper Abdomen.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(73,'2019-11-23','Qe',22,'DKLJSKL','Male','789','Dr. Swami','Radiography',NULL,'Hand AP & LAT',400,'D://Reports//HARSH PAWARHand AP & LAT.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(74,'2019-11-23','SANDEEP',12,'FGD','Male','258','Dr Kumbhar','Radiography',NULL,'Other',2000,'D://Reports//SANDEEPOther.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(77,'2019-11-23','KJAH',23,'DJSK','Male','1234','Dr. Swami','Ultrasonography','KUB',NULL,500,'D://Reports//KJAHKUB.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(79,'2019-11-23','HJ',12,'LKDJLSK','Male','76832768','Dr. A.A Dharngutte\n','Ultrasonography','Follicular Monitoring',NULL,800,'D://Reports//HJFollicular Monitoring.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(80,'2019-11-23','ZC',23,'SDFS','Male','3242','Dr. A.A Dharngutte\n','Ultrasonography','Viability Scan',NULL,400,'D://Reports//ZCViability Scan.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(81,'2019-11-23','ABC',13,'DSDFSF','Male','1312312','Dr. Swami','Ultrasonography','NT Scan (11 to 14 weeks)',NULL,800,'D://Reports//ABCWhole Abdomen.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(82,'2019-11-23','ABC',3,'FSFS','Male','131','Dr. A.A Dharngutte\n','Ultrasonography','NT Scan (11 to 14 weeks)',NULL,800,'D://Reports//ABCWhole Abdomen.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(84,'2019-11-23','SHJ',643,'MHHBHJ','Male','546546','Dr. Swami','Ultrasonography','Whole Abdomen',NULL,800,'D://Reports//SHJWhole Abdomen.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(85,'2019-11-23','JOYA',16,'JHGHJGJH','Female','2134586','Dr. Swami','Ultrasonography','Whole Abdomen',NULL,800,'D://Reports//JOYAWhole Abdomen.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(88,'2019-11-24','DKJ',23,'FSGSAFG','Male','23423','Dr. A.A Dharngutte\n','Ultrasonography','Growth Scan',NULL,800,'D://Reports//DKJGrowth Scan.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(89,'2019-11-24','DSK',9247,'KFHGKJ','Male','348758','Self','Ultrasonography','Neck or Thyroid',NULL,800,'D://Reports//DSKNeck or Thyroid.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(90,'2019-11-24','VIRAJJ KJFH',38,'KFJHJK','Male','9843798','Dr. A.A Dharngutte\n','Ultrasonography','Peripheral Vein (R)-UL or LL',NULL,800,'D://Reports//VIRAJJ KJFHPeripheral Vein (R)-UL or LL.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(91,'2019-11-24','HGF',45,'G','Male','56','Dr. Sid','Radiography',NULL,'Spine(C or D or L or S or C)',800,'D://Reports//HGFSpine(C or D or L or S or C).docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(92,'2019-11-24','DJ',32,'JKKHKSJ','Male','485798','Self','Ultrasonography','KUB',NULL,800,'D://Reports//DJKUB.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(93,'2019-11-24','JDFHKJS',32,'JHGKJD','Male','9847982','Dr. A.A Dharngutte\n','Radiography',NULL,'Foot AP & LAT',400,'D://Reports//JDFHKJSFoot AP & LAT.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(94,'2019-11-24','KJDF',37,'DSKH','Female','32978','Dr. Swami','Ultrasonography','NT Scan (11 to 14 weeks)',NULL,500,'D://Reports//KJDFNT Scan (11 to 14 weeks).docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(95,'2019-11-24','ABC',35,'ICH','Male','9876543210','Self','Ultrasonography','Whole Abdomen','Foot AP',1000,'D://Reports//ABCWhole Abdomen.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(96,'2019-11-24','ABC',35,'ICH','Male','9876543210','Dr. A.A Dharngutte\n','Ultrasonography','Upper Abdomen','Chest PA',1000,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(97,'2019-11-26','LKJKJD',34,'KSHDKJS','Male','324324','Dr. Swami','Ultrasonography','Viability Scan','KUB',800,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(98,'2019-11-26','QWEER',3,'DHDGDF','Male','34234','Self','Ultrasonography','KUB','Abodemen(Erect)',500,'D://Reports//QWEERComplete Abortion.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(99,'2019-11-26','ER',23,'JHGJHGJ','Male','65434','Dr. A.A Dharngutte\n','Ultrasonography and RadioGraphy','Follicular Monitoring','Chest PA & LA',800,'D://Reports//ERr.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(100,'2019-11-26','T',5,'JGJH','Male','757','Dr. A.A Dharngutte\n','Ultrasonography and RadioGraphy','Whole Abdomen','KUB',800,'D://Reports//Tb.docx','D://Reports//Tasd.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(101,'2019-11-26','AD',3,'SDFSD','Male','42','Dr. A.A Dharngutte\n','Ultrasonography and RadioGraphy','[Follicular Monitoring, Viability Scan, NT Scan (11 to 14 weeks), Anomaly Scan, Fetal Echocardiograpahy]','[Chest PA, Chest PA & LA, Abodemen(Erect), KUB]',500,'D://Reports//ADas.docx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-26 20:19:02
