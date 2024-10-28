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


import com.dao.WeishengyuanDao;
import com.entity.WeishengyuanEntity;
import com.service.WeishengyuanService;
import com.entity.vo.WeishengyuanVO;
import com.entity.view.WeishengyuanView;

@Service("weishengyuanService")
public class WeishengyuanServiceImpl extends ServiceImpl<WeishengyuanDao, WeishengyuanEntity> implements WeishengyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeishengyuanEntity> page = this.selectPage(
                new Query<WeishengyuanEntity>(params).getPage(),
                new EntityWrapper<WeishengyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeishengyuanEntity> wrapper) {
		  Page<WeishengyuanView> page =new Query<WeishengyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeishengyuanVO> selectListVO(Wrapper<WeishengyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeishengyuanVO selectVO(Wrapper<WeishengyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeishengyuanView> selectListView(Wrapper<WeishengyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeishengyuanView selectView(Wrapper<WeishengyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
