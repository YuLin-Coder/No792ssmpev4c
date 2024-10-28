package com.entity.vo;

import com.entity.TuihuodingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 退货订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
public class TuihuodingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药品图片
	 */
	
	private String yaopintupian;
		
	/**
	 * 购买数量
	 */
	
	private Integer goumaishuliang;
		
	/**
	 * 金额
	 */
	
	private Integer jine;
		
	/**
	 * 退货日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tuihuoriqi;
		
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
	 * 设置：金额
	 */
	 
	public void setJine(Integer jine) {
		this.jine = jine;
	}
	
	/**
	 * 获取：金额
	 */
	public Integer getJine() {
		return jine;
	}
				
	
	/**
	 * 设置：退货日期
	 */
	 
	public void setTuihuoriqi(Date tuihuoriqi) {
		this.tuihuoriqi = tuihuoriqi;
	}
	
	/**
	 * 获取：退货日期
	 */
	public Date getTuihuoriqi() {
		return tuihuoriqi;
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
			
}
