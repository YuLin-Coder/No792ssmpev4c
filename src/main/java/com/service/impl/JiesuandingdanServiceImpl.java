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


import com.dao.JiesuandingdanDao;
import com.entity.JiesuandingdanEntity;
import com.service.JiesuandingdanService;
import com.entity.vo.JiesuandingdanVO;
import com.entity.view.JiesuandingdanView;

@Service("jiesuandingdanService")
public class JiesuandingdanServiceImpl extends ServiceImpl<JiesuandingdanDao, JiesuandingdanEntity> implements JiesuandingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiesuandingdanEntity> page = this.selectPage(
                new Query<JiesuandingdanEntity>(params).getPage(),
                new EntityWrapper<JiesuandingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiesuandingdanEntity> wrapper) {
		  Page<JiesuandingdanView> page =new Query<JiesuandingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiesuandingdanVO> selectListVO(Wrapper<JiesuandingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiesuandingdanVO selectVO(Wrapper<JiesuandingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiesuandingdanView> selectListView(Wrapper<JiesuandingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiesuandingdanView selectView(Wrapper<JiesuandingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
