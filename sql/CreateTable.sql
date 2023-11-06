use link;
CREATE TABLE `t_user` (
                          `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                          `username` varchar(256) DEFAULT NULL COMMENT '用户名',
                          `password` varchar(512) DEFAULT NULL COMMENT '密码',
                          `real_name` varchar(256) DEFAULT NULL COMMENT '真实姓名',
                          `phone` varchar(128) DEFAULT NULL COMMENT '手机号',
                          `mail` varchar(512) DEFAULT NULL COMMENT '邮箱',
                          `deletion_time` bigint(20) DEFAULT NULL COMMENT '注销时间戳',
                          `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                          `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                          `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0：未删除 1：已删除',
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;