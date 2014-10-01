/*
MySQL Data Transfer
Source Host: localhost
Source Database: drdgportal
Target Host: localhost
Target Database: drdgportal
Date: 2014-10-1 17:41:09
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for drdg_emp
-- ----------------------------
CREATE TABLE `drdg_emp` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(20) NOT NULL,
  `emp_pwd` varchar(20) NOT NULL,
  `emp_power` char(1) NOT NULL DEFAULT '1' COMMENT '0管理，1雇员',
  `emp_date` date NOT NULL,
  `emp_state` char(1) NOT NULL DEFAULT '1' COMMENT '0 开启 1关闭',
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for drdg_power_group
-- ----------------------------
CREATE TABLE `drdg_power_group` (
  `pg_id` int(11) NOT NULL AUTO_INCREMENT,
  `pg_name` varchar(50) NOT NULL,
  PRIMARY KEY (`pg_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for drdg_power_group_grant
-- ----------------------------
CREATE TABLE `drdg_power_group_grant` (
  `pgg_id` int(11) NOT NULL AUTO_INCREMENT,
  `fk_pg_id` int(11) NOT NULL,
  `fk_emp_id` int(11) NOT NULL,
  PRIMARY KEY (`pgg_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for drdg_power_group_info
-- ----------------------------
CREATE TABLE `drdg_power_group_info` (
  `pgi_id` int(11) NOT NULL AUTO_INCREMENT,
  `fk_pg_id` int(11) NOT NULL,
  `fk_pmi_id` int(11) NOT NULL,
  PRIMARY KEY (`pgi_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for drdg_project_module
-- ----------------------------
CREATE TABLE `drdg_project_module` (
  `pm_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `pm_name` varchar(20) NOT NULL COMMENT '项目名称',
  `pm_state` char(1) NOT NULL DEFAULT '0' COMMENT '状态[0开启、1关闭]',
  `pm_remarks` varchar(100) DEFAULT '' COMMENT '备注信息',
  PRIMARY KEY (`pm_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for drdg_project_module_info
-- ----------------------------
CREATE TABLE `drdg_project_module_info` (
  `pmi_id` int(11) NOT NULL AUTO_INCREMENT,
  `fk_pm_id` int(11) NOT NULL COMMENT '项目模块外键',
  `pmi_sequence` int(11) NOT NULL DEFAULT '0' COMMENT '模块下子信息顺序',
  `pmi_name` varchar(20) NOT NULL COMMENT '模块下子信息名称',
  `pmi_url` varchar(100) NOT NULL COMMENT '模块下子信息地址',
  PRIMARY KEY (`pmi_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `drdg_emp` VALUES ('1', 'drdg', '5307197', '0', '2014-09-01', '0');
INSERT INTO `drdg_emp` VALUES ('2', 'fuzhengwei', '123', '1', '2014-09-17', '1');
INSERT INTO `drdg_emp` VALUES ('3', '霹雳霹雳', '1', '1', '2014-09-22', '1');
INSERT INTO `drdg_emp` VALUES ('5', '横冲', '123', '1', '2014-09-23', '0');
INSERT INTO `drdg_emp` VALUES ('6', 'Lucy', '123', '1', '2014-09-23', '1');
INSERT INTO `drdg_emp` VALUES ('7', 'leon', '123', '1', '2014-09-23', '1');
INSERT INTO `drdg_emp` VALUES ('8', '蚂蚁', '123', '1', '2014-09-23', '1');
INSERT INTO `drdg_emp` VALUES ('9', '苏二毛', '123', '1', '2014-09-23', '1');
INSERT INTO `drdg_emp` VALUES ('10', '伪球迷', '123', '1', '2014-09-23', '1');
INSERT INTO `drdg_emp` VALUES ('11', '月饼', '123', '1', '2014-09-23', '1');
INSERT INTO `drdg_emp` VALUES ('12', 'The、Queen', '123', '1', '2014-09-23', '1');
INSERT INTO `drdg_emp` VALUES ('13', '王春辰', '1', '1', '2014-09-23', '1');
INSERT INTO `drdg_emp` VALUES ('14', '蚂蚁', '123', '1', '2014-09-23', '1');
INSERT INTO `drdg_emp` VALUES ('15', '错误', '111', '1', '2014-09-23', '1');
INSERT INTO `drdg_emp` VALUES ('16', '王俊', '111', '1', '2014-09-23', '1');
INSERT INTO `drdg_emp` VALUES ('17', '李旭峰', '111', '1', '2014-09-23', '1');
INSERT INTO `drdg_power_group` VALUES ('1', '全局管理员');
INSERT INTO `drdg_power_group_grant` VALUES ('1', '1', '1');
INSERT INTO `drdg_power_group_info` VALUES ('1', '1', '1');
INSERT INTO `drdg_project_module` VALUES ('1', '雇员管理', '0', null);
INSERT INTO `drdg_project_module` VALUES ('2', '客户管理', '0', '');
INSERT INTO `drdg_project_module` VALUES ('3', '测试模块', '0', '');
INSERT INTO `drdg_project_module` VALUES ('4', '33', '0', '');
INSERT INTO `drdg_project_module_info` VALUES ('1', '1', '1', '雇员列表', 'drdg/emp/emplist.jsp');
INSERT INTO `drdg_project_module_info` VALUES ('2', '1', '2', '新增雇员', 'drdg/emp/empadd.jsp');
INSERT INTO `drdg_project_module_info` VALUES ('3', '2', '1', 'customer', '1');
INSERT INTO `drdg_project_module_info` VALUES ('4', '3', '1', 'test', 'test/xx.jsp');
