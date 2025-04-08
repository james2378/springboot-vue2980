package com.dao;

import com.entity.PinkuensjhengshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.PinkuensjhengshenqingView;

/**
 * 贫困生申请 Dao 接口
 *
 * @author 
 */
public interface PinkuensjhengshenqingDao extends BaseMapper<PinkuensjhengshenqingEntity> {

   List<PinkuensjhengshenqingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
