package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiesuandingdanEntity;
import com.entity.view.JiesuandingdanView;

import com.service.JiesuandingdanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 结算订单
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-08 10:53:03
 */
@RestController
@RequestMapping("/jiesuandingdan")
public class JiesuandingdanController {
    @Autowired
    private JiesuandingdanService jiesuandingdanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiesuandingdanEntity jiesuandingdan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("weishengshi")) {
			jiesuandingdan.setWeishengshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiesuandingdanEntity> ew = new EntityWrapper<JiesuandingdanEntity>();
		PageUtils page = jiesuandingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiesuandingdan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiesuandingdanEntity jiesuandingdan, HttpServletRequest request){
        EntityWrapper<JiesuandingdanEntity> ew = new EntityWrapper<JiesuandingdanEntity>();
		PageUtils page = jiesuandingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiesuandingdan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiesuandingdanEntity jiesuandingdan){
       	EntityWrapper<JiesuandingdanEntity> ew = new EntityWrapper<JiesuandingdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiesuandingdan, "jiesuandingdan")); 
        return R.ok().put("data", jiesuandingdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiesuandingdanEntity jiesuandingdan){
        EntityWrapper< JiesuandingdanEntity> ew = new EntityWrapper< JiesuandingdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiesuandingdan, "jiesuandingdan")); 
		JiesuandingdanView jiesuandingdanView =  jiesuandingdanService.selectView(ew);
		return R.ok("查询结算订单成功").put("data", jiesuandingdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiesuandingdanEntity jiesuandingdan = jiesuandingdanService.selectById(id);
        return R.ok().put("data", jiesuandingdan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiesuandingdanEntity jiesuandingdan = jiesuandingdanService.selectById(id);
        return R.ok().put("data", jiesuandingdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiesuandingdanEntity jiesuandingdan, HttpServletRequest request){
    	jiesuandingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiesuandingdan);

        jiesuandingdanService.insert(jiesuandingdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiesuandingdanEntity jiesuandingdan, HttpServletRequest request){
    	jiesuandingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiesuandingdan);

        jiesuandingdanService.insert(jiesuandingdan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiesuandingdanEntity jiesuandingdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiesuandingdan);
        jiesuandingdanService.updateById(jiesuandingdan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiesuandingdanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiesuandingdanEntity> wrapper = new EntityWrapper<JiesuandingdanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("weishengshi")) {
			wrapper.eq("weishengshizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jiesuandingdanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
