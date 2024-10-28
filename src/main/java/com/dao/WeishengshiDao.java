package com.dao;

import com.entity.WeishengshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeishengshiVO;
import com.entity.view.WeishengshiView;


/**
 * 卫生室
 * 
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
public interface WeishengshiDao extends BaseMapper<WeishengshiEntity> {
	
	List<WeishengshiVO> selectListVO(@Param("ew") Wrapper<WeishengshiEntity> wrapper);
	
	WeishengshiVO selectVO(@Param("ew") Wrapper<WeishengshiEntity> wrapper);
	
	List<WeishengshiView> selectListView(@Param("ew") Wrapper<WeishengshiEntity> wrapper);

	List<WeishengshiView> selectListView(Pagination page,@Param("ew") Wrapper<WeishengshiEntity> wrapper);
	
	WeishengshiView selectView(@Param("ew") Wrapper<WeishengshiEntity> wrapper);
	
}
