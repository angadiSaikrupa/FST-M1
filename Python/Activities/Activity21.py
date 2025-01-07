import pytest

# Test for Addition
def test_addition():
    # Initialize two numbers
    num1 = 10
    num2 = 15
    # Add them
    sum_result = num1 + num2

    # Assertion: Validate sum
    assert sum_result == 25

# Test for Subtraction
def test_subtraction():
    # Initialize two numbers
    num1 = 15
    num2 = 5
    # Subtract num2 from num1
    difference = num1 - num2

    # Assertion: Validate difference
    assert difference == 10

# Test for Multiplication (Product)
def test_multiplication():
    # Initialize two numbers
    num1 = 5
    num2 = 4
    # Multiply them
    product = num1 * num2

    # Assertion: Validate product
    assert product == 20

# Test for Division (Quotient)
def test_division():
    # Initialize two numbers
    num1 = 20
    num2 = 4
    # Divide num1 by num2
    quotient = num1 / num2

    # Assertion: Validate quotient
    assert quotient == 5.0

# Test for Division by Zero (edge case)
def test_division_by_zero():
    # Initialize numbers
    num1 = 20
    num2 = 0
    # Assert that division by zero raises a ZeroDivisionError
    with pytest.raises(ZeroDivisionError):
        result = num1 / num2
   