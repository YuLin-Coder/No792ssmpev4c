package com.dao;

import com.entity.JiesuandingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiesuandingdanVO;
import com.entity.view.JiesuandingdanView;


/**
 * 结算订单
 * 
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
public interface JiesuandingdanDao extends BaseMapper<JiesuandingdanEntity> {
	
	List<JiesuandingdanVO> selectListVO(@Param("ew") Wrapper<JiesuandingdanEntity> wrapper);
	
	JiesuandingdanVO selectVO(@Param("ew") Wrapper<JiesuandingdanEntity> wrapper);
	
	List<JiesuandingdanView> selectListView(@Param("ew") Wrapper<JiesuandingdanEntity> wrapper);

	List<JiesuandingdanView> selectListView(Pagination page,@Param("ew") Wrapper<JiesuandingdanEntity> wrapper);
	
	JiesuandingdanView selectView(@Param("ew") Wrapper<JiesuandingdanEntity> wrapper);
	
}
