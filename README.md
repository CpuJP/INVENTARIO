
# **Inventory Management System for Costume and Apparel**


This is a web-based **Inventory Management System** designed to track, manage, and organize costume and apparel items used for theater and dance performances. Built with **Java**, **Spring Boot**, this application allows the management of items, categories, and photos in a dynamic, easy-to-use interface.

---

## **Features**

- **Item Tracking**: Keep detailed records of costumes, clothing, and accessories used in performances.
- **Subarea Management**: Categorize each item by its related subarea (e.g., **Theater**, **Dance**).
- **Real-time Updates**: Modify item quantities, descriptions, and states in real time.
- **Photo Integration**: Each item can be associated with a photo for easier identification.
- **Auditing**: Track item movements and updates with detailed logs and automatic backups.

---

## **Technologies Used**

- **Backend**: Java with **Spring Boot**
- **Database**: MySQL (migrated to **PostgreSQL** for enhanced performance)
- **Security**: Authentication and authorization for role-based access control

---

## **Setup Instructions**

### Prerequisites

- Java 11 or later
- Spring Boot
- MySQL or PostgreSQL database
- IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/CpuJP/Inventarios
   ```

2. Navigate to the project directory:

   ```bash
   cd InventarioKyqa
   ```

3. Import the project into your IDE and configure the database connection in the `application.properties` file.

4. Run the application:

   ```bash
   ./mvnw spring-boot:run
   ```

   Or, if you’re using an IDE, just click "Run".

---

## **Database Schema**

The system uses a relational database schema to store the inventory data. Here are some of the main tables:

- **items**: Stores the details of each inventory item, including name, description, and quantity.
- **subareas**: Represents different categories like "Dance" or "Theater".
- **item_subareas**: A join table linking items to subareas.
- **photos**: Stores photos associated with each item for easy visual identification.

---

## **How It Works**

The system allows users to interact with a detailed catalog of costume and apparel items. Users can add new items, update quantities, and assign them to specific subareas like **Theater** or **Dance**.

The app automatically tracks item movements and stores metadata about each item, including associated photos.

In addition, users can filter and view all items belonging to a specific subarea or inventory.

---

## **Collaboration**

We welcome contributions to improve the functionality and user experience of this project! If you're interested in collaborating, please:

1. **Fork** the repository.
2. **Clone** your fork to make changes.
3. **Create a branch** for your feature or bugfix.
4. **Submit a Pull Request** when you're ready to merge your changes.

If you have any questions or need further guidance, feel free to reach out to us at **cpujuanpis@gmail.com**.

---

## **Contact**

Juan Pablo | **cpujuanpis@gmail.com**  
LinkedIn: [Juan Pablo](https://www.linkedin.com/in/jp-giraldo/)

---

## **License**

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

### **Contributions**

Thank you to the following contributors who have helped improve this project:

- **Juan Pablo**: Project lead and developer

---

