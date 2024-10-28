package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 采购订单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
@TableName("caigoudingdan")
public class CaigoudingdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CaigoudingdanEntity() {
		
	}
	
	public CaigoudingdanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 药品名称
	 */
					
	private String yaopinmingcheng;
	
	/**
	 * 药品图片
	 */
					
	private String yaopintupian;
	
	/**
	 * 采购日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date caigouriqi;
	
	/**
	 * 购买数量
	 */
					
	private Integer goumaishuliang;
	
	/**
	 * 卫生室账号
	 */
					
	private String weishengshizhanghao;
	
	/**
	 * 负责人姓名
	 */
					
	private String fuzerenxingming;
	
	/**
	 * 卫生室名
	 */
					
	private String weishengshiming;
	
	/**
	 * 所属区域
	 */
					
	private String suoshuquyu;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：药品名称
	 */
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
	/**
	 * 设置：药品图片
	 */
	public void setYaopintupian(String yaopintupian) {
		this.yaopintupian = yaopintupian;
	}
	/**
	 * 获取：药品图片
	 */
	public String getYaopintupian() {
		return yaopintupian;
	}
	/**
	 * 设置：采购日期
	 */
	public void setCaigouriqi(Date caigouriqi) {
		this.caigouriqi = caigouriqi;
	}
	/**
	 * 获取：采购日期
	 */
	public Date getCaigouriqi() {
		return caigouriqi;
	}
	/**
	 * 设置：购买数量
	 */
	public void setGoumaishuliang(Integer goumaishuliang) {
		this.goumaishuliang = goumaishuliang;
	}
	/**
	 * 获取：购买数量
	 */
	public Integer getGoumaishuliang() {
		return goumaishuliang;
	}
	/**
	 * 设置：卫生室账号
	 */
	public void setWeishengshizhanghao(String weishengshizhanghao) {
		this.weishengshizhanghao = weishengshizhanghao;
	}
	/**
	 * 获取：卫生室账号
	 */
	public String getWeishengshizhanghao() {
		return weishengshizhanghao;
	}
	/**
	 * 设置：负责人姓名
	 */
	public void setFuzerenxingming(String fuzerenxingming) {
		this.fuzerenxingming = fuzerenxingming;
	}
	/**
	 * 获取：负责人姓名
	 */
	public String getFuzerenxingming() {
		return fuzerenxingming;
	}
	/**
	 * 设置：卫生室名
	 */
	public void setWeishengshiming(String weishengshiming) {
		this.weishengshiming = weishengshiming;
	}
	/**
	 * 获取：卫生室名
	 */
	public String getWeishengshiming() {
		return weishengshiming;
	}
	/**
	 * 设置：所属区域
	 */
	public void setSuoshuquyu(String suoshuquyu) {
		this.suoshuquyu = suoshuquyu;
	}
	/**
	 * 获取：所属区域
	 */
	public String getSuoshuquyu() {
		return suoshuquyu;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
