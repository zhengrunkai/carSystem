var showtype="active";
function initHtml() {
    $("table tbody tr").remove();
    $.ajax({
        url: "/getDingdanInit",
        type: "Post",
        data:"",
        datatype: "html",
        success: function(data, status) {
            eval(data);
        }
    });
}
function addtabletr() {
    $(".dingdanadd").show();
}
function closeadd() {
    $(".dingdanadd").hide();
}
function saveDingdan() {
    var data = {
        dingdan_id: $("#dingdan_id").val(),
        dingdan_time: $("#dingdan_time").val(),
        dingdan_xiaoshou_man: $("#dingdan_xiaoshou_man").val(),
        dingdan_kehu_name: $("#dingdan_kehu_name").val(),
        dingdan_cheliang: $("#dingdan_cheliang").val(),
    };
    $.ajax({
        url: "/saveDingdan",
        type: "Post",
        data:data,
        datatype: "html",
        success: function(data, status) {
            if(data=="success"){
                if(showtype=="active")   showtype="success";
                else showtype="active";
                var scStr="<tr class='"+showtype+"'><td>"+$("#dingdan_id").val()+"</td><td>"+$("#dingdan_time").val()+"</td><td>"+$("#dingdan_xiaoshou_man").val()
                    +"</td><td>"+$("#dingdan_kehu_name").val()+"</td><td>"+$("#dingdan_cheliang").val()+"</td><td>新增或新修改记录</td></tr>";
                $("table tbody").prepend(scStr);
                $(".dingdanadd").hide();
            }
        }
    });
}
function updateDingdan(dingdan_id) {
    $.ajax({
        url: "/updateDingdan",
        type: "Post",
        data:"dingdan_id="+dingdan_id,
        datatype: "html",
        success: function(data, status) {
            eval(data);
        }
    });
}

function deleteDingdan(dingdan_id) {
    if(confirm("确定删除当前记录？")) {
        $.ajax({
            url: "/deleteDingdan",
            type: "Post",
            data: "dingdan_id=" + dingdan_id,
            datatype: "html",
            success: function (data, status) {
                eval(data);
            }
        })
    }
}
function searchDingdan(){
    var data={
        dingdan_id:$("#dingdan_id2").val()
    };
    $.ajax({
        url: "/updateDingdan",
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
