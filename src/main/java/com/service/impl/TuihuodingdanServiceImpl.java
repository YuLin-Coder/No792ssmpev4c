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


import com.dao.TuihuodingdanDao;
import com.entity.TuihuodingdanEntity;
import com.service.TuihuodingdanService;
import com.entity.vo.TuihuodingdanVO;
import com.entity.view.TuihuodingdanView;

@Service("tuihuodingdanService")
public class TuihuodingdanServiceImpl extends ServiceImpl<TuihuodingdanDao, TuihuodingdanEntity> implements TuihuodingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuihuodingdanEntity> page = this.selectPage(
                new Query<TuihuodingdanEntity>(params).getPage(),
                new EntityWrapper<TuihuodingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuihuodingdanEntity> wrapper) {
		  Page<TuihuodingdanView> page =new Query<TuihuodingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuihuodingdanVO> selectListVO(Wrapper<TuihuodingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuihuodingdanVO selectVO(Wrapper<TuihuodingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuihuodingdanView> selectListView(Wrapper<TuihuodingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuihuodingdanView selectView(Wrapper<TuihuodingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
