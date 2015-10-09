-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 23, 2015 at 01:30 PM
-- Server version: 5.6.26
-- PHP Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nba_vit1`
--

-- --------------------------------------------------------

--
-- Table structure for table `assessment_type`
--

CREATE TABLE IF NOT EXISTS `assessment_type` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `type` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE IF NOT EXISTS `course` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `course_code` varchar(255) NOT NULL,
  `course_credit` int(11) NOT NULL,
  `course_name` varchar(255) NOT NULL,
  `coursetype_id` bigint(20) NOT NULL,
  `employee_id` bigint(20) NOT NULL,
  `module` int(11) NOT NULL,
  `semester` int(11) NOT NULL,
  `course_type_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `course_coordinator`
--

CREATE TABLE IF NOT EXISTS `course_coordinator` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `course_offering`
--

CREATE TABLE IF NOT EXISTS `course_offering` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `acadamic_year` varchar(255) NOT NULL,
  `course_id` bigint(20) NOT NULL,
  `module` varchar(255) NOT NULL,
  `semester` varchar(255) NOT NULL,
  `year` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `course_outcome`
--

CREATE TABLE IF NOT EXISTS `course_outcome` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `acadamic_year` varchar(255) NOT NULL,
  `co_code` varchar(255) NOT NULL,
  `co_statement` varchar(255) NOT NULL,
  `course_id` bigint(20) NOT NULL,
  `employee_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `course_type`
--

CREATE TABLE IF NOT EXISTS `course_type` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `type` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course_type`
--

INSERT INTO `course_type` (`id`, `version`, `type`) VALUES
(1, 0, 'Theory'),
(2, 0, 'Lab'),
(3, 0, 'CVV');

-- --------------------------------------------------------

--
-- Table structure for table `co_marks_mapping`
--

CREATE TABLE IF NOT EXISTS `co_marks_mapping` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `actual_marks` int(11) NOT NULL,
  `assessment_marks` int(11) NOT NULL,
  `assessment_type_id` bigint(20) NOT NULL,
  `course_id` bigint(20) NOT NULL,
  `course_offering_id` bigint(20) NOT NULL,
  `employee_id` bigint(20) NOT NULL,
  `percentage` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE IF NOT EXISTS `department` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `institute_id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`id`, `version`, `institute_id`, `name`) VALUES
(1, 0, 1, 'Computer'),
(2, 0, 1, 'Electronics'),
(3, 0, 1, 'Chemical'),
(4, 0, 1, 'Instrumentation'),
(5, 0, 1, 'Mechanical'),
(6, 0, 1, 'Industrial & Production'),
(7, 1, 1, 'Engineering, Sciences & Humanities'),
(8, 0, 1, 'Office'),
(9, 0, 1, 'Library'),
(10, 0, 1, 'Training and Placement'),
(11, 0, 1, 'Workshop');

-- --------------------------------------------------------

--
-- Table structure for table `designation`
--

CREATE TABLE IF NOT EXISTS `designation` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `designation` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `designation`
--

INSERT INTO `designation` (`id`, `version`, `designation`) VALUES
(1, 0, 'Professor'),
(2, 0, 'Associate Professor'),
(3, 0, 'Assistance Professor'),
(4, 0, 'Lecturer'),
(5, 0, 'Reader');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE IF NOT EXISTS `employee` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `designation_id` bigint(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `employee_id` varchar(255) NOT NULL,
  `mob` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `program_id` bigint(20) NOT NULL,
  `department_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=231 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `version`, `designation_id`, `email`, `employee_id`, `mob`, `name`, `program_id`, `department_id`, `role_id`) VALUES
