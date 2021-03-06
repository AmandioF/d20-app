## D20-APP ##

A system allowing the rental of card games and trays without the need for an existing playroom in the city, where users can either make their own rental games and rent from other users.
There's support for the following features:

* Conventional email/username based registration with admin support
* Conventional Login using Spring Security and generation of JWT token
* Multiple device login and logout support
* Support for password updation once logged in
* Supports admin protected urls leveraging Spring security
* Support to Add Games, Users, Ownerships and Loan (As Admin)
* Support to Erase Games, Users, Ownerships and Loan (As Admin)
* Conventional Gets for Games, Users, Ownerships and Loan

---

## Swagger Docs ##
The project has been configured with a basic Swagger docket that exposes the commonly used API's along with the expected params.
![image](https://user-images.githubusercontent.com/28639434/69038898-97518500-09c9-11ea-962e-099364fc6975.png)
![image](https://user-images.githubusercontent.com/28639434/69038875-843eb500-09c9-11ea-9679-c0458295f0d7.png)
![image](https://user-images.githubusercontent.com/28639434/69038884-8b65c300-09c9-11ea-9392-9d5a62f05871.png)
![image](https://user-images.githubusercontent.com/28639434/69038911-9e789300-09c9-11ea-887e-ec8300349257.png)
![image](https://user-images.githubusercontent.com/28639434/69038903-991b4880-09c9-11ea-85ab-9e2e1177e08d.png)

---

## JWT ##
JSON Web Tokens are an open, industry standard RFC 7519 method for representing claims securely between two parties.

![](https://cdn-images-1.medium.com/max/1334/1*7T41R0dSLEzssIXPHpvimQ.png)

**Spring Security and JWT Configuration**

We will be configuring Spring Security and JWT for performing 2 operations-
* Generating JWT — Expose a POST API with mapping /authenticate. On passing correct username and password it will generate a JSON Web Token(JWT)
* Validating JWT — If user tries to access GET API with mapping /hello. It will allow access only if request has a valid JSON Web Token(JWT)

**JSON Web Token Structure**

A JWT consists of three parts separated by a dot.

> header.payload.signature

The **header** consists of two different parts: the token type (in this case JWT), and the name of the hashing algorithm, HMAC SHA256 or RSA.

The **payload** contains what we call claims. Claims are entity attributes (in this case user) and metadata.

The **signature** verifies that the JWT sender is who they claim to be to ensure that the message has not changed during traffic. To create the signature, we use the Base64 encoded header, the Base64 encoded payload, and the algorithm specified in the header.

---

## Access D20-APP
1. **Heroku Application**

	You can run D20-app accessing the site -

	[https://d20-app.herokuapp.com](https://d20-app.herokuapp.com)
  
### Contribution ###
* Please fork the project and adapt it to your use case.
* Submit a pull request.
* The project is in a nascent stage. As such any issues you find should be reported in the issues section.

---
## Demo Screens ##

1. **Registering a user**
---
![image](https://user-images.githubusercontent.com/28639434/69042298-bc48f680-09cf-11ea-8b35-2e3755102f05.png)


2. **Logging in a valid user**
---
![image](https://user-images.githubusercontent.com/28639434/69042282-b6531580-09cf-11ea-9df7-ae881ab16e2f.png)

3. **Logging in an invalid user**
---
![image](https://user-images.githubusercontent.com/28639434/69042280-b6531580-09cf-11ea-8d02-d59d858cefcd.png)

4. **Using the token in request Your Account info**
---
![image](https://user-images.githubusercontent.com/28639434/69042270-b226f800-09cf-11ea-97df-4d590784511f.png)



