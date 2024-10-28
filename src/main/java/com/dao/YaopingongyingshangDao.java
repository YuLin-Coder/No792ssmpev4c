package com.dao;

import com.entity.YaopingongyingshangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaopingongyingshangVO;
import com.entity.view.YaopingongyingshangView;


/**
 * 药品供应商
 * 
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
public interface YaopingongyingshangDao extends BaseMapper<YaopingongyingshangEntity> {
	
	List<YaopingongyingshangVO> selectListVO(@Param("ew") Wrapper<YaopingongyingshangEntity> wrapper);
	
	YaopingongyingshangVO selectVO(@Param("ew") Wrapper<YaopingongyingshangEntity> wrapper);
	
	List<YaopingongyingshangView> selectListView(@Param("ew") Wrapper<YaopingongyingshangEntity> wrapper);

	List<YaopingongyingshangView> selectListView(Pagination page,@Param("ew") Wrapper<YaopingongyingshangEntity> wrapper);
	
	YaopingongyingshangView selectView(@Param("ew") Wrapper<YaopingongyingshangEntity> wrapper);
	
}
