package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiesuandingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiesuandingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiesuandingdanView;


/**
 * 结算订单
 *
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
public interface JiesuandingdanService extends IService<JiesuandingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiesuandingdanVO> selectListVO(Wrapper<JiesuandingdanEntity> wrapper);
   	
   	JiesuandingdanVO selectVO(@Param("ew") Wrapper<JiesuandingdanEntity> wrapper);
   	
   	List<JiesuandingdanView> selectListView(Wrapper<JiesuandingdanEntity> wrapper);
   	
   	JiesuandingdanView selectView(@Param("ew") Wrapper<JiesuandingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiesuandingdanEntity> wrapper);
   	
}

