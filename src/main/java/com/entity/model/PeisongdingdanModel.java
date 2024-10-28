package com.entity.model;

import com.entity.PeisongdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 配送订单
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
public class PeisongdingdanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药品图片
	 */
	
	private String yaopintupian;
		
	/**
	 * 卫生室名
	 */
	
	private String weishengshiming;
		
	/**
	 * 购买数量
	 */
	
	private Integer goumaishuliang;
		
	/**
	 * 药品价格
	 */
	
	private Integer yaopinjiage;
		
	/**
	 * 金额
	 */
	
	private Integer jine;
		
	/**
	 * 供应商账号
	 */
	
	private String gongyingshangzhanghao;
		
	/**
	 * 销售代理
	 */
	
	private String xiaoshoudaili;
		
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
	 * 设置：药品价格
	 */
	 
	public void setYaopinjiage(Integer yaopinjiage) {
		this.yaopinjiage = yaopinjiage;
	}
	
	/**
	 * 获取：药品价格
	 */
	public Integer getYaopinjiage() {
		return yaopinjiage;
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
	 * 设置：供应商账号
	 */
	 
	public void setGongyingshangzhanghao(String gongyingshangzhanghao) {
		this.gongyingshangzhanghao = gongyingshangzhanghao;
	}
	
	/**
	 * 获取：供应商账号
	 */
	public String getGongyingshangzhanghao() {
		return gongyingshangzhanghao;
	}
				
	
	/**
	 * 设置：销售代理
	 */
	 
	public void setXiaoshoudaili(String xiaoshoudaili) {
		this.xiaoshoudaili = xiaoshoudaili;
	}
	
	/**
	 * 获取：销售代理
	 */
	public String getXiaoshoudaili() {
		return xiaoshoudaili;
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
