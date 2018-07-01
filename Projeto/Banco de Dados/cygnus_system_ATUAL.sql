-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 02-Jul-2018 às 00:20
-- Versão do servidor: 10.1.30-MariaDB
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cygnus_system`
--
CREATE DATABASE IF NOT EXISTS `cygnus_system` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `cygnus_system`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `equipamentos`
--

CREATE TABLE `equipamentos` (
  `idEquipamentos` int(11) NOT NULL,
  `nomeEquipamento` varchar(30) NOT NULL,
  `refenciaLocal` int(11) DEFAULT NULL,
  `dataUltimaInspecao` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `equipamentos`
--

INSERT INTO `equipamentos` (`idEquipamentos`, `nomeEquipamento`, `refenciaLocal`, `dataUltimaInspecao`) VALUES
(1, 'IC-101', 19, '2018-06-30'),
(2, 'IC-102', 19, '2018-06-30'),
(3, 'BALÃOS DOS FILTROS', 2, '2018-06-30'),
(4, 'IC-103', 19, '2018-06-30'),
(5, 'MISTURADOR PRODUTOS', 3, '2018-06-30'),
(6, 'IC-104', 19, '2018-06-30'),
(7, 'V-92-04-05', 4, '2018-06-30'),
(8, 'V-92-04-06', 4, '2018-06-30'),
(9, 'BIFLOW V-92-04-04', 3, '2018-06-30'),
(10, 'EMBEBIÇÃO', 17, '2018-06-30'),
(11, 'FD-315 V-92-04-01', 5, '2018-06-30'),
(12, 'FD-315 V-92-04-02', 5, '2018-06-30'),
(13, 'FD-315 V-92-04-03', 5, '2018-06-30'),
(14, 'ROLO DESAGUADOR', 22, '2018-06-30'),
(15, 'TERNO SECADOR 1', 23, '2018-06-30'),
(16, 'TERNO SECADOR 2', 23, '2018-06-30'),
(17, 'TERNO SECADOR 3', 23, '2018-06-30'),
(18, 'TERNO SECADOR 4', 23, '2018-06-30'),
(19, 'BIMEDIA V-40', 7, '2018-06-30'),
(20, 'LEITE MISTO V-31', 7, '2018-06-30'),
(21, 'FILTRO CARTUCHO 1 E 2', 7, '2018-06-30'),
(22, 'COLUNA 1 A 6', 7, '2018-06-30'),
(23, 'BIMEDIA V-41', 8, '2018-06-30'),
(24, 'LEITO MISTO V-30', 8, '2018-06-30'),
(25, 'FILTRO CARTUCHO 1 E 2', 8, '2018-06-30'),
(26, 'COLUNA 1 A 6', 8, '2018-06-30'),
(27, 'BIMEDIA V-42', 9, '2018-06-30'),
(28, 'LEITO MISTO V-32', 9, '2018-06-30'),
(29, 'FILTRO CARTUCHO 1 E 2', 9, '2018-06-30'),
(30, 'COLUNA 1 A 6', 9, '2018-06-30'),
(31, 'COLUNA 1 A 6', 10, '2018-06-30'),
(32, 'FILTRO CARTUCHO 1 E 2', 10, '2018-06-30'),
(33, 'LEITO MISTO V-33', 10, '2018-06-30'),
(34, 'BIMEDIA V-43', 10, '2018-06-30'),
(35, 'IC-101', 21, '2018-06-30'),
(36, 'IC-102', 21, '2018-06-30'),
(37, 'DESAERADOR', 11, '2018-06-30'),
(38, 'IC-103', 21, '2018-06-30'),
(39, 'CALDEIRA AMD', 12, '2018-06-30'),
(40, 'IC-104', 21, '2018-06-30'),
(41, 'CALDEIRA AMD', 13, '2018-06-30'),
(42, 'EMBEBIÇÃO', 18, '2018-06-30'),
(43, 'CONDENSADOR', 15, '2018-06-30'),
(44, 'FLASH CONTÍNUO', 15, '2018-06-30'),
(45, 'FLASH DE FUNDO', 15, '2018-06-30'),
(46, 'TURBO-BOMBA', 15, '2018-06-30'),
(47, 'CONDENSADOR', 14, '2018-06-30'),
(48, 'FLASH CONTÍNUO', 14, '2018-06-30'),
(49, 'FLASH DE FUNDO', 14, '2018-06-30'),
(50, 'TURBO-BOMBA', 14, '2018-06-30'),
(51, 'TERNO DESAGUADOR 1', 25, '2018-06-30'),
(52, 'TERNO DESAGUADOR 2', 25, '2018-06-30'),
(53, 'TERNO SECADOR 1', 26, '2018-06-30'),
(54, 'TERNO SECADOR 2', 26, '2018-06-30'),
(55, 'TERNO SECADOR 3', 26, '2018-06-30'),
(56, 'TERNO SECADOR 4', 26, '2018-06-30');

-- --------------------------------------------------------

--
-- Estrutura da tabela `equipamento_local`
--

CREATE TABLE `equipamento_local` (
  `idEquipamento` int(11) NOT NULL,
  `idLocal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `equipamento_local`