(1, 0, 2, 'niteen.sahasrabudhe@vit.edu', '13', '9422500260 ', 'Professor N.V. SAHASRABUDHE', 11, 0, 0),
(2, 0, 1, 'shriram.sane@vit.edu', '15', '9421077475 ', 'Professor (DR.) S.M. SANE', 8, 0, 0),
(3, 0, 1, 'haribhau.phakatkar@vit.edu', '20', '9850839782 ', 'Professor H.G. PHAKATKAR', 11, 0, 0),
(4, 0, 1, 'sanjay.bahulikar@vit.edu', '22', '9822513847 ', 'Professor (DR.) S.R. BAHULIKAR', 11, 0, 0),
(5, 0, 2, 'shashank.oak@vit.edu', '23', '9405577466', 'Professor S.M. OAK', 11, 0, 0),
(6, 0, 3, 'sunil.chougule@vit.edu', '31', '9422010617', 'Professor S.D. CHOUGULE', 11, 0, 0),
(7, 0, 1, 'mahesh.walame@vit.edu', '37', '9527013311 ', 'Professor (DR.) M.V. WALAME', 11, 0, 0),
(8, 0, 2, 'jayanti.shete@vit.edu', '39', '9371676374', 'DR. (SMT.) J.P. SHETE', 11, 0, 0),
(9, 0, 3, 'manasi.ghamande@vit.edu', '53', '9850039126 ', 'Professor(SMT.) M.V. GHAMANDE', 12, 0, 0),
(10, 0, 2, 'milind.patwardhan@vit.edu', '57', '9403766328 ', 'Professor M.M. PATWARDHAN', 12, 0, 0),
(11, 0, 2, 'madhuri.deshpande@vit.edu', '58', '9922689982', 'Professor(SMT.) M.C. DESHPANDE', 9, 0, 0),
(12, 0, 2, 'sunil.kuber@vit.edu', '126', '9890924719 ', 'Professor S.S. KUBER', 9, 0, 0),
(13, 0, 2, 'prakash.vaidya@vit.edu', '128', '9922041531', 'Professor P.R. VAIDYA', 8, 0, 0),
(14, 0, 1, 'mukund.nalawade@vit.edu', '131', '9822881007 ', 'Professor (DR.) M.K. NALAWADE', 11, 0, 0),
(15, 0, 3, 'vrinda.parkhi@vit.edu', '151', '', 'Professor(SMT.) V.P. PARKHI', 5, 0, 0),
(16, 0, 2, 'milind.tirmare@vit.edu', '197', '9527084503 ', 'Professor M.B. TIRMARE', 5, 0, 0),
(17, 0, 3, 'rambabu.vatti@vit.edu', '209', '9881402529 ', 'Professor R.B. VATTI', 6, 0, 0),
(18, 0, 2, 'kishori.degaonkar@vit.edu', '241', '9545456615 ', 'Professor(SMT.) K.S. DEGAONKAR', 6, 0, 0),
(20, 0, 1, 'siddharth.jabade@vit.edu', '262', '9960902661', 'Professor (DR.) S.K. JABADE', 11, 0, 0),
(21, 0, 1, 'aanchal.moolchandani@vit.edu', '264', '9850942861 ', 'DR. (SMT.) A.M. MOOLCHANDANI', 12, 0, 0),
(22, 0, 3, 'praveen.pol@vit.edu', '265', '', 'Professor P.V. POL', 10, 0, 0),
(23, 0, 3, 'mrunal.shidore@vit.edu', '266', '9823340490 ', 'Professor(SMT.) M.M. SHIDORE', 5, 0, 0),
(24, 0, 3, 'girish.kotwal@vit.edu', '273', '9881145612 ', 'Professor G.N. KOTWAL', 11, 0, 0),
(25, 0, 3, 'vaishali.jabade@vit.edu', '302', '9423016776 ', 'Professor(SMT.) V.S. JABADE', 6, 0, 0),
(26, 0, 2, 'harshavardhan.khare@vit.edu', '307', '9420176215 ', 'Professor H.M. KHARE', 12, 0, 0),
(27, 0, 3, 'mahesh.dube@vit.edu', '308', '9822276834 ', 'Professor M.R. DUBE', 3, 0, 0),
(28, 0, 2, 'kedar.sant@vit.edu', '312', '9422080920 ', 'Professor (DR.) K.D. SANT', 11, 0, 0),
(29, 0, 3, 'ashish.mujumdar@vit.edu', '338', '9970377074 ', 'Professor A.R. MUJUMDAR', 11, 0, 0),
(30, 0, 3, 'manisha.mhetre@vit.edu', '341', '9372605577 ', 'Professor(SMT.) M.R. MHETRE', 10, 0, 0),
(31, 0, 1, 'bipin.sule@vit.edu', '343', '9850833153 ', 'Professor (DR.) B.S. SULE', 2, 0, 0),
(32, 0, 3, 'anita.joshi@vit.edu', '349', '9423233587 ', 'Professor(SMT.) A.S. JOSHI', 12, 0, 0),
(33, 0, 2, 'abhay.chopde@vit.edu', '355', '9225523555 ', 'Professor A.M. CHOPADE', 5, 0, 0),
(34, 0, 3, 'rajkumar.bhagat@vit.edu', '357', '9422303150 ', 'Professor R.K. BHAGAT', 11, 0, 0),
(35, 0, 2, 'mukund.kulkarni@vit.edu', '399', '8275594995', 'Professor M.M. KULKARNI', 12, 0, 0),
(36, 0, 4, 'vivek.nagnath@vit.edu', '407', '9420860424, 8806949777', 'SHRI V.S. NAGNATH', 12, 0, 0),
(37, 0, 1, 'jayant.kulkarni@vit.edu', '425', '9850029160 ', 'Professor (DR.) J.V. KULKARNI', 10, 0, 0),
(38, 0, 3, 'vidya_godbole@yahoo.com ', '434', '9881881601 ', 'Professor(SMT.) V.A. GODBOLE', 4, 0, 0),
(39, 0, 2, 'shrinivas.chippa@vit.edu', '438', '9822667480 ', 'Professor (DR.) S.P. CHIPPA', 11, 0, 0),
(40, 0, 2, 'dattatray.hulwan@vit.edu', '439', '9371026139 ', 'Professor (DR.) D.B. HULWAN', 11, 0, 0),
(41, 0, 3, 'shilpa.lambor@vit.edu', '440', '9373006659 ', 'Professor(SMT.) S.M. LAMBOR', 6, 0, 0),
(42, 0, 5, 'ashutosh.kulkarni@vit.edu', '448', '9850664479 ', 'Professor A.M. KULKARNI', 4, 0, 0),
(43, 0, 2, 'karthick.sb@vit.edu', '450', '9860357920 ', 'Professor S.B. KARTHICK', 2, 0, 0),
(44, 0, 2, 'shailendra.bandewar@vit.edu', '451', '9822667217 ', 'Professor (DR.) S.R. BANDEWAR', 12, 0, 0),
(45, 0, 1, 'satish.inamdar@vit.edu', '457', '9423508416', 'Professor (DR.) S.R. INAMDAR', 7, 0, 0),
(46, 0, 3, 'nitin.borse@vit.edu', '461', '9890075122 ', 'Professor N.V. BORSE', 11, 0, 0),
(47, 0, 2, 'rajesh.dhake@vit.edu', '463', '9422341860 ', 'Professor R.J. DHAKE', 8, 0, 0),
(48, 0, 1, 'manikrao.dhore@vit.edu', '466', '9850642235 ', 'Professor (DR.) M.L. DHORE', 2, 0, 0),
(49, 0, 3, 'rajesh.raikwar@vit.edu', '467', '9021673749 ', 'Professor R.G. RAIKWAR', 12, 0, 0),
(50, 0, 3, 'rajesh.chaudhari@vit.edu', '470', '9960731502 ', 'Professor R.J. CHAUDHARI', 9, 0, 0),
(51, 0, 3, 'sunil.tayde@vit.edu', '478', '9403185042 ', 'Professor S.M. TAYDE', 5, 0, 0),
(52, 0, 3, 'rupali.deshpande@vit.edu', '479', '9822209233 ', 'Professor(SMT.) R.S. DESHPANDE', 12, 0, 0),
(53, 0, 2, 'bharat.taralekar@vit.edu', '488', '9423033120 ', 'Professor B.G. TARLEKAR', 5, 0, 0),
(54, 0, 3, 'laxmikant.mangate@vit.edu', '492', '9850617994 ', 'Professor L.D. MANGATE', 11, 0, 0),
(55, 0, 2, 'sangeeta.kurundkar@vit.edu', '503', '9822445831 ', 'Professor(SMT.) S.V. KURUNDKAR', 6, 0, 0),
(56, 0, 3, 'shilpa.sondkar@vit.edu', '507', '9860194055 ', 'DR. (SMT.) S.Y. SONDKAR', 10, 0, 0),
(57, 0, 2, 'ganesh.dongre@vit.edu', '524', '9890948843 ', 'Professor (DR.) G.G. DONGRE', 8, 0, 0),
(58, 0, 3, 'ganesh.korwar@vit.edu', '529', '9850175010 ', 'Professor G.D. KORWAR', 11, 0, 0),
(59, 0, 2, 'prashant.shevgaonkar@vit.edu', '543', '9422364834 ', 'Professor P.M. SHEVGAONKAR', 7, 0, 0),
(60, 0, 3, 'sanjesh.pawale@vit.edu', '550', '9822019429 ', 'Professor S.S. PAWALE', 2, 0, 0),
(61, 0, 3, 'premanand.ghadekar@vit.edu', '552', '9822261230 ', 'Professor P.P. GHADEKAR', 3, 0, 0),
(62, 0, 3, 'swati.shilaskar@vit.edu', '562', '9881251935 ', 'Professor(SMT.) S.N. SHILASKAR', 5, 0, 0),
(63, 0, 1, 'mangesh.chaudhari@vit.edu', '563', '9890881214 ', 'Professor (DR.) M.B. CHAUDHARI', 11, 0, 0),
(64, 0, 3, 'preeti.bailke@vit.edu', '571', '9970174958 ', 'Professor(SMT.) P.A. BAILKE', 3, 0, 0),
(65, 0, 3, 'pramod.kale@vit.edu', '572', '9623551946 ', 'Professor P.K. KALE', 8, 0, 0),
(66, 0, 2, 'ashwini.barbadekar@vit.edu', '576', '9422064107 ', 'DR. (SMT.) A.B. BARBADEKAR', 5, 0, 0),
(67, 0, 3, 'milind.kamble@vit.edu', '577', '9326850144', 'Professor M.V. KAMBLE', 6, 0, 0),
(68, 0, 3, 'varsha.karandikar@vit.edu', '578', '9822342796 ', 'DR. (SMT.) V.N. KARANDIKAR', 8, 0, 0),
(69, 0, 3, 'noshir.tarapore@vit.edu', '582', '', 'Professor N.Z. TARAPORE', 2, 0, 0),
(70, 0, 2, 'prakash.kulkarni@vit.edu', '586', '9822773959 ', 'Professor P.B. KULKARNI', 12, 0, 0),
(71, 0, 1, 'pavitra@vit.edu', '600', '9822550376 ', 'Professor (DR.) S. PAVITHRAN', 11, 0, 0),
(72, 0, 3, 'nishant.kulkarni@vit.edu', '602', '9890679176 ', 'Professor N.S. KULKARNI', 11, 0, 0),
(73, 0, 3, 'vijay.gaikwad@vit.edu', '609', '9764053842', 'Professor V.D. GAIKWAD', 5, 0, 0),
(74, 0, 3, 'jitendra.gaikwad@vit.edu', '613', '9423582261 ', 'Professor J.A. GAIKWAD', 10, 0, 0),
(75, 0, 3, 'vijay.itnal@vit.edu', '616', '9822550134 ', 'Professor V.K. ITNAL', 8, 0, 0),
(76, 0, 3, 'virendra.pawar@vit.edu', '625', '9423003268 ', 'Professor V.D. PAWAR', 3, 0, 0),
(77, 0, 3, 'vijay.mane@vit.edu', '631', '9850186151 ', 'Professor V.M. MANE', 6, 0, 0),
(78, 0, 3, 'baliram.ade@vit.edu', '632', '9890471373 ', 'Professor B.T. ADE', 12, 0, 0),
(79, 0, 3, 'shripad.bhatlawande@vit.edu', '633', '9422673643 ', 'Professor (DR.) S.S. BHATLAWANDE', 6, 0, 0),
(80, 0, 2, 'dilip.maghade@vit.edu', '634', '9922437715 ', 'Professor (DR.) D.K. MAGHADE', 10, 0, 0),
(81, 0, 3, 'sangita.lade@vit.edu', '638', '9820917203 ', 'Professor(SMT.) S.G. LADE', 2, 0, 0),
(82, 0, 3, 'ashwini.shingare@vit.edu', '639', '9850687138 ', 'Professor(SMT.) A.S. SHINGARE', 3, 0, 0),
(83, 0, 3, 'prasad.gokhale@vit.edu', '640', '9421012229', 'Professor (DR.) P.K. GOKHALE', 2, 0, 0),
(84, 0, 3, 'siddharth.bhorge@vit.edu', '641', '9890602638 ', 'Professor S.B. BHORGE', 5, 0, 0),
(85, 0, 3, 'milind.kulkarni@vit.edu', '643', '9890950187 ', 'Professor M.V. KULKARNI', 3, 0, 0),
(86, 0, 3, 'sunil.shinde@vit.edu', '644', '9422427506 ', 'Professor S.S. SHINDE', 11, 0, 0),
(87, 0, 2, 'chandrashekhar.mahajan@vit.edu', '645', '9890608333 ', 'Professor (DR.) C.M. MAHAJAN', 12, 0, 0),
(88, 0, 3, 'nitin.satpute@vit.edu', '654', '9420081185 ', 'Professor N.V. SATPUTE', 11, 0, 0),
(89, 0, 1, 'shamrao.malgonde@vit.edu', '655', '9850079768 ', 'Professor (DR.) S.P. MALGONDE', 12, 0, 0),
(90, 0, 3, 'moreshwar.khodke@vit.edu', '659', '9822046183 ', 'Professor M.R. KHODKE', 11, 0, 0),
(91, 0, 3, 'saraswati.jadhav@vit.edu', '662', '9423890403 ', 'Professor(SMT.) S.V. PATIL', 3, 0, 0),
(92, 0, 3, 'ganesh.bhutkar@vit.edu', '665', '9860147607 ', 'Professor G.D. BHUTKAR', 2, 0, 0),
(93, 0, 3, 'milind.rane@vit.edu', '684', '9890258986 ', 'Professor M.E. RANE', 6, 0, 0),
(94, 0, 3, 'sheetal.kondhalkar@vit.edu', '691', '9822544466 ', 'Professor(SMT.) S.D. SOBALE', 12, 0, 0),
(95, 0, 3, 'priyadarshan.dhabe@vit.edu', '693', '9422340733 ', 'Professor P.S. DHABE', 3, 0, 0),
(96, 0, 3, 'medha.wyawahare@vit.edu', '696', '9422611577 ', 'Professor(SMT.) M.V. WYAWAHARE', 6, 0, 0),
(97, 0, 3, 'chetan.kapadnis@vit.edu', '708', '9421051833', 'Professor C.V. KAPADNIS', 7, 0, 0),
(98, 0, 2, 'santosh.mukkawar@vit.edu', '718', '9021155735 ', 'Professor (DR.) S.V. MUKKAWAR', 12, 0, 0),
(99, 0, 3, 'sandeep.shinde@vit.edu', '747', '9881718250 ', 'Professor S.R. SHINDE', 3, 0, 0),
(100, 0, 3, 'aparna.mete@vit.edu', '748', '9881064443 ', 'Professor(SMT.) A.R. SAWANT', 2, 0, 0),
(101, 0, 3, 'sachin.komble@vit.edu', '754', '9822093643 ', 'Professor S.P. KOMBLE', 11, 0, 0),
(102, 0, 2, 'chandrani.mitra@vit.edu', '755', '9850815320 ', 'DR. (SMT.) C.N. MITRA', 12, 0, 0),
(103, 0, 3, 'pooja.kulkarni@vit.edu', '784', '9823236950 ', 'Professor(SMT.) P.A. KULKARNI', 5, 0, 0),
(104, 0, 3, 'shaiwali.ballal@vit.edu', '785', '9823114554 ', 'Professor(SMT.) S.P. BALLAL', 6, 0, 0),
(105, 0, 3, 'deepak.pawar@vit.edu', '791', '9822811324 ', 'Professor D.P. PAWAR', 4, 0, 0),
(106, 0, 3, 'shachi.nigam@vit.edu', '809', '9975425455 ', 'DR. (SMT.) S.M. NIGAM', 7, 0, 0),
(107, 0, 3, 'shrikant.kulkarni@vit.edu', '810', '9975849724 ', 'Professor (DR.) S. KULKARNI', 7, 0, 0),
(108, 0, 3, 'kapil.mundada@vit.edu', '814', '9890558423 ', 'Professor K.G. MUNDADA', 10, 0, 0),
(109, 0, 3, 'deepali.deshpande@vit.edu', '823', '9860321752 ', 'Professor(SMT.) D.R. DESHPANDE', 3, 0, 0),
(110, 0, 3, 'shital.jagtap@vit.edu', '834', '9423214002 ', 'Professor(SMT.) S.V. JAGTAP', 3, 0, 0),
(111, 0, 3, 'pramod.kanjalkar@vit.edu', '841', '9225640608 ', 'Professor P.M. KANJALKAR', 10, 0, 0),
(112, 0, 5, 'neelam.chandolikar@vit.edu', '845', '9850539102 ', 'DR. (SMT.) N.S. CHANDOLIKAR', 4, 0, 0),
(113, 0, 3, 'vijaykumar.bhanuse@vit.edu', '846', '9226671123 ', 'Professor V.R. BHANUSE', 10, 0, 0),
(114, 0, 3, 'shital.raut@vit.edu', '848', '9422694969 ', 'Professor(SMT.) S.N. RAUT', 5, 0, 0),
(115, 0, 3, 'kiran.ingale@vit.edu', '849', '7588687306 ', 'Professor K.B. INGALE', 6, 0, 0),
(116, 0, 2, 'manik.deosarkar@vit.edu', '853', '9975122887 ', 'Professor (DR.) M.P. DEOSARKAR', 7, 0, 0),
(117, 0, 3, 'ajay.talele@vit.edu', '855', '9763083225 ', 'Professor A.K. TALELE', 5, 0, 0),
(118, 0, 1, 'dhananjay.bhatkhande@vit.edu', '859', '9423879605 ', 'Professor (DR.) D.S. BHATKHANDE', 7, 0, 0),
(119, 0, 3, 'alankar.dasare@vit.edu', '906', '9890623820 ', 'Professor A.J. DASARE', 2, 0, 0),
(120, 0, 3, 'archana.chaudhari@vit.edu', '907', '9970187049 ', 'Professor(SMT.) A.K. CHAUDHARI', 10, 0, 0),
(121, 0, 3, 'ramkrishna.bharsakade@vit.edu', '908', '9421200690 ', 'Professor R.S. BHARSAKADE', 9, 0, 0),
(122, 0, 3, 'deepali.deshpande@vit.edu', '910', '9850245168 ', 'Professor(SMT.) D.J. JOSHI', 2, 0, 0),
(123, 0, 3, 'suvarna.mane@vit.edu', '911', '9096430212 ', 'Professor(SMT.) S.V. PATIL', 9, 0, 0),
(124, 0, 3, 'suhas.bhise@vit.edu', '915', '9922063407 ', 'Professor S.B. BHISE', 6, 0, 0),
(125, 0, 3, 'rupali.tornekar@gmail.com ', '916', '9422456779 ', 'Professor(SMT.) R.V. TORNEKAR', 5, 0, 0),
(126, 0, 3, 'anil.kadu@vit.edu', '917', '9975761559 ', 'Professor A.B. KADU', 10, 0, 0),
(127, 0, 4, 'umesh.kodgule@vit.edu', '921', '9922991994 ', 'SHRI U.B. KODGULE', 2, 0, 0),
(128, 0, 3, 'pravin.rathod@vit.edu', '922', '9890156968 ', 'Professor P.H. RATHOD', 2, 0, 0),
(129, 0, 3, 'shubhada.deshmukh@vit.edu', '923', '9763850087 ', 'Professor(SMT.) S.P. DESHMUKH', 2, 0, 0),
(130, 0, 3, 'dgkanade72@gmail.com ', '946', '9604390046 ', 'Professor D.G. KANADE', 5, 0, 0),
(131, 0, 4, 'bajirao.kondbhar@vit.edu ', '953', '9421607682 ', 'SHRI B.B. KONDBHAR', 3, 0, 0),
(132, 0, 3, 'sanikapatankar@gmail.com ', '970', '9881678985 ', 'Professor(SMT.) S.S. PATANKAR', 10, 0, 0),
(134, 0, 3, 'gangwal.ashish@gmail.com', '996', '9850332498 ', 'Professor A.R. GANGWAL', 7, 0, 0),
(135, 0, 3, 'borateha19@gmail.com', '997', '7620980342', 'Professor(SMT.) H.U. KARNE', 7, 0, 0),
(136, 0, 3, 'pgs2006@rediffmail.com', '998', '9890310974 ', 'Professor P.M. GAIGOLE', 8, 0, 0),
(137, 0, 4, 'surekhadix@gmail.com', '999', '8805442500 ', 'SMT. S.A. DIXIT', 12, 0, 0),
(138, 0, 3, 'ratna.nitin.patil@gmail.com ', '1014', '9604181937 ', 'Professor(SMT.) R.N. PATIL', 2, 0, 0),
(139, 0, 3, 'deshgayatri@rediff.com', '1028', '9763396106 ', 'Professor(SMT.) G.D. GAWANDE', 7, 0, 0),
(140, 0, 2, 'rahul.waikar@gmail.com', '1038', '9604075216 ', 'Professor (DR.) R.A. WAIKAR', 9, 0, 0),
(141, 0, 1, 'patil.st@vit.edu', '1044', '9028036261 ', 'Professor (DR.) S.T. PATIL', 2, 0, 0),
(142, 0, 3, 'madhubala.gandhi@vit.edu', '1049', '9422927654 ', 'Professor(SMT.) M.P. GANDHI', 2, 0, 0),
(143, 0, 3, 'arjun.ramachandra@vit.edu', '1050', '9665219635 ', 'Professor ARJUN K. RAMCHANDRA', 12, 0, 0),
(144, 0, 3, 'prakashkholiya@gmail.com', '1051', '9881720314 ', 'Professor P.J. SINGH', 4, 0, 0),
(145, 0, 3, 'jayesh.bhangdiya@vit.edu', '1052', '9637129300 ', 'Professor J.B. BHANGDIYA', 2, 0, 0),
(146, 0, 3, 'abhadixit100@gmail.com', '1053', '9975615068 ', 'Professor(SMT.) A.A. DIXIT', 6, 0, 0),
(147, 0, 2, 'makarand.upkare@gmail.com', '1055', '9860096952 ', 'Professor (DR.) M.M. UPKARE', 7, 0, 0),
(148, 0, 3, 'nilesh.patel@vit.edu', '1056', '9689359121 ', 'Professor N.P. PATEL', 2, 0, 0),
(149, 0, 3, 'saurabh.khatri@vit.edu', '1058', '9527240288 ', 'Professor S.M. KHATRI', 2, 0, 0),
(150, 0, 4, 'sachinsawant.rgpv@gmail.com', '1059', '8806663910 ', 'SHRI S.S. SAWANT', 12, 0, 0),
(151, 0, 4, 'shardamhase24@gmail.com', '1068', '9850599391 ', 'SMT. S.S. MHASE', 12, 0, 0),
(152, 0, 3, 'amol.bhilare@vit.edu', '1069', '9689880794 ', 'Professor A.A. BHILARE', 2, 0, 0),
(153, 0, 3, 'shreetanu2006@yahoo.com', '1078', '8805745816 ', 'DR. (SMT.) T.S. BHATTACHARJEE', 7, 0, 0),
(154, 0, 3, 'tejas_patil2000@yahoo.com', '1081', '9175547468 ', 'Professor T.G. PATIL', 10, 0, 0),
(155, 0, 3, 'santosh.joshi@vit.edu', '1082', '9689880817 ', 'Professor S.P. JOSHI', 11, 0, 0),
(156, 0, 3, 'vishal.kaushal@vit.edu', '1083', '8698170964 ', 'Professor V.K. KAUSHAL', 2, 0, 0),
(157, 0, 4, 'ranjanajadhav26@gmail.com', '1091', '8960502632 ', 'SMT. R.S. JADHAV', 2, 0, 0),
(158, 0, 1, 'j.chitode@gmail.com', '1093', '9604559639 ', 'Professor (DR.) J.S. CHITODE', 6, 0, 0),
(159, 0, 3, 'nachiketdkulkarni@gmail.com', '1096', '9421694830 ', 'Professor N.D. KULKARNI', 3, 0, 0),
(160, 0, 3, 'arpitmishra.1506@gmail.com', '1098', '8928403726 ', 'Professor A.A. MISHRA', 6, 0, 0),
(161, 0, 4, 'sagar.gen@gmail.com', '1101', '8237740753 ', 'SHRI S.A. KULKARNI', 12, 0, 0),
(162, 0, 3, 'morekiran06@gmail.com', '1102', '9503911294 ', 'Professor K.P. MORE', 5, 0, 0),
(163, 0, 3, 'sangeeta.kumari@vit.edu', '1106', '9096697685 ', 'Professor(SMT.) S.P. PRASAD', 2, 0, 0),
(164, 0, 3, 'vaddi.nitw@gmail.com', '1113', '9764250740 ', 'Professor A.G. VADDI', 7, 0, 0),
(165, 0, 3, 'sandipkulkarni27@gmail.com', '1114', '9326852305 ', 'Professor S.S. KULKARNI', 12, 0, 0),
(166, 0, 3, 'sagarjanokar@rediffmail.com', '1115', '9823217913 ', 'Professor S.G. JANOKAR', 6, 0, 0),
(167, 0, 3, 'aviraj.vitpune@gmail.com', '1119', '9096809390 ', 'Professor A.U. RAJURKAR', 9, 0, 0),
(168, 0, 3, 'krishnamurthylatha2012@gmail.com', '1125', '9011075450 ', 'Professor(SMT.) L. KRISHNAMURTHY', 12, 0, 0),
(169, 0, 3, 'tanakhopkar@yahoo.com', '1126', '8408035471 ', 'Professor(SMT.) T.C. KHOPKAR', 12, 0, 0),
(170, 0, 3, 'rahulbal123@gmail.com', '1127', '9850770180 ', 'Professor R.A. BAL', 6, 0, 0),
(171, 0, 4, 'neeraj.pophale@gmail.com', '1129', '9028671806 ', 'SHRI N.S. POPHALE', 12, 0, 0),
(172, 0, 3, 'pushkar.joglekar@vit.edu', '1137', '9762340668 ', 'Professor (DR.) P.S. JOGLEKAR', 3, 0, 0),
(173, 0, 3, 'pranavdhaneshwar@gmail.com', '1143', '9423311707 ', 'Professor P.S. DHANESHWAR', 11, 0, 0),
(174, 0, 3, 'dhiraj.jadhav1188@gmail.com', '1147', '8308915400 ', 'Professor D.S. JADHAV', 2, 0, 0),
(179, 0, 3, 'nvalakunde@gmail.com', '1149', '9970140025 ', 'Professor N.D. VALAKUNDE', 2, 0, 0),
(180, 0, 3, 'jyoti.r.madake@gmail.com', '1150', '9833693095 ', 'Professor(SMT.) J.R. MADAKE', 6, 0, 0),
(181, 0, 3, 'deepali_1010@hotmail.com', '1151', '9049830521 ', 'Professor(SMT.) D.S. DHANDE', 10, 0, 0),
(182, 0, 3, 'abhimali9696@gmail.com', '1152', '8446369160 ', 'Professor A.R. MALI', 11, 0, 0),
(183, 0, 3, 'monish2244@gmail.com', '1153', '9527800217 ', 'Professor M.M. SHAH', 12, 0, 0),
(184, 0, 3, 'kalpeshjoshi1@gmail.com', '1155', '9422797100 ', 'Professor K.V. JOSHI', 6, 0, 0),
(185, 0, 3, 'amruta0101@rediffmail.com', '1156', '9960545247 ', 'Professor(SMT.) A.J. TATHE', 6, 0, 0),
(186, 1, 3, 'prashant.6388@gmail.com', '1158', '7774050839', 'Professor P.S. CHAVAN', 2, 0, 0),
(187, 0, 3, 'prabhat91.2011@gmail.com', '1159', '9049056992 ', 'Professor P.M. UPADHYAY', 12, 0, 0),
(188, 0, 3, 'nileshparmar0355@gmail.com', '1160', '9021210158 ', 'Professor N.A. PARMAR', 6, 0, 0),
(189, 0, 3, 'kaustubhkulkarni92@gmail.com', '1161', '7276849023 ', 'Professor K.D. KULKARNI', 12, 0, 0),
(190, 0, 3, 'aniruddhadesh@rediffmail.com', '1162', '9689754298 ', 'Professor (DR.) A.S. DESHPANDE', 7, 0, 0),
(191, 0, 3, 'gajanan.gambhire@gmail.com', '1172', '7276258663 ', 'Professor G.M. GAMBHIRE', 8, 0, 0),
(192, 0, 3, 'ketan.bahulkar@gmail.com', '1174', '9764009173 ', 'Professor K.S. BAHULKAR', 2, 0, 0),
(193, 0, 3, 'sinharakesh92@gmail.com', '1175', '9028889753 ', 'Professor R.A. SINHA', 7, 0, 0),
(194, 0, 3, 'meghanashiralkar@gmail.com', '1176', '8055616556 ', 'Professor(SMT.) M.N. SHIRALKAR', 12, 0, 0),
(195, 0, 3, 'aneetanatan@gmail.com', '1177', '9850288075 ', 'Professor(SMT.) A. WESLEY', 12, 0, 0),
(196, 0, 1, 'joegpr@gmail.com', '1182', '9420975388 ', 'Professor (DR.) P.D. JOEG', 2, 0, 0),
(197, 0, 3, 'pinkytalwar89@gmail.com', '1185', '9777114709 ', 'Professor(SMT.) G.B. TALWAR', 12, 0, 0),
(198, 0, 3, 'anupritamande@yahoo.co.in', '1188', '9623853654 ', 'Professor(SMT.) A.U. MANDE', 6, 0, 0),
(199, 0, 3, 'bhaktikadam30@gmail.com', '1189', '7588383380 ', 'Professor(SMT.) B.D. KADAM', 6, 0, 0),
(200, 0, 3, 'sujitdeokar30@gmail.com', '1190', '9637088544 ', 'Professor S.M. DEOKAR', 10, 0, 0),
(201, 0, 3, 'ashish_pawar25@yahoo.com', '1193', '9922544074 ', 'Professor A.H. PAWAR', 11, 0, 0),
(202, 0, 3, 'pallavisandav@gmail.com', '1194', '9850973638 ', 'Professor(SMT.) P.C. SANDAV', 12, 0, 0),
(203, 0, 3, 'priyanakade1@gmail.com', '1196', '9420282817 ', 'Professor(SMT.) P.G. NAKADE', 7, 0, 0),
(204, 0, 3, 'saeepeshave@gmail.com', '1199', '7720082343 ', 'Professor(SMT.) S.S. PESHAVE', 12, 0, 0),
(205, 0, 3, 'kalesagar14290@gmail.com', '1201', '9552539694 ', 'Professor S.A. KALE', 12, 0, 0),
(206, 0, 3, 'ingle.nikhil@gmail.com', '1202', '7276720549', 'Professor N.S. INGLE', 11, 0, 0),
(207, 0, 3, 'sncheri@gmail.com', '1206', '9881300235', 'Professor(SMT.) S. VIVIAN', 5, 0, 0),
(208, 0, 3, 'raju_patel_in@yahoo.com', '1207', '7588684123', 'Professor R.R. PATEL', 10, 0, 0),
(209, 0, 3, 'debabrata.swain7@yahoo.com', '1209', '9922754865', 'Professor D.J. SWAIN', 2, 0, 0),
(210, 0, 3, 'sourabhdeshpande08@gmail.com', '1210', '9730765355', 'Professor S.S. DESHPANDE', 12, 0, 0),
(211, 0, 4, 'nad.rnsm@gmail.com', '1211', '8983211219', 'SHRI J.G. PARDESHI', 12, 0, 0),
(212, 0, 3, 'madhvi.sadhwani@gmail.com', '1212', '9766453874', 'SMT. M.N.RAMRAKHIYANI', 4, 0, 0),
(213, 0, 3, 'nilamupasani@gmail.com', '1213', '9422987298', 'SMT. N.V.UPASANI', 2, 0, 0),
(214, 0, 3, 'akshata.khade24@gmail.com', '1214', '7028011622', 'SMT A.S.HANGE', 2, 0, 0),
(215, 0, 3, 'reshma.pise@vit.edu', '1215', '9226838382', 'SMT. R.N.PISE', 2, 0, 0),
(216, 0, 3, 'gaikwadhanmant5955@gmail.com', '1216', '9714783595', 'ProfessorH.K.GAIKWAD', 11, 0, 0),
(217, 0, 3, 'thakarenitino@gmail.com', '1217', '9823300935', 'ProfessorN.S.THAKARE', 11, 0, 0),
(218, 0, 3, 'spadalkar007@gmail.com', '1218', '9224244626', 'ProfessorS.R.PADALKAR', 11, 0, 0),
(219, 0, 3, 'kutpat@yahoo.com', '1219', '9970092579', 'ProfessorK.M.UTPAT', 11, 0, 0),
(222, 0, 3, 'ketkikaskhedikar@yahoo.com', '1220', '', 'ProfessorK.A.SHIRBAVIKAR', 11, 0, 0),
(223, 0, 3, 'anand.abhiman@gmail.com', '1221', '', 'ProfessorA.N.UMRANI', 8, 0, 0),
(224, 0, 3, 'jagdalesh@gmail.com', '1223', '', 'Professor (SMT.) S.H.JAGDALE', 11, 0, 0),
(225, 0, 2, 'sbsahay1@yahoo', '1225', '', 'ProfessorS.B.SAHAY', 6, 0, 0),
(226, 0, 3, 'drsrsatpute@gmail.com', '1226', '', 'Professor(DR.) S.R.SATPUTE', 7, 0, 0),
(227, 0, 3, 'nilimadi@techmahindra.com', '1227', '', 'Professor(SMT.) DUDHANE N.A.', 2, 0, 0),
(228, 0, 4, 'gajananghuge01@gmail.com', '1228', '', 'SHRI.G.V.GHUGE', 12, 0, 0),
(229, 0, 1, 'prashant.chavan@vit.edu', '1158', '9833693095', 'Prashant', 2, 0, 0),
(230, 0, 3, 'chauhanrvikas@gmail.com', '1148', '9762340668', 'vikas', 2, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `employee_role`
--

CREATE TABLE IF NOT EXISTS `employee_role` (
  `employee_roles_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee_role`
--

INSERT INTO `employee_role` (`employee_roles_id`, `role_id`) VALUES
(1, 5),
(2, 5),
(3, 5),
(4, 5),
(5, 5),
(6, 5),
(7, 5),
(8, 5),
(9, 5),
(10, 5),
(11, 5),
(12, 5),
(13, 5),
(14, 5),
(15, 5),
(16, 5),
(17, 5),
(18, 5),
(20, 5),
(21, 5),
(22, 5),
(23, 5),
(24, 5),
(25, 5),
(26, 5),
(27, 5),
(28, 5),
(29, 5),
(30, 5),
(31, 5),
(32, 5),
(33, 5),
(34, 5),
(35, 5),
(36, 5),
(37, 5),
(38, 5),
(39, 5),
(40, 5),
(41, 5),
(42, 5),
(43, 5),
(44, 5),
(45, 5),
(46, 5),
(47, 5),
(48, 5),
(49, 5),
(50, 5),
(51, 5),
(52, 5),
(53, 5),
(54, 5),
(55, 5),
(56, 5),
(57, 5),
(58, 5),
(59, 5),
(60, 5),
(61, 5),
(62, 5),
(63, 5),
(64, 5),
(65, 5),
(66, 5),
(67, 5),
(68, 5),
(69, 5),
(70, 5),
(71, 5),
(72, 5),
(73, 5),
(74, 5),
(75, 5),
(76, 5),
(77, 5),
(78, 5),
(79, 5),
(80, 5),
(81, 5),
(82, 5),
(83, 5),
(84, 5),
(85, 5),
(86, 5),
(87, 5),
(88, 5),
(89, 5),
(90, 5),
(91, 5),
(92, 5),
(93, 5),
(94, 5),
(95, 5),
(96, 5),
(97, 5),
(98, 5),
(99, 5),
(100, 5),
(101, 5),
(102, 5),
(103, 5),
(104, 5),
(105, 5),
(106, 5),
(107, 5),
(108, 5),
(109, 5),
(110, 5),
(111, 5),
(112, 5),
(113, 5),
(114, 5),
(115, 5),
(116, 5),
(117, 5),
(118, 5),
(119, 5),
(120, 5),
(121, 5),
(122, 5),
(123, 5),
(124, 5),
(125, 5),
(126, 5),
(127, 5),
(128, 5),
(129, 5),
(130, 5),
(131, 5),
(132, 5),
(134, 5),
(135, 5),
(136, 5),
(137, 5),
(138, 5),
(139, 5),
(140, 5),
(141, 5),
(142, 5),
(143, 5),
(144, 5),
(145, 5),
(146, 5),
(147, 5),
(148, 5),
(149, 5),
(150, 5),
(151, 5),
(152, 5),
(153, 5),
(154, 5),
(155, 5),
(156, 5),
(157, 5),
(158, 5),
(159, 5),
(160, 5),
(161, 5),
(162, 5),
(163, 5),
(164, 5),
(165, 5),
(166, 5),
(167, 5),
(168, 5),
(169, 5),
(170, 5),
(171, 5),
(172, 5),
(173, 5),
(174, 5),
(178, 5),
(179, 5),
(180, 5),
(181, 5),
(182, 5),
(183, 5),
(184, 5),
(185, 5),
(186, 5),
(187, 5),
(188, 5),
(189, 5),
(190, 5),
(191, 5),
(192, 5),
(193, 5),
(194, 5),
(195, 5),
(196, 5),
(197, 5),
(198, 5),
(199, 5),
(200, 5),
(201, 5),
(202, 5),
(203, 5),
(204, 5),
(205, 5),
(206, 5),
(207, 5),
(208, 5),
(209, 5),
(210, 5),
(211, 5),
(212, 5),
(213, 5),
(214, 5),
(215, 5),
(216, 5),
(217, 5),
(218, 5),
(219, 5),
(222, 5),
(223, 5),
(224, 5),
(225, 5),
(226, 5),
(227, 5),
(228, 5),
(229, 3),
(229, 2),
(229, 4),
(230, 1),
(230, 2),
(186, 3),
(186, 4),
(186, 1),
(186, 2),
(186, 5);

-- --------------------------------------------------------

--
-- Table structure for table `ga`
--

CREATE TABLE IF NOT EXISTS `ga` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `ga_code` varchar(255) NOT NULL,
  `ga_statement` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `institute`
--

CREATE TABLE IF NOT EXISTS `institute` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `address` varchar(255) NOT NULL,
  `establishment_date` datetime NOT NULL,
  `mission` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `vision` varchar(255) NOT NULL,
  `vm_created_date` datetime NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `institute`
--

INSERT INTO `institute` (`id`, `version`, `address`, `establishment_date`, `mission`, `name`, `vision`, `vm_created_date`) VALUES
(1, 2, 'No.666, Upper Indiranagar, Bibwewadi, Pune, Maharashtra 411037, 020 2428 3001', '1982-09-01 00:00:00', 'vitMission', 'Vishwakarma Institute of Technology , Pune', 'vitVision', '2015-09-16 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `pwd` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `usertype_id` bigint(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `version`, `pwd`, `username`, `usertype_id`) VALUES
(1, 0, '1158', '1158', 2),
(2, 0, '123', '123', 1),
(3, 0, '1148', '1148', 2),
(4, 0, '906', '906', 2),
(5, 0, '922', '922', 2),
(6, 0, 'admin1058', 'admin1058', 3);

-- --------------------------------------------------------

--
-- Table structure for table `marking_scheme`
--

CREATE TABLE IF NOT EXISTS `marking_scheme` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `course_type_id` bigint(20) NOT NULL,
  `endsemester_exam` int(11) NOT NULL,
  `homework_assignment` int(11) NOT NULL,
  `laboratry` int(11) NOT NULL,
  `review_file` int(11) NOT NULL,
  `review_four` int(11) NOT NULL,
  `review_one` int(11) NOT NULL,
  `review_three` int(11) NOT NULL,
  `review_two` int(11) NOT NULL,
  `test1` int(11) NOT NULL,
  `test2` int(11) NOT NULL,
  `tutorial` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `peo`
--

CREATE TABLE IF NOT EXISTS `peo` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `peo_code` varchar(255) NOT NULL,
  `peo_statement` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `po`
--

CREATE TABLE IF NOT EXISTS `po` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `po_code` varchar(255) NOT NULL,
  `po_statement` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `program`
--

CREATE TABLE IF NOT EXISTS `program` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `department_id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `program`
--

INSERT INTO `program` (`id`, `version`, `department_id`, `name`) VALUES
(2, 1, 1, 'B.Tech-Computer'),
(3, 1, 1, 'B.Tech-Information Technology'),
(4, 0, 1, 'Master of Computer Applications'),
(5, 1, 2, 'B.Tech-Electronics'),
(6, 1, 2, 'B.Tech-Electronics and Telecommunication'),
(7, 1, 3, 'B.Tech-Chemical'),
(8, 1, 6, 'B.Tech-Industrial'),
(9, 1, 6, 'B.Tech-Production'),
(10, 1, 4, 'B.Tech-Instrumentation'),
(11, 1, 5, 'B.Tech-Mechanical'),
(12, 0, 7, 'Engineering, Sciences & Humanities'),
(13, 0, 8, 'Office'),
(14, 0, 11, 'Workshop'),
(15, 0, 10, 'Training and Placement'),
(16, 0, 9, 'Library');

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE IF NOT EXISTS `role` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `role` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`id`, `version`, `role`) VALUES
(1, 0, 'Director'),
(2, 1, 'Hod'),
(3, 0, 'Dean'),
(4, 0, 'Course Owner'),
(5, 0, 'Course Instructor');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `academic_year` varchar(255) NOT NULL,
  `btech_division` varchar(255) DEFAULT NULL,
  `btech_roll_no` int(11) NOT NULL,
  `current_year` varchar(255) NOT NULL,
  `department_id` bigint(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `fy_division` varchar(255) DEFAULT NULL,
  `fy_roll_no` int(11) NOT NULL,
  `gr_number` varchar(255) NOT NULL,
  `graduation_status` bit(1) NOT NULL,
  `mobile_number` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `program_id` bigint(20) NOT NULL,
  `sy_division` varchar(255) DEFAULT NULL,
  `sy_roll_no` int(11) NOT NULL,
  `ty_division` varchar(255) DEFAULT NULL,
  `ty_roll_no` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student_course`
--

CREATE TABLE IF NOT EXISTS `student_course` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `course_offering_id` bigint(20) NOT NULL,
  `student_id` bigint(20) NOT NULL,
  `student_division` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student_marks`
--

CREATE TABLE IF NOT EXISTS `student_marks` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `actual_marks` int(11) NOT NULL,
  `assessment_marks` int(11) NOT NULL,
  `assessment_type_id` bigint(20) NOT NULL,
  `course_offering_id` bigint(20) NOT NULL,
  `student_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `teacher_course`
--

CREATE TABLE IF NOT EXISTS `teacher_course` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `course_offering_id` bigint(20) NOT NULL,
  `employee_id` bigint(20) NOT NULL,
  `teacher_divison` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user_type`
--

CREATE TABLE IF NOT EXISTS `user_type` (
  `id` bigint(20) NOT NULL,
  `version` bigint(20) NOT NULL,
  `type` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_type`
--

INSERT INTO `user_type` (`id`, `version`, `type`) VALUES
(1, 0, 'Student'),
(2, 0, 'Employee'),
(3, 0, 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `assessment_type`
--
ALTER TABLE `assessment_type`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKAF42E01B2CE84319` (`coursetype_id`),
  ADD KEY `FKAF42E01BDF10C019` (`employee_id`),
  ADD KEY `FKAF42E01B8C91A370` (`course_type_id`);

--
-- Indexes for table `course_coordinator`
--
ALTER TABLE `course_coordinator`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `course_offering`
--
ALTER TABLE `course_offering`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK394E4FAA53FC68B9` (`course_id`);

--
-- Indexes for table `course_outcome`
--
ALTER TABLE `course_outcome`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK1C36432E53FC68B9` (`course_id`),
  ADD KEY `FK1C36432EDF10C019` (`employee_id`);

--
-- Indexes for table `course_type`
--
ALTER TABLE `course_type`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `co_marks_mapping`
--
ALTER TABLE `co_marks_mapping`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK3CB69E42483546BE` (`assessment_type_id`),
  ADD KEY `FK3CB69E42EF1774F0` (`course_offering_id`),
  ADD KEY `FK3CB69E4253FC68B9` (`course_id`),
  ADD KEY `FK3CB69E42DF10C019` (`employee_id`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK328E43523F056C5B` (`institute_id`);

--
-- Indexes for table `designation`
--
ALTER TABLE `designation`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK4722E6AE7EAD5CDB` (`designation_id`),
  ADD KEY `FK4722E6AE4D7C1E3B` (`program_id`);

--
-- Indexes for table `employee_role`
--
ALTER TABLE `employee_role`
  ADD KEY `FK87184F6792067299` (`role_id`),
  ADD KEY `FK87184F6742CED81B` (`employee_roles_id`);

--
-- Indexes for table `ga`
--
ALTER TABLE `ga`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `institute`
--
ALTER TABLE `institute`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK625EF69A98030D9` (`usertype_id`);

--
-- Indexes for table `marking_scheme`
--
ALTER TABLE `marking_scheme`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK5238032F8C91A370` (`course_type_id`);

--
-- Indexes for table `peo`
--
ALTER TABLE `peo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `po`
--
ALTER TABLE `po`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `program`
--
ALTER TABLE `program`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKED8F1E8438A501D9` (`department_id`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK8FFE823B38A501D9` (`department_id`),
  ADD KEY `FK8FFE823B4D7C1E3B` (`program_id`);

--
-- Indexes for table `student_course`
--
ALTER TABLE `student_course`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKB0A3729FEF1774F0` (`course_offering_id`),
  ADD KEY `FKB0A3729FB0706EDB` (`student_id`);

--
-- Indexes for table `student_marks`
--
ALTER TABLE `student_marks`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKDCEEE042483546BE` (`assessment_type_id`),
  ADD KEY `FKDCEEE042EF1774F0` (`course_offering_id`),
  ADD KEY `FKDCEEE042B0706EDB` (`student_id`);

--
-- Indexes for table `teacher_course`
--
ALTER TABLE `teacher_course`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK40C04F18EF1774F0` (`course_offering_id`),
  ADD KEY `FK40C04F18DF10C019` (`employee_id`);

--
-- Indexes for table `user_type`
--
ALTER TABLE `user_type`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `assessment_type`
--
ALTER TABLE `assessment_type`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `course`
--
ALTER TABLE `course`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `course_coordinator`
--
ALTER TABLE `course_coordinator`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `course_offering`
--
ALTER TABLE `course_offering`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `course_outcome`
--
ALTER TABLE `course_outcome`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `course_type`
--
ALTER TABLE `course_type`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `co_marks_mapping`
--
ALTER TABLE `co_marks_mapping`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `designation`
--
ALTER TABLE `designation`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=231;
--
-- AUTO_INCREMENT for table `ga`
--
ALTER TABLE `ga`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `institute`
--
ALTER TABLE `institute`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `marking_scheme`
--
ALTER TABLE `marking_scheme`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `peo`
--
ALTER TABLE `peo`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `po`
--
ALTER TABLE `po`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `program`
--
ALTER TABLE `program`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `student_course`
--
ALTER TABLE `student_course`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `student_marks`
--
ALTER TABLE `student_marks`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `teacher_course`
--
ALTER TABLE `teacher_course`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `user_type`
--
ALTER TABLE `user_type`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `course`
--
ALTER TABLE `course`
  ADD CONSTRAINT `FKAF42E01B2CE84319` FOREIGN KEY (`coursetype_id`) REFERENCES `course_type` (`id`),
  ADD CONSTRAINT `FKAF42E01B8C91A370` FOREIGN KEY (`course_type_id`) REFERENCES `course_type` (`id`),
  ADD CONSTRAINT `FKAF42E01BDF10C019` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`);

--
-- Constraints for table `course_offering`
--
ALTER TABLE `course_offering`
  ADD CONSTRAINT `FK394E4FAA53FC68B9` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`);

--
-- Constraints for table `course_outcome`
--
ALTER TABLE `course_outcome`
  ADD CONSTRAINT `FK1C36432E53FC68B9` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`),
  ADD CONSTRAINT `FK1C36432EDF10C019` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`);

--
-- Constraints for table `co_marks_mapping`
--
ALTER TABLE `co_marks_mapping`
  ADD CONSTRAINT `FK3CB69E42483546BE` FOREIGN KEY (`assessment_type_id`) REFERENCES `assessment_type` (`id`),
  ADD CONSTRAINT `FK3CB69E4253FC68B9` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`),
  ADD CONSTRAINT `FK3CB69E42DF10C019` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`),
  ADD CONSTRAINT `FK3CB69E42EF1774F0` FOREIGN KEY (`course_offering_id`) REFERENCES `course_offering` (`id`);

--
-- Constraints for table `department`
--
ALTER TABLE `department`
  ADD CONSTRAINT `FK328E43523F056C5B` FOREIGN KEY (`institute_id`) REFERENCES `institute` (`id`);

--
-- Constraints for table `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `FK4722E6AE4D7C1E3B` FOREIGN KEY (`program_id`) REFERENCES `program` (`id`),
  ADD CONSTRAINT `FK4722E6AE7EAD5CDB` FOREIGN KEY (`designation_id`) REFERENCES `designation` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
