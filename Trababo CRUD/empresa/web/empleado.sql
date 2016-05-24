-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-05-2016 a las 23:46:47
-- Versión del servidor: 10.1.10-MariaDB
-- Versión de PHP: 7.0.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `empresa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(10) COLLATE utf8_bin NOT NULL,
  `apellidos` varchar(30) COLLATE utf8_bin NOT NULL,
  `edad` int(2) NOT NULL,
  `salario` double NOT NULL,
  `comision` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`codigo`, `nombre`, `apellidos`, `edad`, `salario`, `comision`) VALUES
(1, 'Alberto', 'Ortega Padilla', 23, 1200, 300),
(2, 'Laura', 'Cañamero Florido', 23, 1400, 100),
(3, 'Pedro', 'Pica Piedra', 44, 1000, 100),
(4, 'Jose Luis', 'Cañamero Florido', 34, 1200, 300),
(5, 'Ana Maria', 'Padilla Gomez', 29, 1300, 400),
(6, 'Sofia', 'Lopez Gallego', 50, 28, 150),
(7, 'Roberto', 'Jimenez Lorenzo', 31, 900, 500);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`codigo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