--

INSERT INTO `equipamento_local` (`idEquipamento`, `idLocal`) VALUES
(1, 19),
(2, 19),
(3, 2),
(4, 19),
(5, 3),
(6, 19),
(7, 4),
(8, 4),
(9, 3),
(10, 17),
(11, 5),
(12, 5),
(13, 5),
(14, 22),
(15, 23),
(16, 23),
(17, 23),
(18, 23),
(19, 7),
(20, 7),
(21, 7),
(22, 7),
(23, 8),
(24, 8),
(25, 8),
(27, 9),
(28, 9),
(26, 8),
(29, 9),
(30, 9),
(31, 10),
(32, 10),
(33, 10),
(34, 10),
(35, 21),
(36, 21),
(37, 11),
(38, 21),
(39, 12),
(40, 21),
(41, 13),
(42, 18),
(43, 15),
(44, 15),
(45, 15),
(46, 15),
(47, 14),
(48, 14),
(49, 14),
(50, 14),
(51, 25),
(52, 25),
(53, 26),
(54, 26),
(55, 26),
(56, 26);

-- --------------------------------------------------------

--
-- Estrutura da tabela `inspecao`
--

CREATE TABLE `inspecao` (
  `idInspecao` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `local`
--

CREATE TABLE `local` (
  `idLocal` int(11) NOT NULL,
  `referenciaLocal` int(11) DEFAULT NULL,
  `nomeLocal` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `local`
--

INSERT INTO `local` (`idLocal`, `referenciaLocal`, `nomeLocal`) VALUES
(1, 0, 'UTILIDADES'),
(2, 1, 'ETALG'),
(3, 1, 'ETA'),
(4, 3, 'BIMEDIA'),
(5, 3, 'FLOCODECANTADOR'),
(6, 1, 'OSMOSE'),
(7, 6, 'CONJUNTO 1'),
(8, 6, 'CONJUNTO 2'),
(9, 6, 'CONJUNTO 3'),
(10, 6, 'CONJUNTO 4'),
(11, 0, 'GERAÇÃO DE VAPOR'),
(12, 11, 'CALDEIRA 1'),
(13, 11, 'CALDEIRA 2'),
(14, 12, 'VASOS'),
(15, 13, 'VASOS'),
(16, 0, 'EXTRAÇÃO'),
(17, 16, 'FASE 1'),
(18, 16, 'FASE 2'),
(19, 17, 'AQUECEDORES'),
(20, 17, 'GARRAFAS'),
(21, 18, 'AQUECEDORES'),
(22, 20, 'TERNO DESAGUADOR'),
(23, 20, 'TERNO SECADOR'),
(24, 18, 'GARRAFAS'),
(25, 24, 'TERNO DESAGUADOR'),
(26, 24, 'TERNO SECADOR');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tipousuario`
--

CREATE TABLE `tipousuario` (
  `idTipoUsuario` int(11) NOT NULL,
  `tipoUsuarioDescricao` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL,
  `nomeUsuario` varchar(30) NOT NULL,
  `loginUsuario` varchar(15) NOT NULL,
  `senhaUsuario` varchar(20) NOT NULL,
  `idTipoUsuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `equipamentos`
--
ALTER TABLE `equipamentos`
  ADD PRIMARY KEY (`idEquipamentos`);

--
-- Indexes for table `inspecao`
--
ALTER TABLE `inspecao`
  ADD PRIMARY KEY (`idInspecao`);

--
-- Indexes for table `local`
--
ALTER TABLE `local`
  ADD PRIMARY KEY (`idLocal`);

--
-- Indexes for table `tipousuario`
--
ALTER TABLE `tipousuario`
  ADD PRIMARY KEY (`idTipoUsuario`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUsuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `equipamentos`
--
ALTER TABLE `equipamentos`
  MODIFY `idEquipamentos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;

--
-- AUTO_INCREMENT for table `inspecao`
--
ALTER TABLE `inspecao`
  MODIFY `idInspecao` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `local`
--
ALTER TABLE `local`
  MODIFY `idLocal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `tipousuario`
--
ALTER TABLE `tipousuario`
  MODIFY `idTipoUsuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
