# springboot-email

## Things to do list:
1. Clone this repository: `git clone https://github.com/hendisantika/springboot-email.git`.
2. Go to your folder: `cd springboot-email`.
3. Set your email password in `application.properties`.
4. Run the application: `mvn clean spring-boot:run`.

## Example Request:
**Send Email Without Attachment**
```
curl http://localhost:8080/email/simple-email/hendisantika@yahoo.co.id
```

**Send Email With Attachment**
```
curl http://localhost:8080/email/simple-order-email/hendisantika@yahoo.co.id
```

