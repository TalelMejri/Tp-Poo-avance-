-- phpMyAdmin SQL Dump
-- version 3.3.5
-- http://www.phpmyadmin.net
--
-- Serveur: 127.0.0.1
-- Généré le : Lun 01 Juin 2015 à 01:02
-- Version du serveur: 5.1.49
-- Version de PHP: 5.3.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `entreprisedb`
--

-- --------------------------------------------------------

--
-- Structure de la table `dept`
--

CREATE TABLE IF NOT EXISTS `dept` (
  `nodept` decimal(2,0) NOT NULL,
  `nom` varchar(25) DEFAULT NULL,
  `noregion` decimal(1,0) NOT NULL,
  PRIMARY KEY (`nodept`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `dept`
--

INSERT INTO `dept` (`nodept`, `nom`, `noregion`) VALUES
(10, 'finance', 1),
(20, 'Atelier', 2),
(30, 'Atelier', 3),
(31, 'Vente', 1),
(32, 'Vente', 2),
(33, 'Vente', 3),
(34, 'Vente', 4),
(35, 'Vente', 5),
(41, 'Distribution', 1),
(42, 'Distribution', 2),
(43, 'Distribution', 3),
(44, 'Distribution', 4),
(45, 'Distribution', 5),
(50, 'Administration', 1);

-- --------------------------------------------------------

--
-- Structure de la table `emp`
--

CREATE TABLE IF NOT EXISTS `emp` (
  `noemp` decimal(7,0) NOT NULL,
  `nom` varchar(25) DEFAULT NULL,
  `prenom` varchar(25) DEFAULT NULL,
  `embauche` date DEFAULT NULL,
  `nosupr` decimal(7,0) DEFAULT NULL,
  `titre` varchar(25) DEFAULT NULL,
  `nodept` decimal(2,0) NOT NULL,
  `salaire` decimal(11,2) DEFAULT NULL,
  `x_commission` decimal(4,2) DEFAULT NULL,
  PRIMARY KEY (`noemp`),
  KEY `emp_nodept_fk` (`nodept`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `emp`
--

INSERT INTO `emp` (`noemp`, `nom`, `prenom`, `embauche`, `nosupr`, `titre`, `nodept`, `salaire`, `x_commission`) VALUES
(1, 'Patamob', 'Adhémar', '2000-03-26', NULL, 'Président', 50, 50000.00, NULL),
(2, 'Zeublouze', 'Agathe', '2000-04-15', 1, 'Dir. Distrib', 41, 35000.00, NULL),
(3, 'Kuzbidon', 'Alex', '2000-05-05', 1, 'Dir. Vente', 31, 34000.00, NULL),
(4, 'Locale', 'Anasthasie', '2000-05-25', 1, 'Dir. finance', 10, 36000.00, NULL),
(5, 'Teutmaronne', 'Armand', '2000-06-14', 1, 'Dir. Administr', 50, 36000.00, NULL),
(6, 'Zoudanlkou', 'Debbie', '2000-07-04', 2, 'Chef Entrepôt', 41, 25000.00, NULL),
(7, 'Rivenbusse', 'Elsa', '2000-07-24', 2, 'Chef Entrepôt', 42, 24000.00, NULL),
(8, 'Ardelpic', 'Helmut', '2000-08-13', 2, 'Chef Entrepôt', 43, 23000.00, NULL),
(9, 'Peursconla', 'Humphrey', '2000-09-02', 2, 'Chef Entrepôt', 44, 22000.00, NULL),
(10, 'Vrante', 'Héléna', '2000-09-22', 2, 'Chef Entrepôt', 45, 21000.00, NULL),
(11, 'Enfaillite', 'Mélusine', '2000-10-12', 3, 'Représentant', 31, 25000.00, 10.00),
(12, 'Eurktumeme', 'Odile', '2000-11-01', 3, 'Représentant', 32, 26000.00, 12.50),
(13, 'Hotdeugou', 'Olaf', '2000-11-21', 3, 'Représentant', 33, 27000.00, 10.00),
(14, 'Odlavieille', 'Pacôme', '2000-12-11', 3, 'Représentant', 34, 25500.00, 15.00),
(15, 'Amartakaldire', 'Quentin', '2000-12-31', 3, 'Représentant', 35, 23000.00, 17.50),
(16, 'Traibien', 'Samira', '2001-01-10', 6, 'Secrétaire', 41, 15000.00, NULL),
(17, 'Fonfec', 'Sophie', '2001-01-20', 6, 'Secrétaire', 41, 14000.00, NULL),
(18, 'Fairant', 'Teddy', '2001-02-09', 7, 'Secrétaire', 42, 13000.00, NULL),
(19, 'Blaireur', 'Terry', '2001-02-09', 7, 'Secrétaire', 42, 13000.00, NULL),
(20, 'Ajerre', 'Tex', '2001-02-19', 8, 'Secrétaire', 43, 13000.00, NULL),
(21, 'Chmonfisse', 'Thierry', '2001-02-19', 8, 'Secrétaire', 43, 12000.00, NULL),
(22, 'Phototetedemort', 'Thomas', '2001-03-01', 9, 'Secrétaire', 44, 22500.00, NULL),
(23, 'Kaécouté', 'Xavier', '2001-03-11', 9, 'Secrétaire', 34, 11500.00, NULL),
(24, 'Adrouille-Toultan', 'Yves', '2001-03-21', 10, 'Secrétaire', 45, 11000.00, NULL),
(25, 'Anchier', 'Yvon', '2000-12-31', 10, 'Secrétaire', 45, 10000.00, NULL);
