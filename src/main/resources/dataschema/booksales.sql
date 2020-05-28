/*
 Navicat Premium Data Transfer

 Source Server         : docker_mysql_local
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : booksales

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 28/05/2020 17:16:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `bookId` varchar(100) NOT NULL COMMENT 'id',
  `bookName` varchar(100) NOT NULL COMMENT '书名',
  `price` decimal(30,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '价格',
  `createdTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='电子书籍';

-- ----------------------------
-- Table structure for bookOrder
-- ----------------------------
DROP TABLE IF EXISTS `bookOrder`;
CREATE TABLE `bookOrder` (
  `orderId` varchar(100) NOT NULL COMMENT '订单id',
  `customerId` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '会员id',
  `amount` decimal(30,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '折扣前订单金额',
  `discount` int(11) unsigned DEFAULT '0' COMMENT '折扣',
  `realPaid` decimal(30,2) unsigned DEFAULT '0.00' COMMENT '真实付款金额',
  `status` int(11) DEFAULT '0' COMMENT '0,未支付；\n1，已支付；',
  `createdTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单';

-- ----------------------------
-- Records of bookOrder
-- ----------------------------
BEGIN;
INSERT INTO `bookOrder` VALUES ('2020052812081959312288', 1, 76.00, 66, 50.16, 1, '2020-05-28 12:08:22');
INSERT INTO `bookOrder` VALUES ('2020052812260062612288', 1, 88.00, 66, 58.08, 1, '2020-05-28 12:26:00');
INSERT INTO `bookOrder` VALUES ('2020052812282804212288', 1, 76.00, NULL, NULL, 0, '2020-05-28 12:28:28');
INSERT INTO `bookOrder` VALUES ('2020052817060807912288', 1, 76.00, NULL, NULL, 0, '2020-05-28 17:06:08');
COMMIT;

-- ----------------------------
-- Table structure for bookOrderDetail
-- ----------------------------
DROP TABLE IF EXISTS `bookOrderDetail`;
CREATE TABLE `bookOrderDetail` (
  `serialId` varchar(100) NOT NULL COMMENT 'id',
  `orderId` varchar(100) NOT NULL COMMENT '订单id',
  `bookId` varchar(100) NOT NULL DEFAULT '' COMMENT '电子书id',
  `amount` decimal(30,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '总金额',
  `count` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '件数',
  `createdTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`serialId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单内商品详情';

-- ----------------------------
-- Records of bookOrderDetail
-- ----------------------------
BEGIN;
INSERT INTO `bookOrderDetail` VALUES ('2020052812282805512288', '2020052812282804212288', '1', 36.00, 3, '2020-05-28 12:28:28');
INSERT INTO `bookOrderDetail` VALUES ('2020052812282806612288', '2020052812282804212288', '2', 40.00, 4, '2020-05-28 12:28:28');
INSERT INTO `bookOrderDetail` VALUES ('2020052817060809412288', '2020052817060807912288', '1', 36.00, 3, '2020-05-28 17:06:08');
INSERT INTO `bookOrderDetail` VALUES ('2020052817060810212288', '2020052817060807912288', '2', 40.00, 4, '2020-05-28 17:06:08');
COMMIT;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `customerId` int(11) unsigned NOT NULL COMMENT 'id',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '姓名',
  `createdTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`customerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='客户';

-- ----------------------------
-- Records of customer
-- ----------------------------
BEGIN;
INSERT INTO `customer` VALUES (1, 'kevin', '2020-05-27 22:09:18');
COMMIT;

-- ----------------------------
-- Table structure for membership
-- ----------------------------
DROP TABLE IF EXISTS `membership`;
CREATE TABLE `membership` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `levelTitle` varchar(50) NOT NULL DEFAULT '' COMMENT '等级名称',
  `customerId` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '会员id',
  `discount` int(5) NOT NULL DEFAULT '100' COMMENT '折扣',
  `createdTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `expire` timestamp NULL DEFAULT NULL COMMENT '会员过期日期',
  `levelCode` int(2) DEFAULT '0' COMMENT 'code',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COMMENT='会员权益';

-- ----------------------------
-- Records of membership
-- ----------------------------
BEGIN;
INSERT INTO `membership` VALUES (1, 'premium', 1, 88, '2020-05-27 22:15:56', '2020-11-27 08:15:57', 1);
INSERT INTO `membership` VALUES (2, 'vip', 1, 66, '2020-05-28 00:27:32', NULL, 0);
COMMIT;

-- ----------------------------
-- Table structure for point
-- ----------------------------
DROP TABLE IF EXISTS `point`;
CREATE TABLE `point` (
  `serialId` varchar(100) NOT NULL COMMENT 'id',
  `customerId` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '会员id',
  `actionCode` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '行为code',
  `point` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '积分数',
  `createdTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`serialId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='积分明细';

-- ----------------------------
-- Records of point
-- ----------------------------
BEGIN;
INSERT INTO `point` VALUES ('2020052814491317712288', 1, 0, 5, '2020-05-28 14:49:13');
INSERT INTO `point` VALUES ('2020052815541726112288', 1, 101, 5, '2020-05-28 15:54:17');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
