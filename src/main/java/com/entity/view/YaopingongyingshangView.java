package com.entity.view;

import com.entity.YaopingongyingshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 药品供应商
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
@TableName("yaopingongyingshang")
public class YaopingongyingshangView  extends YaopingongyingshangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YaopingongyingshangView(){
	}
 
 	public YaopingongyingshangView(YaopingongyingshangEntity yaopingongyingshangEntity){
 	try {
			BeanUtils.copyProperties(this, yaopingongyingshangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
