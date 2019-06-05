<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>欢迎页面</title>
		<script src="js/js.js" type="text/javascript"></script>
		<script type="text/javascript">
	function initArray() {
		this.length = initArray.arguments.length;
		for ( var i = 0; i < this.length; i++) {
			this[i] = initArray.arguments[i];
		}
	}

	function ChangeColor() {
		document.all.c.style.color = color[index];
		(index < color.length - 1) ? index++ : index = 0;
	}
	var ChangeMessage = "欢迎使用学生公寓管理系统";
	var speed = 2000;
	var index = 0;

	var color = new initArray("#f00ff0", "#ff0000", "#0ff000", "#00ff00",
			"#000ff0", "#0000ff", "#fff000", "#0fff00");
	setInterval("ChangeColor()", 1000);
</script>
		<SCRIPT LANGUAGE="JavaScript" TYPE="text/javascript">
	//创建一个数组,用于存放每个月的天数
	function montharr(m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11) {
		this[0] = m0;
		this[1] = m1;
		this[2] = m2;
		this[3] = m3;
		this[4] = m4;
		this[5] = m5;
		this[6] = m6;
		this[7] = m7;
		this[8] = m8;
		this[9] = m9;
		this[10] = m10;
		this[11] = m11;
	}
	//实现月历
	function calendar() {
		var monthNames = "JanFebMarAprMayJunJulAugSepOctNovDec";
		var today = new Date();
		var thisDay;
		var monthDays = new montharr(31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
				30, 31);
		year = today.getYear() + 1900;
		thisDay = today.getDate();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			monthDays[1] = 29;
		nDays = monthDays[today.getMonth()];
		firstDay = today;
		firstDay.setDate(1);
		testMe = firstDay.getDate();
		if (testMe == 2)
			firstDay.setDate(0);
		startDay = firstDay.getDay();
		document
				.write("<div id='rili'>");
		document
				.write("<TABLE width='217' BORDER='0' CELLSPACING='0' CELLPADDING='2' BGCOLOR='#0080FF'>");
		document
				.write("<TR><TD><table border='0' cellspacing='1' cellpadding='2' bgcolor='Silver'>");
		document.write("<TR><th colspan='7' bgcolor='#C8E3FF'>");
		var dayNames = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五",
				"星期六");
		var monthNames = new Array("1月", "2月", "3月", "4月", "5月", "6月", "7月",
				"8月", "9月", "10月", "11月", "12月");
		var now = new Date();
		document.writeln("<FONT STYLE='font-size:9pt;Color:#330099'>" + "公元 "
				+ now.getYear() + "年" + monthNames[now.getMonth()] + " "
				+ now.getDate() + "日 " + dayNames[now.getDay()] + "</FONT>");
		document
				.writeln("</TH></TR><TR><TH BGCOLOR='#0080FF'><FONT STYLE='font-size:9pt;Color:White'>日</FONT></TH>");
		document
				.writeln("<th bgcolor='#0080FF'><FONT STYLE='font-size:9pt;Color:White'>一</FONT></TH>");
		document
				.writeln("<TH BGCOLOR='#0080FF'><FONT STYLE='font-size:9pt;Color:White'>二</FONT></TH>");
		document
				.writeln("<TH BGCOLOR='#0080FF'><FONT STYLE='font-size:9pt;Color:White'>三</FONT></TH>");
		document
				.writeln("<TH BGCOLOR='#0080FF'><FONT STYLE='font-size:9pt;Color:White'>四</FONT></TH>");
		document
				.writeln("<TH BGCOLOR='#0080FF'><FONT STYLE='font-size:9pt;Color:White'>五</FONT></TH>");
		document
				.writeln("<TH BGCOLOR='#0080FF'><FONT STYLE='font-size:9pt;Color:White'>六</FONT></TH>");
		document.writeln("</TR><TR>");
		column = 0;
		for (i = 0; i < startDay; i++) {
			document.writeln("\n<TD><FONT STYLE='font-size:9pt'> </FONT></TD>");
			column++;
		}

		for (i = 1; i <= nDays; i++) {
			if (i == thisDay) {
				document
						.writeln("</TD><TD ALIGN='CENTER' BGCOLOR='#FF8040'><FONT STYLE='font-size:9pt;Color:#ffffff'><B>");
			} else {
				document
						.writeln("</TD><TD BGCOLOR='#FFFFFF' ALIGN='CENTER'><FONT STYLE='font-size:9pt;font-family:Arial;font-weight:bold;Color:#330066'>");
			}
			document.writeln(i);
			if (i == thisDay)
				document.writeln("</FONT></TD>");
			column++;
			if (column == 7) {
				document.writeln("<TR>");
				column = 0;
			}
		}
		document
				.writeln("<TR><TD COLSPAN='7' ALIGN='CENTER' VALIGN='TOP' BGCOLOR='#0080FF'>");
		document
				.writeln("<FORM NAME='clock' onSubmit='0'><FONT STYLE='font-size:9pt;Color:#ffffff'>");
		document
				.writeln("现在时间:<INPUT TYPE='Text' NAME='face' ALIGN='TOP'></FONT></FORM></TD></TR></TABLE>");
		document.writeln("</TD></TR></TABLE></div>");
	}
