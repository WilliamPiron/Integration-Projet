-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Dim 07 Janvier 2018 à 19:46
-- Version du serveur :  10.1.22-MariaDB
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `projetidcm2`
--

-- --------------------------------------------------------

--
-- Structure de la table `cours`
--

CREATE TABLE `cours` (
  `NumCours` int(11) NOT NULL,
  `libele` varchar(45) NOT NULL,
  `niveau` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `cours`
--

INSERT INTO `cours` (`NumCours`, `libele`, `niveau`, `type`) VALUES
(1, 'SGBD', 'M1', 'CM'),
(2, 'SGBDA', 'M2', 'CM'),
(3, 'SGBD', 'M1', 'TD'),
(4, 'SGBDA', 'M2', 'TD'),
(5, 'ID', 'M2', 'CM'),
(6, 'ID', 'M2', 'TD');

-- --------------------------------------------------------

--
-- Structure de la table `enseignant`
--

CREATE TABLE `enseignant` (
  `ID_ens` int(11) NOT NULL,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `telephone` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `enseignant`
--

INSERT INTO `enseignant` (`ID_ens`, `nom`, `prenom`, `telephone`) VALUES
(1, 'Dubois', 'Jean', ' 012345678'),
(2, 'LEGRAND', 'EMILIE', ' 012345678'),
(10, 'Nom10', 'Prenom10', ' 012345678'),
(11, 'Nom10', 'Prenom11', ' 012345678');

-- --------------------------------------------------------

--
-- Structure de la table `enseigne`
--

CREATE TABLE `enseigne` (
  `NumEns` int(11) NOT NULL,
  `NumCours` int(11) NOT NULL,
  `Annee` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `enseigne`
--

INSERT INTO `enseigne` (`NumEns`, `NumCours`, `Annee`) VALUES
(1, 1, 2008),
(2, 2, 2009),
(10, 3, 2008),
(10, 5, 2009),
(11, 4, 2009),
(11, 6, 2009);

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE `etudiant` (
  `ID_etudiant` int(11) NOT NULL,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `provenance` varchar(45) NOT NULL,
  `Formation_precedente` varchar(45) NOT NULL,
  `Pays_Formation_precedente` varchar(45) NOT NULL,
  `Annee_debut` int(11) NOT NULL,
  `Niveau_inscription` varchar(45) NOT NULL,
  `telephone` varchar(45) DEFAULT NULL,
  `dateNaissance` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `etudiant`
--

INSERT INTO `etudiant` (`ID_etudiant`, `nom`, `prenom`, `provenance`, `Formation_precedente`, `Pays_Formation_precedente`, `Annee_debut`, `Niveau_inscription`, `telephone`, `dateNaissance`) VALUES
(10, 'Nom10', 'Prenom10', 'fr', 'Licence', 'fr', 2008, 'M1', '012345678', '1985-03-05'),
(11, 'Nom11', 'Prenom11', 'de', 'M1', 'fr', 2009, 'M2', '012345678', '1985-09-08'),
(12, 'Nom12', 'Prenom12', 'it', 'Licence', 'it', 2008, 'M1', '012345678', '1987-07-02');

-- --------------------------------------------------------

--
-- Structure de la table `inscription`
--

CREATE TABLE `inscription` (
  `NumEt` int(11) NOT NULL,
  `NumCours` int(11) NOT NULL,
  `Annee` int(11) NOT NULL,
  `Note_cours` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `inscription`
--

INSERT INTO `inscription` (`NumEt`, `NumCours`, `Annee`, `Note_cours`) VALUES
(10, 1, 2008, 10),
(10, 3, 2008, 16),
(11, 2, 2009, 12),
(11, 4, 2009, 10),
(11, 5, 2009, 14),
(11, 6, 2009, 16),
(12, 1, 2008, 14),
(12, 3, 2008, 12);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `cours`
--
ALTER TABLE `cours`
  ADD PRIMARY KEY (`NumCours`);

--
-- Index pour la table `enseignant`
--
ALTER TABLE `enseignant`
  ADD PRIMARY KEY (`ID_ens`);

--
-- Index pour la table `enseigne`
--
ALTER TABLE `enseigne`
  ADD PRIMARY KEY (`NumEns`,`NumCours`,`Annee`),
  ADD KEY `FK_Cours` (`NumCours`);

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`ID_etudiant`);

--
-- Index pour la table `inscription`
--
ALTER TABLE `inscription`
  ADD PRIMARY KEY (`NumEt`,`NumCours`,`Annee`),
  ADD KEY `FK_cours_ins` (`NumCours`);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `enseigne`
--
ALTER TABLE `enseigne`
  ADD CONSTRAINT `FK_Cours` FOREIGN KEY (`NumCours`) REFERENCES `cours` (`NumCours`),
  ADD CONSTRAINT `FK_Ens` FOREIGN KEY (`NumEns`) REFERENCES `enseignant` (`ID_ens`);

--
-- Contraintes pour la table `inscription`
--
ALTER TABLE `inscription`
  ADD CONSTRAINT `FK_cours_ins` FOREIGN KEY (`NumCours`) REFERENCES `cours` (`NumCours`),
  ADD CONSTRAINT `FK_etudiant` FOREIGN KEY (`NumEt`) REFERENCES `etudiant` (`ID_etudiant`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
