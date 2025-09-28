Q1: This code does not require any authorization before providing the requested informamiton. 
This allows unauthorized users to access informaiton that they should not be able to. 
To fix this, I required users to be logged in. I also added a check to ensure that the user had an 'admin' role. 
This will prevent non admin users from accessing sensitive informaiton. 

Q2: The code in this example does not check for login or access. 
Therefore anyone logged in or not could access the information. 
Similar to the last quesiton, I fixed this by added in a login requirement and checking to ensure the user is an admin.
This blocks unauthorized access to the information

Q3: This code uses an outdated crypto called MD5. It is fast and outdated. It also does not have salt
It is easier for attackers to crack and therefore should not be used for passwords. 
To fix this, I used BCrypt, which is reccommended by the OWASP. 
Unlike MD5, it salts to prevent hashs from being the same. It is also slower which resists brute-force attacks. 

Q4: Similar to question three's code this uses an outdated way of hashing. 
SHA-1 is weak and does not have salt. I will use BCrypt again to fix this code. 
BCrypt fixes the vulnerability by adding salt to the password hash.

Q5: The code in question five allows an attacked to inject SQL via the username input. 
To fix this, I added a prepared statement to prevent SQL injection. 
It prevents it by treating the input as data instead of executable SQL. 

Q6: This code allows for a NoSQL injection. 
req.query.username is used directly by the database and allows attackers to pass objects that can bypass auth and dump data. 
To fix this I added a validation for the username that only allows plain charaters. 
I also made it to where the query uses the safe variable rather than the raw parameter. 

Q7: The issue with this code is that it allows anyone that knows your email to change your password. 
That makes it insecure by design. 
To fix this I added authentication by requiring the user to be signed in to change their password. 
The signed in user can no longer change any password as long as the knew the email.
I also hashed the password before storing. 

Q8: The issue with this code is that it completely trust a third party script. 
If the third party makes malicious changes, those will be executed by your program automatically. 
The way I chose to fix this was to add the specific verison of the third party script. 
Therefore, if there is a malicious update, it will not be automatically run. 

Q9: The issue with this code is that it will fetch any url the user enters. 
This can lead to attackers trying to trick the server into requesting internal services. 
I fixed this by adding a list of allowed hosts. 
Now it only approved hosts can be requestedblocking malicious URLS

Q10: This code compares the input to the actual password. 
That infers that the password is stored in plaintext which is not appropriate for password storage. 
I rewrote the code to match the password entered with the stored hash using BCrypt. 
