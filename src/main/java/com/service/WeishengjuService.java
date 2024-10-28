package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeishengjuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeishengjuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeishengjuView;


/**
 * 卫生局
 *
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
public interface WeishengjuService extends IService<WeishengjuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeishengjuVO> selectListVO(Wrapper<WeishengjuEntity> wrapper);
   	
   	WeishengjuVO selectVO(@Param("ew") Wrapper<WeishengjuEntity> wrapper);
   	
   	List<WeishengjuView> selectListView(Wrapper<WeishengjuEntity> wrapper);
   	
   	WeishengjuView selectView(@Param("ew") Wrapper<WeishengjuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeishengjuEntity> wrapper);
   	
}

