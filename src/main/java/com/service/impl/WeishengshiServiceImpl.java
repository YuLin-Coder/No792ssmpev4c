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


import com.dao.WeishengshiDao;
import com.entity.WeishengshiEntity;
import com.service.WeishengshiService;
import com.entity.vo.WeishengshiVO;
import com.entity.view.WeishengshiView;

@Service("weishengshiService")
public class WeishengshiServiceImpl extends ServiceImpl<WeishengshiDao, WeishengshiEntity> implements WeishengshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeishengshiEntity> page = this.selectPage(
                new Query<WeishengshiEntity>(params).getPage(),
                new EntityWrapper<WeishengshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeishengshiEntity> wrapper) {
		  Page<WeishengshiView> page =new Query<WeishengshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeishengshiVO> selectListVO(Wrapper<WeishengshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeishengshiVO selectVO(Wrapper<WeishengshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeishengshiView> selectListView(Wrapper<WeishengshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeishengshiView selectView(Wrapper<WeishengshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
