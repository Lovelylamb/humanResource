function hideAlert(arg) {
    if(arg.innerHTML.length!=0){
        setTimeout(function arg1() {
            arg.innerHTML="";
        },2000);
    }
}
//设置定时器 实现页面的上的警示内容在出现两秒后消失
