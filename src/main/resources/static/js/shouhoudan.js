var showtype="active";
function initHtml() {
    $("table tbody tr").remove();
    $.ajax({
        url: "/getShouhoudanInit",
        type: "Post",
        data:"",
        datatype: "html",
        success: function(data, status) {
            eval(data);
        }
    });
}
function addtabletr() {
    $(".shouhoudanadd").show();
}
function closeadd() {
    $(".shouhoudanadd").hide();
}
function saveShouhoudan() {
    var data = {
        shouhoudan_id: $("#shouhoudan_id").val(),
        shouhoudan_time: $("#shouhoudan_time").val(),
        shouhoudan_wenti: $("#shouhoudan_wenti").val(),
        shouhoudan_shouhou_man: $("#shouhoudan_shouhou_man").val(),
        shouhoudan_kehu_name: $("#shouhoudan_kehu_name").val(),
    };
    $.ajax({
        url: "/saveShouhoudan",
        type: "Post",
        data:data,
        datatype: "html",
        success: function(data, status) {
            if(data=="success"){
                if(showtype=="active")   showtype="success";
                else showtype="active";
                var scStr="<tr class='"+showtype+"'><td>"+$("#shouhoudan_id").val()+"</td><td>"+$("#shouhoudan_time").val()+"</td><td>"+$("#shouhoudan_wenti").val()
                    +"</td><td>"+$("#shouhoudan_shouhou_man").val()+"</td><td>"+$("#shouhoudan_kehu_name").val()+ "</td><td>新增或新修改记录</td></tr>";
                $("table tbody").prepend(scStr);
                $(".shouhoudanadd").hide();
            }
        }
    });
}
function updateShouhoudan(shouhoudan_id) {
    $.ajax({
        url: "/updateShouhoudan",
        type: "Post",
        data:"shouhoudan_id="+shouhoudan_id,
        datatype: "html",
        success: function(data, status) {
            eval(data);
        }
    });
}

function deleteShouhoudan(shouhoudan_id) {
    if(confirm("确定删除当前记录？")) {
        $.ajax({
            url: "/deleteShouhoudan",
            type: "Post",
            data: "shouhoudan_id=" + shouhoudan_id,
            datatype: "html",
            success: function (data, status) {
                eval(data);
            }
        })
    }
}
function searchShouhoudan(){
    var data={
        shouhoudan_id:$("#shouhoudan_id2").val()
    };
    $.ajax({
        url: "/updateShouhoudan",
        type: "Post",
        data: data,
        datatype: "html",
        success: function(data, status) {
            eval(data);
            $(".search").hide();
        }
    });
}
function searchtabletr() {
    $("#search").show();
}
function closesearch() {
    $("#search").hide();
}