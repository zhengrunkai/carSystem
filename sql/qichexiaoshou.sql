/*
Navicat MySQL Data Transfer

Source Server         : old
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : qichexiaoshou

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2021-02-09 09:55:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `cheliang`
-- ----------------------------
DROP TABLE IF EXISTS `cheliang`;
CREATE TABLE `cheliang` (
  `cheliang_id` int(20) NOT NULL,
  `cheliang_xinghao` varchar(20) DEFAULT '',
  `cheliang_danjia` varchar(20) DEFAULT NULL,
  `cheliang_cheqi` varchar(20) DEFAULT NULL,
  `cheliang_chelunyangshi` varchar(20) DEFAULT NULL,
  `cheliang_neishitiao` varchar(20) DEFAULT NULL,
  `cheliang_zuoyicaizhi` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cheliang_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of cheliang
-- ----------------------------
INSERT INTO `cheliang` VALUES ('2000', '新BMW2系多功能旅行车', '263800', '红色', '17英寸铝合金轮圈双辐射549型', '深色亚光氧化银内饰', 'Dakota真皮黑色');
INSERT INTO `cheliang` VALUES ('2001', 'BMW3系四门轿车2019款', '316800', '蓝色', '18英寸铝合金轮圈星式轮辐400M型', 'M运动套装', 'Sensatec合成皮黑色');
INSERT INTO `cheliang` VALUES ('2002', 'BMW 4系四门轿跑车', '359800', '黑色', '18英寸铝合金轮圈，星式轮辐400M型', '铝制六边形内饰，带亚光埃斯托蓝色装饰条', 'Dakota真皮，珊瑚红带黑色装饰条');
INSERT INTO `cheliang` VALUES ('2003', 'BMW 4系双门轿跑车2019款', '359800', '蓝色', '18英寸铝合金轮圈，星式轮辐400M型', '碳纤维纹理铝制内饰', 'Dakota真皮, 黑色带蓝色缝线');
INSERT INTO `cheliang` VALUES ('2004', '2019新款BMW 5系插电式混合动力', '496900', '矿石白', '18英寸铝合金轮圈, W式轮辐632型', '海湾形细线纹高级木饰, 带珠光镀铬装饰条', '高级Nappa真皮，象牙白带精制缝线及对比色真皮饰条');
INSERT INTO `cheliang` VALUES ('2005', '新BMW 7系', '828000', '棕色', '19英寸铝合金轮圈，V式轮辐620型', '灰色白杨木纹理高级木饰', '高级扩展Nappa真皮内饰，象牙白色，黑色内装');

-- ----------------------------
-- Table structure for `dingdan`
-- ----------------------------
DROP TABLE IF EXISTS `dingdan`;
CREATE TABLE `dingdan` (
  `dingdan_id` int(20) NOT NULL DEFAULT '0',
  `dingdan_time` varchar(20) DEFAULT NULL,
  `dingdan_xiaoshou_man` varchar(20) NOT NULL,
  `dingdan_kehu_name` varchar(20) DEFAULT '',
  `dingdan_cheliang` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`dingdan_id`),
  KEY `dingdan_xiaoshou_man` (`dingdan_xiaoshou_man`) USING BTREE,
  CONSTRAINT `dingdan1` FOREIGN KEY (`dingdan_id`) REFERENCES `cheliang` (`cheliang_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `dingdan2` FOREIGN KEY (`dingdan_xiaoshou_man`) REFERENCES `yuangong` (`yuangong_name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of dingdan
-- ----------------------------
INSERT INTO `dingdan` VALUES ('2000', '2019.02.01', '小王', '郑卡卡', '新BMW2系多功能旅行车');
INSERT INTO `dingdan` VALUES ('2001', '2019.04.01', '小李', '黄看看', 'BMW3系四门轿车2017款');
INSERT INTO `dingdan` VALUES ('2002', '2018.3.4', '小胡', '郑凯', 'BMW 4系四门轿跑车');
INSERT INTO `dingdan` VALUES ('2003', '2019.02.05', '小李', '徐良', 'BMW 4系双门轿跑车2019款');
INSERT INTO `dingdan` VALUES ('2004', '2019.03.16', '小王', '汪苏泷', '2019新款BMW 5系插电式混合动力');
INSERT INTO `dingdan` VALUES ('2005', '2019.04.14', '小李', '刘伟', '新BMW 7系');

-- ----------------------------
-- Table structure for `jinchuhuodan`
-- ----------------------------
DROP TABLE IF EXISTS `jinchuhuodan`;
CREATE TABLE `jinchuhuodan` (
  `jinchuhuodan_id` int(20) NOT NULL,
  `jinchuhuodan_cheliangxinghao` varchar(20) CHARACTER SET gbk COLLATE gbk_bin NOT NULL,
  `jinchuhuodan_gongyingshang` varchar(20) DEFAULT NULL,
  `jinchuhuodan_qianshou_time` varchar(20) DEFAULT NULL,
  `jinchuhuodan_chuku_time` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`jinchuhuodan_id`),
  CONSTRAINT `jinchuhuodan` FOREIGN KEY (`jinchuhuodan_id`) REFERENCES `cheliang` (`cheliang_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of jinchuhuodan
-- ----------------------------
INSERT INTO `jinchuhuodan` VALUES ('2000', '新BMW2系多功能旅行车', '广州宝马车行', '2017.3.22', '2017.6.5');
INSERT INTO `jinchuhuodan` VALUES ('2001', 'BMW3系四门轿车2019款', '惠州宝马车行', '2018.4.3', '2019.5.7');
INSERT INTO `jinchuhuodan` VALUES ('2002', 'BMW 4系四门轿跑车', '上海宝马车行', '2018.4.3', '2018.5.7');
INSERT INTO `jinchuhuodan` VALUES ('2003', 'BMW 4系双门轿跑车2019款', '深圳宝马车行', '2019.4.4', '2019.5.7');
INSERT INTO `jinchuhuodan` VALUES ('2004', '2019新款BMW 5系插电式混合动力', '广州宝马车行', '2019.03.20', '2019.05.12');
INSERT INTO `jinchuhuodan` VALUES ('2005', '新BMW 7系', '惠州宝马车行', '2019.05.23', '2019.06.12');

-- ----------------------------
-- Table structure for `shouhoudan`
-- ----------------------------
DROP TABLE IF EXISTS `shouhoudan`;
CREATE TABLE `shouhoudan` (
  `shouhoudan_id` int(20) NOT NULL DEFAULT '0',
  `shouhoudan_time` varchar(20) DEFAULT NULL,
  `shouhoudan_wenti` varchar(100) DEFAULT NULL,
  `shouhoudan_shouhou_man` varchar(20) NOT NULL,
  `shouhoudan_kehu_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`shouhoudan_id`),
  KEY `shouhoudan_shouhou_man` (`shouhoudan_shouhou_man`),
  CONSTRAINT `shouhoudan_shouhou1` FOREIGN KEY (`shouhoudan_shouhou_man`) REFERENCES `yuangong` (`yuangong_name`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `shouhoudan_shouhou2` FOREIGN KEY (`shouhoudan_id`) REFERENCES `cheliang` (`cheliang_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of shouhoudan
-- ----------------------------
INSERT INTO `shouhoudan` VALUES ('2003', '2018.08.07', '气缸漏油', '小康', '郑好好');
INSERT INTO `shouhoudan` VALUES ('2004', '2018.10.19', '发动机异常声音', '小华', '王亚东');
INSERT INTO `shouhoudan` VALUES ('2005', '2018.09.23', '不满意', '小青', '黄晶晶');

-- ----------------------------
-- Table structure for `sss`
-- ----------------------------
DROP TABLE IF EXISTS `sss`;
CREATE TABLE `sss` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `yi` varchar(30) NOT NULL DEFAULT '',
  `er` varchar(50) DEFAULT NULL,
  `time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of sss
-- ----------------------------
INSERT INTO `sss` VALUES ('1', '1714080902221', 'https://s2.ax1x.com/2020/01/12/loAoeP.jpg', '2020-01-12 15:36:38');
INSERT INTO `sss` VALUES ('18', 'we', './images/5.jpg', '2020-01-08 15:50:53');
INSERT INTO `sss` VALUES ('21', '2222222', './images/2.jpg', '2020-01-08 15:49:20');
INSERT INTO `sss` VALUES ('22', '4444444', './images/3.jpg', '2020-01-08 15:49:34');
INSERT INTO `sss` VALUES ('23', '444444', './images/4.jpg', '2020-01-08 15:49:50');
INSERT INTO `sss` VALUES ('24', '111', 'https://s2.ax1x.com/2020/01/12/lorVm9.jpg', '2020-01-12 15:31:48');
INSERT INTO `sss` VALUES ('25', 'we2', './images/5.jpg', '2020-02-23 09:53:08');
INSERT INTO `sss` VALUES ('26', 'wew', './images/5.jpg', '2020-02-23 09:53:57');
INSERT INTO `sss` VALUES ('27', '2222233', './images/2.jpg', '2020-02-23 09:54:06');
INSERT INTO `sss` VALUES ('30', '', '', '2020-06-15 14:35:47');
INSERT INTO `sss` VALUES ('31', '432', '', '2020-06-15 14:42:58');
INSERT INTO `sss` VALUES ('32', '543354', '', '2020-06-15 14:43:05');
INSERT INTO `sss` VALUES ('33', '645', '', '2020-06-15 14:43:13');
INSERT INTO `sss` VALUES ('34', '999', '', '2020-06-15 14:43:43');
INSERT INTO `sss` VALUES ('35', '8888', '', '2020-06-15 14:46:24');
INSERT INTO `sss` VALUES ('36', '3213', '', '2020-06-15 15:18:32');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `userpassword` varchar(50) NOT NULL,
  `userrights` varchar(50) NOT NULL,
  `rolenumber` int(11) NOT NULL,
  `rolename` varchar(50) NOT NULL,
  `roledescription` varchar(255) NOT NULL,
  `usercheck` varchar(20) DEFAULT NULL,
  `useremail` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('7', 'qqq', '15f98b0e1f77385bf08681293b80b617', '1', '1', '1', '普通注册->邮箱验证成功', '', '1256311705@qq.com');
INSERT INTO `user` VALUES ('8', '', 'a8e6d5c70609d4382b39395222a8ebca', '0', '1', '1', '普通注册', 'pa35sps3', '');
INSERT INTO `user` VALUES ('9', '15975100650', 'b97e27eb5e3d3c374c59712417d115ea', '0', '1', '1', '普通注册', 'q86wCR2W', '1256311705@qq.co');
INSERT INTO `user` VALUES ('10', 'eee', 'f921b97e2656491ac484f7b2bb302786', '0', '1', '1', '普通注册', 'J4fT0Wn8', '1256311705@qq.co');
INSERT INTO `user` VALUES ('11', '2', 'b97e27eb5e3d3c374c59712417d115ea', '0', '1', '1', '普通注册', 'I15UyJ3A', '1e');
INSERT INTO `user` VALUES ('12', 'fff', 'f921b97e2656491ac484f7b2bb302786', '0', '1', '1', '普通注册', '8D8N7335', '1256311705@qq.com');
INSERT INTO `user` VALUES ('13', 'rtt', '669d2d310b7773ffa9c11e60dbd9f29a', '0', '1', '1', '普通注册', '1skOE6tt', '1256311705@qq.com');
INSERT INTO `user` VALUES ('14', 'ewr', '1326e8e36c0fd9d765ec72e080d9aa34', '0', '1', '1', '普通注册', 'qZf89IF3', '1256311705@qq.com');
INSERT INTO `user` VALUES ('15', 'ttt', '805f7e8c71e89cbc7fee3c7404b7eb34', '0', '1', '1', '普通注册', '20l5E057', '1256311705@qq.com');
INSERT INTO `user` VALUES ('16', 'zzz', '15f98b0e1f77385bf08681293b80b617', '1', '1', '1', '普通注册->邮箱验证成功', '', '1256311705@qq.com');
INSERT INTO `user` VALUES ('17', 'xxx', '15f98b0e1f77385bf08681293b80b617', '0', '1', '1', '普通注册', '23X7CZL0', '1256311705@qq.com');
INSERT INTO `user` VALUES ('18', 'sss', '15f98b0e1f77385bf08681293b80b617', '0', '1', '1', '普通注册', 'nn698QQx', '1256311705@qq.com');
INSERT INTO `user` VALUES ('19', 'ggg', '15f98b0e1f77385bf08681293b80b617', '1', '1', '1', '普通注册->邮箱验证成功', '', '1256311705@qq.com');
INSERT INTO `user` VALUES ('20', 'bbb', '15f98b0e1f77385bf08681293b80b617', '0', '1', '1', '普通注册', 'G5g5HpS3', '1256311705@qq.com');
INSERT INTO `user` VALUES ('21', 'iii', '15f98b0e1f77385bf08681293b80b617', '1', '1', '1', '普通注册->邮箱验证成功', '', '1256311705@qq.com');
INSERT INTO `user` VALUES ('22', 'vvv', '15f98b0e1f77385bf08681293b80b617', '0', '1', '1', '普通注册', '4jC90m0O', '1256311705@qq.com');
INSERT INTO `user` VALUES ('155', '123', '123', '1', '1', '1', 'ooo', null, null);
INSERT INTO `user` VALUES ('156', 'zhengrk', '645c312530a173d3da7ffa6b92013f6c', '1', '1', '1', '普通注册->邮箱验证成功', '', '1256311705@qq.com');

-- ----------------------------
-- Table structure for `yuangong`
-- ----------------------------
DROP TABLE IF EXISTS `yuangong`;
CREATE TABLE `yuangong` (
  `yuangong_id` int(20) NOT NULL DEFAULT '0',
  `yuangong_name` varchar(20) NOT NULL,
  `yuangong_sex` varchar(20) DEFAULT NULL,
  `yuangong_phone` varchar(20) DEFAULT NULL,
  `yuangong_yeji` varchar(20) DEFAULT NULL,
  `yuangong_pingjia` varchar(50) DEFAULT NULL,
  `yuangong_bumen` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`yuangong_id`,`yuangong_name`),
  KEY `yuangong` (`yuangong_name`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of yuangong
-- ----------------------------
INSERT INTO `yuangong` VALUES ('21', '小王', '男', '13766787765', '3辆/月', null, '销售部');
INSERT INTO `yuangong` VALUES ('31', '小青', '女', '15467657897', null, '很有礼貌，人很热情', '售后部');
INSERT INTO `yuangong` VALUES ('41', '小李', '男', '15676489867', '3辆/月', null, '销售部');
INSERT INTO `yuangong` VALUES ('51', '小康', '女', '16784665874', null, '很负责', '售后部');
INSERT INTO `yuangong` VALUES ('61', '小华', '女', '15678467356', null, '做事认真，服务周到', '售后部');
INSERT INTO `yuangong` VALUES ('71', '小胡', '男', '13878478578', '2辆/月', null, '销售部');
