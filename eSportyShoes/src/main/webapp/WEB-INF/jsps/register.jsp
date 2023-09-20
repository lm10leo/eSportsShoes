<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
    <h1>User Registration</h1>
    <form action="/register" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="firstName">First name:</label>
        <input type="text" id="firstName" name="firstName" required><br><br>

        <label for="lastName">Last name:</label>
        <input type="text" id="lastName" name="lastName" required><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>