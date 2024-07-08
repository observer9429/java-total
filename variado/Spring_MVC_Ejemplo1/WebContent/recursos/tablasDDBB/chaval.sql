-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-11-2020 a las 04:10:24
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `chaval`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productoszz`
--

CREATE TABLE `productoszz` (
  `id` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `seccion` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `precio` double(5,2) NOT NULL,
  `stock` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `productoszz`
--

INSERT INTO `productoszz` (`id`, `seccion`, `nombre`, `precio`, `stock`) VALUES
('001', 'panes', 'chavata', 0.30, 90),
('002', 'panes', 'frances', 0.20, 160),
('003', 'panes', 'integral', 0.25, 80),
('004', 'panes', 'yema', 0.25, 80),
('005', 'bebidas', 'cafe', 1.50, 40),
('006', 'bebidas', 'capuchino', 4.00, 25),
('007', 'bebidas', 'chicha', 1.20, 20),
('008', 'bebidas', 'pepsi', 2.50, 30),
('009', 'bocaditos', 'alfajor', 2.50, 20),
('010', 'bocaditos', 'caramandunga', 0.25, 50),
('011', 'bocaditos', 'orejas', 2.50, 10),
('012', 'bocaditos', 'paydemanzana', 2.50, 10),
('013', 'tortas', 'chantilly', 9.99, 4),
('014', 'tortas', 'chocolate', 9.99, 3),
('015', 'tortas', 'selvanegra', 60.00, 2),
('016', 'tortas', 'tresleches', 60.00, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `nombres` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `apellidos` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `edad` int(11) NOT NULL,
  `usuario` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `clave` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `email` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `direccion` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `distrito` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `departamento` varchar(25) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`nombres`, `apellidos`, `edad`, `usuario`, `clave`, `email`, `direccion`, `distrito`, `departamento`) VALUES
('walter jose', 'suarez de la cruz', 18, 'chicharito', 'chichadios', 'escorpio9429@hotmail.com', 'avenida rosa toro 376', 'san luis', 'lima');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
