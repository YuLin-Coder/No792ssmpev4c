package com.dao;

import com.entity.CaigoudingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaigoudingdanVO;
import com.entity.view.CaigoudingdanView;


/**
 * 采购订单
 * 
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
public interface CaigoudingdanDao extends BaseMapper<CaigoudingdanEntity> {
	
	List<CaigoudingdanVO> selectListVO(@Param("ew") Wrapper<CaigoudingdanEntity> wrapper);
	
	CaigoudingdanVO selectVO(@Param("ew") Wrapper<CaigoudingdanEntity> wrapper);
	
	List<CaigoudingdanView> selectListView(@Param("ew") Wrapper<CaigoudingdanEntity> wrapper);

	List<CaigoudingdanView> selectListView(Pagination page,@Param("ew") Wrapper<CaigoudingdanEntity> wrapper);
	
	CaigoudingdanView selectView(@Param("ew") Wrapper<CaigoudingdanEntity> wrapper);
	
}
