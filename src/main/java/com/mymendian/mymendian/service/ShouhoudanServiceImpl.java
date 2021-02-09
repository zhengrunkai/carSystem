package com.mymendian.mymendian.service;

        import com.mymendian.mymendian.dao.ShouhoudanDao;
        import com.mymendian.mymendian.model.Shouhoudan;
        import org.springframework.stereotype.Service;

        import javax.annotation.Resource;
        import java.util.List;

@Service
public class ShouhoudanServiceImpl implements ShouhoudanService {
    @Resource
    ShouhoudanDao shouhoudanDao;
    @Override
    public void insertShouhoudan(Shouhoudan shouhoudan) {
        shouhoudanDao.insertShouhoudan(shouhoudan);
    }
    @Override
    public void deleteShouhoudan(int id) {
        shouhoudanDao.deleteShouhoudan(id);
    }
    @Override
    public void updateShouhoudan(Shouhoudan shouhoudan) {
        shouhoudanDao.updateShouhoudan(shouhoudan);
    }
    @Override
    public Shouhoudan findShouhoudanById(int id) {
        return shouhoudanDao.findShouhoudanById(id);
    }
    @Override
    public Shouhoudan findShouhoudanByShouhoudan_id(int shouhoudan_id) {
        return shouhoudanDao.findShouhoudanByShouhoudan_id(shouhoudan_id);
    }
    @Override
    public String getShouhoudanInit() {
        String shouhoudanInit="";
        List<Shouhoudan> scL=shouhoudanDao.findShouhoudanLast(10);
        if(scL.size()>0){
            String showtype="success";
            for(Shouhoudan sc:scL){
                if(showtype.equals("active"))   showtype="success";
                else showtype="active";
                shouhoudanInit +="$(\"table tbody\").append(\"<tr class=\\\""+showtype+"\\\"><td>"
                        +sc.getShouhoudan_id()+"</td><td>"+sc.getShouhoudan_time()+"</td><td>"+sc.getShouhoudan_wenti()
                        +"</td><td>"+sc.getShouhoudan_shouhou_man()+"</td><td>"+sc.getShouhoudan_kehu_name()+"</td>"
                        +"<td><button type=\\\"button\\\" class=\\\"btn btn-primary \\\" onclick=\\\"updateShouhoudan("+sc.getShouhoudan_id()+")\\\">修改</button>&nbsp;"
                        +"<button type=\\\"button\\\" class=\\\"btn btn-primary \\\" onclick=\\\"deleteShouhoudan("+sc.getShouhoudan_id()+")\\\">删除</button></td></tr>\");";
            }
        }
        return shouhoudanInit;
    }
}
