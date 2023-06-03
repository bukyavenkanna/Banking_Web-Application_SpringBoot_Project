
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<body style="background-color: pink;">
    <h1 style="color: red;">Create NewAccount in Bank of Rathod...Fill the given Details...</h1>
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
                <td>Enter Your Conform-password</td>
                <td><input type="text" name="cPassword"></td>
            </tr>
            <tr>
                <td>Enter Your Amount</td>
                <td><input type="number" name="amount"></td>
            </tr> <tr>
                <td>Enter Your Address</td>
                <td><input type="text" name="address"></td>
            </tr>
            <tr>
                <td>Enter Your MobileNo</td>
                <td><input type="text" name="mobileNo"></td>
            </tr>
            <tr>
                
                <td><input type="submit" value="save"></td>
            </tr>
        </table>


    </form:form>
</body>