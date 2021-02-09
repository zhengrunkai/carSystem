package com.mymendian.mymendian.service;

import com.mymendian.mymendian.dao.DingdanDao;
import com.mymendian.mymendian.model.Dingdan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DingdanServiceImpl implements DingdanService {
    @Resource
    DingdanDao dingdanDao;
    @Override
    public void insertDingdan(Dingdan dingdan) {
        dingdanDao.insertDingdan(dingdan);
    }
    @Override
    public void deleteDingdan(int id) {
        dingdanDao.deleteDingdan(id);
    }
    @Override
    public void updateDingdan(Dingdan dingdan) {
        dingdanDao.updateDingdan(dingdan);
    }
    @Override
    public Dingdan findDingdanById(int id) {
        return dingdanDao.findDingdanById(id);
    }
    @Override
    public Dingdan findDingdanByDingdan_id(int dingdan_id) {
        return dingdanDao.findDingdanByDingdan_id(dingdan_id);
    }
    @Override
    public String getDingdanInit() {
        String dingdanInit="";
        List<Dingdan> scL=dingdanDao.findDingdanLast(10);
        if(scL.size()>0){
            String showtype="success";
            for(Dingdan sc:scL){
                if(showtype.equals("active"))   showtype="success";
                else showtype="active";
                dingdanInit +="$(\"table tbody\").append(\"<tr class=\\\""+showtype+"\\\"><td>"
                        +sc.getDingdan_id()+"</td><td>"+sc.getDingdan_time()+"</td><td>"+sc.getDingdan_xiaoshou_man()
                        +"</td><td>"+sc.getDingdan_kehu_name()+"</td><td>"+sc.getDingdan_cheliang()+"</td>"
                        +"<td><button type=\\\"button\\\" class=\\\"btn btn-primary \\\" onclick=\\\"updateDingdan("+sc.getDingdan_id()+")\\\">修改</button>&nbsp;"
                        +"<button type=\\\"button\\\" class=\\\"btn btn-primary \\\" onclick=\\\"deleteDingdan("+sc.getDingdan_id()+")\\\">删除</button></td></tr>\");";

            }
        }
        return dingdanInit;
    }
}
