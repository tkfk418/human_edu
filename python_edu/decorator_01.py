# -*- coding: utf-8 -*-

# Decorator 기본개념
# 객체로서의 함수, 중첩함수, NonLocal Variable (global, local)
# Closures
# 디자인 패턴, 함수를 기능적으로 디자인 한다! 
# 성형
def make_something(func):

    def face():
        print("눈 성형 함")
        func()

    return face

def normal():
    print("노멀한 얼굴")

if __name__ == "__main__":
    decorated_func = make_something(normal)
    decorated_func()
