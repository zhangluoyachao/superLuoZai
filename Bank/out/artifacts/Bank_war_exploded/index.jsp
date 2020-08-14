<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <title>无标题文档</title>
  <style>
    *{padding:0px; margin:0px}
    #container{ width:300px; margin:100px auto; text-align:center;}
    body{
      color: #555;
      font-size: 15px;
      line-height: 1.7;
      font-family: 'Helvetica Neue',Helvetica,'PingFang SC','Hiragino Sans GB','Microsoft YaHei',Arial,sans-serif;
      background: #f7fafc;
      -webkit-font-smoothing: subpixel-antialiased;
    }
    .title{
      margin: 30px 0 20px;
      font-weight: 400;
      font-size: 18px;
    }
    .ind-bar{font-size: 18px;}
    .ind-bar a{
      padding:10px;
      color:inherit;
      text-decoration:none;
      line-height: 35px;
      transition: opacity .15s,color .15s;
      opacity: .7;
      -ms-filter: "alpha(Opacity=70)";
      -webkit-transition: opacity .15s,color .15s;
    }
    .ind-bar a:hover{
      opacity: 1;
    }

    .slider-bar{
      position: absolute;
      left: 0;
      bottom: 0;
      margin: 0 .8em;
      width: 2.4em;
      height: 2px;
      background: #0f88eb;
      -webkit-transition: left .15s ease-in;
      transition: left .15s ease-in;
    }
    .reg{ padding: 1px 0;
      border: 1px solid #d5d5d5;
      border-radius: 3px;}
    .inp input{
      border: 0;
      border-radius: 0;
      box-shadow: none;
      background: #fff;
      width: 100%;
      box-sizing: border-box;
      margin: 0;
      padding: 8px 10px;
      line-height: 19px;
      color: #555;

    }
    .sign-button{
      background: #0f88eb;
      box-shadow: none;
      border: 0;
      border-radius: 3px;
      line-height: 41px;
      color: #fff;
      display: block;
      padding: 0;
      width: 100%;
      font-size: 15px
    }
    .sign-button:hover{
      background: #55abed;
    }
  </style>
</head>

<body>
<div id="container">
  <form action="${base}/bank/main.jsp" method="post">
    <h2 class="title">网上银行登录</h2>
    <div class="ind-bar">

      <br>
      <span class="slider-bar"></span>
    </div>
    <div class="reg">
      <div class="inp"><input type="text" name="name" placeholder="卡号"></div>
      <div class="inp" style="border-top: 1px solid #e8e8e8"><input type="text" name="phone_num" placeholder="请输入6位数密码"></div>
    </div>
    <div style="margin-top:20px;">
      <button class="sign-button" type="submit">登录系统</button>
    </div>
  </form>

  <div style="margin-top:5px;">
    <button class="sign-button" type="submit" onclick="">注册</button>
  </div>
</div>

</div>
</body>
</html>
