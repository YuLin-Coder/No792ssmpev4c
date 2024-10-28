package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaopingongyingshangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaopingongyingshangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaopingongyingshangView;


/**
 * 药品供应商
 *
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
public interface YaopingongyingshangService extends IService<YaopingongyingshangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaopingongyingshangVO> selectListVO(Wrapper<YaopingongyingshangEntity> wrapper);
   	
   	YaopingongyingshangVO selectVO(@Param("ew") Wrapper<YaopingongyingshangEntity> wrapper);
   	
   	List<YaopingongyingshangView> selectListView(Wrapper<YaopingongyingshangEntity> wrapper);
   	
   	YaopingongyingshangView selectView(@Param("ew") Wrapper<YaopingongyingshangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaopingongyingshangEntity> wrapper);
   	
}

