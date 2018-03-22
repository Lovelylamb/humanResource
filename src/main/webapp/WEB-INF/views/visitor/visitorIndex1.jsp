<%--
  Created by IntelliJ IDEA.
  User: Jesus
  Date: 2018/3/17
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="ie=edge,chrome=1">
    <title>用户首页面</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script src="/scripts/jquery-3.3.1.min.js"></script>
    <script src="/scripts/ajax.js"></script>
    <link rel="stylesheet" href="/styles/ai.css">
    <style>
        .navbar-default .navbar-header .container-fluid .navbar-brand li{
            float: left;
            height: inherit;
        }
        .navbar-default .navbar-header{
            line-height: 34px;
        }


    </style>
</head>
<body>
<%--<div class="alert alert-success">${visitor.visitorName}登陆成功</div>--%>
<div class="mod-header">
    <div class="cat">
        <div class="cat-box" data-cat="engine">
            <div class="layout">
                <div class="cat-group">
                    <h3 class="cat-tit"><div class="cat-ico"><i class="ico-lan"></i></div>自然语言处理</h3>
                    <ul class="cat-list">
                        <li class="cat-item">
                            <div class="cat-item-main">
                                <span>基础文本分析</span>
                            </div>
                            <div class="cat-item-sub">
                                <div class="cat-item-row">
                                    <a href="#participle">分词/词性</a>
                                    <a href="#proper">专有名词</a>
                                    <a href="#synonym">同义词</a>
                                </div>
                            </div>
                        </li>
                        <li class="cat-item">
                            <div class="cat-item-main">
                                <span>语义解析</span>
                            </div>
                            <div class="cat-item-sub">
                                <div class="cat-item-row">
                                    <a href="#">意图/成分<i class="cat-tag is-beta"></i></a>
                                </div>
                            </div>
                        </li>
                        <li class="cat-item">
                            <div class="cat-item-main">
                                <a href="#">情感分析</a>
                            </div>
                        </li>
                        <li class="cat-item">
                            <div class="cat-item-main">
                                <span>机器翻译</span>
                            </div>
                            <div class="cat-item-sub">
                                <div class="cat-item-row">
                                    <a href="#">文本翻译</a>
                                    <a href="#">图片翻译<i class="cat-tag is-new"></i></a>
                                    <a href="#">语音翻译<i class="cat-tag is-new"></i></a>
                                </div>
                            </div>
                        </li>
                        <li class="cat-item">
                            <div class="cat-item-main">
                                <a href="#">智能闲聊<i class="cat-tag is-hot"></i></a>
                            </div>
                        </li>
                    </ul>
                </div>
                <div class="cat-group">
                    <h3 class="cat-tit"><div class="cat-ico"><i class="ico-image"></i></div>计算机视觉</h3>
                    <ul class="cat-list">
                        <li class="cat-item">
                            <div class="cat-item-main">
                                <span>OCR<i class="cat-tag is-hot"></i></span>
                            </div>
                            <div class="cat-item-sub">
                                <div class="cat-item-row">
                                    <a href="#identify">身份证识别</a>
                                    <a href="#card">名片识别</a>
                                    <a href="#driverregistration">行驶证/驾驶证识别</a>
                                </div>
                                <div class="cat-item-row">
                                    <a href="#businesslicense">营业执照识别</a>
                                    <a href="#creditcard">银行卡识别</a>
                                    <a href="#common">通用识别</a>
                                </div>
                            </div>
                        </li>
                        <li class="cat-item">
                            <div class="cat-item-main">
                                <span>人脸识别</span>
                            </div>
                            <div class="cat-item-sub">
                                <div class="cat-item-row">
                                    <a href="#detect">人脸分析</a>
                                    <a href="#multiface">多人脸检测<i class="cat-tag is-new"></i></a>
                                    <a href="#compare">人脸对比</a>
                                    <a href="#search">人脸搜索</a>
                                </div>
                                <div class="cat-item-row">
                                    <a href="#shape">五官定位</a>
                                    <a href="javascript:void(0);" class="disabled">人脸核身(即将开放)</a>
                                </div>
                            </div>
                        </li>
                        <li class="cat-item">
                            <div class="cat-item-main">
                                <span>图片识别</span>
                            </div>
                            <div class="cat-item-sub">
                                <div class="cat-item-row">
                                    <a href="#scene">物体/场景识别<i class="cat-tag is-beta"></i></a>
                                    <a href="#tag">图片标签识别</a>
                                    <a href="#express">看图说话</a>
                                </div>
                                <div class="cat-item-row">
                                    <a href="#fuzzy">模糊图片识别</a>
                                    <a href="#food">美食图片识别</a>
                                    <a href="#plants">花草识别<i class="cat-tag is-hot"></i></a>
                                </div>
                                <div class="cat-item-row">
                                    <a href="#cars">车辆识别<i class="cat-tag is-new"></i></a>
                                </div>
                            </div>
                        </li>
                        <li class="cat-item">
                            <div class="cat-item-main">
                                <span>图片特效<i class="cat-tag is-new"></i></span>
                            </div>
                            <div class="cat-item-sub">
                                <div class="cat-item-row">
                                    <a href="#">人脸融合</a>
                                    <a href="#">滤镜</a>
                                    <a href="#">人脸美妆</a>
                                </div>
                                <div class="cat-item-row">
                                    <a href="#">人脸变妆</a>
                                    <a href="#">大头贴</a>
                                    <a href="#">颜龄检测</a>
                                </div>
                            </div>
                        </li>
                        <li class="cat-item">
                            <div class="cat-item-main">
                                <a href="#">智能鉴黄</a>
                            </div>
                        </li>
                        <li class="cat-item">
                            <div class="cat-item-main">
                                <a href="#">暴恐识别</a>
                            </div>
                        </li>
                    </ul>
                </div>
                <div class="cat-group">
                    <h3 class="cat-tit"><div class="cat-ico"><i class="ico-voice"></i></div>智能语音</h3>
                    <ul class="cat-list">
                        <li class="cat-item">
                            <div class="cat-item-main">
                                <span>语音识别</span>
                            </div>
                            <div class="cat-item-sub">
                                <div class="cat-item-row">
                                    <a href="#">语音识别</a>
                                    <a href="#">长语音识别<i class="cat-tag is-new"></i></a>
                                    <a href="#">关键词检索<i class="cat-tag is-new"></i></a>
                                </div>
                            </div>
                        </li>
                        <li class="cat-item">
                            <div class="cat-item-main">
                                <a href="#">语音合成<i class="cat-tag is-new"></i></a>
                            </div>
                        </li>
                        <li class="cat-item">
                            <div class="cat-item-main">
                                <span>语音唤醒(即将开放)</span>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <div class="layout clearfix">
        <a href="" class="mod-header-logo"></a>

        <div class="mod-header-nav">
            <ul id="jmod-header-nav">
                <li id="nav-header-serv" class="top-cat hassub" data-cat="engine">
                    <h2><a href="javascript:void(0);">技术引擎</a><i class="top-cat-arrow"></i></h2>
                </li>
                <li id="nav-header-accelerator" class="top-cat"><h2><a href="#">功能介绍</a></h2></li>
                <li id="nav-header-info" class="top-cat"><h2><a href="#">版本套餐</a></h2></li>
                <li id="nav-header-hr" class="top-cat"><h2><a href="#">最新动态</a></h2></li>
                <li id="nav-header-join" class="top-cat"><h2><a href="#">关于我们</a></h2></li>
                <li id="nav-header-doc" class="top-cat"><h2><a href="#">下载</a></h2></li>

            </ul>
            <i class="jmod-nav-slider slider hidden" style="transform: translateX(0px);"></i>
        </div>

        <div class="mod-header-user">
            <a href="/visitor/reg.view" target="_blank" class="try jmod-header-try">注册</a>
            <a href="/visitor/login.view" target="_blank" class="console jmod-header-console hidden">登陆</a>
        </div>
    </div>

</div>


<%--<nav class="navbar navbar-default" role="navigation">--%>
    <%--<div class="container-fluid">--%>
        <%--<div class="navbar-header">--%>
            <%--<a class="navbar-brand" href="#">阿里巴巴</a>--%>
        <%--</div>--%>
        <%--<ul class="nav navbar-nav navbar-right">--%>
            <%--<li class="active"><a href="#"><span>首页</span> </a></li>--%>
            <%--<li><a href="#"><span>功能介绍</span> </a></li>--%>
            <%--<li><a href="#"><span>版本套餐</span> </a></li>--%>
            <%--<li><a href="#"><span>最新动态</span> </a></li>--%>
            <%--<li><a href="#"><span>关于我们</span> </a></li>--%>
            <%--<li><a href="#"><span>下载</span> </a></li>--%>
            <%--<li><a href="#"><span>合伙人联盟</span> </a></li>--%>
            <%--<li><a href="/visitor/reg.view"><span class="glyphicon glyphicon-user"></span> 注册</a></li>--%>
            <%--<li><a href="/visitor/login.view"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>--%>
        <%--</ul>--%>
    <%--</div>--%>
<%--</nav>--%>
</body>
</html>
