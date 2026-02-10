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

2. Create a local DB config file:
- Copy `src/dao/db.properties.example` to `src/dao/db.properties`
- Fill in your local MySQL values

You can also use environment variables:
- `DB_URL`
- `DB_USER`
- `DB_PASSWORD`

## Run in NetBeans

1. Open the project folder in NetBeans.
2. Ensure the MySQL Connector/J library is added to the project.
3. Create `src/dao/db.properties` or set `DB_URL`, `DB_USER`, `DB_PASSWORD`.
4. Run the main class: `Pharmacy_management_system`.

## Sample data (optional)

If you want quick demo data:

```
mysql -u root -p < db/sample_data.sql
```

## Notes

- This project uses a local MySQL database named `pharmacy` by default.
- Keep database credentials out of source control for production deployments.
