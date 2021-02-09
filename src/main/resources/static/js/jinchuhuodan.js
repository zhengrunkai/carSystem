var showtype="active";
function initHtml() {
    $("table tbody tr").remove();
    $.ajax({
        url: "/getJinchuhuodanInit",
        type: "Post",
        data:"",
        datatype: "html",
        success: function(data, status) {
            eval(data);
        }
    });
}
function addtabletr() {
    $(".jinchuhuodanadd").show();
}
function closeadd() {
    $(".jinchuhuodanadd").hide();
}
function saveJinchuhuodan() {
    var data = {
        jinchuhuodan_id: $("#jinchuhuodan_id").val(),
        jinchuhuodan_cheliangxinghao: $("#jinchuhuodan_cheliangxinghao").val(),
        jinchuhuodan_gongyingshang: $("#jinchuhuodan_gongyingshang").val(),
        jinchuhuodan_qianshou_time: $("#jinchuhuodan_qianshou_time").val(),
        jinchuhuodan_chuku_time: $("#jinchuhuodan_chuku_time").val(),
    };
    $.ajax({
        url: "/saveJinchuhuodan",
        type: "Post",
        data: data,
        datatype: "html",
        success: function (data, status) {
            if (data == "success") {
                if (showtype == "active") showtype = "success";
                else showtype = "active";
                var scStr = "<tr class='" + showtype + "'><td>" + $("#jinchuhuodan_id").val() + "</td><td>" + $("#jinchuhuodan_cheliangxinghao").val() + "</td><td>" + $("#jinchuhuodan_gongyingshang").val()
                    + "</td><td>" + $("#jinchuhuodan_qianshou_time").val() + "</td><td>" + $("#jinchuhuodan_chuku_time").val() + "</td><td>新增或新修改记录</td></tr>";
                $("table tbody").prepend(scStr);
                $(".jinchuhuodanadd").hide();
            }
        }
    });
}
    function updateJinchuhuodan(jinchuhuodan_id) {
        $.ajax({
            url: "/updateJinchuhuodan",
            type: "Post",
            data:"jinchuhuodan_id="+jinchuhuodan_id,
            datatype: "html",
            success: function(data, status) {
                eval(data);
            }
        });
    }

    function deleteJinchuhuodan(jinchuhuodan_id) {
        if(confirm("确定删除当前记录？")) {
            $.ajax({
                url: "/deleteJinchuhuodan",
                type: "Post",
                data: "jinchuhuodan_id=" + jinchuhuodan_id,
                datatype: "html",
                success: function (data, status) {
                    eval(data);
                }
            })
        }
    }
function searchJinchuhuodan(){
    var data={
        jinchuhuodan_id:$("#jinchuhuodan_id2").val()
    };
    $.ajax({
        url: "/updateJinchuhuodan",
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
