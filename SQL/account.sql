/*
Navicat MySQL Data Transfer

Source Server         : 20191003
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2019-10-16 22:02:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `ID` int(11) NOT NULL COMMENT '编号',
  `UID` int(11) DEFAULT NULL COMMENT '用户编号',
  `MONEY` double DEFAULT NULL COMMENT '金额',
  PRIMARY KEY (`ID`),
  KEY `FK_Reference_8` (`UID`),
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`UID`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', '46', '1000');
INSERT INTO `account` VALUES ('2', '45', '1000');
INSERT INTO `account` VALUES ('3', '46', '2000');
