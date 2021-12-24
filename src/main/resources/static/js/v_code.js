$(function(){
    $("#pass_v_code").click(function() {
        var para={
            v_code:$("#v_code").val()
        }
        $.ajax({
            url:"/user/v_code_pd",//加网页的路径
            type:"Post",
            data:para,
            datatype:"html",
            success:function(data){
                 eval(data);
            }
        });
    });
});