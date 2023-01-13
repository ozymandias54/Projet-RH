-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le : ven. 13 jan. 2023 à 14:45
-- Version du serveur : 10.4.24-MariaDB
-- Version de PHP : 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `RH`
--

-- --------------------------------------------------------

--
-- Structure de la table `avisrecrutement`
--

CREATE TABLE `avisrecrutement` (
  `titrePoste` varchar(45) NOT NULL,
  `description` varchar(100) NOT NULL,
  `ExigenceEmploi` varchar(100) NOT NULL,
  `dateFinCandidature` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `avisrecrutement`
--

INSERT INTO `avisrecrutement` (`titrePoste`, `description`, `ExigenceEmploi`, `dateFinCandidature`) VALUES
('Job dev', 'cherche dev', 'java\nc++\noracle', '2023-01-31');

-- --------------------------------------------------------

--
-- Structure de la table `candidat`
--

CREATE TABLE `candidat` (
  `idCandidat` int(11) NOT NULL,
  `nom` varchar(25) NOT NULL,
  `prenom` varchar(35) NOT NULL,
  `dateNaissance` date NOT NULL,
  `dateCandidature` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `genre` tinyint(1) NOT NULL,
  `competence` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `candidat`
--

INSERT INTO `candidat` (`idCandidat`, `nom`, `prenom`, `dateNaissance`, `dateCandidature`, `genre`, `competence`) VALUES
(3, 'sididbe', 'eloi', '2022-12-02', '2022-12-22 13:22:41', 1, 'dev java');

-- --------------------------------------------------------

--
-- Structure de la table `demandeabsence`
--

CREATE TABLE `demandeabsence` (
  `idDemandeAbsence` int(11) NOT NULL,
  `dateCreation` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `dateDebut` date DEFAULT NULL,
  `dateFin` date DEFAULT NULL,
  `motif` varchar(365) NOT NULL,
  `statut` varchar(26) NOT NULL,
  `idEmploye` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `demandeabsence`
--

INSERT INTO `demandeabsence` (`idDemandeAbsence`, `dateCreation`, `dateDebut`, `dateFin`, `motif`, `statut`, `idEmploye`) VALUES
(4, '2022-12-20 17:27:44', '2022-12-21', '2022-12-28', 'maladie', 'Accepter', 3);

-- --------------------------------------------------------

--
-- Structure de la table `demandeemploye`
--

CREATE TABLE `demandeemploye` (
  `idDemandeEmploye` int(11) NOT NULL,
  `employeDemande` varchar(35) NOT NULL,
  `statut` varchar(25) NOT NULL,
  `idCandidat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `demandeemploye`
--

INSERT INTO `demandeemploye` (`idDemandeEmploye`, `employeDemande`, `statut`, `idCandidat`) VALUES
(2, 'programmeur', 'Accepter', 3);

-- --------------------------------------------------------

--
-- Structure de la table `departement`
--

CREATE TABLE `departement` (
  `idDepartement` int(11) NOT NULL,
  `nomDepartement` varchar(26) NOT NULL,
  `description` varchar(35) NOT NULL,
  `chefDepartement` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `departement`
--

INSERT INTO `departement` (`idDepartement`, `nomDepartement`, `description`, `chefDepartement`) VALUES
(1, 'Ressource Humaine', 'Servir', 'Moussa Sidibé'),
(3, 'Finance', 'gestions des finances', 'Ali Moussa koné'),
(4, 'departement DEV', 'Logiciel', 'Fofana');

-- --------------------------------------------------------

--
-- Structure de la table `employe`
--

CREATE TABLE `employe` (
  `idEmploye` int(11) NOT NULL,
  `nom` varchar(21) NOT NULL,
  `prenom` varchar(35) NOT NULL,
  `dateNaissance` date NOT NULL,
  `dateEmbauche` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `genre` tinyint(1) NOT NULL,
  `poste` varchar(25) NOT NULL,
  `salaireDeBase` double NOT NULL,
  `eMail` varchar(25) NOT NULL,
  `idDepartement` int(11) NOT NULL,
  `idEquipe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `employe`
--

INSERT INTO `employe` (`idEmploye`, `nom`, `prenom`, `dateNaissance`, `dateEmbauche`, `genre`, `poste`, `salaireDeBase`, `eMail`, `idDepartement`, `idEquipe`) VALUES
(2, 'Sylla', 'Oumou', '2012-12-05', '2022-12-11 12:47:28', 0, 'Comptable', 250000, 'oumouaagmail.com', 1, 3),
(3, 'sy', 'abba', '2012-12-03', '2022-12-11 12:25:52', 1, 'Programmeur', 150000, 'abbaaGmail', 3, 3),
(6, 'Fofana', 'Bassy', '1993-12-10', '2022-12-15 19:03:51', 1, 'comptable', 543555, 'bassyaa', 3, 3),
(7, 'Sanogo', 'Issa', '1997-06-06', '2022-12-15 19:04:46', 1, 'secretaire', 55555, 'issaaa', 1, 1),
(8, 'Dabo', 'Aissata', '2022-12-01', '2022-12-27 16:33:57', 0, 'pdg', 25000, 'aissa@gmail.com', 1, 1);

-- --------------------------------------------------------

--
-- Structure de la table `entretient`
--

CREATE TABLE `entretient` (
  `id` int(11) NOT NULL,
  `dateEntretient` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `intervieweur` int(11) NOT NULL,
  `noteCandidat` int(11) NOT NULL,
  `candidat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `entretient`
--

INSERT INTO `entretient` (`id`, `dateEntretient`, `intervieweur`, `noteCandidat`, `candidat`) VALUES
(2, '2023-01-13 13:01:54', 7, 11, 3);

-- --------------------------------------------------------

--
-- Structure de la table `equipe`
--

CREATE TABLE `equipe` (
  `idEquipe` int(11) NOT NULL,
  `nombreDeMembre` int(11) NOT NULL,
  `chefEquipe` varchar(35) NOT NULL,
  `nomEquipe` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `equipe`
--

INSERT INTO `equipe` (`idEquipe`, `nombreDeMembre`, `chefEquipe`, `nomEquipe`) VALUES
(1, 2, 'Moussa Sidibe', 'RH'),
(3, 3, 'Fofana', 'Equipe dev');

-- --------------------------------------------------------

--
-- Structure de la table `historique`
--

CREATE TABLE `historique` (
  `id` int(11) NOT NULL,
  `candidat` int(11) NOT NULL,
  `poste` varchar(45) NOT NULL,
  `DateDebut` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `historique`
--

INSERT INTO `historique` (`id`, `candidat`, `poste`, `DateDebut`) VALUES
(1, 3, 'informaticien', '2023-01-20');

-- --------------------------------------------------------

--
-- Structure de la table `prime`
--

CREATE TABLE `prime` (
  `idPrime` int(11) NOT NULL,
  `montant` double NOT NULL,
  `statut` varchar(25) NOT NULL,
  `motif` varchar(35) NOT NULL,
  `idEmploye` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `prime`
--

INSERT INTO `prime` (`idPrime`, `montant`, `statut`, `motif`, `idEmploye`) VALUES
(1, 23455, 'Non payer', 'bon boulot', 2),
(2, 455665, 'Non payer', 'haha', 3),
(3, 5515, 'paye', 'une bon idée', 7);

-- --------------------------------------------------------

--
-- Structure de la table `projet`
--

CREATE TABLE `projet` (
  `idProjet` int(11) NOT NULL,
  `nomProjet` varchar(25) NOT NULL,
  `dateDebut` date NOT NULL,
  `dateFin` date DEFAULT NULL,
  `mission` varchar(55) NOT NULL,
  `idEquipe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `projet`
--

INSERT INTO `projet` (`idProjet`, `nomProjet`, `dateDebut`, `dateFin`, `mission`, `idEquipe`) VALUES
(1, 'projet RH', '2022-12-03', '2022-12-22', 'application des gestions', 3),
(2, 'projet Game', '2022-12-01', '2023-01-13', 'gr', 1);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `idUser` int(11) NOT NULL,
  `login` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `profil` varchar(25) NOT NULL,
  `idEmploye` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`idUser`, `login`, `password`, `profil`, `idEmploye`) VALUES
(4, 'aiss', 'azerty', 'Administrateur', 8);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `avisrecrutement`
--
ALTER TABLE `avisrecrutement`
  ADD PRIMARY KEY (`titrePoste`);

--
-- Index pour la table `candidat`
--
ALTER TABLE `candidat`
  ADD PRIMARY KEY (`idCandidat`);

--
-- Index pour la table `demandeabsence`
--
ALTER TABLE `demandeabsence`
  ADD PRIMARY KEY (`idDemandeAbsence`),
  ADD KEY `idEmploye` (`idEmploye`);

--
-- Index pour la table `demandeemploye`
--
ALTER TABLE `demandeemploye`
  ADD PRIMARY KEY (`idDemandeEmploye`),
  ADD KEY `idCandidat` (`idCandidat`);

--
-- Index pour la table `departement`
--
ALTER TABLE `departement`
  ADD PRIMARY KEY (`idDepartement`),
  ADD KEY `idEmploye` (`chefDepartement`);

--
-- Index pour la table `employe`
--
ALTER TABLE `employe`
  ADD PRIMARY KEY (`idEmploye`),
  ADD KEY `idDepartement` (`idDepartement`,`idEquipe`),
  ADD KEY `idEquipe` (`idEquipe`);

--
-- Index pour la table `entretient`
--
ALTER TABLE `entretient`
  ADD PRIMARY KEY (`id`),
  ADD KEY `entretient` (`intervieweur`),
  ADD KEY `candidat` (`candidat`);

--
-- Index pour la table `equipe`
--
ALTER TABLE `equipe`
  ADD PRIMARY KEY (`idEquipe`);

--
-- Index pour la table `historique`
--
ALTER TABLE `historique`
  ADD PRIMARY KEY (`id`),
  ADD KEY `candidat` (`candidat`);

--
-- Index pour la table `prime`
--
ALTER TABLE `prime`
  ADD PRIMARY KEY (`idPrime`),
  ADD KEY `idEmploye` (`idEmploye`);

--
-- Index pour la table `projet`
--
ALTER TABLE `projet`
  ADD PRIMARY KEY (`idProjet`),
  ADD KEY `idEquipe` (`idEquipe`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`idUser`),
  ADD KEY `idEmploye` (`idEmploye`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `candidat`
--
ALTER TABLE `candidat`
  MODIFY `idCandidat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `demandeabsence`
--
ALTER TABLE `demandeabsence`
  MODIFY `idDemandeAbsence` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `demandeemploye`
--
ALTER TABLE `demandeemploye`
  MODIFY `idDemandeEmploye` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `departement`
--
ALTER TABLE `departement`
  MODIFY `idDepartement` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `employe`
--
ALTER TABLE `employe`
  MODIFY `idEmploye` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT pour la table `entretient`
--
ALTER TABLE `entretient`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `equipe`
--
ALTER TABLE `equipe`
  MODIFY `idEquipe` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `historique`
--
ALTER TABLE `historique`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `prime`
--
ALTER TABLE `prime`
  MODIFY `idPrime` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `projet`
--
ALTER TABLE `projet`
  MODIFY `idProjet` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `idUser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `demandeabsence`
--
ALTER TABLE `demandeabsence`
  ADD CONSTRAINT `demandeAbsence_ibfk_1` FOREIGN KEY (`idEmploye`) REFERENCES `employe` (`idEmploye`);

--
-- Contraintes pour la table `demandeemploye`
--
ALTER TABLE `demandeemploye`
  ADD CONSTRAINT `demandeEmploye_ibfk_1` FOREIGN KEY (`idCandidat`) REFERENCES `candidat` (`idCandidat`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `employe`
--
ALTER TABLE `employe`
  ADD CONSTRAINT `employe_ibfk_1` FOREIGN KEY (`idDepartement`) REFERENCES `departement` (`idDepartement`),
  ADD CONSTRAINT `employe_ibfk_2` FOREIGN KEY (`idEquipe`) REFERENCES `equipe` (`idEquipe`);

--
-- Contraintes pour la table `entretient`
--
ALTER TABLE `entretient`
  ADD CONSTRAINT `entretient` FOREIGN KEY (`intervieweur`) REFERENCES `employe` (`idEmploye`),
  ADD CONSTRAINT `entretient_ibfk_1` FOREIGN KEY (`candidat`) REFERENCES `candidat` (`idCandidat`);

--
-- Contraintes pour la table `historique`
--
ALTER TABLE `historique`
  ADD CONSTRAINT `historique_ibfk_1` FOREIGN KEY (`candidat`) REFERENCES `candidat` (`idCandidat`);

--
-- Contraintes pour la table `prime`
--
ALTER TABLE `prime`
  ADD CONSTRAINT `prime_ibfk_1` FOREIGN KEY (`idEmploye`) REFERENCES `employe` (`idEmploye`);

--
-- Contraintes pour la table `projet`
--
ALTER TABLE `projet`
  ADD CONSTRAINT `projet_ibfk_1` FOREIGN KEY (`idEquipe`) REFERENCES `equipe` (`idEquipe`);

--
-- Contraintes pour la table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`idEmploye`) REFERENCES `employe` (`idEmploye`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
