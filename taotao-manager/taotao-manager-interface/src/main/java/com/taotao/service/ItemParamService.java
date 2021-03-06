package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;

public interface ItemParamService {

    //查询规格参数模板列表
    EasyUIDataGridResult getItemParamList(Integer page, Integer rows);

    //查询某个类目的规格参数模板
    TaotaoResult getItemParamByCid(Long cid);

    //添加某个类的规格参数模板
    TaotaoResult insertItemParam(Long cid, String paramData);

    //删除规格参数模板(批量)
    TaotaoResult deleteItemParam(String ids);
}
