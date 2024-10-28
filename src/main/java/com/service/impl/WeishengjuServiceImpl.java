package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WeishengjuDao;
import com.entity.WeishengjuEntity;
import com.service.WeishengjuService;
import com.entity.vo.WeishengjuVO;
import com.entity.view.WeishengjuView;

@Service("weishengjuService")
public class WeishengjuServiceImpl extends ServiceImpl<WeishengjuDao, WeishengjuEntity> implements WeishengjuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeishengjuEntity> page = this.selectPage(
                new Query<WeishengjuEntity>(params).getPage(),
                new EntityWrapper<WeishengjuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeishengjuEntity> wrapper) {
		  Page<WeishengjuView> page =new Query<WeishengjuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeishengjuVO> selectListVO(Wrapper<WeishengjuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeishengjuVO selectVO(Wrapper<WeishengjuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeishengjuView> selectListView(Wrapper<WeishengjuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeishengjuView selectView(Wrapper<WeishengjuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
