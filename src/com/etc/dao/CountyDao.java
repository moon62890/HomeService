package com.etc.dao;

import java.util.List;

import com.etc.entity.County;

public interface CountyDao {
	/**
	 * 添加县/区信息
	 * @param c
	 * @return
	 */
	public boolean addCounty(County c);
	/**
	 * 查询所有县的信息
	 * @return
	 */
	public List<County> queryAllCounty();
}
