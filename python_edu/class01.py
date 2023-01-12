# -*- coding:utf-8 -*-

class Person:
    """
    사람을 표현하는 클래스

    '''
    Attributes
    ----------------
    name : str
        name of the person
    
    age : int
        age of the person

    
    Methods
    -------
    info(comment=""):
        informaton of the person's something

    """

    def __init__(self, name, age):
        """
        Constructs all the necessary attributes for the person object

        Parameters
        ------------
            name : str
                name of the person
            
            age : int
                age of the person
        """

        self.name = name
        self.age  = age

    # 다양한 메서드들 정의

    def info(self, comment=None):
        """
        dkfjdksfjkdlafjdkaj

        Parameters
        -----------
        comment : str, optional
            more infomation to be displayed (Default is None)

        Returns
        -----------
        None
        """

        print(f'내 이름은 {self.name} 이다. 내 나이는 {self.age} 이다. 추가정보 ' + comment)


def main():
    a_person = Person('Min', age = 30)
    a_person.info("나는 어디에 있는가?")
    # print(Person.__doc__)
    help(Person)

if __name__ == "__main__":
    main()