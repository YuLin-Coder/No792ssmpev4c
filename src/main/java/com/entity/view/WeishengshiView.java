package com.entity.view;

import com.entity.WeishengshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 卫生室
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
@TableName("weishengshi")
public class WeishengshiView  extends WeishengshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeishengshiView(){
	}
 
 	public WeishengshiView(WeishengshiEntity weishengshiEntity){
 	try {
			BeanUtils.copyProperties(this, weishengshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
