# -*- coding: utf-8 -*-

# 핵심 주제 : Decorator
# 중첩함수, 함수를 객체처럼 사용
# 사칙연산을 만들 예정 (중첩함수, 객체)
def math_functions(func_name):
    """djfkdjfkajfd
    Args:
        func_name(str) : 함수이름 기입
    """
    if func_name == "add":
        def add(a, b):
            return a + b 
        return add
    elif func_name == "multiple":
        def multiple(a, b):
            return a * b 
        return multiple
    elif func_name == "subtract":
        def subtract(a, b):
            return a - b
        return subtract
    elif func_name == "divide":
        def divide(a, b):
            return a // b 
        return divide
    else:
        print("....")

if __name__ == "__main__":
    x = 100
    y = 2

    # Closure 개념
    add = math_functions("add")
    print("100 + 2 = {}".format(add(x, y)))