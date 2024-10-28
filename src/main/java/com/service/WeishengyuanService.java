package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeishengyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeishengyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeishengyuanView;


/**
 * 卫生院
 *
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
public interface WeishengyuanService extends IService<WeishengyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeishengyuanVO> selectListVO(Wrapper<WeishengyuanEntity> wrapper);
   	
   	WeishengyuanVO selectVO(@Param("ew") Wrapper<WeishengyuanEntity> wrapper);
   	
   	List<WeishengyuanView> selectListView(Wrapper<WeishengyuanEntity> wrapper);
   	
   	WeishengyuanView selectView(@Param("ew") Wrapper<WeishengyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeishengyuanEntity> wrapper);
   	
}

