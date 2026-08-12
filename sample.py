# sample.py

print("===== PYTHON SAMPLE PROGRAM =====")

name = input("Enter your name: ")
age = int(input("Enter your age: "))

print("\nHello,", name)
print("Your age is:", age)

if age >= 18:
    print("You are eligible.")
else:
    print("You are not eligible.")

print("\n===== NUMBERS =====")

num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))

print("Addition       :", num1 + num2)
print("Subtraction    :", num1 - num2)
print("Multiplication :", num1 * num2)

if num2 != 0:
    print("Division       :", num1 / num2)
else:
    print("Division       : Cannot divide by zero")

print("\nProgram completed successfully!")