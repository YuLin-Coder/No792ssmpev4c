package com.dao;

import com.entity.WeishengyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeishengyuanVO;
import com.entity.view.WeishengyuanView;


/**
 * 卫生院
 * 
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
public interface WeishengyuanDao extends BaseMapper<WeishengyuanEntity> {
	
	List<WeishengyuanVO> selectListVO(@Param("ew") Wrapper<WeishengyuanEntity> wrapper);
	
	WeishengyuanVO selectVO(@Param("ew") Wrapper<WeishengyuanEntity> wrapper);
	
	List<WeishengyuanView> selectListView(@Param("ew") Wrapper<WeishengyuanEntity> wrapper);

	List<WeishengyuanView> selectListView(Pagination page,@Param("ew") Wrapper<WeishengyuanEntity> wrapper);
	
	WeishengyuanView selectView(@Param("ew") Wrapper<WeishengyuanEntity> wrapper);
	
}
