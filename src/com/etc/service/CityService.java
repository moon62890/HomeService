package com.etc.service;

import java.util.List;

import com.etc.entity.City;

public interface CityService {
	/**
	 * 添加市级信息
	 * 
	 * @param c
	 * @return
	 */
	public boolean addCity(City c);

	/**
	 * 查找所有的市
	 * 
	 * @return
	 */
	public List<City> queryAllCity();
}
