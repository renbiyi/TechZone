set names utf8;

CREATE TABLE `tb_user` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `enabled` tinyint(3) NOT NULL COMMENT '是否开启：1-开启 0-关闭',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

CREATE TABLE `tb_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `name` varchar(50) NOT NULL COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色信息表';

CREATE TABLE `tb_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `role_id` bigint(20) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户-角色对应表';

CREATE TABLE `tb_resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `url` varchar(255) NOT NULL COMMENT 'url',
  `auth` varchar(255) NOT NULL COMMENT '所属权限',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资源信息表';

INSERT INTO `tb_role`(`name`) VALUES ('ROLE_ADMIN'), ('ROLE_USER');