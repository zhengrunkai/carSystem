var showtype="active";
function initHtml() {
    $("table tbody tr").remove();
    $.ajax({
        url: "/getYuangongInit",
        type: "Post",
        data:"",
        datatype: "html",
        success: function(data, status) {
            eval(data);
        }
    });
}
function addtabletr() {
    $(".yuangongadd").show();
}
function closeadd() {
    $(".yuangongadd").hide();
}
function saveYuangong() {
    var data = {
        yuangong_id: $("#yuangong_id").val(),
        yuangong_name: $("#yuangong_name").val(),
        yuangong_sex: $("#yuangong_sex").val(),
        yuangong_phone: $("#yuangong_phone").val(),
        yuangong_yeji: $("#yuangong_yeji").val(),
        yuangong_pingjia: $("#yuangong_pingjia").val(),
        yuangong_bumen: $("#yuangong_bumen").val()
    };
    $.ajax({
        url: "/saveYuangong",
        type: "Post",
        data:data,
        datatype: "html",
        success: function(data, status) {
            if(data=="success"){
                if(showtype=="active")   showtype="success";
                else showtype="active";
                var scStr="<tr class='"+showtype+"'><td>"+$("#yuangong_id").val()+"</td><td>"+$("#yuangong_name").val()+"</td><td>"+$("#yuangong_sex").val()
                    +"</td><td>"+$("#yuangong_phone").val()+"</td><td>"+$("#yuangong_yeji").val()+"</td><td>"+$("#yuangong_pingjia").val()+"</td><td>"+$("#yuangong_bumen").val()+ "</td><td>新增或新修改记录</td></tr>";
                $("table tbody").prepend(scStr);
                $(".yuangongadd").hide();
            }
        }
    });
}
function updateYuangong(yuangong_id) {
    $.ajax({
        url: "/updateYuangong",
        type: "Post",
        data:"yuangong_id="+yuangong_id,
        datatype: "html",
        success: function(data, status) {
            eval(data);
        }
    });
}

function deleteYuangong(yuangong_id) {
    if(confirm("确定删除当前记录？")) {
        $.ajax({
            url: "/deleteYuangong",
            type: "Post",
            data: "yuangong_id=" + yuangong_id,
            datatype: "html",
            success: function (data, status) {
                eval(data);
            }
        })
    }
}
function searchYuangong(){
    var data={
        yuangong_id:$("#yuangong_id2").val()
    };
    $.ajax({
        url: "/updateYuangong",
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