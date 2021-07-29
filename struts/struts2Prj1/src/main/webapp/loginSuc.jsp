<%@ page language="java" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>  
<%@ taglib prefix="s" uri="/struts-tags"%>  
<h1>这是使用OGNL输出的结果页面</h1>  
<table border="9">  
    <tr>  
        <td align="right">获取姓名属性：</td>  
        <td align="left"><s:property value="user.username"/></td>  
        <td>${user.username}</td>
        <%-- 另外还有两种写法也是可以正常输出值栈中对象的普通属性的 --%>  
        <%-- <s:property value="user['username']"/> --%>  
        <%-- <s:property value="user[/"username/"]"/> --%>  
        <%-- 但是如果写成下面这种形式的话，就什么都不会输出了 --%>  
        <%-- <s:property value="user[username]"/> --%>  
    </tr>  
    <tr>  
        <td align="right">获取地址属性：</td>  
        <td align="left"><s:property value="user.address.addr"/></td> 
        <td>${user.address.addr}</td> 
    </tr>  
    <tr>  
        <td align="right">调用值栈中的对象的普通方法：</td>  
        <td align="left"><s:property value="user.getVOMethod()"/></td>  
        <td>${user.getVOMethod()}</td> 
    </tr>  
    <tr>  
        <td align="right">调用值栈中Action的普通方法：</td>  
        <td align="left"><s:property value="getCommon()"/></td>  
    </tr>  
</table>  
<hr/>  
<table border="9">  
    <tr>  
        <td align="right">获取普通类的静态属性：</td>  
        <td align="left"><s:property value="@cn.com.wan.struts2.vo.Address@TIPS"/></td>  
    </tr>  
    <tr>  
        <td align="right">访问普通类的构造方法：</td>  
        <td align="left"><s:property value="cn.com.wan.struts2.vo.Student('张小三',22).username"/></td>  
    </tr>  
    <tr>  
        <td align="right">调用Action中的静态方法：</td>  
        <td align="left"><s:property value="@cn.com.wan.struts2.action.LoginAction@getStatic()"/></td>  
    </tr>  
    <tr>  
        <td align="right">调用JDK中的类的静态方法：</td>  
        <td align="left"><s:property value="@java.util.Calendar@getInstance().time"/></td>  
    </tr>  
    <tr>  
        <td align="right">调用JDK中的类的静态方法：</td>  
        <td align="left"><s:property value="@java.lang.Math@floor(46.58)"/></td>  
    </tr>  
    <tr>  
        <td align="right">调用JDK中的类的静态方法：</td>  
        <td align="left"><s:property value="@@floor(46.58)"/></td>  
    </tr>  
</table>  
<hr/>  
<table border="9">  
    <tr>  
        <td align="right">获取List中的所有元素：</td>  
        <td align="left"><s:property value="testList"/></td>  
    </tr>  
    <tr>  
        <td align="right">获取Set中的所有元素：</td>  
        <td align="left"><s:property value="testSet"/></td>  
    </tr>  
    <tr>  
        <td align="right">获取Map中的所有元素：</td>  
        <td align="left"><s:property value="testMap"/></td>  
    </tr>  
    <tr>  
        <td align="right">获取Map中的某个元素：</td>  
        <td align="left"><s:property value="testMap['m22']"/></td>  
        <%-- 另外还有两种写法也是可以正常获取Map中的某个具体元素的 --%>  
        <%-- <s:property value="testMap.m22"/> --%>  
        <%-- <s:property value="testMap[/"m22/"]"/> --%>  
    </tr>  
    <tr>  
        <td align="right">获取Set中的某个元素：</td>  
        <%-- 由于Set中的元素是无顺序的，所以不能使用下标获取数据，所以这里什么也得不到 --%>  
        <td align="left"><s:property value="testSet[2]"/></td>  
    </tr>  
    <tr>  
        <td align="right">获取List中的某个元素：</td>  
        <td align="left"><s:property value="testList[2]"/></td>  
    </tr>  
</table>  
<hr/>  
<table border="9">  
    <tr>  
        <td align="right">获取List的大小：</td>  
        <td align="left"><s:property value="testList.size"/></td>  
    </tr>  
    <tr>  
        <td align="right">获取Set的大小：</td>  
        <td align="left"><s:property value="testSet.size"/></td>  
    </tr>  
    <tr>  
        <td align="right">获取Map的大小：</td>  
        <td align="left"><s:property value="testMap.size"/></td>  
    </tr>  
    <tr>  
        <td align="right">获取Map中所有的键：</td>  
        <td align="left"><s:property value="testMap.keys"/></td>  
    </tr>  
    <tr>  
        <td align="right">获取Map中所有的值：</td>  
        <td align="left"><s:property value="testMap.values"/></td>  
    </tr>  
    <tr>  
        <td align="right">Lambda计算4的阶乘：</td>  
        <td align="left"><s:property value="#f= :[#this==1?1 : #this*#f(#this-1)],#f(4)"/></td>  
    </tr>  
