/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2016-08-02 16:07:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(60) DEFAULT NULL,
  `enabled` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
-- 密码的原文是“1”
INSERT INTO `springbootsecurity`.`user` (`id`, `enabled`, `password`, `username`) VALUES ('1', b'1', '$2a$10$6izW/j7MAPR9JSK5NGbUCOkKB2UJ25mnVacw3WQV5vf2PAgEPAHpC', 'wuketao');
INSERT INTO `springbootsecurity`.`user` (`id`, `enabled`, `password`, `username`) VALUES ('2', b'1', '$2a$10$6izW/j7MAPR9JSK5NGbUCOkKB2UJ25mnVacw3WQV5vf2PAgEPAHpC', 'yuling');
