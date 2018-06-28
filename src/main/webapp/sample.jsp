<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file ="WEB-INF/views/header.jsp" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		//location.href="sample";
		//location.href = "list";
	</script>
	<script>
//      $.post("요청이름","전달될 값", 콜백함수);
        $.post("sample","", function(obj){
        	
            alert(obj.mno);
            alert(obj.firstName);
            alert(obj.lastName);
            
            $("#one").text("#one:"+obj.mno+"세 "+obj.firstName+ " "+obj.lastName );
        }); 
         
        $.post("list","",function(msg){
        	var output = "";
        	$.each(msg,function(index,item){
        		output +=item.mno+"번 "+item.firstName+item.lastName+"<br>";
        	})
            $("#list").html(output);
        });
</script>
<div id="one"></div>
<div id="list"></div>
</body>
</html>