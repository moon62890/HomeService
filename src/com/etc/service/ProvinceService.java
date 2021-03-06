package com.etc.service;

import java.util.List;

import com.etc.entity.Province;

public interface ProvinceService {
	/**
	 * 添加省份信息
	 * 
	 * @param p
	 * @return
	 */
	public boolean addProvince(Province p);

	/**
	 * 查询所有省份信息
	 * 
	 * @return
	 */
	public List<Province> queryAllProvince();
}
