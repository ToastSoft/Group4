#1.数据库创建
drop database IF EXISTS public_security;
create database public_security;
select * from user_info;
select * from fine_info;
select * from case_later;
select * from criminal_report;
use `public_security`;

#2.用户信息
#其中police_id必须存在于警察表中
# ----------------------------
# Table structure for user_info
# ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(20) NOT NULL,
  `login_password` varchar(20) NOT NULL,
  `police_id` int(11) NOT NULL,
  `police_name` varchar(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `delete_time` timestamp NULL DEFAULT NULL,
  `user_status` char(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


INSERT INTO `user_info` VALUES ('1', 'admin', '000000', '1', '薄警官', '2017-01-11 15:44:06', null, '0');
INSERT INTO `user_info` VALUES ('2', 'user01', '000000', '2', '周警官', '2017-01-11 15:45:11', null, '0');
INSERT INTO `user_info` VALUES ('3', 'user03', '000000', '3', '李四', '2017-01-11 15:46:04', null, '0');

#--3.权限信息
# ----------------------------
# Table structure for jurisdiction_info
# ----------------------------
#
DROP TABLE IF EXISTS `jurisdiction_info`;
select * from jurisdiction_info;
CREATE TABLE `jurisdiction_info` (
  `jurisdiction_id` int(11) NOT NULL AUTO_INCREMENT,
  `jurisdiction_name` varchar(20) NOT NULL,
  PRIMARY KEY (`jurisdiction_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;


INSERT INTO `jurisdiction_info` VALUES ('1', '案件信息浏览');
INSERT INTO `jurisdiction_info` VALUES ('2', '案件信息修改');
INSERT INTO `jurisdiction_info` VALUES ('3', '案件信息删除');
INSERT INTO `jurisdiction_info` VALUES ('4', '权限管理');
INSERT INTO `jurisdiction_info` VALUES ('5', '日志监控');
INSERT INTO `jurisdiction_info` VALUES ('6', '案件信息备份/恢复');
INSERT INTO `jurisdiction_info` VALUES ('7', '文件上传/下载');

#--4.用户与权限关系表
# ----------------------------
# Table structure for user_jurisdiction_info
# ----------------------------
DROP TABLE IF EXISTS `user_jurisdiction_info`;
select * from user_jurisdiction_info;
CREATE TABLE `user_jurisdiction_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `jurisdiction_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;


INSERT INTO `user_jurisdiction_info` VALUES ('1', '1', '1');
INSERT INTO `user_jurisdiction_info` VALUES ('2', '1', '2');
INSERT INTO `user_jurisdiction_info` VALUES ('3', '1', '3');
INSERT INTO `user_jurisdiction_info` VALUES ('4', '1', '4');
INSERT INTO `user_jurisdiction_info` VALUES ('5', '1', '5');
INSERT INTO `user_jurisdiction_info` VALUES ('6', '1', '6');
INSERT INTO `user_jurisdiction_info` VALUES ('7', '1', '7');
INSERT INTO `user_jurisdiction_info` VALUES ('8', '2', '1');
INSERT INTO `user_jurisdiction_info` VALUES ('9', '3', '1');
INSERT INTO `user_jurisdiction_info` VALUES ('10', '3', '2');

#--用户与权限关联查询
use public_security;
select ui.user_id,ui.login_name,ui.login_password,ui.police_id,ui.police_name,ui.create_time,ui.delete_time,ui.user_status,ji.jurisdiction_id,ji.jurisdiction_name 
from user_info ui left join user_jurisdiction_info uji on ui.user_id=uji.user_id 
left join jurisdiction_info ji on uji.jurisdiction_id=ji.jurisdiction_id;

#--5.公安局表
# ----------------------------
# Table structure for public_security
# ----------------------------
DROP TABLE IF EXISTS `public_security`;
select * from public_security;
CREATE TABLE `public_security` (
  `ps_id` int(11) NOT NULL AUTO_INCREMENT,
  `ps_name` varchar(20) NOT NULL,
  `ps_telephone` varchar(13) NOT NULL,
  `ps_address` varchar(50) NOT NULL,
  `ps_leader_name` varchar(20) NOT NULL,
  PRIMARY KEY (`ps_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;


INSERT INTO `public_security` VALUES ('1', '大连市甘井子分局', '0411-80000001', '大连市甘井子区XXX路', '宋存宝');
INSERT INTO `public_security` VALUES ('2', '大连市沙河口分局', '0411-80000002', '大连市沙河口XX路', '白文凯');
INSERT INTO `public_security` VALUES ('3', '大连市西岗区分局', '0411-80000003', '大连市西岗区XXX路', '余思言');
INSERT INTO `public_security` VALUES ('4', '大连市中山区分局', '0411-80000004', '大连市中山区XX街XX路', '王钢蛋');
INSERT INTO `public_security` VALUES ('5', '大连市开发区分区', '0411-80000005', '大连市开发区五彩城', '何磊');

#--6.警员表
# ----------------------------
# Table structure for policeman_info
# ----------------------------
DROP TABLE IF EXISTS `policeman_info`;
CREATE TABLE `policeman_info` (
  `policeman_id` int(11) NOT NULL AUTO_INCREMENT,
  `policeman_name` varchar(20) NOT NULL,
  `policeman_gender` char(1) NOT NULL,
  `policeman_age` int(11) NOT NULL,
  `policeman_address` varchar(50) NOT NULL,
  `policeman_type` char(1) NOT NULL,
  `ps_id` int(11) NOT NULL,
  PRIMARY KEY (`policeman_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;


INSERT INTO `policeman_info` VALUES ('1', '王老大', '1', '24', '大连市泡崖子玉山二街', '0', '5');
INSERT INTO `policeman_info` VALUES ('2', '李老二', '1', '33', '大连市中山区昆明街', '1', '1');
INSERT INTO `policeman_info` VALUES ('3', '赵老六', '1', '55', '大连市西岗区唐山街松山寺', '2', '2');
INSERT INTO `policeman_info` VALUES ('4', '宋小花', '0', '19', '大连市开发区五彩城', '3', '3');
INSERT INTO `policeman_info` VALUES ('5', '诸葛花圈', '0', '22', '大连市马栏河', '2', '4');
INSERT INTO `policeman_info` VALUES ('6', '西门边框', '1', '22', '大连市长海县大长山岛', '1', '2');
INSERT INTO `policeman_info` VALUES ('7', '公孙提灯', '1', '28', '大连市沙河口区软件园', '0', '3');

#--警员与警局关联查询
use public_security;
select * from policeman_info pi left join public_security ps on pi.ps_id=ps.ps_id;

#--7.民族表
# ----------------------------
# Table structure for nation_info
# ----------------------------
DROP TABLE IF EXISTS `nation_info`;
CREATE TABLE `nation_info` (
  `nation_id` int(11) NOT NULL AUTO_INCREMENT,
  `nation_name` varchar(10) NOT NULL,
  PRIMARY KEY (`nation_id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;


INSERT INTO `nation_info` VALUES ('1', '汉族');
INSERT INTO `nation_info` VALUES ('2', '壮族');
INSERT INTO `nation_info` VALUES ('3', '满族');
INSERT INTO `nation_info` VALUES ('4', '回族');
INSERT INTO `nation_info` VALUES ('5', '苗族');
INSERT INTO `nation_info` VALUES ('6', '维吾尔族');
INSERT INTO `nation_info` VALUES ('7', '土家族');
INSERT INTO `nation_info` VALUES ('8', '彝族');
INSERT INTO `nation_info` VALUES ('9', '蒙古族');
INSERT INTO `nation_info` VALUES ('10', '藏族');
INSERT INTO `nation_info` VALUES ('11', '布依族');
INSERT INTO `nation_info` VALUES ('12', '侗族');
INSERT INTO `nation_info` VALUES ('13', '瑶族');
INSERT INTO `nation_info` VALUES ('14', '朝鲜族');
INSERT INTO `nation_info` VALUES ('15', '白族');
INSERT INTO `nation_info` VALUES ('16', '哈尼族');
INSERT INTO `nation_info` VALUES ('17', '哈萨克族');
INSERT INTO `nation_info` VALUES ('18', '黎族');
INSERT INTO `nation_info` VALUES ('19', '傣族');
INSERT INTO `nation_info` VALUES ('20', '畲族');
INSERT INTO `nation_info` VALUES ('21', '傈僳族');
INSERT INTO `nation_info` VALUES ('22', '仡佬族');
INSERT INTO `nation_info` VALUES ('23', '东乡族');
INSERT INTO `nation_info` VALUES ('24', '高山族');
INSERT INTO `nation_info` VALUES ('25', '拉祜族');
INSERT INTO `nation_info` VALUES ('26', '水族');
INSERT INTO `nation_info` VALUES ('27', '佤族');
INSERT INTO `nation_info` VALUES ('28', '纳西族');
INSERT INTO `nation_info` VALUES ('29', '羌族');
INSERT INTO `nation_info` VALUES ('30', '土族');
INSERT INTO `nation_info` VALUES ('31', '仫佬族');
INSERT INTO `nation_info` VALUES ('32', '锡伯族');
INSERT INTO `nation_info` VALUES ('33', '柯尔克孜族');
INSERT INTO `nation_info` VALUES ('34', '达斡尔族');
INSERT INTO `nation_info` VALUES ('35', '景颇族');
INSERT INTO `nation_info` VALUES ('36', '毛南族');
INSERT INTO `nation_info` VALUES ('37', '撒拉族');
INSERT INTO `nation_info` VALUES ('38', '塔吉克族');
INSERT INTO `nation_info` VALUES ('39', '阿昌族');
INSERT INTO `nation_info` VALUES ('40', '普米族');
INSERT INTO `nation_info` VALUES ('41', '鄂温克族');
INSERT INTO `nation_info` VALUES ('42', '怒族');
INSERT INTO `nation_info` VALUES ('43', '京族');
INSERT INTO `nation_info` VALUES ('44', '基诺族');
INSERT INTO `nation_info` VALUES ('45', '德昂族');
INSERT INTO `nation_info` VALUES ('46', '保安族');
INSERT INTO `nation_info` VALUES ('47', '俄罗斯族');
INSERT INTO `nation_info` VALUES ('48', '裕固族');
INSERT INTO `nation_info` VALUES ('49', '乌兹别克族');
INSERT INTO `nation_info` VALUES ('50', '门巴族');
INSERT INTO `nation_info` VALUES ('51', '鄂伦春族');
INSERT INTO `nation_info` VALUES ('52', '独龙族');
INSERT INTO `nation_info` VALUES ('53', '塔塔尔族');
INSERT INTO `nation_info` VALUES ('54', '赫哲族');
INSERT INTO `nation_info` VALUES ('55', '珞巴族');
INSERT INTO `nation_info` VALUES ('56', '布朗族');

#--8.公民表
# ----------------------------
# Table structure for citizen_info
# ----------------------------
DROP TABLE IF EXISTS `citizen_info`;
CREATE TABLE `citizen_info` (
  `id_card` char(18) NOT NULL,
  `id_name` varchar(20) NOT NULL,
  `id_age` int(11) NOT NULL,
  `id_gender` char(1) NOT NULL,
  `id_birthday` date NOT NULL,
  `id_address` varchar(100) NOT NULL,
  `id_professional` varchar(20) NOT NULL,
  `id_company` varchar(50) NOT NULL,
  `nation_id` int(11) NOT NULL,
  PRIMARY KEY (`id_card`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `citizen_info` VALUES ('210203199201315257', 'sbxmz', '12', '1', '2017-01-18', '大连市沙河口区软景美食城', '矿工', '元老矿业', '50');
INSERT INTO `citizen_info` VALUES ('210203199301315266', '宋明国', '2', '1', '2016-01-01', '黑龙江省漠河', '试菜员', '街上羊汤', '2');
INSERT INTO `citizen_info` VALUES ('210203199301315276', '高大姨', '28', '0', '1990-05-05', '甘肃省兰州市拉面馆', '厨师', '西北马记牛肉面', '5');
INSERT INTO `citizen_info` VALUES ('210203199301315277', '王旭来', '24', '1', '1993-01-31', '大连市沙河口区泡崖子玉山二街', '程序员', '雨琳', '1');
INSERT INTO `citizen_info` VALUES ('210203199304121896', '刘大力', '19', '0', '1993-04-12', '大连市中山区劳动公园', '销售员', '安利', '16');
INSERT INTO `citizen_info` VALUES ('210203199304121891', '刘小力', '19', '0', '1993-04-12', '大连市中山区劳动公园', '销售员', '安利', '16');
INSERT INTO `citizen_info` VALUES ('210203199304121892', '刘中力', '19', '0', '1993-04-12', '大连市中山区劳动公园', '销售员', '安利', '16');
INSERT INTO `citizen_info` VALUES ('210203199304121893', '刘巨力', '19', '0', '1993-04-12', '大连市中山区劳动公园', '销售员', '安利', '16');
INSERT INTO `citizen_info` VALUES ('210203199304121894', '刘没力', '19', '0', '1993-04-12', '大连市中山区劳动公园', '销售员', '安利', '16');
INSERT INTO `citizen_info` VALUES ('210203199304121812', '张受害', '19', '0', '1993-04-12', '大连市中山区劳动公园', '销售员', '安利', '16');
INSERT INTO `citizen_info` VALUES ('210203199304121831', '刘受害', '19', '0', '1993-04-12', '大连市中山区劳动公园', '销售员', '安利', '16');

#--公民表与民族表关联查询
use public_security;
select * from citizen_info ci left join nation_info ni on ci.nation_id=ni.nation_id;

#--9.治安、行政处罚表
# ----------------------------
# Table structure for punishment_info
# ----------------------------
DROP TABLE IF EXISTS `punishment_info`;
CREATE TABLE `punishment_info` (
  `punishment_id` int(11) NOT NULL AUTO_INCREMENT,
  `punishment_situation` varchar(500) NOT NULL,
  `punishment_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `id_card` char(18) NOT NULL,
  `ps_id` int(11) NOT NULL,
  `case_id` int(11) NOT NULL,
  PRIMARY KEY (`punishment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


INSERT INTO `punishment_info` VALUES ('1', '行政拘留五百年', '2017-01-12 08:59:31', '210203199201315257', '1', '1');
INSERT INTO `punishment_info` VALUES ('2', '有期徒刑好几十年', '2017-01-12 09:00:30', '210203199301315276', '2', '2');

#--10.违法人员信息表
# ----------------------------
# Table structure for illegal_info
# ----------------------------
DROP TABLE IF EXISTS `illegal_info`;
CREATE TABLE `illegal_info` (
  `illegal_id` int(11) NOT NULL AUTO_INCREMENT,
  `id_card` char(18) NOT NULL,
  `case_id` int(11) NOT NULL,
  PRIMARY KEY (`illegal_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


INSERT INTO `illegal_info` VALUES ('1', '210203199201315257', '1');
INSERT INTO `illegal_info` VALUES ('2', '210203199301315276', '2');

#--11.受害人信息表
# ----------------------------
# Table structure for victim_info
# ----------------------------
#
DROP TABLE IF EXISTS `victim_info`;
CREATE TABLE `victim_info` (
  `victim_id` int(11) NOT NULL AUTO_INCREMENT,
  `id_card` char(18) NOT NULL,
  `case_id` int(11) NOT NULL,
  PRIMARY KEY (`victim_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


INSERT INTO `victim_info` VALUES ('1', '210203199304121812', '1');
INSERT INTO `victim_info` VALUES ('2', '210203199304121831', '2');

#--12.嫌疑人信息表
# ----------------------------
# Table structure for suspect_info
# ----------------------------
#
DROP TABLE IF EXISTS `suspect_info`;
CREATE TABLE `suspect_info` (
  `suspect_id` int(11) NOT NULL AUTO_INCREMENT,
  `suspect_inttime` timestamp NULL DEFAULT NULL,
  `suspect_outtime` timestamp NULL DEFAULT NULL,
  `handle_condition` int(11) NOT NULL,
  `id_card` char(18) NOT NULL,
  `case_id` int(11) NOT NULL,
  PRIMARY KEY (`suspect_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


INSERT INTO `suspect_info` VALUES ('1', '2017-01-01 09:25:26', null, '3', '210203199304121896', '3');
INSERT INTO `suspect_info` VALUES ('2', '2017-01-08 09:25:35', null, '3', '210203199304121891', '4');

#--13.其它案件登记表
# ----------------------------
# Table structure for other_case
# ----------------------------
DROP TABLE IF EXISTS `other_case`;
CREATE TABLE `other_case` (
  `other_id` int(11) NOT NULL AUTO_INCREMENT,
  `other_content` varchar(500) NOT NULL,
  `other_handle` varchar(500) NOT NULL,
  `alarm_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `alarm_place` varchar(200) NOT NULL,
  `other_result` varchar(500) NOT NULL,
  `alarm_id` int(11) NOT NULL,
  PRIMARY KEY (`other_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


INSERT INTO `other_case` VALUES ('1', '耍流氓', '抓起来', '2017-01-13 14:34:44', '金百合', '处理1', '0');
INSERT INTO `other_case` VALUES ('2', '偷钱包', '先打一顿', '2017-01-13 14:34:47', '天池', '处理2', '0');

#--14.救助服务登记表
# ----------------------------
# Table structure for help_service
# ----------------------------
#
DROP TABLE IF EXISTS `help_service`;
CREATE TABLE `help_service` (
  `help_id` int(11) NOT NULL AUTO_INCREMENT,
  `help_name` varchar(50) NOT NULL,
  `behelp_name` varchar(50) NOT NULL,
  `alarm_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `alarm_place` varchar(200) NOT NULL,
  `help_content` varchar(500) NOT NULL,
  `alarm_id` int(11) NOT NULL,
  PRIMARY KEY (`help_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


INSERT INTO `help_service` VALUES ('1', '雨琳信息有限公司', '西岗区分局', '2017-01-13 14:28:29', '软件园', '门锁死打不开', '0');
INSERT INTO `help_service` VALUES ('2', '江南皮革厂', '中山分局', '2017-01-13 14:28:31', '大菜市', '老板带着小姨子跑了', '0');

#--15.民事纠纷案件登记表
# ----------------------------
# Table structure for civil_dispute
# ----------------------------
#
DROP TABLE IF EXISTS `civil_dispute`;
CREATE TABLE `civil_dispute` (
  `civil_dispute` int(11) NOT NULL AUTO_INCREMENT,
  `first_party` varchar(50) NOT NULL,
  `second_party` varchar(50) NOT NULL,
  `alarm_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `alarm_place` varchar(200) NOT NULL,
  `civil_reason` varchar(500) NOT NULL,
  `civil_result` varchar(500) NOT NULL,
  `case_id` int(11) NOT NULL,
  PRIMARY KEY (`civil_dispute`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


INSERT INTO `civil_dispute` VALUES ('1', '蟹老板', '王欢', '2017-01-13 14:30:58', '如家302', '家庭暴力', '和解', '9');
INSERT INTO `civil_dispute` VALUES ('2', '鸠摩智', '电竞俱乐部', '2017-01-13 14:31:04', '软件园', '没带身份证非要上网', '就不让上网', '10');


#--16.刑事案件登记表
# ----------------------------
# Table structure for criminal_info
# ----------------------------
#
DROP TABLE IF EXISTS `criminal_info`;
select * from criminal_info;
CREATE TABLE `criminal_info` (
  `criminal_id` int(11) NOT NULL AUTO_INCREMENT,
  `supply_info` varchar(500) NOT NULL,
  `criminal_situation` varchar(500) DEFAULT NULL,
  `case_supply` varchar(500) DEFAULT NULL,
  `criminal_result` varchar(500) NOT NULL,
  `case_id` int(11) NOT NULL,
  PRIMARY KEY (`criminal_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


INSERT INTO `criminal_info` VALUES ('1', '买菜不给钱', 'xxxx', '拿了就跑', '刑事拘留', '11');
INSERT INTO `criminal_info` VALUES ('2', '勒索', 'aaaaaa', 'qqq', '刑事拘留', '12');


#--17.治安案件登记表
# ----------------------------
# Table structure for security_info
# ----------------------------
#
DROP TABLE IF EXISTS `security_info`;
CREATE TABLE `security_info` (
  `security_id` int(11) NOT NULL AUTO_INCREMENT,
  `supply_info` varchar(500) NOT NULL,
  `security_result` varchar(500) NOT NULL,
  `fine_id` int(11) DEFAULT NULL,
  `case_id` int(11) NOT NULL,
  PRIMARY KEY (`security_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


INSERT INTO `security_info` VALUES ('1', '占道经营', '没收', '2', '13');
INSERT INTO `security_info` VALUES ('2', '非法集会', '驱散', null, '14');


#--18.未及时破案说明书
# ----------------------------
# Table structure for case_later
# ----------------------------
#
DROP TABLE IF EXISTS `case_later`;
select * from case_later;
CREATE TABLE `case_later` (
  `case_later_id` int(11) NOT NULL AUTO_INCREMENT,
  `later_reason` varchar(500) NOT NULL,
  `supply_info` varchar(500) DEFAULT NULL,
  `case_id` int(11) NOT NULL,
  PRIMARY KEY (`case_later_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

INSERT INTO `case_later` VALUES ('1', '嫌疑人潜逃', '跑了', '15');
INSERT INTO `case_later` VALUES ('2', '犯罪人有背景', '背后有人，不好惹', '16');

#--19.刑事案件报告表
# ----------------------------
# Table structure for criminal_report
# ----------------------------
#
DROP TABLE IF EXISTS `criminal_report`;
select * from criminal_report;
CREATE TABLE `criminal_report` (
  `criminal_report_id` int(11) NOT NULL AUTO_INCREMENT,
  `case_report` varchar(500) NOT NULL,
  `report_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `case_id` int(11) NOT NULL,
  PRIMARY KEY (`criminal_report_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


INSERT INTO `criminal_report` VALUES ('1', '刑事案件报告11', '2017-01-12 10:43:44', '17');
INSERT INTO `criminal_report` VALUES ('2', '刑事案件报告22', '2017-01-12 10:43:57', '18');

#--20.追缴、罚没、扣押登记表
# ----------------------------
# Table structure for fine_info
# ----------------------------
DROP TABLE IF EXISTS `fine_info`;
select * from fine_info;
CREATE TABLE `fine_info` (
  `fine_id` int(11) NOT NULL AUTO_INCREMENT,
  `fine_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fine_type` int(11) NOT NULL,
  `fine_character` varchar(100) NOT NULL,
  `fine_reason` varchar(500) NOT NULL,
  `id_card` char(18) NOT NULL,
  `policeman_id` int(11) NOT NULL,
  `case_id` int(11) NOT NULL,
  PRIMARY KEY (`fine_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

INSERT INTO `fine_info` VALUES ('1', '2017-01-05 10:53:11', '0', '呲水枪', '瞎几把呲', '210203199301315266', '7', '19');
INSERT INTO `fine_info` VALUES ('2', '2016-12-29 10:55:35', '1', '手斧', '破坏公务', '210203199304121891', '6', '20');

#--21.立案告知书
# ----------------------------
# Table structure for case_notify
# ----------------------------
DROP TABLE IF EXISTS `case_notify`;
CREATE TABLE `case_notify` (
  `case_notify_id` int(11) NOT NULL AUTO_INCREMENT,
  `benotified_name` varchar(20) NOT NULL,
  `alarm_address` varchar(200) NOT NULL,
  `case_notify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `case_notify_consider` varchar(50) NOT NULL,
  `case_id` int(11) NOT NULL,
  PRIMARY KEY (`case_notify_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

INSERT INTO `case_notify` VALUES ('1', '被告知人姓名1', '被告知人地址1', '2017-01-12 11:09:29', '认为1111', '21');
INSERT INTO `case_notify` VALUES ('2', '被告知人姓名2', '被告知人地址2', '2017-01-12 11:10:32', '认为222', '22');

#--22.接受案件回执表
# ----------------------------
# Table structure for accept_case
# ----------------------------
DROP TABLE IF EXISTS `accept_case`;
select * from accept_case;
CREATE TABLE `accept_case` (
  `case_id` int(11) NOT NULL AUTO_INCREMENT,
  `case_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `case_place` varchar(200) NOT NULL,
  `place_case_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `case_name` varchar(100) NOT NULL,
  `dept_id` int(11) NOT NULL,
  `policeman_id` int(11) NOT NULL,
  `ps_id` int(11) NOT NULL,
  `alarm_id` int(11) NOT NULL,
  PRIMARY KEY (`case_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


INSERT INTO `accept_case` VALUES ('1', '2017-01-13 14:09:57', '数码路', '2016-12-29 14:09:18', '数码路抢劫案', '1', '2', '2', '2');
INSERT INTO `accept_case` VALUES ('2', '2017-01-13 14:10:06', '软件园路', '2016-12-27 14:09:22', '软件园路强奸案', '1', '3', '2', '2');

#--23.接处警登记表
#-- ----------------------------
#-- Table structure for alarm_info
#-- ----------------------------
DROP TABLE IF EXISTS `alarm_info`;
CREATE TABLE `alarm_info` (
  `alarm_id` int(11) NOT NULL AUTO_INCREMENT,
  `alarm_name` varchar(20) NOT NULL,
  `alarm_gender` char(1) NOT NULL,
  `alarm_telephone` varchar(13) NOT NULL,
  `alarm_address` varchar(100) NOT NULL,
  `alarm_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `alarm_format` int(11) NOT NULL,
  `alarm_content` varchar(500) NOT NULL,
  `alarm_case_time` timestamp NULL DEFAULT NULL,
  `alarm_place` varchar(100) NOT NULL,
  `reception_policeman` int(11) NOT NULL,
  `handle_situation` varchar(500) NOT NULL,
  `handle_policeman` int(11) NOT NULL,
  `loss_siuation` varchar(200) NOT NULL,
  `death_number` int(11) NOT NULL,
  `injured_number` int(11) NOT NULL,
  `economic_loss` double NOT NULL,
  `handle_result` int(11) NOT NULL,
  `duty_leader` int(11) NOT NULL,
  PRIMARY KEY (`alarm_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


INSERT INTO `alarm_info` VALUES ('1', '郝力来', '1', '18698688666', '中南海', '2017-01-13 14:03:02', '0', '有人非礼', '2016-12-25 14:02:21', '软件园B8', '2', '处警情况', '2', '损失xxxx', '100', '500', '15', '0', '3');
INSERT INTO `alarm_info` VALUES ('2', '郝力来2', '1', '18698688665', '瓦房店', '2017-01-13 14:03:18', '0', '有人非礼', '2016-12-26 14:02:27', '金百合洗浴中心', '2', '处警情况', '2', '损失xxxx', '100', '500', '15', '0', '3');
INSERT INTO `alarm_info` VALUES ('3', '郝力来3', '1', '18698688664', '庄河北站', '2017-01-13 14:03:34', '0', '有人非礼', '2016-12-26 14:02:31', '龙池', '2', '处警情况', '2', '损失xxxx', '100', '500', '15', '0', '3');


#--24.日志信息表
# ----------------------------
# Table structure for log_info
# ----------------------------
DROP TABLE IF EXISTS `log_info`;
CREATE TABLE `log_info` (
  `log_id` int(11) NOT NULL AUTO_INCREMENT,
  `log_msg` varchar(500) NOT NULL,
  `log_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `log_info`(log_msg,user_id) values('log测试*****',1);

#--25.部门表
#-- ----------------------------
#-- Table structure for dept
#-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `dept_id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(255) NOT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;


INSERT INTO `dept` VALUES ('1', '部门1');
INSERT INTO `dept` VALUES ('2', '部门2');
INSERT INTO `dept` VALUES ('3', '部门3');
INSERT INTO `dept` VALUES ('4', '部门4');
INSERT INTO `dept` VALUES ('5', '部门5');
















