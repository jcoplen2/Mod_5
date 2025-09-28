Q1: This code does not require any authorization before providing the requested informamiton. This allows unauthorized users to access informaiton that they should not be able to. 
To fix this, I added a check to ensure that the user was signed in and had an 'admin' role. This will prevent non admin users from accessing sensitive informaiton. 
Q2: The code in this example does not check for login or access. Therefore anyone logged in or not could access the information. 
Similar to the last quesiton, I fixed this by added in a login requirement and checking to ensure the user is an admin.
Q3: This code uses an outdated crypto called MD5. It is easier for attackers to crack and therefore should not be used for passwords. To fix this, I used BCrypt, which is reccommended by the OWASP. Unlike MD5, it salts to prevent hashs from being the same, and
it is slower by design. 
Q4: Similar to question four's code this uses an outdated way of encrypting. SHA-1 is weak and does not have salt. I will use BCrypt again to fix this code. 
Q5: The code in question five allows an attacked to inject SQL via the username input. To fix this, I added a prepared statement to prevent SQL injection. It prevents it by treating the input as data instead of executable SQL. 
Q6: This code allows for a NoSQL injection. req.query.username is used directly by the database and allows attackers to pass objects that can bypass auth and dump data. To fix this I added a validation for the username that only allows plain 
charaters. I also made it to where the query uses the safe variable rather than the raw parameter. 
Q7: The issue with this code is that it allows anyone that knows your email to change your password. That makes it insecure by design. To fix this I added authentication by requiring the user to be signed in to change their password. The signed in user
can no longer change any password as long as the knew the email. I also hashed the password before storing. 
Q8: 
