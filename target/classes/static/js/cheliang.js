var showtype="active";
function initHtml() {
    $("table tbody tr").remove();
    $.ajax({
        url: "/getCheliangInit",
        type: "Post",
        data:"",
        datatype: "html",
        success: function(data, status) {
            eval(data);
        }
    });
}
function addtabletr() {
    $(".cheliangadd").show();
}
function closeadd() {
    $(".cheliangadd").hide();
}
function saveCheliang() {
    var data = {
        cheliang_id: $("#cheliang_id").val(),
        cheliang_xinghao: $("#cheliang_xinghao").val(),
        cheliang_danjia: $("#cheliang_danjia").val(),
        cheliang_cheqi: $("#cheliang_cheqi").val(),
        cheliang_chelunyangshi: $("#cheliang_chelunyangshi").val(),
        cheliang_neishitiao: $("#cheliang_neishitiao").val(),
        cheliang_zuoyicaizhi: $("#cheliang_zuoyicaizhi").val(),
    };
    $.ajax({
        url: "/saveCheliang",
        type: "Post",
        data:data,
        datatype: "html",
        success: function(data, status) {
            if(data=="success"){
                if(showtype=="active")   showtype="success";
                else showtype="active";
                var scStr="<tr class='"+showtype+"'><td>"+$("#cheliang_id").val()+"</td><td>"+$("#cheliang_xinghao").val()+"</td><td>"+$("#cheliang_danjia").val()+"</td><td>"+$("#cheliang_cheqi").val()
                    +"</td><td>"+$("#cheliang_chelunyangshi").val()+"</td><td>"+$("#cheliang_neishitiao").val()+"</td><td>"+$("#cheliang_zuoyicaizhi").val()+"</td><td>新增或新修改记录</td></tr>";
                $("table tbody").prepend(scStr);
                $(".cheliangadd").hide();
            }
        }
    });
}
function updateCheliang(cheliang_id) {
    $.ajax({
        url: "/updateCheliang",
        type: "Post",
        data:"cheliang_id="+cheliang_id,
        datatype: "html",
        success: function(data, status) {
            eval(data);
        }
    });
}

function deleteCheliang(cheliang_id) {
    if(confirm("确定删除当前记录？")) {
        $.ajax({
            url: "/deleteCheliang",
            type: "Post",
            data: "cheliang_id=" + cheliang_id,
            datatype: "html",
            success: function (data, status) {
                eval(data);
            }
        })
    }
}
function searchCheliang(){
    var data={
        cheliang_id:$("#cheliang_id2").val()
    };
    $.ajax({
        url: "/updateCheliang",
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