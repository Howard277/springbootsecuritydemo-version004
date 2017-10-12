/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2016-08-02 16:07:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(50) DEFAULT NULL,
  `desc` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `springbootsecurity`.`role` (`id`, `description`, `rolename`) VALUES ('1', '管理员', 'ADMIN');
INSERT INTO `springbootsecurity`.`role` (`id`, `description`, `rolename`) VALUES ('2', '数据库管理员', 'DBA');
INSERT INTO `springbootsecurity`.`role` (`id`, `description`, `rolename`) VALUES ('3', '普通用户', 'USER');

