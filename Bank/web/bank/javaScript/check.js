function check() {
    var username = document.getElementsByName("cardNo")[0].value;
    var password = document.getElementsByName("password")[0].value;

    var reg1 = /^\d{6}$/;
    var reg2 = /^\d{16}$/;

    if (!reg2.test(username)) {
        alert("请正确输入您的16位卡号！");
        return false;
    } else if (!reg1.test(password)) {
        alert("请正确输入6位登录密码！");
        return false;
    }
    return true;
}