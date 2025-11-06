# springboot-email

 Set your email password in `application.properties`.
 Run the application: `mvn clean spring-boot:run`.

## Example Request:
**Send Email Without Attachment**
```
curl http://localhost:8080/email/simple-email/sankar.jaiswal@gmail.com

```

**Send Email With Attachment**
```
curl http://localhost:8080/email/simple-order-email/sankar.jaiswal@gmail.com

```

