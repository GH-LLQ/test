$(function(){
    $("#yzm").click(function() {
        var para={
            email:$("#email").val()
        }
        $.ajax({
            url:"/user/emailpd2",//加网页的路径
            type:"Post",
            data:para,
            datatype:"html",
            success:function(data){
                // eval(data);
            }
        });
    });
});

$(function(){
    $("#pass_v_code2").click(function() {
        var para={
            v_code:$("#v_code").val()
        }
        $.ajax({
            url:"/user/v_code_pd2",//加网页的路径
            type:"Post",
            data:para,
            datatype:"html",
            success:function(data){
                eval(data);
            }
        });
    });
});