</table>  
<hr/>  
<table border="9">  
    <tr>  
        <td align="right">获取List中的所有对象：</td>  
        <td align="left"><s:property value="stus"/></td>  
    </tr>  
    <tr>  
        <td align="right">利用投影获取List中对象的名字：</td>  
        <td align="left"><s:property value="stus.{username}"/></td>  
    </tr>  
    <tr>  
        <td align="right">利用投影获取List中第二个对象的名字：</td>  
        <%-- 使用<s:property value="stus[1].{username}"/>获取到的值为：[李四] --%>  
        <%-- 二者的区别在于：后者比前者多了一个中括号 --%>  
        <td align="left">  
            <s:property value="stus.{username}[1]"/>        
            <s:property value="stus[1].{username}"/>  
        </td>  
    </tr>  
    <tr>  
        <td align="right">利用选择获取List中成绩及格的所有对象：</td>  
        <td align="left"><s:property value="stus.{?#this.grade>=60}"/></td>  
    </tr>  
    <tr>  
        <td align="right">利用选择获取List中成绩及格的第一个对象：</td>  
        <td align="left"><s:property value="stus.{^#this.grade>=60}"/></td>  
    </tr>  
    <tr>  
        <td align="right">利用选择获取List中成绩及格的最后一个对象：</td>  
        <td align="left"><s:property value="stus.{$#this.grade>=60}"/></td>  
    </tr>  
</table>  
<hr/>  
<table border="9">  
    <tr>  
        <td align="right">利用选择获取List中成绩及格的所有对象的名字：</td>  
        <td align="left"><s:property value="stus.{?#this.grade>=60}.{username}"/></td>  
    </tr>  
    <tr>  
        <td align="right">利用选择获取List中成绩及格的第二个对象的名字：</td>  
        <td align="left"><s:property value="stus.{?#this.grade>=60}.{username}[1]"/></td>  
    </tr>  
    <tr>  
        <td align="right">利用选择获取List中成绩及格的第一个对象的名字：</td>  
        <td align="left"><s:property value="stus.{^#this.grade>=60}.{username}"/></td>  
    </tr>  
    <tr>  
        <td align="right">利用选择获取List中成绩及格的最后一个对象的名字：</td>  
        <td align="left"><s:property value="stus.{$#this.grade>=60}.{username}"/></td>  
    </tr>  
    <tr>  
        <td align="right">利用选择获取List中成绩及格的第一个对象然后求大小：</td>  
        <td align="left"><s:property value="stus.{^#this.grade>=60}.{username}.size"/></td>  
    </tr>  
</table>  
<hr/>  
<table border="9">  
    <tr>  
        <td align="right">利用OGNL中的#号获取attr中的属性：</td>  
        <td align="left"><s:property value="#attr.BB"/></td>  
    </tr>  
    <tr>  
        <td align="right">利用OGNL中的#号获取request范围中的属性：</td>  
        <td align="left"><s:property value="#request.req"/></td>  
    </tr>  
    <tr>  
        <td align="right">利用OGNL中的#号获取session范围中的属性：</td>  
        <td align="left"><s:property value="#session.ses"/></td>  
    </tr>  
    <tr>  
        <td align="right">利用OGNL中的#号获取Paraments对象的属性：</td>  
        <td align="left"><s:property value="#parameters.netname"/></td>  
    </tr>  
    <tr>  
        <td align="right">使用&#60;&#37;=request.getParameter&#40;""&#41;&#37;&#62;或者&#36;&#123;param.name&#125;获取链接参数值：</td>  
        <td align="left">  
            ${param.netname}        
            <%=request.getParameter("netname")%>  
        </td>  
    </tr>  
    <tr>
    	<td align="right">利用OGNL中的#号获取request范围中的属性：</td>
   		<td>
   			<s:property value="#request"/>
    	</td>
    </tr>
    <tr>  
        <td align="right">查看值栈中的信息：</td>  
        <td align="left"><s:debug/></td>  
    </tr>  
</table> 