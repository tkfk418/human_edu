# -*- coding:utf-8 -*-
def dec_divide(func):

    def inner(a, b):
        
        # 문자열 포맷팅 공부
        # f-string 문자열, .format() 문자열 위주로 공부
        print("{}와 {}를 나눈다.".format(a, b))

        if b == 0:
            print("0이 들어와서 계산이 안됨")
            return
        return func(a, b)
    
    return inner

@dec_divide
def divide(a, b):
    print(a/b)

if __name__ == "__main__":
    divide(10, 0)
