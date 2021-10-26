<html>
<body>
	
	<form action="/SpringMVC/interestResult" method="post"><br><br>
		Principal Amount: <input type="text" name="principal"/><br><br>
		Time in years: <input type="text" name="time"/><br><br>
		Rate of Interest: <input type="text" name="rate"/><br><br>
		<input type="submit" value="Calculate"/><br><br>
		Simple Interest: ${msg}
	</form>

</body>
</html>