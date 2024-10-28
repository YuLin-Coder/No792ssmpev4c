package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeishengshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeishengshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeishengshiView;


/**
 * 卫生室
 *
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
public interface WeishengshiService extends IService<WeishengshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeishengshiVO> selectListVO(Wrapper<WeishengshiEntity> wrapper);
   	
   	WeishengshiVO selectVO(@Param("ew") Wrapper<WeishengshiEntity> wrapper);
   	
   	List<WeishengshiView> selectListView(Wrapper<WeishengshiEntity> wrapper);
   	
   	WeishengshiView selectView(@Param("ew") Wrapper<WeishengshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeishengshiEntity> wrapper);
   	
}

