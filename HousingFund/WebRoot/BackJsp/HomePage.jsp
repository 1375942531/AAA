<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>AAA住房公积金管理系统</title>
		<meta name="description" content="Restyling jQuery UI Widgets and Elements" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
			<link rel="stylesheet" href="../assets/css/bootstrap.min.css" />
		<link rel="stylesheet" href="../assets/css/ace.min.css" id="main-ace-style" />
		
		<style type="text/css">
			.active{
			
				border: 1px solid #e3e3e3;
			}
			#sidebar{border-right: 1px solid #438EB9;}
			#navbar{height: 100px;}
			#demo{color: #fff;};
			.titles{
				font-size: 30px;
				text-align: center;
			}
		</style>
	<link rel="stylesheet" href="../bootstrap/font-awesome-4.7.0/css/font-awesome.css" type="text/css"></link></head>

	<body class="no-skin">
		<!-- #section:basics/navbar.layout -->
		<div id="navbar" class="navbar navbar-default" ><!-- style="background-color: #CDCDCD;" -->
			<div class="navbar-container" id="navbar-container">
				<div class="navbar-header pull-left" style="height: 100px; margin: 0;padding: 0;">
					<!-- #section:basics/navbar.layout.brand -->
					<a href="#" class="navbar-brand">
							<img src="../bootstrap/logo.jpg" style="height: 80px;"width="250px;"></img>
					</a>
				</div>
				<div class="navbar-header" style="font-size: 55px;text-align:center; color: #FFF; letter-spacing: 10px; padding-left: 30px;">
					AAA住房公积金管理系统
				</div>
				<div class="navbar-buttons navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">

						<li class="green">
							<a data-toggle="dropdown" class="dropdown-toggle" href="#" style="background-color: #438EB9;">
								<i class="ace-icon fa fa-envelope icon-animated-vertical"  ></i>
								<span class="badge badge-success">1</span>
							</a>

							<ul class="dropdown-menu-right dropdown-navbar dropdown-menu dropdown-caret dropdown-close">
								<li class="dropdown-header">
									<i class="ace-icon fa fa-envelope-o"></i>
									1条未读信息
								</li>

								<li class="dropdown-content">
									<ul class="dropdown-menu dropdown-navbar">
										<li>
											<a href="#">
												<img src="../assets/avatars/avatar.png" class="msg-photo" alt="Alex's Avatar" />
												<span class="msg-body">
													<span class="msg-title">
														<span class="blue">B2C:</span>
													</span>

													<span class="msg-time">
														<i class="ace-icon fa fa-clock-o"></i>
														<span>2019-12-15 18:00:00</span>
													</span>
												</span>
											</a>
										</li>
									</ul>
								</li>

								<li class="dropdown-footer">
									<a href="inbox.html">
										查看全部消息
										<i class="ace-icon fa fa-arrow-right"></i>
									</a>
								</li>
							</ul>
						</li>

						<!-- #section:basics/navbar.user_menu -->
						<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<span class="user-info">
									当前用户
									<c:forEach items="${list_users }" var="users">
										${users.uname }
									</c:forEach>
								</span>
								<i class="ace-icon fa fa-caret-down"></i>
							</a>
							<span id="demo"></span>

							<ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								<li>
									<a href="#">
										<i class="ace-icon fa fa-cog"></i>
										系统设置
									</a>
								</li>

								<li>
									<a href="profile.html">
										<i class="ace-icon fa fa-user"></i>
										个人信息设置
									</a>
								</li>

								<li class="divider"></li>

								<li>
									<a href="#" onclick="quit_login()">
										<i class="ace-icon fa fa-power-off"></i>
										退出
									</a>
								</li>
							</ul>
						</li>
						<!-- /section:basics/navbar.user_menu -->
					</ul>
				</div>

				<!-- /section:basics/navbar.dropdown -->
			</div><!-- /.navbar-container -->
		</div>
		<!--=====================================================================================  -->

		<!-- /section:basics/navbar.layout -->
		<div class="main-container" id="main-container">
			<!-- #section:basics/sidebar -->
			<div id="sidebar" class="sidebar responsive" style="font-size:17px">
				<ul class="nav nav-list">
					<li class="active">
						<a href="welcomePage.jsp" id="home" target="right_main">
							<i class="menu-icon fa fa-television"></i>
							<span class="menu-text"> 首页 </span>
						</a>
						<b class="arrow"></b>
					</li>
					<!-- 信息管理 -->
					<li class="Myli">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-edit"></i>
							<span class="menu-text">信息管理</span>
							<b class="arrow fa fa-angle-down"></b>
						</a>
						<b class="arrow"></b>

						<ul class="submenu">
							<c:forEach items="${list_Powers}" var="Powers">
								<c:if test="${Powers.ptype == '信息管理'}">
									<li class="">
									<a href="${Powers.purl }" class="test" target="right_main">
										<i class="menu-icon fa fa-caret-right"></i>
										${Powers.pname }
									</a>
									<b class="arrow"></b>
									</li>
								</c:if>
							</c:forEach>
						</ul>
					</li>
					<!--单位业务-->
					<li class="Myli">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-hospital-o"></i>
							<span class="menu-text">单位业务</span>
							<b class="arrow fa fa-angle-down"></b>
						</a>
						<b class="arrow"></b>

						<ul class="submenu">
							<c:forEach items="${list_Powers}" var="Powers">
								<c:if test="${Powers.ptype == '单位业务'}">
									<li>
									<a href="${Powers.purl }" class="test" target="right_main">
										<i class="menu-icon fa fa-caret-right"></i>
										${Powers.pname }
									</a>
									<b class="arrow"></b>
									</li>
								</c:if>
							</c:forEach>
						</ul>
					</li>
					<!-- 汇缴提取 -->
						<li class="Myli">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-ils"></i>
							<span class="menu-text">汇缴提取</span>
							<b class="arrow fa fa-angle-down"></b>
						</a>
						<b class="arrow"></b>

						<ul class="submenu">
							<c:forEach items="${list_Powers}" var="Powers">
								<c:if test="${Powers.ptype == '汇缴提取'}">
									<li class="">
									<a href="${Powers.purl }" class="test" target="right_main">
										<i class="menu-icon fa fa-caret-right"></i>
										${Powers.pname }
									</a>
									<b class="arrow"></b>
									</li>
								</c:if>
							</c:forEach>
						</ul>
					</li>
					<!-- 信贷业务 -->
						<li class="Myli">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-object-group"></i>
							<span class="menu-text">信贷业务</span>
							<b class="arrow fa fa-angle-down"></b>
						</a>
						<b class="arrow"></b>

						<ul class="submenu">
							<c:forEach items="${list_Powers}" var="Powers">
								<c:if test="${Powers.ptype == '信贷业务'}">
									<li class="">
									<a href="${Powers.purl }" class="test" target="right_main">
										<i class="menu-icon fa fa-caret-right"></i>
										${Powers.pname }
									</a>
									<b class="arrow"></b>
									</li>
								</c:if>
							</c:forEach>
						</ul>
					</li>
						<!-- 还贷业务 -->
						<li class="Myli">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-opera"></i>
							<span class="menu-text">还款业务</span>
							<b class="arrow fa fa-angle-down"></b>
						</a>
						<b class="arrow"></b>

						<ul class="submenu">
							<c:forEach items="${list_Powers}" var="Powers">
								<c:if test="${Powers.ptype == '还款业务'}">
									<li class="">
									<a href="${Powers.purl }" class="test" target="right_main">
										<i class="menu-icon fa fa-caret-right"></i>
										${Powers.pname }
									</a>
									<b class="arrow"></b>
									</li>
								</c:if>
							</c:forEach>
						</ul>
					</li>
					<!-- 员工管理 -->
					<li class="Myli">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-user-plus"></i>
							<span class="menu-text">员工管理</span>
							<b class="arrow fa fa-angle-down"></b>
						</a>
						<b class="arrow"></b>

						<ul class="submenu">
							<c:forEach items="${list_Powers}" var="Powers">
								<c:if test="${Powers.ptype == '员工管理'}">
									<li class="">
									<a href="${Powers.purl }" class="test" target="right_main">
										<i class="menu-icon fa fa-caret-right"></i>
										${Powers.pname }
									</a>
									<b class="arrow"></b>
									</li>
								</c:if>
							</c:forEach>
						</ul>
					</li>
					<!-- 权限管理 -->
					<li class="Myli">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-paw"></i>
							<span class="menu-text">权限管理</span>
							<b class="arrow fa fa-angle-down"></b>
						</a>
						<b class="arrow"></b>

						<ul class="submenu">
							<c:forEach items="${list_Powers}" var="Powers">
								<c:if test="${Powers.ptype == '权限管理'}">
									<li class="">
									<a href="${Powers.purl }" class="test" target="right_main">
										<i class="menu-icon fa fa-caret-right"></i>
										${Powers.pname }
									</a>
									<b class="arrow"></b>
									</li>
								</c:if>
							</c:forEach>
						</ul>
					</li>
				</ul><!-- /.nav-list -->
			</div>

			<!-- /section:basics/sidebar -->
			<div class="main-content">
				<!-- /section:basics/content.breadcrumbs 右中部分 -->
				<div class="page-content">
					<iframe src="welcomePage.jsp" name="right_main" frameborder="0" scrolling="auto" width="100%" height="1900px"></iframe> 
				</div>
			</div>
		</div><!-- /.main-container -->

		

	</body>
</html>
<script type="text/javascript">
			window.jQuery || document.write("<script src='../assets/js/jquery.min.js'>"+"<"+"/script>");
		</script>
		<script src="../assets/js/bootstrap.min.js"></script>
		<script src="../assets/js/ace-elements.min.js"></script>
		<script src="../assets/js/ace.min.js"></script>
		<script type="text/javascript" src="../bootstrap/jquery.jclock.js"></script>
	    <script type="text/javascript">
	    	$(function(){
	    		//创造时间
				$('#demo').jclock({withDate:true, withWeek:true});
			});
			function quit_login(){
				if(confirm('是否要退出系統？'))window.top.location='login.jsp';
			};
			function Myli_none(){
				var myli_html = $(".Myli ul").html();
				if(myli_html == ""){
					$(".Myli").css("display","none");
				}
			};
			$("#home").click(function(){
			  $(".test").css("background","#ffffff")
			})
			$(".test").click(function(){
		       $(".test").css("background","#ffffff")
			   $(this).css("background","#AFEEEE")
			})
	    </script>
