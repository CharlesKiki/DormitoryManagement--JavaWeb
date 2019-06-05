/*
Navicat MySQL Data Transfer

Source Server         : conn
Source Server Version : 50530
Source Host           : localhost:3306
Source Database       : db_apartment

Target Server Type    : MYSQL
Target Server Version : 50530
File Encoding         : 65001

Date: 2013-12-16 11:20:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminId` int(11) NOT NULL DEFAULT '0',
  `adminName` varchar(50) DEFAULT NULL,
  `adminPwd` varchar(50) DEFAULT NULL,
  `adminPow` int(11) DEFAULT '1',
  PRIMARY KEY (`adminId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'user', '123', '1');
INSERT INTO `admin` VALUES ('4', 'fujie', '13658334342', '2');
INSERT INTO `admin` VALUES ('5', '张三', '13658326320', '2');

-- ----------------------------
-- Table structure for `apartment`
-- ----------------------------
DROP TABLE IF EXISTS `apartment`;
CREATE TABLE `apartment` (
  `apartId` int(11) NOT NULL AUTO_INCREMENT,
  `apartName` varchar(50) DEFAULT NULL,
  `apartNum` varchar(50) DEFAULT NULL,
  `adminId` int(11) DEFAULT NULL,
  `apartNote` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`apartId`),
  KEY `adminId` (`adminId`),
  KEY `apartId` (`apartId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of apartment
-- ----------------------------
INSERT INTO `apartment` VALUES ('3', '1', '231', '4', '一号公寓');
INSERT INTO `apartment` VALUES ('4', '2', '245', '5', '二号公寓');

-- ----------------------------
-- Table structure for `goods`
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goodsId` int(11) NOT NULL AUTO_INCREMENT,
  `stuId` int(11) DEFAULT NULL,
  `goodsIn` varchar(50) DEFAULT NULL,
  `goodsOut` varchar(50) DEFAULT NULL,
  `goodsDate` date DEFAULT NULL,
  `adminId` int(11) DEFAULT NULL,
  `note` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`goodsId`),
  KEY `stuId` (`stuId`),
  KEY `adminId` (`adminId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('6', '20', '电脑', '', '2013-04-18', '1', '做毕业论文');

-- ----------------------------
-- Table structure for `health`
-- ----------------------------
DROP TABLE IF EXISTS `health`;
CREATE TABLE `health` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roomId` int(11) DEFAULT NULL,
  `health` varchar(20) DEFAULT NULL,
  `checkDate` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `roomId` (`roomId`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of health
-- ----------------------------

-- ----------------------------
-- Table structure for `manager`
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `manId` int(11) NOT NULL AUTO_INCREMENT,
  `manName` varchar(50) DEFAULT NULL,
  `manPhone` varchar(50) DEFAULT NULL,
  `manEmail` varchar(50) DEFAULT NULL,
  `note` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`manId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES ('4', 'fujie', '13658334342', 'mang1987@qq.com', '管理员');
INSERT INTO `manager` VALUES ('5', '张三', '13658326320', 'dsfasf@qq.com', '公寓管理员');

-- ----------------------------
-- Table structure for `room`
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `roomId` int(11) NOT NULL AUTO_INCREMENT,
  `dormNum` varchar(50) DEFAULT NULL,
  `floorNum` varchar(50) DEFAULT NULL,
  `apartId` int(11) DEFAULT NULL,
  `bedNum` int(11) DEFAULT NULL,
  `staNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`roomId`),
  KEY `apartId` (`apartId`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES ('27', '1', '1', '3', '4', '1');

-- ----------------------------
-- Table structure for `stubase`
-- ----------------------------
DROP TABLE IF EXISTS `stubase`;
CREATE TABLE `stubase` (
  `stuId` int(11) NOT NULL DEFAULT '0',
  `bedNum` varchar(50) DEFAULT NULL,
  `roomId` int(11) DEFAULT NULL,
  PRIMARY KEY (`stuId`),
  KEY `roomId` (`roomId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stubase
-- ----------------------------
INSERT INTO `stubase` VALUES ('20', '2', '16');
INSERT INTO `stubase` VALUES ('21', '3', '16');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stuId` int(11) NOT NULL AUTO_INCREMENT,
  `stuNum` varchar(50) DEFAULT NULL,
  `stuName` varchar(50) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `sbj` varchar(50) DEFAULT NULL,
  `stuMajor` varchar(50) DEFAULT NULL,
  `stuCollege` varchar(50) DEFAULT NULL,
  `ssfz` varchar(50) DEFAULT NULL,
  `stuEnter` date DEFAULT NULL,
  `stuBirth` date DEFAULT NULL,
  `stuPhone` varchar(50) DEFAULT NULL,
  `stuAddress` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`stuId`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('20', '2009211135', '付杰', '男', '0310901', '信息管理与信息系统', '经济管理学院', '500101199004053266', '2009-09-08', '1989-04-01', '13658963108', '贵州');
INSERT INTO `student` VALUES ('21', '2009211136', '刘洋', '男', '0310901', '信息管理与信息系统', '经济管理学院', '500101199004053267', '2009-09-08', '1989-04-29', '13658963109', '贵州');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL DEFAULT '0',
  `userName` varchar(50) DEFAULT NULL,
  `userPwd` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('20', '2009211135', '123456');
INSERT INTO `user` VALUES ('21', '2009211136', '123456');

-- ----------------------------
-- Table structure for `visit`
-- ----------------------------
DROP TABLE IF EXISTS `visit`;
CREATE TABLE `visit` (
  `visitId` int(11) NOT NULL AUTO_INCREMENT,
  `visitName` varchar(50) DEFAULT NULL,
  `stuId` int(11) DEFAULT NULL,
  `relation` varchar(50) DEFAULT NULL,
  `visDate` date DEFAULT NULL,
  `leaDate` date DEFAULT NULL,
  `adminId` int(11) DEFAULT NULL,
  `visCret` varchar(50) DEFAULT NULL,
  `note` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`visitId`),
  KEY `stuId` (`stuId`),
  KEY `adminId` (`adminId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of visit
-- ----------------------------
