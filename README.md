🩺 Health Insurance - Customer Management System
A simple Spring Boot RESTful API to manage customers for a Health Insurance system. It includes features for customer registration, updating details, viewing all customers, and deletion.

### 1. Register a New Customer
📌 Purpose: This method is used to register a new customer.

📥 Input: JSON object with name, address, email, password.

💾 Process: It calls the service to save the customer in the database.

📤 Output: Returns the saved customer with ID.


### 2. Get Customer by ID
 📌 Purpose: This method is used to fetch customer data by ID.

🔍 Path Variable: id (example: /api/customers/1)

📤 Output: Returns customer object if found; else returns 404.

### 3. Get All Customers
📌 Purpose: To get a list of all customers stored in the database.

📤 Output: Returns a list of Customer objects.

📍 URL to call: /api/customers (GET)


### 4. Update Existing Customer
📌 Purpose: To update an existing customer's data by their ID.

📝 What changes? Name, address, email, or password.

📥 Input: ID in URL and new customer data in body.

📤 Output: Updated customer info.

### 5. Delete Customer
📌 Purpose: To delete a customer from the system by their ID.

🧽 Use Case: Customer account closed or removed.

📤 Output: Success message like "Customer deleted successfully".






