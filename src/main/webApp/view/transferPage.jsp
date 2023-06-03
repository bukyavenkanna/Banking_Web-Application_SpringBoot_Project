
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<body style="background-color:#42eb39;">
    <h1 style="color: rgb(145, 38, 38);">Transfer...Here..Fill the Given Details....</h1>
    <form:form   action="/savetrans">
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
                <td>Enter Your TargetAccountNo</td>
                <td><input type="number" name="targetaccount"></td>
            </tr>
            <tr>
                <td>Enter Your Amount</td>
                <td><input type="number" name="amount"></td>
            </tr>
           
            <tr>
                
                <td style="background-color: green;color: white;"><input type="submit" value="save"></td>
            </tr>
        </table>


    </form:form>
</body>