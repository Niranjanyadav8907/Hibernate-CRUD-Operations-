# Hibernate CRUD Operations (Short Overview)

Hibernate is an Object-Relational Mapping (ORM) framework that simplifies the interaction between Java applications and relational databases. CRUD operations (Create, Read, Update, Delete) are the essential database operations that Hibernate handles efficiently.

## Key Concepts for Hibernate CRUD Operations

### 1. **Create**
   - Adding new records to the database.
   - Achieved using `Session.save()` or `Session.persist()` methods.

### 2. **Read**
   - Fetching records from the database.
   - Methods like `Session.get()`, `Session.load()`, or HQL (Hibernate Query Language) queries are used.

### 3. **Update**
   - Modifying existing records in the database.
   - Use `Session.update()` or `Session.merge()` to synchronize changes with the database.

### 4. **Delete**
   - Removing records from the database.
   - Methods such as `Session.delete()` are used.

### Workflow
1. **SessionFactory**: Provides `Session` instances to interact with the database.
2. **Transaction Management**: Hibernate requires explicit transaction management to commit or rollback changes.
3. **Entity Class**: POJO (Plain Old Java Object) annotated with JPA annotations like `@Entity`, `@Id`, etc.

### Example of Hibernate Annotations
```java
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    // Getters and Setters
}
```

### Hibernate Configuration
- **hibernate.cfg.xml** or application properties file is used to define database details and Hibernate settings.
- Example properties:
  ```xml
  <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/your_database</property>
  <property name="hibernate.dialect">org.hibernate.dialect.MySQL8Dialect</property>
  ```

### Benefits of Using Hibernate for CRUD Operations
- Reduces boilerplate code.
- Provides HQL for database-independent queries.
- Automatically handles SQL generation.
- Supports caching for better performance.

