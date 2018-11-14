-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1build0.15.04.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Jeu 11 Août 2016 à 15:25
-- Version du serveur :  5.6.28-0ubuntu0.15.04.1
-- Version de PHP :  5.6.4-4ubuntu6.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `gestion_VMT`
--

-- --------------------------------------------------------

--
-- Structure de la table `panne`
--

CREATE TABLE IF NOT EXISTS `panne` (
`id_panne` int(11) NOT NULL,
  `info_panne` text NOT NULL,
  `date_panne` date NOT NULL,
  `status_panne` varchar(25) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `panne`
--

INSERT INTO `panne` (`id_panne`, `info_panne`, `date_panne`, `status_panne`) VALUES
(2, 'je test l''ajout via mysql', '2016-12-10', 'reparee'),
(3, 'alhmdoulilahi', '2016-12-12', 'reparée');

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
`id` int(11) NOT NULL,
  `id_users` int(11) NOT NULL,
  `logine` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL,
  `type` varchar(10) NOT NULL,
  `nom` varchar(60) NOT NULL,
  `prenom` varchar(60) NOT NULL,
  `telephone` int(12) NOT NULL,
  `email` varchar(60) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `users`
--

INSERT INTO `users` (`id`, `id_users`, `logine`, `password`, `type`, `nom`, `prenom`, `telephone`, `email`) VALUES
(6, 2, 'adams', 'komahi', 'admin', 'mahdi', 'hassan', 77093125, 'mahdihssajilal@gmail.com'),
(7, 5, 'buoba', 'buoba', 'user', 'aboubaker', 'issa', 77741791, 'aboubaker-issa@live.com'),
(8, 3, 'madi', '123', 'admin', 'hassan', 'dane', 77056245, 'aden.hassan@hotmail.fr'),
(9, 4, 'smithe', 'lomahi', 'admin', 'aden', 'hassanDjilal', 77831573, 'mariamKaire@hotmail.com');

-- --------------------------------------------------------

--
-- Structure de la table `VMT`
--

CREATE TABLE IF NOT EXISTS `VMT` (
`id_vmt` int(11) NOT NULL,
  `type_vmt` varchar(11) NOT NULL,
  `QtStock` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `VMT`
--

INSERT INTO `VMT` (`id_vmt`, `type_vmt`, `QtStock`) VALUES
(3, '8255', 231),
(4, '8525G2', 23),
(5, '8055', 452),
(7, '8525G2', 23);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `panne`
--
ALTER TABLE `panne`
 ADD PRIMARY KEY (`id_panne`);

--
-- Index pour la table `users`
--
ALTER TABLE `users`
 ADD PRIMARY KEY (`id`);

--
-- Index pour la table `VMT`
--
ALTER TABLE `VMT`
 ADD PRIMARY KEY (`id_vmt`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `panne`
--
ALTER TABLE `panne`
MODIFY `id_panne` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT pour la table `users`
--
ALTER TABLE `users`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT pour la table `VMT`
--
ALTER TABLE `VMT`
MODIFY `id_vmt` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
