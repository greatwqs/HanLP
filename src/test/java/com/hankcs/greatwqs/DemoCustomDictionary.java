/*
 * <summary></summary>
 * <author>He Han</author>
 * <email>hankcs.cn@gmail.com</email>
 * <create-date>2014/12/9 13:04</create-date>
 *
 * <copyright file="DemoCustomDictionary.java" company="上海林原信息科技有限公司">
 * Copyright (c) 2003-2014, 上海林原信息科技有限公司. All Right Reserved, http://www.linrunsoft.com/
 * This source is subject to the LinrunSpace License. Please contact 上海林原信息科技有限公司 to get more information.
 * </copyright>
 */
package com.hankcs.greatwqs;

import java.util.Map;

import com.hankcs.hanlp.dictionary.BaseSearcher;
import com.hankcs.hanlp.dictionary.CustomDictionary;

/**
 * 演示用户词典的动态增删
 *
 * @author hankcs
 */
public class DemoCustomDictionary {
	public static void main(String[] args) {
		// 动态增加
		CustomDictionary.add("粉底");
		CustomDictionary.add("型的重");
		CustomDictionary.add("腮红");
		CustomDictionary.add("发际线");
		CustomDictionary.add("美妆生活");

		String text = "【效果胜过修容，发际线 发际线彻底改变脸型的神技！】 #论脸型的重要性# 5大技巧教你画出完美发际线 分分钟变成标准三庭五眼 彻底改变气质打造无死角电影脸！L易烫YCC的秒拍视频#日常化妆教程# ​​​​ #美妆生活# #美妆生活# #美妆生活# #美妆生活# #美妆生活# #美妆生活# #美妆生活# ​​​​"; // 怎么可能噗哈哈！

		// 首字哈希之后二分的trie树分词
		BaseSearcher searcher = CustomDictionary.getSearcher(text);
		String dfd = new String[1].toString();
		Map.Entry entry;
		while ((entry = searcher.next()) != null) {
			System.out.println("54L. entry.getKey()" + entry.getKey()+", entry.getValue()"+entry.getValue());
		}
	}
}
