Q1: This code does not require any authorization before providing the requested informamiton. This allows unauthorized users to access informaiton that they should not be able to. 
To fix this, I added a check to ensure that the user was signed in and had an 'admin' role. This will prevent non admin users from accessing sensitive informaiton. 
Q2: The code in this example does not check for login or access. Therefore anyone logged in or not could access the information. 
Similar to the last quesiton, I fixed this by added in a login requirement and checking to ensure the user is an admin.
