<%@include file="commonThingsInView/header.jspf" %>
	<header>
		<h1>A2J website is with you to learn java</h1>
	</header>
	<h1>${passwordError}</h1>
	<div class="forms">
		<form action="/login.do" method="post">
			<fieldset>
				<legend>Login</legend>
				<input type="text" name="name" placeholder="Enter Your Name" /> <input
					type="password" name="password" placeholder="Enter Your Password" />
				<input type="submit" value="Login" />
			</fieldset>
		</form>
		<%-- <%=date%> --%>
	</div>
<%@include file="commonThingsInView/footer.jspf" %>
