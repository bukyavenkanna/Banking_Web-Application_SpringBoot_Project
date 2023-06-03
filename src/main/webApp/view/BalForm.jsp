
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<body style="background-color:yellow;text-align: center;">
    <h1 style="color: red;"> Balance_Enquary...Here..Fill the Given Details....</h1>
    <form:form   action="/savebal" style="text-align: center;">
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
           
           <br>
            <tr>
                
                <td style="color: rgb(14, 248, 77);text-align: end;"><input type="submit" value="save"></td>
            </tr>
        </table>


    </form:form>
</body>