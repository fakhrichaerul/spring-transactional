# Aplikasi Spring Transactional

Cara menjalankan :

1. Jalankan aplikasi

    ```
   mvn spring-boot:run
    ```

2. Browse ke url localhost:8080/h2-console
   lalu login dengan database, username dan password
   yang sama dengan konfigurasi application.properties
    ```
    JDBC URL = jdbc:h2:mem:h2db
    User Name = h2
    Password = password
    ```

3. Template URL untuk Method Post

    ```
    http://localhost:8080/employee
    ```

   Template Request Body Json untuk Method Post

    ```json
    {
    "empName":"Fakhri",
    "email":"fakhrichaerul@gmail.com",
    "departmentName":"IT"
    }
    ```
   