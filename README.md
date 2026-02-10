# Pharmacy Management System

A Java Swing + MySQL pharmacy management system built with NetBeans.

## Requirements

- JDK 8+ (tested with NetBeans 24)
- MySQL 8.x
- MySQL Connector/J in your NetBeans project libraries

## Database setup (schema only)

1. Create the database and tables using the provided schema file:

```
mysql -u root -p < db/schema.sql
```

2. Update your MySQL credentials in the connection provider:
- Open [src/dao/connectionprovider.java](src/dao/connectionprovider.java) and change the URL, username, and password to match your local MySQL.

## Run in NetBeans

1. Open the project folder in NetBeans.
2. Ensure the MySQL Connector/J library is added to the project.
3. Run the main class: `Pharmacy_management_system`.

## Notes

- This project uses a local MySQL database named `pharmacy` by default.
- Keep database credentials out of source control for production deployments.
