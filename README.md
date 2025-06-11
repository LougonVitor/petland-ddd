# 🐾 petland-ddd
Project developed in Java for managing a pet shop, applying SOLID principles and DDD. This project was created for study purposes and includes UML diagrams modeled with Astah.

## 🚀 Technologies Used

- **Java**
- **DDD**
- **SOLID**
- **Docker**
- **Spring Boot**
- **Spring JPA**
- **PostgreSQL**
- **Clean Architecture**

## 🔧 How It Works

1. The PostgresSQL database is in a docker container.
2. A request is sent by Postman or any other api platform.
3. The endpoint will follow this pattern: localhost:8080/[domainName{animals or register}] -> the method will decide which action will be taken, whether it is POST, DELETE, GET or PUT.
4. The system will perform the validations.
5. Then save it to the database.
 
## ⚙️ Configuration

Configure the .properties file to connect to your database.:
```properties
spring.datasource.url=${POSTGRE_MENU_DATABASE_URL}
spring.datasource.username=${POSTGRE_USERNAME_ADMIN}
spring.datasource.password=${POSTGRE_PASSWORD_ADMIN}
```
Put something like this:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/food
spring.datasource.username=your-username
spring.datasource.password=your-password
```

## 📜 License
This project is licensed under the MIT License - feel free to use and improve it! 😊

---

Made with ❤️ and **Java** by [VitorLougon](https://github.com/LougonVitor)! 🚀
