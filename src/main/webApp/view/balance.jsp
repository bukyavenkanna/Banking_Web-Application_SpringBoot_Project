
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<body style="background-color:yellow;">
    <h1 style="color: red;">Check your Balane...Here..Fill the Given Details....</h1>
    <form:form   action="/save">
        <table>
            <tr>
                <td>Enter Your AccountNo</td>
                <td><input type="number" name="accountNo"></td>
            </tr>
            <tr>
                <td>Enter Your Name</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Enter Your password</td>
                <td><input type="text" name="password"></td>
            </tr>
           
            <tr>
                
                <td style="background-color: green;color: white;"><input type="submit" value="save"></td>
            </tr>
        </table>


    </form:form>
</body>