package com.etc.dao;

import java.util.List;

import com.etc.entity.Courier;

public interface CourierDao {
	/**
	 * 增加快递员信息
	 * @param courier 快递员信息
	 * @return
	 */
	public boolean addCourier(Courier courier); 
	/**
	 * 匹配 手机号码密码 /匹配 工号和密码
	 * @param account
	 * @param pwd
	 * @return
	 */
	public Courier checkAccountPwd(String account,String pwd);
	/**
	 * 修改用户名修改密码(需要匹配旧密码)
	 * @param account
	 * @param pwd
	 * @return
	 */
	public boolean updateAccountPwd(String account,String oldPwd, String newPwd);
	/**
	 * 查询所有的快递员.
	 * @return
	 */
	public List<Courier> queryAllCourier();
	
}
