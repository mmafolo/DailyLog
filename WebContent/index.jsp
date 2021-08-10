<title>Home | Daily Logger</title>
<%@ include file="header.jsp" %>
    <form action="<%=request.getContextPath()%>/createPost" method="post">
        <tr><td><input type="submit" name ="submit" value="Add a Post"></td></tr>
    </form>
	</body>
</html>
