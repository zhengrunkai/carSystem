var showtype="active";
function initHtml() {
    $("table tbody tr").remove();
    $.ajax({
        url: "/getSssInit",
        type: "Post",
        data:"",
        datatype: "html",
        success: function(data, status) {
            eval(data);
        }
    });
}
function addtabletr() {
    $(".sssadd").show();
}
function closeadd() {
    $(".sssadd").hide();
}
function saveSss() {
    var data = {
        yi: $("#yi").val(),
        er: $("#er").val(),
    };
    $.ajax({
        url: "/saveSss",
        type: "Post",
        data:data,
        datatype: "html",
        success: function(data, status) {
            if(data=="success"){
                if(showtype=="active")   showtype="success";
                else showtype="active";
                var scStr="<tr class='"+showtype+"'><td>"+$("#yi").val()+"</td><td>"+$("#er").val()+ "</td><td>新增或新修改记录</td></tr>";
                $("table tbody").prepend(scStr);
                $(".sssadd").hide();
            }
        }
    });
}
function updateSss(yi) {
    $.ajax({
        url: "/updateSss",
        type: "Post",
        data:"yi="+yi,
        datatype: "html",
        success: function(data, status) {
            eval(data);
        }
    });
}

function deleteSss(yi) {
    if(confirm("确定删除当前记录？")) {
        $.ajax({
            url: "/deleteSss",
            type: "Post",
            data: "yi=" + yi,
            datatype: "html",
            success: function (data, status) {
                eval(data);
            }
        })
    }
}
function searchSss(){
    var data={
        yi:$("#yi2").val()
    };
    $.ajax({
        url: "/updateSss",
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