package com.entity.view;

import com.entity.JiesuandingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 结算订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
@TableName("jiesuandingdan")
public class JiesuandingdanView  extends JiesuandingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiesuandingdanView(){
	}
 
 	public JiesuandingdanView(JiesuandingdanEntity jiesuandingdanEntity){
 	try {
			BeanUtils.copyProperties(this, jiesuandingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
