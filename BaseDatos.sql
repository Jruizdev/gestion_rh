CREATE DATABASE  IF NOT EXISTS `evidencia_aprendizaje` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `evidencia_aprendizaje`;
-- MariaDB dump 10.18  Distrib 10.4.17-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: evidencia_aprendizaje
-- ------------------------------------------------------
-- Server version	10.4.17-MariaDB

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
-- Table structure for table `alumnos`
--

DROP TABLE IF EXISTS `alumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alumnos` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `CURP` varchar(45) NOT NULL,
  `certificado` blob DEFAULT NULL,
  `ID_alumno` int(11) NOT NULL,
  `ID_contacto` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID_alumno` (`ID_alumno`),
  KEY `ID_contacto` (`ID_contacto`),
  CONSTRAINT `alumnos_ibfk_1` FOREIGN KEY (`ID_alumno`) REFERENCES `datos_escolares` (`ID_alumno`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `alumnos_ibfk_2` FOREIGN KEY (`ID_contacto`) REFERENCES `datos_contacto` (`ID_contacto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumnos`
--

LOCK TABLES `alumnos` WRITE;
/*!40000 ALTER TABLE `alumnos` DISABLE KEYS */;
INSERT INTO `alumnos` VALUES (2,'Jonathan Ruiz','Cirilo Cornejo #7','RUOJ970407HQTTZLN02',NULL,2,2);
/*!40000 ALTER TABLE `alumnos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carrera`
--

DROP TABLE IF EXISTS `carrera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `carrera` (
  `ID_carrera` int(11) NOT NULL,
  `carrera` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carrera`
--

LOCK TABLES `carrera` WRITE;
/*!40000 ALTER TABLE `carrera` DISABLE KEYS */;
INSERT INTO `carrera` VALUES (1,'Desarrollo de Software'),(2,'Telemática'),(3,'Biotecnología'),(4,'Administración de empresas'),(5,'Nutrición aplicada');
/*!40000 ALTER TABLE `carrera` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `datos_contacto`
--

DROP TABLE IF EXISTS `datos_contacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `datos_contacto` (
  `ID_contacto` int(11) NOT NULL AUTO_INCREMENT,
  `telefono` varchar(45) NOT NULL,
  `correo` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_contacto`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datos_contacto`
--

LOCK TABLES `datos_contacto` WRITE;
/*!40000 ALTER TABLE `datos_contacto` DISABLE KEYS */;
INSERT INTO `datos_contacto` VALUES (2,'4427896536','jonathan.ruizolv@nube.unadmexico.mx');
/*!40000 ALTER TABLE `datos_contacto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `datos_escolares`
--

DROP TABLE IF EXISTS `datos_escolares`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `datos_escolares` (
  `ID_alumno` int(11) NOT NULL AUTO_INCREMENT,
  `matricula` varchar(45) NOT NULL,
  `semestre` varchar(45) NOT NULL,
  `ID_carrera` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_alumno`),
  KEY `ID_carrera` (`ID_carrera`),
  CONSTRAINT `datos_escolares_ibfk_1` FOREIGN KEY (`ID_carrera`) REFERENCES `carrera` (`ID_carrera`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datos_escolares`
--

LOCK TABLES `datos_escolares` WRITE;
/*!40000 ALTER TABLE `datos_escolares` DISABLE KEYS */;
INSERT INTO `datos_escolares` VALUES (2,'ES202100495','3',1);
/*!40000 ALTER TABLE `datos_escolares` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `datospersonales`
--

DROP TABLE IF EXISTS `datospersonales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `datospersonales` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `RFC` varchar(45) NOT NULL,
  `Direccion` varchar(45) NOT NULL,
  `Estado_civil` varchar(45) NOT NULL,
  `Telefono` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datospersonales`
--

LOCK TABLES `datospersonales` WRITE;
/*!40000 ALTER TABLE `datospersonales` DISABLE KEYS */;
INSERT INTO `datospersonales` VALUES (1,'Marco','Ramos Mendoza','RAMM950516PLKJ','Av. Cimatario #5, Col. Mirador','Casado','5532145698'),(2,'Paulina','Almaza Arteaga','ALAP920901JHSP','Av. Pie de la Cuesta #122, Col. El Refugio','Soltero','4426547893'),(3,'Diego','Sainz Uribe','SAUD941104PLOI','Cirilo Cornejo #7, Col. Alcanfores','Casado','5563214587'),(4,'Jaziel','Leyva Alvarez','LEAJ940122LKPO','Profesores #356, Col. Los Heroes','Soltero','5536547898');
/*!40000 ALTER TABLE `datospersonales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seccion_materias`
--

DROP TABLE IF EXISTS `seccion_materias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `seccion_materias` (
  `ID_materia` int(11) NOT NULL AUTO_INCREMENT,
  `materia` varchar(45) NOT NULL,
  `semestre` varchar(45) NOT NULL,
  `ciclo_escolar` varchar(45) NOT NULL,
  `ID_carrera` int(11) NOT NULL,
  PRIMARY KEY (`ID_materia`),
  KEY `ID_carrera` (`ID_carrera`),
  CONSTRAINT `seccion_materias_ibfk_1` FOREIGN KEY (`ID_carrera`) REFERENCES `carrera` (`ID_carrera`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seccion_materias`
--

LOCK TABLES `seccion_materias` WRITE;
/*!40000 ALTER TABLE `seccion_materias` DISABLE KEYS */;
INSERT INTO `seccion_materias` VALUES (1,'Modelado de Negocios','3','2021-2',1),(2,'Diseño de Base de Datos','3','2021-1',1),(3,'Programacion Orientada a Objetos II','3','2021-1',1);
/*!40000 ALTER TABLE `seccion_materias` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-04  1:15:54
