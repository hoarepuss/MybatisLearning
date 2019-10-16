/*
Navicat MySQL Data Transfer

Source Server         : 20191003
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2019-10-16 22:02:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) CHARACTER SET utf8 NOT NULL COMMENT '用户名称',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `sex` char(1) CHARACTER SET utf8 DEFAULT NULL COMMENT '性别',
  `address` varchar(256) CHARACTER SET utf8 DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('41', '霍尔', '2019-10-14 15:42:48', '女', '北京市朝阳');
INSERT INTO `user` VALUES ('42', '小二王', '2018-03-01 00:00:00', '女', '北京金燕龙');
INSERT INTO `user` VALUES ('43', '小二王', '2018-03-01 00:00:00', '女', '北京金燕龙');
INSERT INTO `user` VALUES ('45', '传智播客', '2018-03-01 00:00:00', '男', '北京金燕龙');
INSERT INTO `user` VALUES ('46', '老王', '2018-03-01 00:00:00', '男', '北京');
INSERT INTO `user` VALUES ('48', '小马宝莉', '2018-03-01 00:00:00', '女', '北京修正');
INSERT INTO `user` VALUES ('52', '胡文卓', '2019-10-14 00:45:24', '男', '北京市顺义区');
INSERT INTO `user` VALUES ('53', '张三', '2019-10-14 10:34:10', '男', '北京市顺义区');
INSERT INTO `user` VALUES ('54', '老王', '2019-10-14 15:48:02', '女', '中山市');
