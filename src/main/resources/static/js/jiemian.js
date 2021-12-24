function chgstunum(){
    var snum=document.getElementById("stunum");
    if(snum.value.length >= 10){
        document.getElementById("dstuphone").style.display="block";
    }else{
        document.getElementById("dstuphone").style.display="none";
    }
}


function chgstuphone(){
    var sphone=document.getElementById("stuphone");
    if(sphone.value.length >= 11){
        document.getElementById("dstupwd").style.display="block";
    }else{
        document.getElementById("dstupwd").style.display="none";
    }
}

function chgstupwd(){
    var spwd=document.getElementById("stupwd");
    if(spwd.value.length >= 6){
        document.getElementById("dsubmit").style.display="block";
    }else{
        document.getElementById("dsubmit").style.display="none";
    }
}

function emaillogin()
{
    document.getElementById("demo").innerHTML=Date();
}