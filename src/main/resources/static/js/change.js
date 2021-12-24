$(function(){
    $("#pass").click(function() {
        var para={
            newpwd:$("#newpwd").val(),
            newpwd2:$("#newpwd2").val()
        }
        $.ajax({
            url:"/user/change_pd",//加网页的路径
            type:"Post",
            data:para,
            datatype:"html",
            success:function(data){
                eval(data);
            }
        });
    });
});