package com.mymendian.mymendian.service;

import com.mymendian.mymendian.dao.YuangongDao;
import com.mymendian.mymendian.model.Yuangong;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class YuangongServiceImpl implements YuangongService {
    @Resource
    YuangongDao yuangongDao;
    @Override
    public void insertYuangong(Yuangong yuangong) {
        yuangongDao.insertYuangong(yuangong);
    }
    @Override
    public void deleteYuangong(int id) {
        yuangongDao.deleteYuangong(id);
    }
    @Override
    public void updateYuangong(Yuangong yuangong) {
        yuangongDao.updateYuangong(yuangong);
    }
    @Override
    public Yuangong findYuangongById(int id) {
        return yuangongDao.findYuangongById(id);
    }
    @Override
    public Yuangong findYuangongByYuangong_id(int yuangong_id) {
        return yuangongDao.findYuangongByYuangong_id(yuangong_id);
    }
    @Override
    public String getYuangongInit() {
        String yuangongInit="";
        List<Yuangong> scL=yuangongDao.findYuangongLast(10);
        if(scL.size()>0){
            String showtype="success";
            for(Yuangong sc:scL){
                if(showtype.equals("active"))   showtype="success";
                else showtype="active";
                yuangongInit +="$(\"table tbody\").append(\"<tr class=\\\""+showtype+"\\\"><td>"
                        +sc.getYuangong_id()+"</td><td>"+sc.getYuangong_name()+"</td><td>"+sc.getYuangong_sex()
                        +"</td><td>"+sc.getYuangong_phone()+"</td><td>"+sc.getYuangong_yeji()+"</td><td>"
                        +sc.getYuangong_pingjia()+"</td><td>"+sc.getYuangong_bumen()+"</td>"
                        +"<td><button type=\\\"button\\\" class=\\\"btn btn-primary \\\" onclick=\\\"updateYuangong("+sc.getYuangong_id()+")\\\">修改</button>&nbsp;"
                        +"<button type=\\\"button\\\" class=\\\"btn btn-primary \\\" onclick=\\\"deleteYuangong("+sc.getYuangong_id()+")\\\">删除</button></td></tr>\");";
            }
        }
        return yuangongInit;
    }
}
