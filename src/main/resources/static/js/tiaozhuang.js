$(function(){
    $("#emaillogin").click(function() {
        // var para={
        //     stunum:$("#stunum").val(),
        //     // stuphone:$("#stuphone").val(),
        //     stupwd:$("#stupwd").val()
        // }
        $.ajax({
            url:"/user/tz",//加网页的路径
            // type:"Post",
            // data:para,
            datatype:"html",
            success:function(data){
                eval(data);
            }
        });
    });
});