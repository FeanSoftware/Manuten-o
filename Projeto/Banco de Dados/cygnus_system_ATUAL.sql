-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 03-Jul-2018 às 03:51
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
-- Estrutura da tabela `empresa`
--

CREATE TABLE `empresa` (
  `idEmpresa` int(11) NOT NULL,
  `nomeEmpresa` varchar(30) DEFAULT NULL,
  `cnpjEmpresa` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `empresa`
--

INSERT INTO `empresa` (`idEmpresa`, `nomeEmpresa`, `cnpjEmpresa`) VALUES
(1, 'USINA SÃO FRANCISCO', '10249419000216');

-- --------------------------------------------------------

--
-- Estrutura da tabela `equipamentos`
--

CREATE TABLE `equipamentos` (
  `idEquipamentos` int(11) NOT NULL,
  `nomeEquipamento` varchar(30) NOT NULL,
  `refenciaLocal` int(11) DEFAULT NULL,
  `dataUltimaInspecao` date NOT NULL,
  `idEmpresa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `equipamentos`
--

INSERT INTO `equipamentos` (`idEquipamentos`, `nomeEquipamento`, `refenciaLocal`, `dataUltimaInspecao`, `idEmpresa`) VALUES
(1, 'IC-101', 19, '2018-06-30', 1),
(2, 'IC-102', 19, '2018-06-30', 1),
(3, 'BALÃOS DOS FILTROS', 2, '2018-06-30', 1),
(4, 'IC-103', 19, '2018-06-30', 1),
(5, 'MISTURADOR PRODUTOS', 3, '2018-06-30', 1),
(6, 'IC-104', 19, '2018-06-30', 1),
(7, 'V-92-04-05', 4, '2018-06-30', 1),
(8, 'V-92-04-06', 4, '2018-06-30', 1),
(9, 'BIFLOW V-92-04-04', 3, '2018-06-30', 1),
(10, 'EMBEBIÇÃO', 17, '2018-06-30', 1),
(11, 'FD-315 V-92-04-01', 5, '2018-06-30', 1),
(12, 'FD-315 V-92-04-02', 5, '2018-06-30', 1),
(13, 'FD-315 V-92-04-03', 5, '2018-06-30', 1),
(14, 'ROLO DESAGUADOR', 22, '2018-06-30', 1),
(15, 'TERNO SECADOR 1', 23, '2018-06-30', 1),
(16, 'TERNO SECADOR 2', 23, '2018-06-30', 1),
(17, 'TERNO SECADOR 3', 23, '2018-06-30', 1),
(18, 'TERNO SECADOR 4', 23, '2018-06-30', 1),
(19, 'BIMEDIA V-40', 7, '2018-06-30', 1),
(20, 'LEITE MISTO V-31', 7, '2018-06-30', 1),
(21, 'FILTRO CARTUCHO 1 E 2', 7, '2018-06-30', 1),
(22, 'COLUNA 1 A 6', 7, '2018-06-30', 1),
(23, 'BIMEDIA V-41', 8, '2018-06-30', 1),
(24, 'LEITO MISTO V-30', 8, '2018-06-30', 1),
(25, 'FILTRO CARTUCHO 1 E 2', 8, '2018-06-30', 1),
(26, 'COLUNA 1 A 6', 8, '2018-06-30', 1),
(27, 'BIMEDIA V-42', 9, '2018-06-30', 1),
(28, 'LEITO MISTO V-32', 9, '2018-06-30', 1),
(29, 'FILTRO CARTUCHO 1 E 2', 9, '2018-06-30', 1),
(30, 'COLUNA 1 A 6', 9, '2018-06-30', 1),
(31, 'COLUNA 1 A 6', 10, '2018-06-30', 1),
(32, 'FILTRO CARTUCHO 1 E 2', 10, '2018-06-30', 1),
(33, 'LEITO MISTO V-33', 10, '2018-06-30', 1),
(34, 'BIMEDIA V-43', 10, '2018-06-30', 1),
(35, 'IC-101', 21, '2018-06-30', 1),
(36, 'IC-102', 21, '2018-06-30', 1),
(37, 'DESAERADOR', 11, '2018-06-30', 1),
(38, 'IC-103', 21, '2018-06-30', 1),
(39, 'CALDEIRA AMD', 12, '2018-06-30', 1),
(40, 'IC-104', 21, '2018-06-30', 1),
(41, 'CALDEIRA AMD', 13, '2018-06-30', 1),
(42, 'EMBEBIÇÃO', 18, '2018-06-30', 1),
(43, 'CONDENSADOR', 15, '2018-06-30', 1),
(44, 'FLASH CONTÍNUO', 15, '2018-06-30', 1),
(45, 'FLASH DE FUNDO', 15, '2018-06-30', 1),
(46, 'TURBO-BOMBA', 15, '2018-06-30', 1),
(47, 'CONDENSADOR', 14, '2018-06-30', 1),
(48, 'FLASH CONTÍNUO', 14, '2018-06-30', 1),
(49, 'FLASH DE FUNDO', 14, '2018-06-30', 1),
(50, 'TURBO-BOMBA', 14, '2018-06-30', 1),
(51, 'TERNO DESAGUADOR 1', 25, '2018-06-30', 1),
(52, 'TERNO DESAGUADOR 2', 25, '2018-06-30', 1),
(53, 'TERNO SECADOR 1', 26, '2018-06-30', 1),
(54, 'TERNO SECADOR 2', 26, '2018-06-30', 1),
(55, 'TERNO SECADOR 3', 26, '2018-06-30', 1),
(56, 'TERNO SECADOR 4', 26, '2018-06-30', 1),
(57, 'TQ CONDENSADO EXTERNO', 27, '2018-06-30', 1),
(58, 'COMPRESSOR 1', 30, '2018-06-30', 1),
(59, 'COMPRESSOR 2', 30, '2018-06-30', 1),
(60, 'COMPRESSOR 3', 30, '2018-06-30', 1),
(61, 'ABERKO N/FABR. 06-3241', 31, '2018-06-30', 1),
(62, 'ABERKO N/FABR. 06-3242', 31, '2018-06-30', 1),
(63, 'INGERSOLL N/S RT 14.339', 31, '2018-06-30', 1),
(64, 'COMPRESSOR 4', 33, '2018-06-30', 1),
(65, 'COMPRESSOR 5', 33, '2018-06-30', 1),
(66, 'CHICAGO (CCM) N/S 131221', 34, '2018-06-30', 1),
(67, 'CHICAGO (TORRE) N/S 131216', 36, '2018-06-30', 1),
(68, 'CHICAGO (PROC.) N/S 131217', 36, '2018-06-30', 1),
(69, 'ABERKO (EVAP.) N/FABR. 8617-1', 34, '2018-06-30', 1),
(70, 'ABERKO (FERM.) N/FABR. 8617-2', 34, '2018-06-30', 1),
(71, 'ABERKO (FÁBRICA) N/FAB. 8617-3', 34, '2018-06-30', 1),
(72, 'CHECAR FERMENTAÇÃO', 34, '2018-06-30', 1),
(73, 'COMPRESSOR DE AR SCHULZ', 37, '2018-06-30', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `equipamento_local`
--

CREATE TABLE `equipamento_local` (
  `idEquipamento` int(11) NOT NULL,
  `idLocal` int(11) NOT NULL,
  `idEmpresa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `equipamento_local`
--

INSERT INTO `equipamento_local` (`idEquipamento`, `idLocal`, `idEmpresa`) VALUES
(1, 19, 1),
(2, 19, 1),
(3, 2, 1),
(4, 19, 1),
(5, 3, 1),
(6, 19, 1),
(7, 4, 1),
(8, 4, 1),
(9, 3, 1),
(10, 17, 1),
(11, 5, 1),
(12, 5, 1),
(13, 5, 1),
(14, 22, 1),
(15, 23, 1),
(16, 23, 1),
(17, 23, 1),
(18, 23, 1),
(19, 7, 1),
(20, 7, 1),
(21, 7, 1),
(22, 7, 1),
(23, 8, 1),
(24, 8, 1),
(25, 8, 1),
(27, 9, 1),
(28, 9, 1),
(26, 8, 1),
(29, 9, 1),
(30, 9, 1),
(31, 10, 1),
(32, 10, 1),
(33, 10, 1),
(34, 10, 1),
(35, 21, 1),
(36, 21, 1),
(37, 11, 1),
(38, 21, 1),
(39, 12, 1),
(40, 21, 1),
(41, 13, 1),
(42, 18, 1),
(43, 15, 1),
(44, 15, 1),
(45, 15, 1),
(46, 15, 1),
(47, 14, 1),
(48, 14, 1),
(49, 14, 1),
(50, 14, 1),
(51, 25, 1),
(52, 25, 1),
(53, 26, 1),
(54, 26, 1),
(55, 26, 1),
(56, 26, 1),
(57, 27, 1),
(58, 30, 1),
(59, 30, 1),
(60, 30, 1),
(61, 31, 1),
(62, 31, 1),
(63, 31, 1),
(64, 33, 1),
(65, 33, 1),
(66, 34, 1),
(67, 36, 1),
(68, 36, 1),
(69, 34, 1),
(70, 34, 1),
(71, 34, 1),
(72, 34, 1),
(73, 37, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `inspecao`
--

CREATE TABLE `inspecao` (
  `idInspecao` int(11) NOT NULL,
  `idEquipamento` int(11) NOT NULL,
  `dataInspecao` date DEFAULT NULL,
  `dataEfetuadaInspecao` date NOT NULL,
  `motivoInspecao` text NOT NULL,
  `idUsuario` int(11) NOT NULL,
  `idEmpresa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `local`
--

CREATE TABLE `local` (
  `idLocal` int(11) NOT NULL,
  `referenciaLocal` int(11) DEFAULT NULL,
  `nomeLocal` varchar(30) NOT NULL,
  `idEmpresa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `local`
--

INSERT INTO `local` (`idLocal`, `referenciaLocal`, `nomeLocal`, `idEmpresa`) VALUES
(1, 0, 'UTILIDADES', 1),
(2, 1, 'ETALG', 1),
(3, 1, 'ETA', 1),
(4, 3, 'BIMEDIA', 1),
(5, 3, 'FLOCODECANTADOR', 1),
(6, 1, 'OSMOSE', 1),
(7, 6, 'CONJUNTO 1', 1),
(8, 6, 'CONJUNTO 2', 1),
(9, 6, 'CONJUNTO 3', 1),
(10, 6, 'CONJUNTO 4', 1),
(11, 0, 'GERAÇÃO DE VAPOR', 1),
(12, 11, 'CALDEIRA 1', 1),
(13, 11, 'CALDEIRA 2', 1),
(14, 12, 'VASOS', 1),
(15, 13, 'VASOS', 1),
(16, 0, 'EXTRAÇÃO', 1),
(17, 16, 'FASE 1', 1),
(18, 16, 'FASE 2', 1),
(19, 17, 'AQUECEDORES', 1),
(20, 17, 'GARRAFAS', 1),
(21, 18, 'AQUECEDORES', 1),
(22, 20, 'TERNO DESAGUADOR', 1),
(23, 20, 'TERNO SECADOR', 1),
(24, 18, 'GARRAFAS', 1),
(25, 24, 'TERNO DESAGUADOR', 1),
(26, 24, 'TERNO SECADOR', 1),
(27, 0, 'GERAÇÃO DE ENERGIA', 1),
(28, 0, 'INSTRUMENTAÇÃO', 1),
(29, 28, 'CENTRAL AR CASA DE FORCA', 1),
(30, 29, 'SEPARADOR AR/ÓLEO', 1),
(31, 29, 'SEPARADOR DE CONDENSADOS', 1),
(32, 28, 'CENTRAL AR UPG', 1),
(33, 32, 'SEPARADOR AR/ÓLEO', 1),
(34, 32, 'SEPARADOR DE CONDENSADOS', 1),
(35, 28, 'UPG', 1),
(36, 35, 'SEPARADOR DE CONDENSADOS', 1),
(37, 28, 'FÁBRICA AÇÚCAR', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tipousuario`
--

CREATE TABLE `tipousuario` (
  `idTipoUsuario` int(11) NOT NULL,
  `tipoUsuarioDescricao` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tipousuario`
--

INSERT INTO `tipousuario` (`idTipoUsuario`, `tipoUsuarioDescricao`) VALUES
(1, 'Administrador');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL,
  `nomeUsuario` varchar(30) NOT NULL,
  `loginUsuario` varchar(15) NOT NULL,
  `senhaUsuario` varchar(20) NOT NULL,
  `idTipoUsuario` int(11) NOT NULL,
  `idEmpresa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`idUsuario`, `nomeUsuario`, `loginUsuario`, `senhaUsuario`, `idTipoUsuario`, `idEmpresa`) VALUES
(1, 'Administrador', 'root', 'root', 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`idEmpresa`);

--
-- Indexes for table `equipamentos`
--
ALTER TABLE `equipamentos`
  ADD PRIMARY KEY (`idEquipamentos`),
  ADD KEY `idEmpresa_fk` (`idEmpresa`),
  ADD KEY `referencia_local_fk` (`refenciaLocal`);

--
-- Indexes for table `equipamento_local`
--
ALTER TABLE `equipamento_local`
  ADD KEY `empresa_id_fk` (`idEmpresa`) USING BTREE;

--
-- Indexes for table `inspecao`
--
ALTER TABLE `inspecao`
  ADD PRIMARY KEY (`idInspecao`),
  ADD KEY `empresa_id_fk` (`idEmpresa`);

--
-- Indexes for table `local`
--
ALTER TABLE `local`
  ADD PRIMARY KEY (`idLocal`),
  ADD KEY `empresa_id_fk` (`idEmpresa`);

--
-- Indexes for table `tipousuario`
--
ALTER TABLE `tipousuario`
  ADD PRIMARY KEY (`idTipoUsuario`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUsuario`),
  ADD KEY `empresa_id_fk` (`idUsuario`),
  ADD KEY `tipoUsuario_id_fk` (`idUsuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `empresa`
--
ALTER TABLE `empresa`
  MODIFY `idEmpresa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `equipamentos`
--
ALTER TABLE `equipamentos`
  MODIFY `idEquipamentos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=74;

--
-- AUTO_INCREMENT for table `inspecao`
--
ALTER TABLE `inspecao`
  MODIFY `idInspecao` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `local`
--
ALTER TABLE `local`
  MODIFY `idLocal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT for table `tipousuario`
--
ALTER TABLE `tipousuario`
  MODIFY `idTipoUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `inspecao`
--
ALTER TABLE `inspecao`
  ADD CONSTRAINT `empresa_id_fk` FOREIGN KEY (`idEmpresa`) REFERENCES `empresa` (`idEmpresa`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
