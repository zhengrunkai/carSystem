var showtype="active";
function initHtml() {
    $("table tbody tr").remove();
    $.ajax({
        url: "/getSyscustomerInit",
        type: "Post",
        data:"",
        datatype: "html",
        success: function(data, status) {
            eval(data);
        }
    });
}
function addtabletr() {
    $(".customeradd").show();
}
function closeadd() {
    $(".customeradd").hide();
}
function saveCustomer() {
    var data = {
        customerid: $("#customerid").val(),
        customertelephone: $("#customertelephone").val(),
        customerphonetypename: $("#customerphonetypename").val(),
        customername: $("#customername").val(),
        customerwhetherflow: $("#customerwhetherflow").val(),
        isoutmealflow: $("#isoutmealflow").val(),
        customermealname: $("#customermealname").val()
    };
    $.ajax({
        url: "/saveSyscustomer",
        type: "Post",
        data:data,
        datatype: "html",
        success: function(data, status) {
            if(data=="success"){
                if(showtype=="active")   showtype="success";
                else showtype="active";
                var scStr="<tr class='"+showtype+"'><td>"+$("#customerid").val()+"</td><td>"+$("#customertelephone").val()+"</td><td>"+$("#customerphonetypename").val()
                    +"</td><td>"+$("#customername").val()+"</td><td>"+$("#customerwhetherflow").val()+"</td><td>"+$("#isoutmealflow").val()+"</td><td>"+$("#customermealname").val()+"</td></tr>";
                $("table tbody").prepend(scStr);
                $(".customeradd").hide();
            }
        }
    });
}
