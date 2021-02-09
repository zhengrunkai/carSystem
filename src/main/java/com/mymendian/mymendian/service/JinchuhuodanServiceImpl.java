package com.mymendian.mymendian.service;

import com.mymendian.mymendian.dao.JinchuhuodanDao;
import com.mymendian.mymendian.model.Jinchuhuodan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JinchuhuodanServiceImpl implements JinchuhuodanService {
    @Resource
    JinchuhuodanDao jinchuhuodanDao;
    @Override
    public void insertJinchuhuodan(Jinchuhuodan jinchuhuodan) {
        jinchuhuodanDao.insertJinchuhuodan(jinchuhuodan);
    }
    @Override
    public void deleteJinchuhuodan(int id) {
        jinchuhuodanDao.deleteJinchuhuodan(id);
    }
    @Override
    public void updateJinchuhuodan(Jinchuhuodan jinchuhuodan) {
        jinchuhuodanDao.updateJinchuhuodan(jinchuhuodan);
    }
    @Override
    public Jinchuhuodan findJinchuhuodanById(int id) {
        return jinchuhuodanDao.findJinchuhuodanById(id);
    }
    @Override
    public Jinchuhuodan findJinchuhuodanByJinchuhuodan_id(int jinchuhuodan_id) {
        return jinchuhuodanDao.findJinchuhuodanByJinchuhuodan_id(jinchuhuodan_id);
    }
    @Override
    public String getJinchuhuodanInit() {
        String jinchuhuodanInit="";
        List<Jinchuhuodan> scL=jinchuhuodanDao.findJinchuhuodanLast(10);
        if(scL.size()>0){
            String showtype="success";
            for(Jinchuhuodan sc:scL){
                if(showtype.equals("active"))   showtype="success";
                else showtype="active";
                jinchuhuodanInit +="$(\"table tbody\").append(\"<tr class=\\\""+showtype+"\\\"><td>"
                        +sc.getJinchuhuodan_id()+"</td><td>"+sc.getJinchuhuodan_cheliangxinghao()+"</td><td>"+sc.getJinchuhuodan_gongyingshang()
                        +"</td><td>"+sc.getJinchuhuodan_qianshou_time()+"</td><td>"+sc.getJinchuhuodan_chuku_time()+"</td>"
                        +"<td><button type=\\\"button\\\" class=\\\"btn btn-primary \\\" onclick=\\\"updateJinchuhuodan("+sc.getJinchuhuodan_id()+")\\\">修改</button>&nbsp;"
                        +"<button type=\\\"button\\\" class=\\\"btn btn-primary \\\" onclick=\\\"deleteJinchuhuodan("+sc.getJinchuhuodan_id()+")\\\">删除</button></td></tr>\");";
            }
        }
        return jinchuhuodanInit;
    }
}
