-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 16, 2020 at 11:34 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `smsdatabase`
--

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `id` int(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `registrationNumber` varchar(20) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `course` varchar(50) NOT NULL,
  `phoneNumber` varchar(12) NOT NULL,
  `username` varchar(12) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`id`, `name`, `registrationNumber`, `gender`, `course`, `phoneNumber`, `username`, `password`) VALUES
(2, 'Erick', '1234', 'Male', 'BBIT', '0702332833', 'karanjaeric', 'karanjaeric'),
(3, 'Edwin', '344242', 'Male', 'IT', '099484834', 'edwin', 'edwin'),
(4, 'dffq', 'qrqr', 'rrrr', 'rqrqr', 'rqrrqrq', 'qrqrrw', 'rqwrrqr'),
(5, 'new Name', 'gwggw', 'gwggg', 'gwgg', 'gwgeg', 'wgeweg', 'wgwgw'),
(6, 'The Real Traus', '5464', 'Male', 'Computer Science', '57478488', 'tarus', 'tarus');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
