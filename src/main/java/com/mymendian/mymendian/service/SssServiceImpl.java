package com.mymendian.mymendian.service;


import com.mymendian.mymendian.dao.SssDao;
import com.mymendian.mymendian.model.Sss;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SssServiceImpl implements SssService {
    @Resource
    SssDao sssDao;
    @Override
    public void insertSss(Sss sss) {
        sssDao.insertSss(sss);
    }
    @Override
    public void deleteSss(String yi) {
        sssDao.deleteSss(yi);
    }
    @Override
    public void updateSss(Sss sss) {
        sssDao.updateSss(sss);
    }
    @Override
    public Sss findSssById(int id) {
        return sssDao.findSssById(id);
    }
    @Override
    public Sss findSssByyi(String yi) {
        return sssDao.findSssByyi(yi);
    }
    @Override
    public String getSssInit() {
        String sssInit="";
        List<Sss> scL=sssDao.findSssLast(10);
        if(scL.size()>0){
            String showtype="success";
            for(Sss sc:scL){
                if(showtype.equals("active"))   showtype="success";
                else showtype="active";
                sssInit +="$(\"table tbody\").append(\"<tr class=\\\""+showtype+"\\\"><td>"
                        +sc.getYi()+"</td><td>"+sc.getEr()+"</td><td>"
                        +"<td><button type=\\\"button\\\" class=\\\"btn btn-primary \\\" onclick=\\\"updateSss("+sc.getYi()+")\\\">修改</button>&nbsp;"
                        +"<button type=\\\"button\\\" class=\\\"btn btn-primary \\\" onclick=\\\"deleteSss("+sc.getYi()+")\\\">删除</button></td></tr>\");";
            }
        }
        return sssInit;
    }
}