</SCRIPT>
		<SCRIPT LANGUAGE="JavaScript">
	var timerID = null;
	var timerRunning = false;

	function stopclock() {
		if (timerRunning)
			clearTimeout(timerID);
		timerRunning = false;
	}

	//显示当前时间
	function showtime() {
		var now = new Date();
		var hours = now.getHours();
		var minutes = now.getMinutes();
		var seconds = now.getSeconds();
		var timeValue = " " + ((hours > 12) ? hours - 12 : hours);
		timeValue += ((minutes < 10) ? ":0" : ":") + minutes;
		timeValue += ((seconds < 10) ? ":0" : ":") + seconds;
		timeValue += (hours >= 12) ? " 下午 " : " 上午 ";
		document.clock.face.value = timeValue;
		timerID = setTimeout("showtime()", 1000);//设置超时,使时间动态显示
		timerRunning = true;
	}

	function startclock() {
		stopclock();
		showtime();
	}
</SCRIPT>

		<style type="text/css">
body {
	background-color: #F1F1F1;
}
</style>

	</head>

	<body onload="startclock(); timerONE=window.setTimeout" text="#000000">
		<br>
		<br>
		<br>
		<br>
		<div style="padding-top: 4em; float: left; padding-left: 6em;">
			<h1>
				<script language=JavaScript>
	document.write('<div id="c"><center><b>' + ChangeMessage
			+ '</b></center></div>');
</script>
			</h1>
		</div>
		<div style="float: right; padding-right: 3em; padding-top: 2em;">
			<table width="520" border="0" align="center" cellpadding="0"
				cellspacing="0">
				<tr>
					<td>
						<div id="flash" align=center></div>
						<script type="text/javascript">
	//          
	var arr1 = new Array;
	var arr2 = new Array;
	var arr3 = new Array;

	arr1.push("images/01.jpg");
	arr2.push("http://www.w3cfuns.com/");
	arr3.push("“w3cfuns");
	arr1.push("images/02.jpg");
	arr2.push("http://www.w3cfuns.com/");
	arr3.push("“w3cfuns");
	arr1.push("images/03.jpg");
	arr2.push("http://www.w3cfuns.com/");
	arr3.push("w3cfuns");
	arr1.push("images/04.jpg");
	arr2.push("http://www.w3cfuns.com/");
	arr3.push("w3cfuns");
	arr1.push("images/05.jpg");
	arr2.push("http://www.w3cfuns.com/");
	arr3.push("w3cfuns");
	arr1.push("images/03.jpg");
	arr2.push("http://www.w3cfuns.com/");
	arr3.push("w3cfuns");

	var pics = arr1.join("|");
	var mylinks = arr2.join("|");
	var texts = arr3.join("|");

	oFlash1 = new sFlash("flash/flash.swf", "js", "520", "200", "6", "#ffffff");
	oFlash1.addParam("quality", "high");
	oFlash1.addParam("wmode", "opaque");
	oFlash1.addParam("salign", "t");
	oFlash1.addVariable("p", pics);
	oFlash1.addVariable("l", mylinks);
	oFlash1.addVariable("icon", texts);
	oFlash1.write("flash");

	//
</script>
					</td>
				</tr>
			</table>
		</div>


		<div style="padding-top: 10em; float: left; padding-left: 3em;">
			<script language="JavaScript" type="text/javascript">
<!--
	calendar();
//-->
</script>
		</div>
		<div style="padding-top: 4em; float: right;padding-right:3em;">
			<img src="style/19.gif">
		</div>




	</body>
</html>
