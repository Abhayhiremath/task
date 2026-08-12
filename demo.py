# demo.py

print("================================")
print("        MY STORE DEMO")
print("================================")

name = input("Enter your name: ")
product = input("Enter product name: ")
price = float(input("Enter product price: "))
quantity = int(input("Enter quantity: "))

total = price * quantity

print("\n===== ORDER DETAILS =====")
print("Customer Name :", name)
print("Product       :", product)
print("Price         :", price)
print("Quantity      :", quantity)
print("Total Amount  :", total)

if total >= 5000:
    discount = total * 0.10
    final_amount = total - discount

    print("Discount      :", discount)
    print("Final Amount  :", final_amount)
else:
    print("No discount applied.")
    print("Final Amount  :", total)

print("\nThank you for shopping with us!")