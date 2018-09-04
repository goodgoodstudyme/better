package com.qcl.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 登录用户信息表
 * 
 * @author 	liulinchun
 * @email 	llcdukes0613@163.com
 * @date 	2018-06-12
 */

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long iUserid; // 用户id
	
	private String vUsername; // 登录账号
	
	private String vPassword; // 账号密码
	
	private String vSalt; // 口令
	
	private String iCompanyid; // 企业id
	
	private String iDepartmentid; // 部门id
	
	private String vPhone; // 联系手机
	
	private String vMobile; // 联系电话
	
	private String vAddress; // 企业营业地址
	
	private String vFax; // 传真
	
	private String vEmail; // 联系邮箱
	
	private String vWechart; // 微信号
	
	private Long vCreateUserId; // 创建人id
	
	private String vUserIcon; // 操作员头像地址
	public String getvUserIcon() {
		return vUserIcon;
	}
	public void setvUserIcon(String vUserIcon) {
		this.vUserIcon = vUserIcon;
	}
	/**
	 * 状态  0:离线 1:在线  2 注销
	 */
	private String vStatus; // 登录状态

	/**
	 * 角色ID列表
	 */
	private List<Long> roleIdList;


	public List<Long> getRoleIdList() {
		return roleIdList;
	}
	public void setRoleIdList(List<Long> roleIdList) {
		this.roleIdList = roleIdList;
	}
	/**
	 * 设置：用户id
	 */
	public void setIUserid(Long iUserid) {
		this.iUserid = iUserid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getIUserid() {
		return iUserid;
	}

	/**
	 * 设置：登录账号
	 */
	public void setVUsername(String vUsername) {
		this.vUsername = vUsername;
	}
	/**
	 * 获取：登录账号
	 */
	public String getVUsername() {
		return vUsername;
	}

	/**
	 * 设置：账号密码
	 */
	public void setVPassword(String vPassword) {
		this.vPassword = vPassword;
	}
	/**
	 * 获取：账号密码
	 */
	public String getVPassword() {
		return vPassword;
	}

	/**
	 * 设置：
	 */
	public void setVSalt(String vSalt) {
		this.vSalt = vSalt;
	}
	/**
	 * 获取：
	 */
	public String getVSalt() {
		return vSalt;
	}

	/**
	 * 设置：企业id
	 */
	public void setICompanyid(String iCompanyid) {
		this.iCompanyid = iCompanyid;
	}
	/**
	 * 获取：企业id
	 */
	public String getICompanyid() {
		return iCompanyid;
	}

	/**
	 * 设置：部门id
	 */
	public void setIDepartmentid(String iDepartmentid) {
		this.iDepartmentid = iDepartmentid;
	}
	/**
	 * 获取：部门id
	 */
	public String getIDepartmentid() {
		return iDepartmentid;
	}

	/**
	 * 设置：联系手机
	 */
	public void setVPhone(String vPhone) {
		this.vPhone = vPhone;
	}
	/**
	 * 获取：联系手机
	 */
	public String getVPhone() {
		return vPhone;
	}

	/**
	 * 设置：联系电话
	 */
	public void setVMobile(String vMobile) {
		this.vMobile = vMobile;
	}
	/**
	 * 获取：联系电话
	 */
	public String getVMobile() {
		return vMobile;
	}

	/**
	 * 设置：企业营业地址
	 */
	public void setVAddress(String vAddress) {
		this.vAddress = vAddress;
	}
	/**
	 * 获取：企业营业地址
	 */
	public String getVAddress() {
		return vAddress;
	}

	/**
	 * 设置：传真
	 */
	public void setVFax(String vFax) {
		this.vFax = vFax;
	}
	/**
	 * 获取：传真
	 */
	public String getVFax() {
		return vFax;
	}

	/**
	 * 设置：联系邮箱
	 */
	public void setVEmail(String vEmail) {
		this.vEmail = vEmail;
	}
	/**
	 * 获取：联系邮箱
	 */
	public String getVEmail() {
		return vEmail;
	}

	/**
	 * 设置：微信号
	 */
	public void setVWechart(String vWechart) {
		this.vWechart = vWechart;
	}
	/**
	 * 获取：微信号
	 */
	public String getVWechart() {
		return vWechart;
	}

	/**
	 * 设置：
	 */
	public void setVCreateUserId(Long vCreateUserId) {
		this.vCreateUserId = vCreateUserId;
	}
	/**
	 * 获取：
	 */
	public Long getVCreateUserId() {
		return vCreateUserId;
	}

	/**
	 * 设置：登录状态
	 */
	public void setVStatus(String vStatus) {
		this.vStatus = vStatus;
	}
	/**
	 * 获取：登录状态
	 */
	public String getVStatus() {
		return vStatus;
	}
	@Override
	public String toString() {
		return "User [iUserid=" + iUserid + ", vUsername=" + vUsername + ", vPassword=" + vPassword + ", vSalt=" + vSalt
				+ ", iCompanyid=" + iCompanyid + ", iDepartmentid=" + iDepartmentid + ", vPhone=" + vPhone
				+ ", vMobile=" + vMobile + ", vAddress=" + vAddress + ", vFax=" + vFax + ", vEmail=" + vEmail
				+ ", vWechart=" + vWechart + ", vCreateUserId=" + vCreateUserId + ", vUserIcon=" + vUserIcon
				+ ", vStatus=" + vStatus + ", roleIdList=" + roleIdList + "]";
	}
	
	
}
