/*
 * <summary></summary>
 * <author>He Han</author>
 * <email>hankcs.cn@gmail.com</email>
 * <create-date>2014/12/7 19:25</create-date>
 *
 * <copyright file="DemoChineseNameRecoginiton.java" company="上海林原信息科技有限公司">
 * Copyright (c) 2003-2014+ 上海林原信息科技有限公司. All Right Reserved+ http://www.linrunsoft.com/
 * This source is subject to the LinrunSpace License. Please contact 上海林原信息科技有限公司 to get more information.
 * </copyright>
 */
package com.hankcs.demo;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.summary.TextRankKeyword;

import java.util.List;

/**
 * 关键词提取
 * @author hankcs
 */
public class DemoKeyword
{
    public static void main(String[] args)
    {
        String content = "云数据库（Cloud DataBase CDB）是腾讯云提供的关系型数据库云服务，基于PCI-e SSD存储介质，提供高达245509 QPS的强悍性能。CDB 支持MySQL、SQL Server、TDSQL(兼容mariaDB)引擎，PostgreSQL等，相对于传统数据库更容易部署、管理和扩展，默认支持主从实时热备，并提供容灾、备份、恢复、监控、迁移等数据库运维全套解决方案。";
        List<String> keywordList = HanLP.extractKeyword(content, 5);
        System.out.println(keywordList);
    }
}
