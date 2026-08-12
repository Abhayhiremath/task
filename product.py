class Product:
    def __init__(self, product_id, name, price, quantity):
        self.product_id = product_id
        self.name = name
        self.price = price
        self.quantity = quantity

    def display_product(self):
        print("\n===== PRODUCT DETAILS =====")
        print("Product ID :", self.product_id)
        print("Name       :", self.name)
        print("Price      :", self.price)
        print("Quantity   :", self.quantity)


# Create products
product1 = Product(101, "Laptop", 55000, 10)
product2 = Product(102, "Mouse", 800, 25)
product3 = Product(103, "Keyboard", 1500, 15)

# Display products
product1.display_product()
product2.display_product()
product3.display_product()