/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : hibernate1

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2017-10-27 17:36:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_customer
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE `t_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `age` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_customer
-- ----------------------------
INSERT INTO `t_customer` VALUES ('1', 'xiaoming', '123', '14');
INSERT INTO `t_customer` VALUES ('2', 'xiaoming_0', '1230', '14');
INSERT INTO `t_customer` VALUES ('3', 'xiaoming_1', '1231', '14');
INSERT INTO `t_customer` VALUES ('4', 'xiaoming_2', '1232', '14');
INSERT INTO `t_customer` VALUES ('5', 'xiaoming_3', '1233', '14');
INSERT INTO `t_customer` VALUES ('6', 'xiaoming_4', '1234', '14');
INSERT INTO `t_customer` VALUES ('7', 'xiaoming_5', '1235', '14');
INSERT INTO `t_customer` VALUES ('8', 'xiaoming_6', '1236', '14');
INSERT INTO `t_customer` VALUES ('9', 'xiaoming_7', '1237', '14');
INSERT INTO `t_customer` VALUES ('10', 'xiaoming_8', '1238', '14');
INSERT INTO `t_customer` VALUES ('11', 'xiaoming_9', '1239', '14');
INSERT INTO `t_customer` VALUES ('12', 'xiaoming_10', '12310', '14');
INSERT INTO `t_customer` VALUES ('13', 'xiaoming_11', '12311', '14');
INSERT INTO `t_customer` VALUES ('14', 'xiaoming_12', '12312', '14');
INSERT INTO `t_customer` VALUES ('15', 'xiaoming_13', '12313', '14');
INSERT INTO `t_customer` VALUES ('16', 'xiaoming_14', '12314', '14');
INSERT INTO `t_customer` VALUES ('17', 'xiaoming_15', '12315', '14');
INSERT INTO `t_customer` VALUES ('18', 'xiaoming_16', '12316', '14');
INSERT INTO `t_customer` VALUES ('19', 'xiaoming_17', '12317', '14');
INSERT INTO `t_customer` VALUES ('20', 'xiaoming_18', '12318', '14');
INSERT INTO `t_customer` VALUES ('21', 'xiaoming_19', '12319', '14');
INSERT INTO `t_customer` VALUES ('22', 'xiaoming_20', '12320', '14');
INSERT INTO `t_customer` VALUES ('23', 'xiaoming_21', '12321', '14');
INSERT INTO `t_customer` VALUES ('24', 'xiaoming_22', '12322', '14');
INSERT INTO `t_customer` VALUES ('25', 'xiaoming_23', '12323', '14');
INSERT INTO `t_customer` VALUES ('26', 'xiaoming_24', '12324', '14');
INSERT INTO `t_customer` VALUES ('27', 'xiaoming_25', '12325', '14');
INSERT INTO `t_customer` VALUES ('28', 'xiaoming_26', '12326', '14');
INSERT INTO `t_customer` VALUES ('29', 'xiaoming_27', '12327', '14');
INSERT INTO `t_customer` VALUES ('30', 'xiaoming_28', '12328', '14');
INSERT INTO `t_customer` VALUES ('31', 'xiaoming_29', '12329', '14');
INSERT INTO `t_customer` VALUES ('32', 'xiaoming_30', '12330', '14');
INSERT INTO `t_customer` VALUES ('33', 'xiaoming_31', '12331', '14');
INSERT INTO `t_customer` VALUES ('34', 'xiaoming_32', '12332', '14');
INSERT INTO `t_customer` VALUES ('35', 'xiaoming_33', '12333', '14');
INSERT INTO `t_customer` VALUES ('36', 'xiaoming_34', '12334', '14');
INSERT INTO `t_customer` VALUES ('37', 'xiaoming_35', '12335', '14');
INSERT INTO `t_customer` VALUES ('38', 'xiaoming_36', '12336', '14');
INSERT INTO `t_customer` VALUES ('39', 'xiaoming_37', '12337', '14');
INSERT INTO `t_customer` VALUES ('40', 'xiaoming_38', '12338', '14');
INSERT INTO `t_customer` VALUES ('41', 'xiaoming_39', '12339', '14');
INSERT INTO `t_customer` VALUES ('42', 'xiaoming_40', '12340', '14');
INSERT INTO `t_customer` VALUES ('43', 'xiaoming_41', '12341', '14');
INSERT INTO `t_customer` VALUES ('44', 'xiaoming_42', '12342', '14');
INSERT INTO `t_customer` VALUES ('45', 'xiaoming_43', '12343', '14');
INSERT INTO `t_customer` VALUES ('46', 'xiaoming_44', '12344', '14');
INSERT INTO `t_customer` VALUES ('47', 'xiaoming_45', '12345', '14');
INSERT INTO `t_customer` VALUES ('48', 'xiaoming_46', '12346', '14');
INSERT INTO `t_customer` VALUES ('49', 'xiaoming_47', '12347', '14');
INSERT INTO `t_customer` VALUES ('50', 'xiaoming_48', '12348', '14');
INSERT INTO `t_customer` VALUES ('51', 'xiaoming_49', '12349', '14');
INSERT INTO `t_customer` VALUES ('52', 'xiaoming_50', '12350', '14');
INSERT INTO `t_customer` VALUES ('53', 'xiaoming_51', '12351', '14');
INSERT INTO `t_customer` VALUES ('54', 'xiaoming_52', '12352', '14');
INSERT INTO `t_customer` VALUES ('55', 'xiaoming_53', '12353', '14');
INSERT INTO `t_customer` VALUES ('56', 'xiaoming_54', '12354', '14');
INSERT INTO `t_customer` VALUES ('57', 'xiaoming_55', '12355', '14');
INSERT INTO `t_customer` VALUES ('58', 'xiaoming_56', '12356', '14');
INSERT INTO `t_customer` VALUES ('59', 'xiaoming_57', '12357', '14');
INSERT INTO `t_customer` VALUES ('60', 'xiaoming_58', '12358', '14');
INSERT INTO `t_customer` VALUES ('61', 'xiaoming_59', '12359', '14');
INSERT INTO `t_customer` VALUES ('62', 'xiaoming_60', '12360', '14');
INSERT INTO `t_customer` VALUES ('63', 'xiaoming_61', '12361', '14');
INSERT INTO `t_customer` VALUES ('64', 'xiaoming_62', '12362', '14');
INSERT INTO `t_customer` VALUES ('65', 'xiaoming_63', '12363', '14');
INSERT INTO `t_customer` VALUES ('66', 'xiaoming_64', '12364', '14');
INSERT INTO `t_customer` VALUES ('67', 'xiaoming_65', '12365', '14');
INSERT INTO `t_customer` VALUES ('68', 'xiaoming_66', '12366', '14');
INSERT INTO `t_customer` VALUES ('69', 'xiaoming_67', '12367', '14');
INSERT INTO `t_customer` VALUES ('70', 'xiaoming_68', '12368', '14');
INSERT INTO `t_customer` VALUES ('71', 'xiaoming_69', '12369', '14');
INSERT INTO `t_customer` VALUES ('72', 'xiaoming_70', '12370', '14');
INSERT INTO `t_customer` VALUES ('73', 'xiaoming_71', '12371', '14');
INSERT INTO `t_customer` VALUES ('74', 'xiaoming_72', '12372', '14');
INSERT INTO `t_customer` VALUES ('75', 'xiaoming_73', '12373', '14');
INSERT INTO `t_customer` VALUES ('76', 'xiaoming_74', '12374', '14');
INSERT INTO `t_customer` VALUES ('77', 'xiaoming_75', '12375', '14');
INSERT INTO `t_customer` VALUES ('78', 'xiaoming_76', '12376', '14');
INSERT INTO `t_customer` VALUES ('79', 'xiaoming_77', '12377', '14');
INSERT INTO `t_customer` VALUES ('80', 'xiaoming_78', '12378', '14');
INSERT INTO `t_customer` VALUES ('81', 'xiaoming_79', '12379', '14');
INSERT INTO `t_customer` VALUES ('82', 'xiaoming_80', '12380', '14');
INSERT INTO `t_customer` VALUES ('83', 'xiaoming_81', '12381', '14');
INSERT INTO `t_customer` VALUES ('84', 'xiaoming_82', '12382', '14');
INSERT INTO `t_customer` VALUES ('85', 'xiaoming_83', '12383', '14');
INSERT INTO `t_customer` VALUES ('86', 'xiaoming_84', '12384', '14');
INSERT INTO `t_customer` VALUES ('87', 'xiaoming_85', '12385', '14');
INSERT INTO `t_customer` VALUES ('88', 'xiaoming_86', '12386', '14');
INSERT INTO `t_customer` VALUES ('89', 'xiaoming_87', '12387', '14');
INSERT INTO `t_customer` VALUES ('90', 'xiaoming_88', '12388', '14');
INSERT INTO `t_customer` VALUES ('91', 'xiaoming_89', '12389', '14');
INSERT INTO `t_customer` VALUES ('92', 'xiaoming_90', '12390', '14');
INSERT INTO `t_customer` VALUES ('93', 'xiaoming_91', '12391', '14');
INSERT INTO `t_customer` VALUES ('94', 'xiaoming_92', '12392', '14');
INSERT INTO `t_customer` VALUES ('95', 'xiaoming_93', '12393', '14');
INSERT INTO `t_customer` VALUES ('96', 'xiaoming_94', '12394', '14');
INSERT INTO `t_customer` VALUES ('97', 'xiaoming_95', '12395', '14');
INSERT INTO `t_customer` VALUES ('98', 'xiaoming_96', '12396', '14');
INSERT INTO `t_customer` VALUES ('99', 'xiaoming_97', '12397', '14');
INSERT INTO `t_customer` VALUES ('100', 'xiaoming_98', '12398', '14');
INSERT INTO `t_customer` VALUES ('101', 'xiaoming_99', '12399', '14');

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `order_desc` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id_fk` (`user_id`),
  CONSTRAINT `user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `t_customer` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=201 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES ('1', '订单第——0', '详情是——0', null);
INSERT INTO `t_order` VALUES ('2', '订单第——1', '详情是——1', '1');
INSERT INTO `t_order` VALUES ('3', '订单第——2', '详情是——2', '1');
INSERT INTO `t_order` VALUES ('4', '订单第——3', '详情是——3', '1');
INSERT INTO `t_order` VALUES ('5', '订单第——4', '详情是——4', '1');
INSERT INTO `t_order` VALUES ('6', '订单第——5', '详情是——5', '1');
INSERT INTO `t_order` VALUES ('7', '订单第——6', '详情是——6', '1');
INSERT INTO `t_order` VALUES ('8', '订单第——7', '详情是——7', '1');
INSERT INTO `t_order` VALUES ('9', '订单第——8', '详情是——8', '1');
INSERT INTO `t_order` VALUES ('10', '订单第——9', '详情是——9', '9');
INSERT INTO `t_order` VALUES ('11', '订单第——10', '详情是——10', '10');
INSERT INTO `t_order` VALUES ('12', '订单第——11', '详情是——11', '11');
INSERT INTO `t_order` VALUES ('13', '订单第——12', '详情是——12', '12');
INSERT INTO `t_order` VALUES ('14', '订单第——13', '详情是——13', '13');
INSERT INTO `t_order` VALUES ('15', '订单第——14', '详情是——14', '14');
INSERT INTO `t_order` VALUES ('16', '订单第——15', '详情是——15', '15');
INSERT INTO `t_order` VALUES ('17', '订单第——16', '详情是——16', '16');
INSERT INTO `t_order` VALUES ('18', '订单第——17', '详情是——17', '17');
INSERT INTO `t_order` VALUES ('19', '订单第——18', '详情是——18', '18');
INSERT INTO `t_order` VALUES ('20', '订单第——19', '详情是——19', '19');
INSERT INTO `t_order` VALUES ('21', '订单第——20', '详情是——20', '20');
INSERT INTO `t_order` VALUES ('22', '订单第——21', '详情是——21', '21');
INSERT INTO `t_order` VALUES ('23', '订单第——22', '详情是——22', '22');
INSERT INTO `t_order` VALUES ('24', '订单第——23', '详情是——23', '23');
INSERT INTO `t_order` VALUES ('25', '订单第——24', '详情是——24', '24');
INSERT INTO `t_order` VALUES ('26', '订单第——25', '详情是——25', '25');
INSERT INTO `t_order` VALUES ('27', '订单第——26', '详情是——26', '26');
INSERT INTO `t_order` VALUES ('28', '订单第——27', '详情是——27', '27');
INSERT INTO `t_order` VALUES ('29', '订单第——28', '详情是——28', '28');
INSERT INTO `t_order` VALUES ('30', '订单第——29', '详情是——29', '29');
INSERT INTO `t_order` VALUES ('31', '订单第——30', '详情是——30', '30');
INSERT INTO `t_order` VALUES ('32', '订单第——31', '详情是——31', '31');
INSERT INTO `t_order` VALUES ('33', '订单第——32', '详情是——32', '32');
INSERT INTO `t_order` VALUES ('34', '订单第——33', '详情是——33', '33');
INSERT INTO `t_order` VALUES ('35', '订单第——34', '详情是——34', '34');
INSERT INTO `t_order` VALUES ('36', '订单第——35', '详情是——35', '35');
INSERT INTO `t_order` VALUES ('37', '订单第——36', '详情是——36', '36');
INSERT INTO `t_order` VALUES ('38', '订单第——37', '详情是——37', '37');
INSERT INTO `t_order` VALUES ('39', '订单第——38', '详情是——38', '38');
INSERT INTO `t_order` VALUES ('40', '订单第——39', '详情是——39', '39');
INSERT INTO `t_order` VALUES ('41', '订单第——40', '详情是——40', '40');
INSERT INTO `t_order` VALUES ('42', '订单第——41', '详情是——41', '41');
INSERT INTO `t_order` VALUES ('43', '订单第——42', '详情是——42', '42');
INSERT INTO `t_order` VALUES ('44', '订单第——43', '详情是——43', '43');
INSERT INTO `t_order` VALUES ('45', '订单第——44', '详情是——44', '44');
INSERT INTO `t_order` VALUES ('46', '订单第——45', '详情是——45', '45');
INSERT INTO `t_order` VALUES ('47', '订单第——46', '详情是——46', '46');
INSERT INTO `t_order` VALUES ('48', '订单第——47', '详情是——47', '47');
INSERT INTO `t_order` VALUES ('49', '订单第——48', '详情是——48', '48');
INSERT INTO `t_order` VALUES ('50', '订单第——49', '详情是——49', '49');
INSERT INTO `t_order` VALUES ('51', '订单第——50', '详情是——50', '50');
INSERT INTO `t_order` VALUES ('52', '订单第——51', '详情是——51', '51');
INSERT INTO `t_order` VALUES ('53', '订单第——52', '详情是——52', '52');
INSERT INTO `t_order` VALUES ('54', '订单第——53', '详情是——53', '53');
INSERT INTO `t_order` VALUES ('55', '订单第——54', '详情是——54', '54');
INSERT INTO `t_order` VALUES ('56', '订单第——55', '详情是——55', '55');
INSERT INTO `t_order` VALUES ('57', '订单第——56', '详情是——56', '56');
INSERT INTO `t_order` VALUES ('58', '订单第——57', '详情是——57', '57');
INSERT INTO `t_order` VALUES ('59', '订单第——58', '详情是——58', '58');
INSERT INTO `t_order` VALUES ('60', '订单第——59', '详情是——59', '59');
INSERT INTO `t_order` VALUES ('61', '订单第——60', '详情是——60', '60');
INSERT INTO `t_order` VALUES ('62', '订单第——61', '详情是——61', '61');
INSERT INTO `t_order` VALUES ('63', '订单第——62', '详情是——62', '62');
INSERT INTO `t_order` VALUES ('64', '订单第——63', '详情是——63', '63');
INSERT INTO `t_order` VALUES ('65', '订单第——64', '详情是——64', '64');
INSERT INTO `t_order` VALUES ('66', '订单第——65', '详情是——65', '65');
INSERT INTO `t_order` VALUES ('67', '订单第——66', '详情是——66', '66');
INSERT INTO `t_order` VALUES ('68', '订单第——67', '详情是——67', '67');
INSERT INTO `t_order` VALUES ('69', '订单第——68', '详情是——68', '68');
INSERT INTO `t_order` VALUES ('70', '订单第——69', '详情是——69', '69');
INSERT INTO `t_order` VALUES ('71', '订单第——70', '详情是——70', '70');
INSERT INTO `t_order` VALUES ('72', '订单第——71', '详情是——71', '71');
INSERT INTO `t_order` VALUES ('73', '订单第——72', '详情是——72', '72');
INSERT INTO `t_order` VALUES ('74', '订单第——73', '详情是——73', '73');
INSERT INTO `t_order` VALUES ('75', '订单第——74', '详情是——74', '74');
INSERT INTO `t_order` VALUES ('76', '订单第——75', '详情是——75', '75');
INSERT INTO `t_order` VALUES ('77', '订单第——76', '详情是——76', '76');
INSERT INTO `t_order` VALUES ('78', '订单第——77', '详情是——77', '77');
INSERT INTO `t_order` VALUES ('79', '订单第——78', '详情是——78', '78');
INSERT INTO `t_order` VALUES ('80', '订单第——79', '详情是——79', '79');
INSERT INTO `t_order` VALUES ('81', '订单第——80', '详情是——80', '80');
INSERT INTO `t_order` VALUES ('82', '订单第——81', '详情是——81', '81');
INSERT INTO `t_order` VALUES ('83', '订单第——82', '详情是——82', '82');
INSERT INTO `t_order` VALUES ('84', '订单第——83', '详情是——83', '83');
INSERT INTO `t_order` VALUES ('85', '订单第——84', '详情是——84', '84');
INSERT INTO `t_order` VALUES ('86', '订单第——85', '详情是——85', '85');
INSERT INTO `t_order` VALUES ('87', '订单第——86', '详情是——86', '86');
INSERT INTO `t_order` VALUES ('88', '订单第——87', '详情是——87', '87');
INSERT INTO `t_order` VALUES ('89', '订单第——88', '详情是——88', '88');
INSERT INTO `t_order` VALUES ('90', '订单第——89', '详情是——89', '89');
INSERT INTO `t_order` VALUES ('91', '订单第——90', '详情是——90', '90');
INSERT INTO `t_order` VALUES ('92', '订单第——91', '详情是——91', '91');
INSERT INTO `t_order` VALUES ('93', '订单第——92', '详情是——92', '92');
INSERT INTO `t_order` VALUES ('94', '订单第——93', '详情是——93', '93');
INSERT INTO `t_order` VALUES ('95', '订单第——94', '详情是——94', '94');
INSERT INTO `t_order` VALUES ('96', '订单第——95', '详情是——95', '95');
INSERT INTO `t_order` VALUES ('97', '订单第——96', '详情是——96', '96');
INSERT INTO `t_order` VALUES ('98', '订单第——97', '详情是——97', '97');
INSERT INTO `t_order` VALUES ('99', '订单第——98', '详情是——98', '98');
INSERT INTO `t_order` VALUES ('100', '订单第——99', '详情是——99', '99');
INSERT INTO `t_order` VALUES ('101', '订单第——0', '详情是——0', '1');
INSERT INTO `t_order` VALUES ('102', '订单第——1', '详情是——1', '1');
INSERT INTO `t_order` VALUES ('103', '订单第——2', '详情是——2', '1');
INSERT INTO `t_order` VALUES ('104', '订单第——3', '详情是——3', '1');
INSERT INTO `t_order` VALUES ('105', '订单第——4', '详情是——4', '1');
INSERT INTO `t_order` VALUES ('106', '订单第——5', '详情是——5', '1');
INSERT INTO `t_order` VALUES ('107', '订单第——6', '详情是——6', '1');
INSERT INTO `t_order` VALUES ('108', '订单第——7', '详情是——7', '1');
INSERT INTO `t_order` VALUES ('109', '订单第——8', '详情是——8', '1');
INSERT INTO `t_order` VALUES ('110', '订单第——9', '详情是——9', '1');
INSERT INTO `t_order` VALUES ('111', '订单第——10', '详情是——10', '1');
INSERT INTO `t_order` VALUES ('112', '订单第——11', '详情是——11', '1');
INSERT INTO `t_order` VALUES ('113', '订单第——12', '详情是——12', '1');
INSERT INTO `t_order` VALUES ('114', '订单第——13', '详情是——13', '1');
INSERT INTO `t_order` VALUES ('115', '订单第——14', '详情是——14', '1');
INSERT INTO `t_order` VALUES ('116', '订单第——15', '详情是——15', '1');
INSERT INTO `t_order` VALUES ('117', '订单第——16', '详情是——16', '1');
INSERT INTO `t_order` VALUES ('118', '订单第——17', '详情是——17', '1');
INSERT INTO `t_order` VALUES ('119', '订单第——18', '详情是——18', '1');
INSERT INTO `t_order` VALUES ('120', '订单第——19', '详情是——19', '1');
INSERT INTO `t_order` VALUES ('121', '订单第——20', '详情是——20', '1');
INSERT INTO `t_order` VALUES ('122', '订单第——21', '详情是——21', '1');
INSERT INTO `t_order` VALUES ('123', '订单第——22', '详情是——22', '1');
INSERT INTO `t_order` VALUES ('124', '订单第——23', '详情是——23', '1');
INSERT INTO `t_order` VALUES ('125', '订单第——24', '详情是——24', '1');
INSERT INTO `t_order` VALUES ('126', '订单第——25', '详情是——25', '1');
INSERT INTO `t_order` VALUES ('127', '订单第——26', '详情是——26', '1');
INSERT INTO `t_order` VALUES ('128', '订单第——27', '详情是——27', '1');
INSERT INTO `t_order` VALUES ('129', '订单第——28', '详情是——28', '1');
INSERT INTO `t_order` VALUES ('130', '订单第——29', '详情是——29', '1');
INSERT INTO `t_order` VALUES ('131', '订单第——30', '详情是——30', '1');
INSERT INTO `t_order` VALUES ('132', '订单第——31', '详情是——31', '1');
INSERT INTO `t_order` VALUES ('133', '订单第——32', '详情是——32', '1');
INSERT INTO `t_order` VALUES ('134', '订单第——33', '详情是——33', '1');
INSERT INTO `t_order` VALUES ('135', '订单第——34', '详情是——34', '1');
INSERT INTO `t_order` VALUES ('136', '订单第——35', '详情是——35', '1');
INSERT INTO `t_order` VALUES ('137', '订单第——36', '详情是——36', '1');
INSERT INTO `t_order` VALUES ('138', '订单第——37', '详情是——37', '1');
INSERT INTO `t_order` VALUES ('139', '订单第——38', '详情是——38', '1');
INSERT INTO `t_order` VALUES ('140', '订单第——39', '详情是——39', '1');
INSERT INTO `t_order` VALUES ('141', '订单第——40', '详情是——40', '1');
INSERT INTO `t_order` VALUES ('142', '订单第——41', '详情是——41', '1');
INSERT INTO `t_order` VALUES ('143', '订单第——42', '详情是——42', '1');
INSERT INTO `t_order` VALUES ('144', '订单第——43', '详情是——43', '1');
INSERT INTO `t_order` VALUES ('145', '订单第——44', '详情是——44', '1');
INSERT INTO `t_order` VALUES ('146', '订单第——45', '详情是——45', '1');
INSERT INTO `t_order` VALUES ('147', '订单第——46', '详情是——46', '1');
INSERT INTO `t_order` VALUES ('148', '订单第——47', '详情是——47', '1');
INSERT INTO `t_order` VALUES ('149', '订单第——48', '详情是——48', '1');
INSERT INTO `t_order` VALUES ('150', '订单第——49', '详情是——49', '1');
INSERT INTO `t_order` VALUES ('151', '订单第——50', '详情是——50', '1');
INSERT INTO `t_order` VALUES ('152', '订单第——51', '详情是——51', '1');
INSERT INTO `t_order` VALUES ('153', '订单第——52', '详情是——52', '1');
INSERT INTO `t_order` VALUES ('154', '订单第——53', '详情是——53', '1');
INSERT INTO `t_order` VALUES ('155', '订单第——54', '详情是——54', '1');
INSERT INTO `t_order` VALUES ('156', '订单第——55', '详情是——55', '1');
INSERT INTO `t_order` VALUES ('157', '订单第——56', '详情是——56', '1');
INSERT INTO `t_order` VALUES ('158', '订单第——57', '详情是——57', '1');
INSERT INTO `t_order` VALUES ('159', '订单第——58', '详情是——58', '1');
INSERT INTO `t_order` VALUES ('160', '订单第——59', '详情是——59', '1');
INSERT INTO `t_order` VALUES ('161', '订单第——60', '详情是——60', '1');
INSERT INTO `t_order` VALUES ('162', '订单第——61', '详情是——61', '1');
INSERT INTO `t_order` VALUES ('163', '订单第——62', '详情是——62', '1');
INSERT INTO `t_order` VALUES ('164', '订单第——63', '详情是——63', '1');
INSERT INTO `t_order` VALUES ('165', '订单第——64', '详情是——64', '1');
INSERT INTO `t_order` VALUES ('166', '订单第——65', '详情是——65', '1');
INSERT INTO `t_order` VALUES ('167', '订单第——66', '详情是——66', '1');
INSERT INTO `t_order` VALUES ('168', '订单第——67', '详情是——67', '1');
INSERT INTO `t_order` VALUES ('169', '订单第——68', '详情是——68', '1');
INSERT INTO `t_order` VALUES ('170', '订单第——69', '详情是——69', '1');
INSERT INTO `t_order` VALUES ('171', '订单第——70', '详情是——70', '1');
INSERT INTO `t_order` VALUES ('172', '订单第——71', '详情是——71', '1');
INSERT INTO `t_order` VALUES ('173', '订单第——72', '详情是——72', '1');
INSERT INTO `t_order` VALUES ('174', '订单第——73', '详情是——73', '1');
INSERT INTO `t_order` VALUES ('175', '订单第——74', '详情是——74', '1');
INSERT INTO `t_order` VALUES ('176', '订单第——75', '详情是——75', '1');
INSERT INTO `t_order` VALUES ('177', '订单第——76', '详情是——76', '1');
INSERT INTO `t_order` VALUES ('178', '订单第——77', '详情是——77', '1');
INSERT INTO `t_order` VALUES ('179', '订单第——78', '详情是——78', '1');
INSERT INTO `t_order` VALUES ('180', '订单第——79', '详情是——79', '1');
INSERT INTO `t_order` VALUES ('181', '订单第——80', '详情是——80', '1');
INSERT INTO `t_order` VALUES ('182', '订单第——81', '详情是——81', '1');
INSERT INTO `t_order` VALUES ('183', '订单第——82', '详情是——82', '1');
INSERT INTO `t_order` VALUES ('184', '订单第——83', '详情是——83', '1');
INSERT INTO `t_order` VALUES ('185', '订单第——84', '详情是——84', '1');
INSERT INTO `t_order` VALUES ('186', '订单第——85', '详情是——85', '1');
INSERT INTO `t_order` VALUES ('187', '订单第——86', '详情是——86', '1');
INSERT INTO `t_order` VALUES ('188', '订单第——87', '详情是——87', '1');
INSERT INTO `t_order` VALUES ('189', '订单第——88', '详情是——88', '1');
INSERT INTO `t_order` VALUES ('190', '订单第——89', '详情是——89', '1');
INSERT INTO `t_order` VALUES ('191', '订单第——90', '详情是——90', '1');
INSERT INTO `t_order` VALUES ('192', '订单第——91', '详情是——91', '1');
INSERT INTO `t_order` VALUES ('193', '订单第——92', '详情是——92', '1');
INSERT INTO `t_order` VALUES ('194', '订单第——93', '详情是——93', '1');
INSERT INTO `t_order` VALUES ('195', '订单第——94', '详情是——94', '1');
INSERT INTO `t_order` VALUES ('196', '订单第——95', '详情是——95', '1');
INSERT INTO `t_order` VALUES ('197', '订单第——96', '详情是——96', '1');
INSERT INTO `t_order` VALUES ('198', '订单第——97', '详情是——97', '1');
INSERT INTO `t_order` VALUES ('199', '订单第——98', '详情是——98', '1');
INSERT INTO `t_order` VALUES ('200', '订单第——99', '详情是——99', '1');
