package com.mymendian.mymendian.service;

import com.mymendian.mymendian.dao.CheliangDao;
import com.mymendian.mymendian.model.Cheliang;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CheliangServiceImpl implements CheliangService {
    @Resource
    CheliangDao cheliangDao;
    @Override
    public void insertCheliang(Cheliang cheliang) {
        cheliangDao.insertCheliang(cheliang);
    }
    @Override
    public void deleteCheliang(int id) {
        cheliangDao.deleteCheliang(id);
    }
    @Override
    public void updateCheliang(Cheliang cheliang) {
        cheliangDao.updateCheliang(cheliang);
    }
    @Override
    public Cheliang findCheliangById(int id) {
        return cheliangDao.findCheliangById(id);
    }
    @Override
    public Cheliang findCheliangByCheliang_id(int cheliang_id) {
        return cheliangDao.findCheliangByCheliang_id(cheliang_id);
    }
    @Override
    public String getCheliangInit() {
        String cheliangInit="";
        List<Cheliang> scL=cheliangDao.findCheliangLast(10);
        if(scL.size()>0){
            String showtype="success";
            for(Cheliang sc:scL){
                if(showtype.equals("active"))   showtype="success";
                else showtype="active";
                cheliangInit +="$(\"table tbody\").append(\"<tr class=\\\""+showtype+"\\\"><td>"+sc.getCheliang_id()+"</td><td>"
                        +sc.getCheliang_xinghao()+"</td><td>"+sc.getCheliang_danjia()+"</td><td>"+sc.getCheliang_cheqi()
                        +"</td><td>"+sc.getCheliang_chelunyangshi()+"</td><td>"+sc.getCheliang_neishitiao()+"</td><td>"
                        +sc.getCheliang_zuoyicaizhi()+"</td>"
                        +"<td><button type=\\\"button\\\" class=\\\"btn btn-primary \\\" onclick=\\\"updateCheliang("+sc.getCheliang_id()+")\\\">修改</button>&nbsp;"
                        +"<button type=\\\"button\\\" class=\\\"btn btn-primary \\\" onclick=\\\"deleteCheliang("+sc.getCheliang_id()+")\\\">删除</button></td></tr>\");";
            }
        }
        return cheliangInit;
    }
}
