package com.nomad.nomadspring.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface NomadMapper {
    @Update("CREATE TABLE IF NOT EXISTS `user`\n" +
            "(\n" +
            "    `id`       int(0)      NOT NULL AUTO_INCREMENT COMMENT \"主键\",\n" +
            "    `group_id` int(0)      NULL DEFAULT NULL COMMENT \"组号\",\n" +
            "    `username` varchar(20) NULL DEFAULT NULL COMMENT \"用户名\",\n" +
            "    `password` varchar(20) NULL DEFAULT NULL COMMENT \"密码\",\n" +
            "    PRIMARY KEY (`id`)\n" +
            ") ENGINE = InnoDB\n" +
            "  AUTO_INCREMENT = 9\n" +
            "  CHARACTER SET = utf8mb4 COMMENT =\"用于测试的用户表\";")
    boolean create();
}
