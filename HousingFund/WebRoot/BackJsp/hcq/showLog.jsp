<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showLog.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
      <style>
      
       th,td{
         font-family:'楷体';
         width:180px;
         height:40px;
         line-height:40px;
         text-align:center;
       }

      </style>
  </head>
  
  <body>
  
        <h2>冲贷日志记录</h2>
      <table border="1" bordercolor="#999" style="border-collapse: collapse;">
        <tr>
          <td>日志记录编号</td>
          <td>借贷合同编号</td>
          <td>借款人</td>
          <td>此期本金</td>
          <td>此期利息</td>
          <td>逾期罚息</td>
          <td>总金额</td>
          <td>冲贷日期</td>
          <td>冲贷状态</td>
          <td>预留手机号</td>
          <td>备注</td>
        </tr>
        <tr>
           <td colspan="11">
             <div style="height:500px;">
                <table >
                  <c:forEach items="${list}" var="item">
                       <tr>
			          <td>${item.id }</td>
			          <td>${item.fush.borrowmoneyagreement.borrowMoneyAgreementId}</td>
			          <td style="padding-left:30px;">${item.fush.borrowmoneyagreement.borrowerName}</td>
			             <c:if test="${empty item.repaymentplandetails}">
			               <td>无</td><td>无</td><td>无</td><td>无</td>
			             </c:if>
			             <c:if test="${!empty item.repaymentplandetails}">
			               <td>${item.repaymentplandetails.currentReturnedCorpus}</td>
				           <td>${item.repaymentplandetails.currentReturnedInterest}</td>
				           <td>${item.repaymentplandetails.overduePrincipalAndInte}</td>
				           <td>${item.money}</td>
			             </c:if>
			          <td>${item.riqi}</td>
			            <c:if test="${item.status eq '失败'}">
			                <td style="color:red;"><b>${item.status}</b></td>
			            </c:if>
			             <c:if test="${item.status eq '成功'}">
			                <td style="color:#5ea6eb;"><b>${item.status}</b></td>
			            </c:if>
			          <td>${item.fush.iphone}</td>
			          <td>${item.remark}</td>
			        </tr>
                  </c:forEach>
                </table>
             </div>
           </td>
        </tr>
      </table>
  
  </body>
</html>
