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


import com.dao.YaopingongyingshangDao;
import com.entity.YaopingongyingshangEntity;
import com.service.YaopingongyingshangService;
import com.entity.vo.YaopingongyingshangVO;
import com.entity.view.YaopingongyingshangView;

@Service("yaopingongyingshangService")
public class YaopingongyingshangServiceImpl extends ServiceImpl<YaopingongyingshangDao, YaopingongyingshangEntity> implements YaopingongyingshangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaopingongyingshangEntity> page = this.selectPage(
                new Query<YaopingongyingshangEntity>(params).getPage(),
                new EntityWrapper<YaopingongyingshangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaopingongyingshangEntity> wrapper) {
		  Page<YaopingongyingshangView> page =new Query<YaopingongyingshangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaopingongyingshangVO> selectListVO(Wrapper<YaopingongyingshangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaopingongyingshangVO selectVO(Wrapper<YaopingongyingshangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaopingongyingshangView> selectListView(Wrapper<YaopingongyingshangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaopingongyingshangView selectView(Wrapper<YaopingongyingshangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
