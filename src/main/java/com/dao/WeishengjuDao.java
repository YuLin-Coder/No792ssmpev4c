package com.dao;

import com.entity.WeishengjuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeishengjuVO;
import com.entity.view.WeishengjuView;


/**
 * 卫生局
 * 
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
public interface WeishengjuDao extends BaseMapper<WeishengjuEntity> {
	
	List<WeishengjuVO> selectListVO(@Param("ew") Wrapper<WeishengjuEntity> wrapper);
	
	WeishengjuVO selectVO(@Param("ew") Wrapper<WeishengjuEntity> wrapper);
	
	List<WeishengjuView> selectListView(@Param("ew") Wrapper<WeishengjuEntity> wrapper);

	List<WeishengjuView> selectListView(Pagination page,@Param("ew") Wrapper<WeishengjuEntity> wrapper);
	
	WeishengjuView selectView(@Param("ew") Wrapper<WeishengjuEntity> wrapper);
	
}
