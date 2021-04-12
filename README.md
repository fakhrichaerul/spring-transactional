# Aplikasi Spring Transactional

Cara menjalankan aplikasi:

1. Run aplikasi

    ```
   mvn spring-boot:run
    ```

2. Database in-memory dapat diakses di url :
    ```
    http://localhost:8080/h2-console
    ```
   lalu login dengan jdbc, username dan password
   yang sama dengan konfigurasi `application.properties`
    ```
    JDBC URL = jdbc:h2:mem:h2db
    User Name = h2
    Password = password
    ```

3. Dokumentasi Rest API dapat dilihat di url :

    ```
    http://localhost:8080/swagger-ui.html
    ```

   